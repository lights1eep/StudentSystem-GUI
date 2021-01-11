package team.twww.jwgl.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import team.twww.jwgl.util.image_change;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;

/**
 * 管理员界面
 * @author 10265
 *
 */
public class AdministratorFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JDesktopPane desktopPane=new JDesktopPane();
	@SuppressWarnings("deprecation")
	public AdministratorFrame() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(AdministratorFrame.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		//setIconImage(Toolkit.getDefaultToolkit().getImage(AdministratorFrame.class.getResource("/team_twww_jwgl_image/1.jpg")));
		//background = new ImageIcon("src/team_twww_jwgl_image/1.jpg");// 背景图片
		//  JLabel tu = new JLabel(background);// 把背景图片显示在一个标签里面
		  // 把标签的大小位置设置为图片刚好填充整个面板
		  //tu.setBounds(0, 0, background.getIconWidth(),
		 //   background.getIconHeight());
		  // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(1600, 800, "src/team_twww_jwgl_image/ad.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/ad.jpg");
		 JLabel tu = new JLabel(background);
		 tu.setBounds(0, 0, background.getIconWidth(),
				    background.getIconHeight());
		// contentPane.add(tu);
		 this.getLayeredPane().add(tu,new Integer(Integer.MIN_VALUE));
		 desktopPane.add(tu,new Integer(Integer.MIN_VALUE));
	        desktopPane.setOpaque(false);
	// contentPane.setOpaque(false);
	        //panel和panelTop设置透明
	      //  panelTop.setOpaque(false);
		setTitle("\u7BA1\u7406\u5458\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 130, 30);
		panel.add(menuBar_1);
		
		JMenu mnNewMenu = new JMenu("\u8BFE\u7A0B\u4FE1\u606F       ");
		mnNewMenu.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_1.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u67E5\u8BE2\u8BFE\u7A0B    ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindCourse fcourse=new FindCourse();
				fcourse.setVisible(true);
				desktopPane.add(fcourse);//查询课程
			}
		});
		mntmNewMenuItem.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u6DFB\u52A0\u8BFE\u7A0B");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCourse acourse= new AddCourse();
				acourse.setVisible(true);
				desktopPane.add(acourse);//添加课程
			}
		});
		mntmNewMenuItem_1.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(0, 35, 130, 35);
		panel.add(menuBar_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u6559\u5E08\u4FE1\u606F       ");
		mnNewMenu_1.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_2.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u67E5\u8BE2\u6559\u5E08    ");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				FindTeacher fteacher=new FindTeacher();
			fteacher.setVisible(true);
			desktopPane.add(fteacher);//查询教师
			}
		});
		mntmNewMenuItem_2.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u6DFB\u52A0\u6559\u5E08 ");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTeacher ateacher= new AddTeacher();
				ateacher.setVisible(true);
				desktopPane.add(ateacher);//添加教师
			}
		});
		mntmNewMenuItem_3.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\u8BC4\u6559\u6C47\u603B");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllEvaluationInfo ateacher1= new AllEvaluationInfo();
				ateacher1.setVisible(true);
				desktopPane.add(ateacher1);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuBar menuBar_3 = new JMenuBar();
		menuBar_3.setBounds(0, 75, 130, 30);
		panel.add(menuBar_3);
		
		JMenu mnNewMenu_2 = new JMenu("\u5B66\u751F\u4FE1\u606F      ");
		mnNewMenu_2.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_3.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u67E5\u8BE2\u5B66\u751F    ");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindStudent fstudent=new FindStudent();
				fstudent.setVisible(true);
				desktopPane.add(fstudent);//查询学生
			}
		});
		mntmNewMenuItem_5.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\u6DFB\u52A0\u5B66\u751F");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent astudent= new AddStudent();
				astudent.setVisible(true);
				desktopPane.add(astudent);//添加学生
			}
		});
		mntmNewMenuItem_6.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem menuItem_11 = new JMenuItem("\u67E5\u770B\u6210\u7EE9");
		menuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindStudentscore find= new FindStudentscore();
				find.setVisible(true);
				desktopPane.add(find);//查看成绩
			}
		});
		menuItem_11.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_2.add(menuItem_11);
		
		JMenuBar menuBar_4 = new JMenuBar();
		menuBar_4.setBounds(0, 110, 130, 30);
		panel.add(menuBar_4);
		
		JMenu mnNewMenu_3 = new JMenu("\u5B66\u9662\u4FE1\u606F      ");
		mnNewMenu_3.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_4.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\u67E5\u8BE2\u5B66\u9662    ");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindCollege fcollege = new FindCollege();
				fcollege.setVisible(true);
				desktopPane.add(fcollege);//查询学院
			}
		});
		mntmNewMenuItem_7.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\u6DFB\u52A0\u5B66\u9662");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCollege acollege=new AddCollege();
				acollege.setVisible(true);
				//acollege.show();
				//acollege.toFront();
				//acollege.alwaysOnTop(true);
				desktopPane.add(acollege);//添加学院
			}
		});
		mntmNewMenuItem_8.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JMenuBar menuBar_5 = new JMenuBar();
		menuBar_5.setBounds(0, 145, 130, 30);
		panel.add(menuBar_5);
		
		JMenu mnNewMenu_4 = new JMenu("\u5173    \u4E8E      ");
		mnNewMenu_4.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_5.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC    ");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs aus=new AboutUs(1);
				aus.setVisible(true);
				desktopPane.add(aus);//关于我们
			}
		});
		mntmNewMenuItem_10.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		mntmNewMenuItem_11.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result =JOptionPane.showConfirmDialog(null, "是否退出系统？");//退出
				if(result==0)
				{
					dispose();
				}
			}
		});;
		mntmNewMenuItem_11.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_4.add(mntmNewMenuItem_11);
		//desktopPane.getRootPane().setOpaque(false);
		// desktopPane.getRootPane().add(tu);
		// desktopPane.get
		// ((JPanel)cp).setOpaque(false);
		  // 内容窗格默认的布局管理器为BorderLayout
		// Container ct=getContentPane();
		 // ct.add(tu);
		GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
		gl_desktopPane.setHorizontalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
			//	.addComponent(tu)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				//.addComponent(tu)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
		);
		desktopPane.setLayout(gl_desktopPane);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}
