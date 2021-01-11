package team.twww.jwgl.view;



import javax.swing.JInternalFrame;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
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
 * 添加学生
 * @author 10265
 *
 */
public class AddStudent extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField studentname;
	private JTextField studentid;
	private JTextField password;
	private JTextField phonenumber;
	private JTextField hometown;
	private JTextField collegeid;
	private JTextField idnumber;
    ButtonGroup sexgroup=new ButtonGroup();//性别组
    JRadioButton radioButton;//男
    JRadioButton radioButton_1 ;//女
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public AddStudent() {
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(474, 579, "src/team_twww_jwgl_image/8.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/8.jpg");
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
		setFrameIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/2.png")));
		getContentPane().setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u5B66\u751F\u59D3\u540D");
		label.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/2.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_1 = new JLabel("\u5B66\u53F7");
		label_1.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/29d06db147436eca478d8b41f671625.png")));
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/7be65a679cb6aeef5845a7c70376aea.png")));
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_4 = new JLabel("\u624B\u673A\u53F7");
		label_4.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/8ffa42b3ba72df58d3641a479c47ed3.png")));
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_5 = new JLabel("\u7C4D\u8D2F");
		label_5.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/486fea346f3a5251d04d06a089e0fce.png")));
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_6 = new JLabel("\u5B66\u9662\u53F7");
		label_6.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/a7634f13499d0a4a02fc680678cf702.png")));
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel lblS = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7");
		lblS.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/f4346b05eb357fb35a28310e17c3cfd.png")));
		lblS.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/19eeca4c1b17fbc73b57df1850d43bb.png")));
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addActionPerformed(e);//添加
			}
		});
		
		studentname = new JTextField();
		studentname.setFont(new Font("宋体", Font.PLAIN, 16));
		studentname.setColumns(10);
		
		studentid = new JTextField();
		studentid.setFont(new Font("宋体", Font.PLAIN, 16));
		studentid.setColumns(10);
		
		password = new JTextField();
		password.setFont(new Font("宋体", Font.PLAIN, 16));
		password.setColumns(10);
		
		phonenumber = new JTextField();
		phonenumber.setFont(new Font("宋体", Font.PLAIN, 16));
		phonenumber.setColumns(10);
		
		hometown = new JTextField();
		hometown.setFont(new Font("宋体", Font.PLAIN, 16));
		hometown.setColumns(10);
		
		collegeid = new JTextField();
		collegeid.setFont(new Font("宋体", Font.PLAIN, 16));
		collegeid.setColumns(10);
		
		idnumber = new JTextField();
		idnumber.setFont(new Font("宋体", Font.PLAIN, 16));
		idnumber.setColumns(10);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.setIcon(new ImageIcon(AddStudent.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);//重置
			}
		});
		
		radioButton = new JRadioButton("\u7537");
		radioButton.setSelected(true);
		radioButton_1 = new JRadioButton("\u5973");
		
		sexgroup.add(radioButton_1);
		sexgroup.add(radioButton);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_1)
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(label_4)
						.addComponent(label_5)
						.addComponent(label_6)
						.addComponent(lblS, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(149)
							.addComponent(radioButton_1))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGap(66)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(idnumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(collegeid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(hometown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(studentid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(studentname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(radioButton)))))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(studentname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(studentid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(radioButton_1)
						.addComponent(radioButton))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(hometown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(collegeid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblS)
						.addComponent(idnumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(button))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		setTitle("\u6DFB\u52A0\u5B66\u751F");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 474, 579);

	}
	private void addActionPerformed(ActionEvent e) {
		int result = 0;
		Connection con=null;
		database star=new database();
		try {
			 con=star.getCon();
			 String sql1 = "insert into user_Table values(?,?,\"学生\")";
			 PreparedStatement prestmt=con.prepareStatement(sql1);
		       prestmt.setInt(1, Integer.parseInt(this.studentid.getText()));
		       prestmt.setString(2, this.password.getText());
		       prestmt.executeUpdate();
	      	   String sql = "insert into Student_Information_Table (Student_Name,user_ID,Sex,Phone_Number,Hometown,College_id,ID_card) values(?,?,?,?,?,?,?)";
		        prestmt=con.prepareStatement(sql);
		       prestmt.setString(1, this.studentname.getText());
		       prestmt.setInt(2, Integer.parseInt(this.studentid.getText()));
		       if(this.radioButton.isSelected())
		    	   prestmt.setString(3, "男");
		       else
		    	   prestmt.setString(3, "女");
		       prestmt.setString(4, this.phonenumber.getText());
		       prestmt.setString(5, this.hometown.getText());
		       prestmt.setInt(6, Integer.parseInt(this.collegeid.getText()));		       
		       prestmt.setString(7, this.idnumber.getText());
		      result= prestmt.executeUpdate();
	
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
		studentname.setText("");
		studentid.setText("");
		password.setText("");
		radioButton.setSelected(true);
		phonenumber.setText("");
		hometown.setText("");
		collegeid.setText("");
		idnumber.setText("");
		
	}
}
