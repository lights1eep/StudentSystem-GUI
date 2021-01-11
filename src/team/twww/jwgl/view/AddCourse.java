package team.twww.jwgl.view;


import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/**
 * 添加课程
 * @author 10265
 *
 */
public class AddCourse extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Coursename;
	private JTextField Courseid;
	private JTextField teachername;
	private JTextField teacherid;
	private JTextField numberofstu;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public AddCourse() {
		this.toFront();
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(520, 579, "src/team_twww_jwgl_image/6.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/6.jpg");
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
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 16));
		setFrameIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		getContentPane().setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u8BFE\u7A0B\u540D");
		label.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/a7634f13499d0a4a02fc680678cf702.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_1 = new JLabel("\u8BFE\u7A0B\u53F7");
		label_1.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/a7634f13499d0a4a02fc680678cf702.png")));
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_2 = new JLabel("\u6559\u5E08\u540D");
		label_2.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/2.png")));
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_3 = new JLabel("\u6559\u5E08\u5DE5\u53F7");
		label_3.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/2.png")));
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_4 = new JLabel("\u9009\u8BFE\u4EBA\u6570");
		label_4.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/7be65a679cb6aeef5845a7c70376aea.png")));
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		
		Coursename = new JTextField();
		Coursename.setFont(new Font("宋体", Font.PLAIN, 16));
		Coursename.setColumns(10);
		
		Courseid = new JTextField();
		Courseid.setFont(new Font("宋体", Font.PLAIN, 16));
		Courseid.setColumns(10);
		
		teachername = new JTextField();
		teachername.setFont(new Font("宋体", Font.PLAIN, 16));
		teachername.setColumns(10);
		
		teacherid = new JTextField();
		teacherid.setFont(new Font("宋体", Font.PLAIN, 16));
		teacherid.setColumns(10);
		
		numberofstu = new JTextField();
		numberofstu.setFont(new Font("宋体", Font.PLAIN, 16));
		numberofstu.setColumns(10);
		
		JButton add = new JButton("\u6DFB\u52A0");
		add.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/19eeca4c1b17fbc73b57df1850d43bb.png")));
		add.setFont(new Font("宋体", Font.PLAIN, 16));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addActionPerformed(e);//添加课程
			}
		});
		
		JButton reset = new JButton("\u91CD\u7F6E");
		reset.setIcon(new ImageIcon(AddCourse.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		reset.setFont(new Font("宋体", Font.PLAIN, 16));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);//重置
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(add, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(label_1)
							.addComponent(label)
							.addComponent(label_2)
							.addComponent(label_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label_4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(numberofstu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(teacherid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(teachername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Courseid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Coursename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(reset, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(Coursename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(Courseid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(teachername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(teacherid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(numberofstu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(add)
						.addComponent(reset))
					.addGap(65))
		);
		getContentPane().setLayout(groupLayout);
		setIconifiable(true);
		setClosable(true);
		setTitle("\u6DFB\u52A0\u8BFE\u7A0B");
		setBounds(100, 100, 520, 480);

	}
	/**
	 * 添加课程
	 * @param e
	 */
	private void addActionPerformed(ActionEvent e) {
		int result = 0;
		Connection con=null;
		database star=new database();
		try {
			 con=star.getCon();
	    	     String sql = "insert into Course_Table (Course_Name,Course_ID,Teacher_Name,User_ID,Student_number) values(?,?,?,?,?)";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		       prestmt.setString(1, this.Coursename.getText());
		       prestmt.setString(2, this.Courseid.getText());
		       prestmt.setString(3, this.teachername.getText());
		       prestmt.setInt(4, Integer.parseInt(this.teacherid.getText()));
		       prestmt.setInt(5, Integer.parseInt(this.numberofstu.getText()));
		       result=prestmt.executeUpdate();
	
	          con.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally
		{
			if(result==1)
				JOptionPane.showMessageDialog(null, "添加成功！");
			else
				JOptionPane.showMessageDialog(null, "添加失败！");
		}
	}
	/**
	 * 重置
	 * @param e
	 */
	private void resetActionPerformed(ActionEvent e) {
		Coursename.setText("");
		Courseid.setText("");
		teachername.setText("");
		teacherid.setText("");
		numberofstu.setText("");
	}

}
