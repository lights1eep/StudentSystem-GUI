package team.twww.jwgl.view;

import javax.swing.ButtonGroup;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.awt.event.ActionEvent;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.ImageIcon;

/**
 * 教学评价
 * @author 27257
 *
 */
public class TeachingEvaluation extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField courseidTxt;
	private JTable table;

	/**
	 * Create the frame.
	 */
	int id;
	JRadioButton rdbtnA;
	JRadioButton rdbtnB; 
	JRadioButton rdbtnC;
	JRadioButton rdbtnD;
	ButtonGroup but=new ButtonGroup();
	@SuppressWarnings("deprecation")
	public TeachingEvaluation(int m) {
		setFrameIcon(new ImageIcon(TeachingEvaluation.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		id=m;
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 20));
		setTitle("\u6559\u5B66\u8BC4\u4EF7");
		setIconifiable(true);
		setClosable(true);
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
		s.changeSize(w, h, "src/team_twww_jwgl_image/28.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/28.jpg");
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
		courseidTxt = new JTextField();
		courseidTxt.setFont(new Font("宋体", Font.PLAIN, 18));
		courseidTxt.setColumns(10);
		
		JButton button = new JButton("\u8BC4\u6559");
		button.setIcon(new ImageIcon(TeachingEvaluation.class.getResource("/team_twww_jwgl_image/1bcf9033165ebe689d3ae4b3e25d9b9.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panduanActionPerformed(e);
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel label = new JLabel("\u8BFE\u7A0B\u7F16\u53F7");
		label.setIcon(new ImageIcon(TeachingEvaluation.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		
		 rdbtnA = new JRadioButton("   A:   \u975E\u5E38\u6EE1\u610F");
		rdbtnA.setFont(new Font("宋体", Font.PLAIN, 16));
		
		rdbtnB = new JRadioButton("   B:   \u6EE1\u610F");
		rdbtnB.setFont(new Font("宋体", Font.PLAIN, 16));
		
		 rdbtnC = new JRadioButton("   C:   \u57FA\u672C\u6EE1\u610F");
		rdbtnC.setFont(new Font("宋体", Font.PLAIN, 16));
		
		rdbtnD = new JRadioButton("   D:   \u4E0D\u6EE1\u610F");
		rdbtnD.setFont(new Font("宋体", Font.PLAIN, 16));
		
		ButtonGroup but=new ButtonGroup();
		but.add(rdbtnA);
		but.add(rdbtnB);
		but.add(rdbtnC);
		but.add(rdbtnD);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 678, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addComponent(label)
							.addGap(36)
							.addComponent(courseidTxt, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
							.addGap(98)
							.addComponent(button))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(174)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(rdbtnC)
								.addComponent(rdbtnA))
							.addGap(117)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnB)
								.addComponent(rdbtnD))))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(courseidTxt, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnB)
						.addComponent(rdbtnA))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnD)
						.addComponent(rdbtnC))
					.addGap(19))
		);
		
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
		     String sql = "select course_name,course_id,teacher_name from student_course_view where user_id=? and course_id not in (select course_id from teaching_evaluation_table where user_id=?)";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     
		       prestmt.setInt(1, id);
		  prestmt.setInt(2, id);
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
	@SuppressWarnings("resource")
	private void panduanActionPerformed(ActionEvent e) {
	String ac=null;
		if(rdbtnA.isSelected()) 
			ac="A";
		else if(rdbtnB.isSelected()) {
			ac="B";
			
		}
		else if(rdbtnC.isSelected()) {
			ac="C";
		}
		else if(rdbtnD.isSelected())
		{
			ac="D";
			rdbtnD.doClick();
		}
		else {
			JOptionPane.showConfirmDialog(null, "请选择");
		}
		 but.clearSelection();
		String c_id=courseidTxt.getText();
		database start=new database();
		   Connection con;
		  
		   try {
			con = start.getCon();
			   String sql = "select * from student_course_view  where user_id=? and course_id=?";
			   PreparedStatement prestmt=con.prepareStatement(sql);
			   prestmt.setInt(1, id);
 	           prestmt.setString(2, c_id);
 	     	 ResultSet rs=null;
	          rs = prestmt.executeQuery();
              
 	           if(rs.next())
 	           { 
 				   String sql2 = "select * from teaching_evaluation_table  where user_id=? and course_id=?";
 				  prestmt=con.prepareStatement(sql2);
 				   prestmt.setInt(1, id);
 	 	           prestmt.setString(2, c_id);
 	 	     	 ResultSet rs1=null;
 		          rs1 = prestmt.executeQuery();
 		          if(rs1.next())
 	        	   {String sql1 = "update teaching_evaluation_table set Teaching_Evaluation=? where user_id=? and course_id=?";
			 prestmt=con.prepareStatement(sql1);
		 	            prestmt.setString(1, ac);
		 	            prestmt.setInt(2, id);
		 	           prestmt.setString(3, c_id);
		 	            
		 	            prestmt.executeUpdate();
		 	           JOptionPane.showConfirmDialog(null, "评教成功！");
		 	           this.filltable();
 	        	   }
 		          else {
					
 		        	 String sql1 = "insert  into teaching_evaluation_table value(?,?,?)";
 					 prestmt=con.prepareStatement(sql1);
 				 	            prestmt.setString(1, c_id.trim());
 				 	            prestmt.setInt(2, id);
 				 	           prestmt.setString(3, ac.trim());
 				 	            
 				 	            prestmt.executeUpdate();
 				 	           JOptionPane.showConfirmDialog(null, "评教成功！");
 				 	           this.filltable();
				}
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
