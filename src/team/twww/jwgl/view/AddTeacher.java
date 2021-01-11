package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import java.awt.Color;

import javax.swing.ButtonGroup;
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
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
/**
 * 添加教师
 * @author 10265
 *
 */
public class AddTeacher extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField teachername;
	private JTextField teacherid;
	private JTextField password;
	private JTextField phonenumber;
	private JTextField collegeid;
	JRadioButton radioButton;//男
	JRadioButton radioButton_1;//女
	ButtonGroup sexGroup=new ButtonGroup();//性别组
	JComboBox<String> jobBox = new JComboBox<String>();//职称组
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public AddTeacher() {
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
	
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(500, 579, "src/team_twww_jwgl_image/9.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/9.jpg");
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
		setFrameIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		getContentPane().setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u6559\u5E08\u59D3\u540D");
		label.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/2.png")));
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		teachername = new JTextField();
		teachername.setFont(new Font("宋体", Font.PLAIN, 16));
		teachername.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6559\u5E08\u5DE5\u53F7");
		label_1.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/8ffa42b3ba72df58d3641a479c47ed3.png")));
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		teacherid = new JTextField();
		teacherid.setFont(new Font("宋体", Font.PLAIN, 16));
		teacherid.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5BC6\u7801");
		label_2.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/29d06db147436eca478d8b41f671625.png")));
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		
		password = new JTextField();
		password.setFont(new Font("宋体", Font.PLAIN, 16));
		password.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/7be65a679cb6aeef5845a7c70376aea.png")));
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_4 = new JLabel("\u804C\u79F0");
		label_4.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/f4346b05eb357fb35a28310e17c3cfd.png")));
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_5 = new JLabel("\u624B\u673A\u53F7");
		label_5.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/f4346b05eb357fb35a28310e17c3cfd.png")));
		label_5.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_6 = new JLabel("\u5B66\u9662\u53F7");
		label_6.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/a7634f13499d0a4a02fc680678cf702.png")));
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		
		phonenumber = new JTextField();
		phonenumber.setFont(new Font("宋体", Font.PLAIN, 16));
		phonenumber.setColumns(10);
		
		collegeid = new JTextField();
		collegeid.setFont(new Font("宋体", Font.PLAIN, 16));
		collegeid.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/19eeca4c1b17fbc73b57df1850d43bb.png")));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addActionPerformed(e);//添加教师
			}
		});
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setIcon(new ImageIcon(AddTeacher.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		button_1.setFont(new Font("宋体", Font.PLAIN, 16));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);//重置界面
			}
		});
		
		radioButton = new JRadioButton("\u7537");
		
		radioButton_1 = new JRadioButton("\u5973");
		sexGroup.add(radioButton);
		sexGroup.add(radioButton_1);
		radioButton.setSelected(true);
		jobBox.setFont(new Font("宋体", Font.PLAIN, 16));
		
		jobBox.setModel(new DefaultComboBoxModel<String>(new String[] {"\u6559\u6388", "\u526F\u6559\u6388", "\u8BB2\u5E08", "\u52A9\u6559"}));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(106)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label_6)
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(label_5)
						.addComponent(label_4))
					.addGap(132)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(teachername)
							.addComponent(password)
							.addComponent(teacherid)
							.addComponent(phonenumber)
							.addComponent(collegeid)
							.addGroup(groupLayout.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(jobBox, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(radioButton)
							.addGap(18)
							.addComponent(radioButton_1)))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(teachername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(teacherid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(radioButton)
						.addComponent(radioButton_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(85)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6)
								.addComponent(collegeid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_4)
								.addComponent(jobBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button))
					.addGap(49))
		);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setIconifiable(true);
		setTitle("\u6DFB\u52A0\u6559\u5E08");
		setBounds(100, 100, 513, 549);

	}
	/**
	 * 添加教师
	 * @param e
	 */
	private void addActionPerformed(ActionEvent e) {
		int result = 0;
		Connection con=null;
		database star=new database();
		try {
			 con=star.getCon();
			 String sql1 = "insert into user_Table values(?,?,\"教师\")";
			 PreparedStatement prestmt=con.prepareStatement(sql1);
		       prestmt.setInt(1, Integer.parseInt(this.teacherid.getText()));
		       prestmt.setString(2, this.password.getText());
		       prestmt.executeUpdate();
			 String sql = "insert into Teacher_Information_Table (Teacher_Name,User_ID,Sex,Phone_Number,College_id,Job_Title) values(?,?,?,?,?,?)";
		       prestmt=con.prepareStatement(sql);
		       prestmt.setString(1, this.teachername.getText());
		       prestmt.setInt(2, Integer.parseInt(this.teacherid.getText()));
		       
		       
		       if(this.radioButton.isSelected())
		    	   prestmt.setString(3, "男");
		       else
		    	   prestmt.setString(3, "女");
		       prestmt.setString(4, this.phonenumber.getText());
		       prestmt.setInt(5,Integer.parseInt(this.collegeid.getText()));		       
		       prestmt.setString(6, (String) this.jobBox.getSelectedItem());
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
		teachername.setText("");
		teacherid.setText("");
		password.setText("");
		radioButton.setSelected(true);
		phonenumber.setText("");
		jobBox.setSelectedIndex(0);
		collegeid.setText("");
	}
}
