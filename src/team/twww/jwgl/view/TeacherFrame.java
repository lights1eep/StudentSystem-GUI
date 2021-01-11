package team.twww.jwgl.view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class TeacherFrame extends JFrame {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JDesktopPane desktopPane = new JDesktopPane();
	/**
	 * Create the frame.
	 */
	int id;
	
	@SuppressWarnings("deprecation")
	public TeacherFrame(int m) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(TeacherFrame.class.getResource("/team_twww_jwgl_image/2.png")));
		id=m;
		setTitle("\u6559\u5E08\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1442, 783);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
	int w=(int)this.getSize().getWidth();
		int h=(int)this.getSize().getHeight();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		//s.changeSize(w, h, "src/team_twww_jwgl_image/27.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/te.jpg");
		 System.out.println(w+" "+h);
		 JLabel tu = new JLabel(background);
		 tu.setBounds(0, 0, background.getIconWidth(),
				    background.getIconHeight());
		// contentPane.add(tu);
		 this.getLayeredPane().add(tu,new Integer(Integer.MIN_VALUE));
		 desktopPane.add(tu,new Integer(Integer.MIN_VALUE));
	        desktopPane.setOpaque(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 130, 30);
		panel.add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("\u4E2A\u4EBA\u4FE1\u606F     ");
		mnNewMenu.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u4FE1\u606F\u67E5\u8BE2    ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindTeacherInfo fteacherinfo=new FindTeacherInfo(id);
				fteacherinfo.setVisible(true);
				desktopPane.add(fteacherinfo);
			}
		});
		mntmNewMenuItem.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeteacherpass cteacherp=new Changeteacherpass(id);
				cteacherp.setVisible(true);
				desktopPane.add(cteacherp);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem menuItem_8 = new JMenuItem("\u8BC4\u6559\u6C47\u603B");
		menuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EvaluationInformation cteacherp1=new EvaluationInformation(id);
				cteacherp1.setVisible(true);
				desktopPane.add(cteacherp1);
			}
		});
		menuItem_8.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu.add(menuItem_8);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(0, 35, 130, 35);
		panel.add(menuBar_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u6559\u5B66\u4FE1\u606F       ");
		mnNewMenu_1.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_2.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u8BFE\u7A0B\u4FE1\u606F    ");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherCourse tc=new TeacherCourse(id);
				tc.setVisible(true);
				desktopPane.add(tc);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u5B66\u751F\u9009\u8BFE\u4FE1\u606F");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Findteastuinfo ftsi=new Findteastuinfo(id);
				ftsi.setVisible(true);
				desktopPane.add(ftsi);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u5F55\u5165\u6210\u7EE9");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddScore as=new AddScore(id);
				as.setVisible(true);
				desktopPane.add(as);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuBar menuBar_5 = new JMenuBar();
		menuBar_5.setBounds(0, 75, 130, 30);
		panel.add(menuBar_5);
		
		JMenu mnNewMenu_4 = new JMenu("\u5173    \u4E8E      ");
		
		mnNewMenu_4.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_5.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC    ");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs aus=new AboutUs(id);
				aus.setVisible(true);
				desktopPane.add(aus);
			}
		});
		mntmNewMenuItem_10.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "是否退出系统？");
				if(result==0)
				{
					dispose();
				}
			}
		});
		mntmNewMenuItem_11.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_11);
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_desktopPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(1279, Short.MAX_VALUE))
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_desktopPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(595, Short.MAX_VALUE))
		);
		panel.setOpaque(false);
		desktopPane.setLayout(gl_desktopPane);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}
