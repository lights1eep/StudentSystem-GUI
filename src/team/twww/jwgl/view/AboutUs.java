package team.twww.jwgl.view;


import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import team.twww.jwgl.util.image_change;

import java.awt.Font;
import javax.swing.ImageIcon;

public class AboutUs extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the frame.
	 * @param 
	 */
	
	@SuppressWarnings("deprecation")
	public AboutUs(int id) {
		setFrameIcon(new ImageIcon(AboutUs.class.getResource("/team_twww_jwgl_image/486fea346f3a5251d04d06a089e0fce.png")));
		setClosable(true);
		setIconifiable(true);
		setTitle("\u5173\u4E8E\u6211\u4EEC");
		setBounds(100, 100, 450, 394);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(w, h, "src/team_twww_jwgl_image/4.jpg");
		 
		ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/4.jpg");
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
		JLabel lblTwww = new JLabel("twww\u5C0F\u7EC4\u6210\u5458");
		lblTwww.setFont(new Font("宋体", Font.PLAIN, 40));
		
		JLabel label = new JLabel("\u7EC4\u957F\uFF1A\u738B\u5929");
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_1 = new JLabel("\u7EC4\u5458\uFF1A\u738B\u8363\u4EAE\u3001\u8C2D\u7693\u6587");
		label_1.setFont(new Font("宋体", Font.PLAIN, 20));
		
		JLabel label_2 = new JLabel("\u7532\u65B9\uFF1A\u738B\u4E9A\u5947");
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(103, Short.MAX_VALUE)
					.addComponent(lblTwww)
					.addGap(91))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(136)
					.addComponent(label)
					.addContainerGap(254, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(136)
					.addComponent(label_1)
					.addContainerGap(154, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(136)
					.addComponent(label_2)
					.addContainerGap(234, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(lblTwww)
					.addGap(26)
					.addComponent(label)
					.addGap(39)
					.addComponent(label_1)
					.addGap(40)
					.addComponent(label_2)
					.addContainerGap(88, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}
