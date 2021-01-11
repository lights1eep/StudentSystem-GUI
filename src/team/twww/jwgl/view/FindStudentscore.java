package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
/**
 * 添加学院
 * @author 10265
 *
 */
public class FindStudentscore extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField collegename;
	private JTable collegetable;
	private JTextField studentname_update;
	private JTextField userid_update;
	private JTextField coursename_update;
	private JTextField score;
	private JTextField teachername;
	private JTextField courseid;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public FindStudentscore() {
		setFrameIcon(new ImageIcon(FindStudentscore.class.getResource("/team_twww_jwgl_image/8ffa42b3ba72df58d3641a479c47ed3.png")));
		setClosable(true);
		setIconifiable(true);
		setTitle("\u67E5\u8BE2\u5B66\u751F\u6210\u7EE9");
		setBounds(100, 100, 549, 612);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(561, 684, "src/team_twww_jwgl_image/17.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/17.jpg");
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
		label.setIcon(new ImageIcon(FindStudentscore.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		
		collegename = new JTextField();
		collegename.setFont(new Font("宋体", Font.PLAIN, 16));
		collegename.setColumns(10);
		
		JButton find = new JButton("\u67E5\u8BE2");
		find.setIcon(new ImageIcon(FindStudentscore.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		find.setFont(new Font("宋体", Font.PLAIN, 16));
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findActionPerformed();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setToolTipText("\u5B66\u751F\u6210\u7EE9\r\n");
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "\u5B66\u751F\u6210\u7EE9", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(35)
							.addComponent(collegename, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addGap(62)
							.addComponent(find)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(collegename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(find))
					.addGap(47)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		
		JLabel label_1 = new JLabel("\u5B66\u751F\u59D3\u540D");
		label_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		studentname_update = new JTextField();
		studentname_update.setFont(new Font("宋体", Font.PLAIN, 16));
		studentname_update.setEditable(false);
		studentname_update.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5B66\u53F7");
		label_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		userid_update = new JTextField();
		userid_update.setFont(new Font("宋体", Font.PLAIN, 16));
		userid_update.setEditable(false);
		userid_update.setColumns(10);
		
		JLabel course_name = new JLabel("\u8BFE\u7A0B\u540D");
		course_name.setFont(new Font("宋体", Font.PLAIN, 16));
		
		coursename_update = new JTextField();
		coursename_update.setFont(new Font("宋体", Font.PLAIN, 16));
		coursename_update.setEditable(false);
		coursename_update.setColumns(10);
		
		JLabel score1 = new JLabel("\u8003\u8BD5\u6210\u7EE9");
		score1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		score = new JTextField();
		score.setFont(new Font("宋体", Font.PLAIN, 16));
		score.setColumns(10);
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setIcon(new ImageIcon(FindStudentscore.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		update.setFont(new Font("宋体", Font.PLAIN, 16));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed();
			}
		});
		
		JLabel label_5 = new JLabel("\u4EFB\u8BFE\u6559\u5E08");
		label_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		teachername = new JTextField();
		teachername.setFont(new Font("宋体", Font.PLAIN, 16));
		teachername.setEditable(false);
		teachername.setColumns(10);
		
		JLabel label_6 = new JLabel("\u8BFE\u7A0B\u53F7");
		label_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		courseid = new JTextField();
		courseid.setFont(new Font("宋体", Font.PLAIN, 16));
		courseid.setEditable(false);
		courseid.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(course_name)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(studentname_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(coursename_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(teachername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(courseid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addGap(8)
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(userid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addComponent(score1)
									.addGap(18)
									.addComponent(score, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(129)
							.addComponent(update)))
					.addContainerGap(112, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(studentname_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(userid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(course_name)
						.addComponent(coursename_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(score1)
						.addComponent(score, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(teachername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(courseid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(update)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		collegetable = new JTable();
		collegetable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePressActionPerformed(e);
			}
		});
		collegetable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"学号","学生姓名","\u8BFE\u7A0B\u540D", "\u8BFE\u7A0B\u53F7", "\u4EFB\u8BFE\u8001\u5E08", "\u8003\u8BD5\u6210\u7EE9"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false,false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(collegetable);
		getContentPane().setLayout(groupLayout);
		this.findActionPerformed();
	}
	/**
	 * 
	 * 修改学院信息
	 */
	private void updateActionPerformed() {
		int result = 0;
		if(this.isEmpty(this.userid_update.getText())||this.isEmpty(this.studentname_update.getText())||this.isEmpty(this.coursename_update.getText())||this.isEmpty(this.score.getText()))
		{
			JOptionPane.showMessageDialog(null, "内容不全！");
		}
		else
		{
			DefaultTableModel dmt=(DefaultTableModel)this.collegetable.getModel(); 
			dmt.setRowCount(0);
			Connection con=null;
			database star=new database();   
			  try {
				 con=star.getCon();
				 String sql = "update score_table set course_score=? where course_id=? and user_id=?";
			     PreparedStatement prestmt=con.prepareStatement(sql);
			       prestmt.setString(1, this.score.getText());
			       prestmt.setString(2, this.courseid.getText());
			       prestmt.setString(3, this.userid_update.getText());
			       result=prestmt.executeUpdate();
		    
		          con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally
			  {
				if(result>0)
				{
					JOptionPane.showMessageDialog(null, "修改成功");
					this.reset();
					this.findActionPerformed();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "修改失败");
					this.reset();
				}
			  }
		}
		
	}
	/**
	 * 点击表格，在下面显示
	 */
	private void mousePressActionPerformed(MouseEvent e) {
		int row=this.collegetable.getSelectedRow();
		this.studentname_update.setText((String) this.collegetable.getValueAt(row, 1));
		this.userid_update.setText(String.valueOf(this.collegetable.getValueAt(row, 0)));
		this.coursename_update.setText((String) this.collegetable.getValueAt(row, 2));
		this.courseid.setText((String) this.collegetable.getValueAt(row, 3));
		this.teachername.setText((String) this.collegetable.getValueAt(row, 4));
		this.score.setText((String) this.collegetable.getValueAt(row, 5));
		
	}
	/**
	 * 查找学院
	 */
	protected void findActionPerformed() {
		DefaultTableModel dmt=(DefaultTableModel)this.collegetable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   
		  try {
			 con=star.getCon();
			 StringBuffer sql = new StringBuffer("select score_view.User_id,Student_name,course_name,course_id,teacher_name,course_score from score_view,student_information_table where score_view.user_id=student_information_table.user_id");
	      
	      	 String w= this.collegename.getText().replaceAll ("(.{1})", "$1%");
	 
	      	 if(!this.isEmpty(this.collegename.getText()))
		    	 sql.append(" and student_name like \"%"+w+"\"");
		    
		     PreparedStatement prestmt=con.prepareStatement(sql.toString());
		      
		      ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	         
	                v.add(String.valueOf(rs.getInt("user_id"))); 
	                v.add(rs.getString("student_name"));
	              v.add(rs.getString("course_name"));
	              v.add(rs.getString("course_id"));
	              v.add(rs.getString("teacher_name")); 
	            v.add(rs.getString("course_score")); 
	           
	            dmt.addRow(v);
	      
	          }
		
	         rs.close();
	    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private boolean  isEmpty(String str)
	{
		if(str==null||"".equals(str))
			return true;
		else
			return false;
	}
	/**
	 * 重置
	 */
	void reset()
	{
		studentname_update.setText("");;
		userid_update.setText("");
		coursename_update.setText("");
		score.setText("");
		teachername.setText("");
		courseid.setText("");
	}
}
