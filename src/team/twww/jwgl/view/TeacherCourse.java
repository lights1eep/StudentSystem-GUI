package team.twww.jwgl.view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.ImageIcon;

public class TeacherCourse extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable table;

	/**
	 * Create the frame.
	 */
	int id;
	@SuppressWarnings("deprecation")
	public TeacherCourse(int m) {
		setFrameIcon(new ImageIcon(TeacherCourse.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		id=m;
		setTitle("\u8BFE\u7A0B\u4FE1\u606F");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 609, 443);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/26.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/26.jpg");
		 JLabel tu = new JLabel(background);
		 tu.setBounds(0, 0, background.getIconWidth(),
				    background.getIconHeight());
		// contentPane.add(tu);
		 this.getLayeredPane().add(tu,new Integer(Integer.MIN_VALUE));
		 // imagePanel.setOpaque(false);
		 JPanel panelTop=new JPanel();
	        panelTop=(JPanel)this.getContentPane();
	 
	        //panel和panelTop设置透明
	        panelTop.setOpaque(false);
		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(117, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(38)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"课程名称", "课程号", "任课教师", "选课人数"
			}
		));
		scrollPane_1.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		this.filltable();
		
	}
	private void filltable() {
		DefaultTableModel dmt=(DefaultTableModel)table.getModel();
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();
		
		  try {
			 con=star.getCon();
			 //要执行的SQL语句
		     String sql = "select course_name,course_id,teacher_name,student_number from course_table where user_id=?";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     
		       prestmt.setInt(1, id);
		 
		       ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	                
	            // ID = rs.getInt("user_id");              
	            v.add(rs.getString("course_name"));
	             // name = rs.getString("teacher_name");
	            v.add(rs.getString("course_id")); 
	            //sex=rs.getString("Sex");
	            v.add(rs.getString("teacher_name")); 
	          //  ph_num=rs.getString("Phone_Number");
	            v.add(String.valueOf(rs.getInt("student_number")));
	            //c_name=rs.getString("college_name");
	           // v.add(rs.getString("college_name"));
	            //Job_Title= rs.getString("Job_Title");
	           // v.add(rs.getString("Job_Title")); 
	            dmt.addRow(v);
	          //  System.out.println("\t123\t|\t" + ID + "\t" + name + "\t" + c_name );
	          }
			// System.out.println("\t\t-----------------------------------------------------------------");
	         rs.close();
	    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
	}
}
