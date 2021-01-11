package team.twww.jwgl.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Toolkit;

/**
 * 学生主界面
 * @author 27257
 *
 */
public class StudentFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;;

	/**
	 * Create the frame.
	 */
	JDesktopPane desktopPane = new JDesktopPane();
	int id;
	@SuppressWarnings("deprecation")
	public StudentFrame(int m) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(StudentFrame.class.getResource("/team_twww_jwgl_image/7be65a679cb6aeef5845a7c70376aea.png")));
		id=m;
		
		setFont(new Font("宋体", Font.BOLD, 25));
		setTitle("\u5B66\u751F\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1442, 783);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
			//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		//s.changeSize(w, h, "src/team_twww_jwgl_image/24.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/st.jpg");
		 JLabel tu = new JLabel(background);
		 tu.setBounds(0, 0, background.getIconWidth(),
				    background.getIconHeight());
		// contentPane.add(tu);
		 this.getLayeredPane().add(tu,new Integer(Integer.MIN_VALUE));
		 desktopPane.add(tu,new Integer(Integer.MIN_VALUE));
	        desktopPane.setOpaque(false);
	//	JMenuBar menuBar = new JMenuBar();
		
		
		
		
		
	
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setOpaque(false);
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 130, 30);
		panel.add(menuBar_1);
		
		JMenu mnNewMenu1 = new JMenu("\u4E2A\u4EBA\u4FE1\u606F     ");
		mnNewMenu1.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_1.add(mnNewMenu1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u4FE1\u606F\u67E5\u8BE2    ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StuInfCheck stuInfCheck=new StuInfCheck(id);
				stuInfCheck.setVisible(true);
				desktopPane.add(stuInfCheck);
			}
		});
		mntmNewMenuItem.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Changeteacherpass changePassword=new Changeteacherpass(id);
				changePassword.setVisible(true);
				desktopPane.add(changePassword);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu1.add(mntmNewMenuItem_1);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(0, 35, 130, 35);
		panel.add(menuBar_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u9009\u8BFE\u4FE1\u606F     ");
		mnNewMenu_1.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_2.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5B66\u751F\u9009\u8BFE    ");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentChooseCourse studentChooseCourse=new StudentChooseCourse(id);
				studentChooseCourse.setVisible(true);
				desktopPane.add(studentChooseCourse);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u5B66\u751F\u9000\u8BFE ");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentCancelCourse studentCancelCourse=new StudentCancelCourse(id);
				studentCancelCourse.setVisible(true);
				desktopPane.add(studentCancelCourse);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuBar menuBar_3 = new JMenuBar();
		menuBar_3.setBounds(0, 75, 130, 30);
		panel.add(menuBar_3);
		
		JMenu mnNewMenu_2 = new JMenu("\u8BFE\u7A0B\u4FE1\u606F     ");
		mnNewMenu_2.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_3.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\u672C\u5B66\u671F\u8BFE\u8868  ");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseInformation courseInformation=new CourseInformation(id);
				courseInformation.setVisible(true);
				desktopPane.add(courseInformation);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuBar menuBar_4 = new JMenuBar();
		menuBar_4.setBounds(0, 110, 130, 30);
		panel.add(menuBar_4);
		
		JMenu mnNewMenu_3 = new JMenu("\u6210\u7EE9\u4FE1\u606F      ");
		mnNewMenu_3.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_4.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\u6210\u7EE9\u67E5\u8BE2    ");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				GradeInformation gradeInformation=new GradeInformation(id);
				gradeInformation.setVisible(true);
				desktopPane.add(gradeInformation);
			}
		});
		mntmNewMenuItem_7.setFont(new Font("宋体", Font.PLAIN, 16));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuBar menuBar_5 = new JMenuBar();
		menuBar_5.setBounds(0, 180, 130, 30);
		panel.add(menuBar_5);
		
		JMenu mnNewMenu_4 = new JMenu("\u5173    \u4E8E      ");
		mnNewMenu_4.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_5.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC    ");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs aboutUs=new AboutUs(id);
				aboutUs.setVisible(true);
				desktopPane.add(aboutUs);
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
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(307, Short.MAX_VALUE))
		);
		gl_desktopPane.setVerticalGroup(
			gl_desktopPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
		);
		
		JMenuBar menuBar_6 = new JMenuBar();
		menuBar_6.setBounds(0, 145, 130, 30);
		panel.add(menuBar_6);
		
		JMenu menu_5 = new JMenu("\u6559\u5B66\u8BC4\u4EF7     ");
		
		menu_5.setFont(new Font("宋体", Font.BOLD, 16));
		menuBar_6.add(menu_5);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\u6559\u5B66\u8BC4\u4EF7    ");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeachingEvaluation teachingEvaluation=new TeachingEvaluation(id);
				teachingEvaluation.setVisible(true);
				desktopPane.add(teachingEvaluation);
			}
		});
		mntmNewMenuItem_9.setFont(new Font("宋体", Font.PLAIN, 16));
		menu_5.add(mntmNewMenuItem_9);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		desktopPane.setLayout(gl_desktopPane);
		contentPane.add(desktopPane, BorderLayout.CENTER);
			this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}
