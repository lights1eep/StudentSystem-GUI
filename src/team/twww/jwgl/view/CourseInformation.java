package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;

/**
 * 学生课程信息
 * @author 27257
 *
 */
public class CourseInformation extends JInternalFrame {
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
	public CourseInformation(int m) {
		setFrameIcon(new ImageIcon(CourseInformation.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		id=m;
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 20));
		setClosable(true);
		setIconifiable(true);
		setTitle("\u8BFE\u7A0B\u4FE1\u606F");
		setBounds(600, 250, 600, 400);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/13.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/13.jpg");
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
		JLabel label = new JLabel("\u672C\u5B66\u671F\u8BFE\u8868");
		label.setIcon(new ImageIcon(CourseInformation.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(147, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(243))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(label)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(81, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u53F7", "\u8BFE\u7A0B\u540D", "\u6388\u8BFE\u8001\u5E08"
			}
		));
		scrollPane.setViewportView(table);
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
		     String sql = "select course_name,course_id,teacher_name from student_course_view where user_id=?";
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
	           // v.add(rs.getInt("student_number"));
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
