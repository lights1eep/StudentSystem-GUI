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
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Findteastuinfo extends JInternalFrame {
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
	@SuppressWarnings("deprecation")
	public Findteastuinfo(int m) {
		setFrameIcon(new ImageIcon(Findteastuinfo.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		id=m;
		setTitle("\u8BFE\u7A0B\u9009\u8BFE\u5B66\u751F\u4FE1\u606F");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/20.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/20.jpg");
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
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setIcon(new ImageIcon(Findteastuinfo.class.getResource("/team_twww_jwgl_image/1bcf9033165ebe689d3ae4b3e25d9b9.png")));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lookActionPerformed(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(17)))
					.addGap(27))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(28)
							.addComponent(button))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		
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
