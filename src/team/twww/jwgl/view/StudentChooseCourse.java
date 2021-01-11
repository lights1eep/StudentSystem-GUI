package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class StudentChooseCourse extends JInternalFrame {
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
	public StudentChooseCourse(int n) {
		setFrameIcon(new ImageIcon(StudentChooseCourse.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		id=n;
		setIconifiable(true);
		setClosable(true);
		setTitle("\u5B66\u751F\u9009\u8BFE");
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
		s.changeSize(w, h, "src/team_twww_jwgl_image/23.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/23.jpg");
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
		
		JLabel label = new JLabel("\u53EF\u9009\u62E9\u8BFE\u7A0B");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u9009\u8BFE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 579, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 581, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel label_1 = new JLabel("\u8981\u9009\u7684\u8BFE\u7A0B\u7F16\u53F7");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setIcon(new ImageIcon(StudentChooseCourse.class.getResource("/team_twww_jwgl_image/1bcf9033165ebe689d3ae4b3e25d9b9.png")));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseActionPerformed(e);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_1)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(89))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u7F16\u53F7", "\u8BFE\u7A0B\u540D"
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
		     String sql = "select course_id,course_name from course_table where course_id not in(select course_id from student_course_view where user_id=?)";
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
	          //  v.add(rs.getString("teacher_name")); 
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
	private void chooseActionPerformed(ActionEvent e) {
		
			
			String c_id=textField.getText();
			database start=new database();
			   Connection con;
			  
			   try {
				con = start.getCon();
				   String sql = "select * from course_table where course_id=?";
				   PreparedStatement prestmt=con.prepareStatement(sql);
				
	 	           prestmt.setString(1, c_id.trim());
	 	         // prestmt.setInt(2, id);
	 	     	 ResultSet rs=null;
		          rs = prestmt.executeQuery();
	              
	 	           if(rs.next())
	 	           { String sql1 = "insert into score_table values(?,?,0)";
				 prestmt=con.prepareStatement(sql1);
			 	            prestmt.setString(1, c_id);
			 	            prestmt.setInt(2, id);
			 
			 	            prestmt.executeUpdate();
			 	           JOptionPane.showConfirmDialog(null, "选课成功！");
			 	           this.filltable();
			 	          String sql2 = "select student_number from course_table where course_id=?";
							 prestmt=con.prepareStatement(sql2);
						 	            prestmt.setString(1, c_id);
						 	           rs = prestmt.executeQuery();    
						 	          int num=0;
						 	           if(rs.next())
						 	           num=rs.getInt("student_number");
						 	           System.out.println(num);
						 	           num++;
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