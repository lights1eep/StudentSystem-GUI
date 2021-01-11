package team.twww.jwgl.view;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;
import team.twww.jwgl.util.string_empty;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accountField;
	private JPasswordField passwordField;
	JComboBox<String> idBox = new JComboBox<String>();
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/team_twww_jwgl_image/2.png")));
		setTitle("\u767B\u5F55");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 447);
			contentPane = new JPanel();
			
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/3.jpg");
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/3.jpg");
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
	        
		
		 
		 
		JLabel label = new JLabel("\u6559\u52A1\u7BA1\u7406\u7CFB\u7EDF\u767B\u5F55\u754C\u9762");
		label.setIcon(new ImageIcon(Login.class.getResource("/team_twww_jwgl_image/7be65a679cb6aeef5845a7c70376aea.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setOpaque(false);
		JLabel account = new JLabel("\u8D26\u53F7");
		account.setIcon(new ImageIcon(Login.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		account.setFont(new Font("宋体", Font.PLAIN, 16));
		account.setOpaque(false);
		JLabel password = new JLabel("\u5BC6\u7801");
		password.setIcon(new ImageIcon(Login.class.getResource("/team_twww_jwgl_image/be6f0e5c3b81b3974865be0240efab6.png")));
		password.setFont(new Font("宋体", Font.PLAIN, 16));
		
		accountField = new JTextField();
		accountField.setFont(new Font("宋体", Font.PLAIN, 16));
		accountField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel id = new JLabel("\u8EAB\u4EFD");
		id.setIcon(new ImageIcon(Login.class.getResource("/team_twww_jwgl_image/8ffa42b3ba72df58d3641a479c47ed3.png")));
		id.setFont(new Font("宋体", Font.PLAIN, 16));
		idBox.setFont(new Font("宋体", Font.PLAIN, 16));
		
		idBox.setModel(new DefaultComboBoxModel<String>(new String[] {"\u5B66\u751F", "\u6559\u5E08", "\u7BA1\u7406\u5458"}));
		idBox.setToolTipText("");
		
		JButton login = new JButton("\u767B\u5F55");
		login.setIcon(new ImageIcon(Login.class.getResource("/team_twww_jwgl_image/1bcf9033165ebe689d3ae4b3e25d9b9.png")));
		login.setFont(new Font("宋体", Font.PLAIN, 16));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});
	
		JButton reset = new JButton("\u91CD\u7F6E");
		reset.setIcon(new ImageIcon(Login.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		reset.setFont(new Font("宋体", Font.PLAIN, 16));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetActionPerformed(e);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(146, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(id)
										.addComponent(password)
										.addComponent(account))
									.addGap(130))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(login)
									.addGap(107)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(reset)
								.addComponent(idBox, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(accountField, 97, 97, 97))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(137)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(180, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(53)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(account)
						.addComponent(accountField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(password)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(id)
						.addComponent(idBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(reset)
						.addComponent(login))
					.addGap(43))
		);
	
		contentPane.setLayout(gl_contentPane);
		this.setVisible(true);
	}
	private void loginActionPerformed(ActionEvent e) {
		String accounnt=accountField.getText();
		String pass=new String(passwordField.getPassword());
		String pos=(String) idBox.getSelectedItem();
		if(string_empty.isempty(accounnt))
		{
			JOptionPane.showConfirmDialog(null, "用户名信息不能为空");
			return;
		}
		if(string_empty.isempty(pass))
		{
			JOptionPane.showConfirmDialog(null, "密码不能为空");
			return;
		}
		int id=Integer.parseInt(accounnt);
		
		//database start=new database();
		   Connection con;
			database star=new database();
		   try {
			con = star.getCon();
			   // 要执行的SQL语句
	           String sql = "select *from user_table where user_id=? and user_password=? and user_position=? ";
	           PreparedStatement prestmt=con.prepareStatement(sql);
	            prestmt.setInt(1, id);
	            prestmt.setString(2, pass);
	            prestmt.setString(3, pos);
	            
	            //prestmt.setString(3, "学生");
	          	 ResultSet rs=null;
	          rs = prestmt.executeQuery();

	          if(rs.next())
	          {
	        	  JOptionPane.showConfirmDialog(null, "登录成功！！！");
	        	  if("教师".equals(pos))
	        		  new TeacherFrame(id);
	      	   else if("管理员".equals(pos))
	      		new AdministratorFrame(); 
	             else
	        		new StudentFrame(id);
	         dispose();
	        	  
	         // System.exit(0);
	          }
	          else {
				
	        	  JOptionPane.showConfirmDialog(null, "用户名密码或者身份出错！");
			}
	          
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		    
        
	}
	private void resetActionPerformed(ActionEvent e) {
		accountField.setText("");
		passwordField.setText("");
	}
	
	public static void main(String[] args) {
		
		   new Login();
		    
}
}
