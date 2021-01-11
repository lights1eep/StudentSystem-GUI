package team.twww.jwgl.view;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FindTeacherInfo extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table_1;

	/**
	 * Create the frame.
	 */int id;
	 
	@SuppressWarnings("deprecation")
	public FindTeacherInfo(int m) {
		setFrameIcon(new ImageIcon(FindTeacherInfo.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		  id=m; 
		setTitle("\u4FE1\u606F\u67E5\u8BE2");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 588, 405);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/19.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/19.jpg");
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
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(87)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(94, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(115)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(140, Short.MAX_VALUE))
		);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u6559\u5E08\u59D3\u540D", "\u804C\u5DE5\u53F7", "\u6027\u522B", "\u624B\u673A\u53F7", "\u5B66\u9662\u53F7", "\u804C\u79F0"
			}
		));
		
		scrollPane.setViewportView(table_1);
		
	
		getContentPane().setLayout(groupLayout);
		    this.filltable();
	}
	private void filltable() {
		DefaultTableModel dmt=(DefaultTableModel)table_1.getModel();
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();
		
		  try {
			 con=star.getCon();
			 //要执行的SQL语句
		     String sql = "select *from teacher_information_view where user_id=?";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		       prestmt.setInt(1, id);
		       System.out.println(id);
		       ResultSet rs=prestmt.executeQuery();
	          int ID = 0;
	         String name=null;
	     String c_name = null;
	      while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	                
	            // ID = rs.getInt("user_id");              
	                v.add(String.valueOf(rs.getInt("user_id")));    // name = rs.getString("teacher_name");
	            v.add(rs.getString("teacher_name")); 
	            //sex=rs.getString("Sex");
	            v.add(rs.getString("Sex")); 
	          //  ph_num=rs.getString("Phone_Number");
	            v.add(rs.getString("Phone_Number"));
	            //c_name=rs.getString("college_name");
	            v.add(rs.getString("college_name"));
	            //Job_Title= rs.getString("Job_Title");
	            v.add(rs.getString("Job_Title")); 
	            dmt.addRow(v);
	            System.out.println("\t123\t|\t" + ID + "\t" + name + "\t" + c_name );
	          }
			 System.out.println("\t\t-----------------------------------------------------------------");
	         rs.close();
	    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
	}
}
