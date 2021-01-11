package team.twww.jwgl.view;


import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
/**
 * 添加学院
 * @author 10265
 *
 */
public class AddCollege extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField collegename;
	private JTextField collegeid;
	private JTextField dean;
	private JTextField phonenumber;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public AddCollege() {
		setFrameIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		setTitle("\u6DFB\u52A0\u5B66\u9662");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 455, 441);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(474, 579, "src/team_twww_jwgl_image/5.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/5.jpg");
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
		JLabel label = new JLabel("\u5B66\u9662\u540D");
		label.setIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/a7634f13499d0a4a02fc680678cf702.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_1 = new JLabel("\u5B66\u9662\u53F7");
		label_1.setIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_2 = new JLabel("\u9662\u957F\u540D");
		label_2.setIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/2.png")));
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_3 = new JLabel("\u7535\u8BDD\u53F7\u7801");
		label_3.setIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		label_3.setFont(new Font("宋体", Font.PLAIN, 20));
		
		collegename = new JTextField();
		collegename.setFont(new Font("宋体", Font.PLAIN, 16));
		collegename.setColumns(10);
		
		collegeid = new JTextField();
		collegeid.setFont(new Font("宋体", Font.PLAIN, 16));
		collegeid.setColumns(10);
		
		dean = new JTextField();
		dean.setFont(new Font("宋体", Font.PLAIN, 16));
		dean.setColumns(10);
		
		phonenumber = new JTextField();
		phonenumber.setFont(new Font("宋体", Font.PLAIN, 16));
		phonenumber.setColumns(10);
		
		JButton button = new JButton("\u6DFB\u52A0");
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.setIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/19eeca4c1b17fbc73b57df1850d43bb.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addActionPerformed(e);//添加
			}
		});
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setFont(new Font("宋体", Font.PLAIN, 16));
		button_1.setIcon(new ImageIcon(AddCollege.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);//重置
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(102)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(label_1)
							.addComponent(label)
							.addComponent(label_2))
						.addComponent(label_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(button, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(collegename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(collegeid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(dean, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1)))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(collegename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(collegeid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(dean, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(phonenumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(74, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	
	}
	/**
	 * 添加学院
	 * @param e
	 */
	database star=new database();
	private void addActionPerformed(ActionEvent e) {
		int result = 0;
		Connection con=null;
		try {
			 con=star.getCon();
		    	     String sql = "insert into college_table  values(?,?,?,?)";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		       prestmt.setString(2, this.collegename.getText());
		       prestmt.setString(3, this.dean.getText());
		       prestmt.setString(4, this.phonenumber.getText());
		       prestmt.setInt(1, Integer.parseInt(this.collegeid.getText()));
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
		collegename.setText("");
		collegeid.setText("");
		dean.setText("");
		phonenumber.setText("");
		
	}
}
