package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.ImageIcon;

public class AllEvaluationInfo extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;


	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public AllEvaluationInfo() {
		setFrameIcon(new ImageIcon(AllEvaluationInfo.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		setTitle("\u8BC4\u6559\u6C47\u603B");
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
		s.changeSize(w, h, "src/team_twww_jwgl_image/11.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/11.jpg");
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
		JLabel label = new JLabel("\u8BC4\u6559\u4FE1\u606F\u6C47\u603B");
		label.setIcon(new ImageIcon(AllEvaluationInfo.class.getResource("/team_twww_jwgl_image/8ffa42b3ba72df58d3641a479c47ed3.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(274)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 378, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u53F7", "\u8BFE\u7A0B\u540D", "\u4EFB\u8BFE\u8001\u5E08", "A\u7EA7\u4EBA\u6570", "B\u7EA7\u4EBA\u6570", "C\u7EA7\u4EBA\u6570", "D\u7EA7\u4EBA\u6570"
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
		     String sql = "select course_Id,course_name,teacher_name from course_table";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     
		 
		       ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	                 
	             v.add(rs.getString("course_name"));
	             String c_id=rs.getString("course_id");
	            
			      
	             v.add(c_id);  v.add(rs.getString("teacher_name"));
	            int ja=0,jb=0,jc=0,jd=0;
	            String sql1 = "select teaching_evaluation from teaching_evaluation_table where course_id=?";
			    prestmt=con.prepareStatement(sql1);
			     
			      prestmt.setString(1, c_id);
			      ResultSet rs1=prestmt.executeQuery();
			      while (rs1.next()) {
				    String r=rs1.getString("teaching_evaluation");
				    System.out.println("asdasdasdsa="+r);
				    if(r.trim().equals("A"))
				    {
				    	ja++;
				    }
				    else if(r.trim().equals("B"))
				    {
				    	jb++;
				    }
				    else if(r.trim().equals("C"))
				    {
				    	jc++;
				    }
				    else {
						
				    	jd++;
					}
				}
			      String sa=String.valueOf(ja)+"人";
			      String sb=String.valueOf(jb)+"人";
			      String sc=String.valueOf(jc)+"人";
			      String sd=String.valueOf(jd)+"人";
			      
			      v.add(sa);
			      v.add(sb);
			      v.add(sc);
			      v.add(sd);
			      
			       
	            dmt.addRow(v);
	            }
			   rs.close();
	    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
	}
}
