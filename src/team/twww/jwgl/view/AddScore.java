package team.twww.jwgl.view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;
import team.twww.jwgl.util.string_empty;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Font;

public class AddScore extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	int id;
	private JTextField textField_1;
	private JTextField textField_2;
	@SuppressWarnings("deprecation")
	public AddScore(int m) {
		setFrameIcon(new ImageIcon(AddScore.class.getResource("/team_twww_jwgl_image/f4346b05eb357fb35a28310e17c3cfd.png")));
		id=m;
		setTitle("\u8BFE\u7A0B\u9009\u8BFE\u5B66\u751F\u4FE1\u606F");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 546, 445);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
	
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize((int)this.getSize().getWidth(), (int)this.getSize().getHeight(), "src/team_twww_jwgl_image/7.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/7.jpg");
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
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel label = new JLabel("\u8F93\u5165\u8BFE\u7A0B\u53F7");
		label.setIcon(new ImageIcon(AddScore.class.getResource("/team_twww_jwgl_image/a7634f13499d0a4a02fc680678cf702.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setIcon(new ImageIcon(AddScore.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lookActionPerformed(e);
			}
		});
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u5B66\u751F\u59D3\u540D"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u7F16\u53F7", "\u8BFE\u7A0B\u540D\u79F0"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u5F55\u5165\u6210\u7EE9", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(14)))))
					.addGap(24))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		label_1.setIcon(new ImageIcon(AddScore.class.getResource("/team_twww_jwgl_image/2.png")));
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6210\u7EE9:");
		label_2.setIcon(new ImageIcon(AddScore.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_2.setColumns(10);
		
		JButton button_1 = new JButton("\u63D0\u4EA4");
		button_1.setIcon(new ImageIcon(AddScore.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		button_1.setFont(new Font("宋体", Font.PLAIN, 16));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertActionPerformed(e);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addComponent(label_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(88)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(166)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(77, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addComponent(button_1)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
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
		     String sql = "select course_id,course_name from course_table where user_id=?";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     
		       prestmt.setInt(1, id);
		 
		       ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	                 v.add(rs.getString("course_id")); 
	            // ID = rs.getInt("user_id");              
	            v.add(rs.getString("course_name"));
	             // name = rs.getString("teacher_name");
	           
	            //sex=rs.getString("Sex");
	           // v.add(rs.getString("teacher_name")); 
	          //  ph_num=rs.getString("Phone_Number");
	         //   v.add(rs.getInt("student_number"));
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
	private void insertActionPerformed(ActionEvent e) {
		String accounnt=textField_1.getText();
		int id1=Integer.parseInt(accounnt);
		String c_id=textField.getText();
		String sco=textField_2.getText();
		int score=Integer.parseInt(sco);
		if(string_empty.isempty(accounnt))
		{
			JOptionPane.showConfirmDialog(null, "学号信息不能为空");
			return;
		}
		
	
		database start=new database();
		   Connection con;
		  
		   try {
			con = start.getCon();
			   // 要执行的SQL语句
			   String sql="select * from score_table where user_id=? and course_id=?";
			  PreparedStatement     prestmt=con.prepareStatement(sql);
	            prestmt.setInt(1, id1);
	            prestmt.setString(2, c_id);
	            ResultSet rs=null;
	          rs = prestmt.executeQuery();
			  
	         
	      
	            
	          	
                 if(rs.next())
                 {
                	 String sql1 = "update  score_table set Course_Score=? where user_id=? and course_id=?";
        	         prestmt=con.prepareStatement(sql1);
        	 	            prestmt.setInt(1, score);
        	 	            prestmt.setInt(2, id1);
        	 	           prestmt.setString(3, c_id);
        	 	            
        	 	            prestmt.executeUpdate();
        	 	           JOptionPane.showConfirmDialog(null, "成绩更新成功！");
                 }
	          else {
				
	        	  JOptionPane.showConfirmDialog(null, "学号出错！");
			}
	         
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
	}
	private void lookActionPerformed(ActionEvent e) {
		String accounnt=textField.getText();
		DefaultTableModel dmt=(DefaultTableModel)table_1.getModel();
		dmt.setRowCount(0);
		if(string_empty.isempty(accounnt))
		{
			JOptionPane.showConfirmDialog(null, "搜索信息不能为空");
			return;
		}
		
	
		database start=new database();
		   Connection con;
		  
		   try {
			con = start.getCon();
			   // 要执行的SQL语句
	           String sql = "select user_id,student_name from choose_course_table where  course_id=? ";
	           PreparedStatement prestmt=con.prepareStatement(sql);
	      
	            prestmt.setString(1, accounnt.trim());
	            
	            //prestmt.setString(3, "学生");
	          	 ResultSet rs=null;
	          rs = prestmt.executeQuery();
                 if(rs.next())
                 {
                	 Vector<String> v1=new Vector<String>();
	                 v1.add(rs.getString("user_id")); 
	            // ID = rs.getInt("user_id");              
	            v1.add(rs.getString("student_name"));
	            dmt.addRow(v1);
                 }
	          else {
				
	        	  JOptionPane.showConfirmDialog(null, "课程号出错！");
			}
	         
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		    
        
	}
}
