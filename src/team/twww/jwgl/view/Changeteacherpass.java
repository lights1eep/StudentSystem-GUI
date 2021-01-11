package team.twww.jwgl.view;



import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;
import team.twww.jwgl.util.string_empty;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Changeteacherpass extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the frame.
	 */
	int id;
	@SuppressWarnings("deprecation")
	public Changeteacherpass(int m) {
		getContentPane().setFont(new Font("宋体", Font.PLAIN, 16));
		setFrameIcon(new ImageIcon(Changeteacherpass.class.getResource("/team_twww_jwgl_image/29d06db147436eca478d8b41f671625.png")));
		id=m;
		setClosable(true);
		setIconifiable(true);
		setTitle("\u4FEE\u6539\u5BC6\u7801");
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
		s.changeSize(w, h, "src/team_twww_jwgl_image/12.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/12.jpg");
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
		JLabel label = new JLabel("\u539F\u5BC6\u7801\uFF1A");
		label.setIcon(new ImageIcon(Changeteacherpass.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel label_1 = new JLabel("\u65B0\u5BC6\u7801\uFF1A");
		label_1.setIcon(new ImageIcon(Changeteacherpass.class.getResource("/team_twww_jwgl_image/be6f0e5c3b81b3974865be0240efab6.png")));
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel label_2 = new JLabel("");
		
		JLabel label_3 = new JLabel("\u786E\u8BA4\u65B0\u5BC6\u7801\uFF1A");
		label_3.setIcon(new ImageIcon(Changeteacherpass.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		label_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 16));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 16));
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u63D0\u4EA4");
		button.setIcon(new ImageIcon(Changeteacherpass.class.getResource("/team_twww_jwgl_image/1bcf9033165ebe689d3ae4b3e25d9b9.png")));
		button.setFont(new Font("宋体", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 changepassage(e);
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(89)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
					.addGap(93))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(193, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(130))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(139)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(27)
					.addComponent(button)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	private void changepassage(ActionEvent e) {
		String old_pass=textField.getText();
		String new_pass=textField_1.getText();
		String new_pass1=textField_2.getText();
		
		
		if(string_empty.isempty(old_pass))
		{
			JOptionPane.showConfirmDialog(null, "密码不能为空");
			return;
		}
	
		
		database start=new database();
		   Connection con;
		  
		   try {
			con = start.getCon();
			   // 要执行的SQL语句
	           String sql = "select * from user_table where user_id=? and user_password=? ";
	           PreparedStatement prestmt=con.prepareStatement(sql);
	            prestmt.setInt(1, id);
	            prestmt.setString(2, old_pass);
	         
	            
	            //prestmt.setString(3, "学生");
	          	 ResultSet rs=null;
	          rs = prestmt.executeQuery();

	          if(rs.next())
	          {
	        	  
	            if(new_pass.trim().equals(new_pass1.trim()))
	            {
	            	
	            	 String sql1 = "update user_table set user_password=? where user_id=?";
	            prestmt=con.prepareStatement(sql1);
	 	            prestmt.setString(1, new_pass);
	 	            prestmt.setInt(2, id);
	 	            prestmt.executeUpdate();
	 	            
	 	           JOptionPane.showConfirmDialog(null, "密码修改成功!!");
	 	           return;
	            }
	            else {
	            	JOptionPane.showConfirmDialog(null, "两次密码不匹配！");
				}
	        	  
	         // System.exit(0);
	          }
	          else {
				
	        	  JOptionPane.showConfirmDialog(null, "原密码出错！");
			}
	          
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		    
        
	}
}
