package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.border.EmptyBorder;

import java.awt.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Vector;
import javax.swing.ImageIcon;

/**
 * 学生信息查询
 * @author 27257
 *
 */
public class StuInfCheck extends JInternalFrame {
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
	public StuInfCheck(int m) {
		setFrameIcon(new ImageIcon(StuInfCheck.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		id=m;
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 20));
		setResizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("\u4E2A\u4EBA\u4FE1\u606F\u67E5\u8BE2");
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
		s.changeSize(w, h, "src/team_twww_jwgl_image/25.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/25.jpg");
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
		JLabel label = new JLabel("\u4F60\u7684\u4E2A\u4EBA\u4FE1\u606F");
		label.setIcon(new ImageIcon(StuInfCheck.class.getResource("/team_twww_jwgl_image/2.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(225)
							.addComponent(label))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(label)
					.addGap(29)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(119, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8D26\u53F7", "\u59D3\u540D", "\u6027\u522B", "\u624B\u673A\u53F7", "\u5B66\u9662", "\u7C4D\u8D2F", "\u8EAB\u4EFD\u8BC1\u53F7"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(69);
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
		     String sql = "select * from student_information_view where user_id=?";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     
		       prestmt.setInt(1, id);
		 
		       ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	                 v.add(String.valueOf(rs.getString("student_name"))); 
	               
	                 v.add(rs.getString("sex"));
	                 v.add(String.valueOf(rs.getString("Phone_number"))); 
	              //   v.add(rs.getInt("Phone_number"));
	                 v.add(rs.getString("college_name"));
	                 v.add(rs.getString("hometown"));
	            // ID = rs.getInt("user_id");              
	            v.add(rs.getString("id_card"));
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
}
