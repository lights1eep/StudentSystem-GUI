package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class StudentCancelCourse extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;


	/**
	 * Create the frame.
	 * @param id 
	 */
	int id;
	@SuppressWarnings("deprecation")
	public StudentCancelCourse(int n) {
		setFrameIcon(new ImageIcon(StudentCancelCourse.class.getResource("/team_twww_jwgl_image/7be65a679cb6aeef5845a7c70376aea.png")));
		id=n;
		setIconifiable(true);
		setClosable(true);
		setTitle("\u5B66\u751F\u9000\u8BFE");
		setBounds(600, 250, 750, 500);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/22.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/22.jpg");
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
		JLabel label = new JLabel("\u5DF2\u9009\u8BFE\u7A0B");
		label.setFont(new Font("宋体", Font.BOLD, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u9000\u8BFE\u5904\u7406", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
						.addComponent(scrollPane))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel label_1 = new JLabel("\u8981\u9000\u9009\u7684\u8BFE\u7A0B\u53F7\uFF1A");
		label_1.setFont(new Font("宋体", Font.BOLD, 20));
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JButton button = new JButton("\u786E\u8BA4\u9000\u9009");
		button.setIcon(new ImageIcon(StudentCancelCourse.class.getResource("/team_twww_jwgl_image/1bcf9033165ebe689d3ae4b3e25d9b9.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteActionPerformed(e);
			}
		});
		button.setBackground(Color.RED);
		button.setFont(new Font("宋体", Font.BOLD, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(button)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u53F7", "\u8BFE\u7A0B\u540D", "\u4EFB\u8BFE\u8001\u5E08"
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
	private void deleteActionPerformed(ActionEvent e) {
		
		
		String c_id=textField.getText();
		database start=new database();
		   Connection con;
		  
		   try {
			con = start.getCon();
			   String sql = "select * from student_course_view where course_id=?";
			   PreparedStatement prestmt=con.prepareStatement(sql);
			
 	           prestmt.setString(1, c_id.trim());
 	         // prestmt.setInt(2, id);
 	     	 ResultSet rs=null;
	          rs = prestmt.executeQuery();
              
 	           if(rs.next())
 	           { String sql1 = "delete from score_table where course_id=? and user_id=?";
			 prestmt=con.prepareStatement(sql1);
		 	            prestmt.setString(1, c_id);
		 	            prestmt.setInt(2, id);
		 
		 	            prestmt.executeUpdate();
		 	           JOptionPane.showConfirmDialog(null, "退课成功！");
		 	           this.filltable();
		 	          String sql2 = "select student_number from course_table where course_id=?";
						 prestmt=con.prepareStatement(sql2);
					 	            prestmt.setString(1, c_id);
					 	           rs = prestmt.executeQuery();    
					 	          
					 	          int num=0;
					 	           if(rs.next())
					 	           num=rs.getInt("student_number");
					 	           num--;
					 String sql3 = "update course_table set student_number=? where course_id=?";
					 prestmt=con.prepareStatement(sql3);
					 prestmt.setInt(1, num);
					 
					 prestmt.setString(2,c_id);
					 
					 prestmt.executeUpdate();
		 	           
 	           }//prestmt.setString(3, "学生");
	          
	          else {
				
	        	  JOptionPane.showConfirmDialog(null, "课程号出错！");
			}
	         
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
}
}
