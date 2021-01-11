package team.twww.jwgl.view;

import java.sql.*;
import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.ImageIcon;
/**
 * 鏌ヨ璇剧▼
 * @author 10265
 *
 */
public class FindCourse extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField coursename;
	private JTable coursetable;
	private JTextField coursename_update;
	private JTextField courseid_update;
	private JTextField teachername_update;
	private JTextField teacherid_update;
	private JTextField numberofstu_update;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public FindCourse() {
		setFrameIcon(new ImageIcon(FindCourse.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		setTitle("\u67E5\u627E\u8BFE\u7A0B");
		getContentPane().setBackground(Color.WHITE);
		setIconifiable(true);
		setClosable(true);
		getContentPane().setForeground(Color.WHITE);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(561, 684, "src/team_twww_jwgl_image/15.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/15.jpg");
		 JLabel tu = new JLabel(background);
		 tu.setBounds(0, 0, background.getIconWidth(),
				    background.getIconHeight());
		// contentPane.add(tu);
		 this.getLayeredPane().add(tu,new Integer(Integer.MIN_VALUE));
		 // imagePanel.setOpaque(false);
		 JPanel panelTop=new JPanel();
	        panelTop=(JPanel)this.getContentPane();
	 
	        //panel鍜宲anelTop璁剧疆閫忔槑
	        panelTop.setOpaque(false);
		JLabel label = new JLabel("\u8BFE\u7A0B\u540D");
		label.setIcon(new ImageIcon(FindCourse.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		label.setFont(new Font("瀹嬩綋", Font.PLAIN, 20));
		
		coursename = new JTextField();
		coursename.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		coursename.setColumns(10);
		
		JButton find = new JButton("\u67E5\u8BE2");
		find.setIcon(new ImageIcon(FindCourse.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		find.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findActionPerformed();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u8BFE\u7A0B\u7BA1\u7406", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(label)
							.addGap(58)
							.addComponent(coursename, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
							.addGap(35)
							.addComponent(find))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(45)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(75, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
					.addGap(34))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(coursename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(find))
					.addGap(35)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		
		JLabel label_1 = new JLabel("\u8BFE\u7A0B\u540D");
		label_1.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		coursename_update = new JTextField();
		coursename_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		coursename_update.setEditable(false);
		coursename_update.setColumns(10);
		
		JLabel label_2 = new JLabel("\u8BFE\u7A0B\u53F7");
		label_2.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		courseid_update = new JTextField();
		courseid_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		courseid_update.setEditable(false);
		courseid_update.setColumns(10);
		
		JLabel label_3 = new JLabel("\u6559\u5E08\u540D");
		label_3.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		teachername_update = new JTextField();
		teachername_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		teachername_update.setColumns(10);
		
		JLabel label_4 = new JLabel("\u6559\u5E08\u5DE5\u53F7");
		label_4.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		teacherid_update = new JTextField();
		teacherid_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		teacherid_update.setColumns(10);
		
		JLabel label_5 = new JLabel("\u9009\u8BFE\u4EBA\u6570");
		label_5.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		numberofstu_update = new JTextField();
		numberofstu_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		numberofstu_update.setColumns(10);
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setIcon(new ImageIcon(FindCourse.class.getResource("/team_twww_jwgl_image/dd3e2eca3df5463a6e044fe630a54fe.png")));
		update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed();
			}
		});
		
		JButton delete = new JButton("\u5220\u9664");
		delete.setIcon(new ImageIcon(FindCourse.class.getResource("/team_twww_jwgl_image/ad3bf4b6fc0088dc64ba4248cc7db8e.png")));
		delete.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteActionPerformed();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_5)
							.addGap(18)
							.addComponent(numberofstu_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(label_2))
							.addGap(34)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(coursename_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(courseid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(58)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_3)
									.addGap(28)
									.addComponent(teachername_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(teacherid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(33, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(53)
					.addComponent(update)
					.addPreferredGap(ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
					.addComponent(delete)
					.addGap(70))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(coursename_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3)
						.addComponent(teachername_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(courseid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(teacherid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_5)
						.addComponent(numberofstu_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(update)
						.addComponent(delete))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		coursetable = new JTable();
		coursetable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			//	mousePressActionPerformed(e);
				mousePressActionPerformed(e);
			}
		});
		coursetable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u540D", "\u8BFE\u7A0B\u53F7", "\u6559\u5E08\u540D", "\u6559\u5E08\u5DE5\u53F7", "\u9009\u8BFE\u4EBA\u6570"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(coursetable);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 561, 684);
		this.findActionPerformed();
	}
	/**
	 * 鍒犻櫎鎵�閫変俊鎭�
	 */
	protected void deleteActionPerformed() {
		int result=0;
		DefaultTableModel dmt=(DefaultTableModel)coursetable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   //鏉╃偞甯撮弫鐗堝祦鎼存挾娈戠猾锟�
		  try {
			 con=star.getCon();
			 String sql = "delete from course_table where course_name= ? and course_id = ?";
	      	   PreparedStatement prestmt=con.prepareStatement(sql);
		     prestmt.setString(1, this.coursename_update.getText());
		       prestmt.setString(2, this.courseid_update.getText());
		       result=prestmt.executeUpdate();
			   String sql2 = "delete from score_table where course_id = ?";
		          prestmt=con.prepareStatement(sql2);
			      prestmt.setString(1,this.courseid_update.getText());
			      
			       result=prestmt.executeUpdate();
			       String sql3 = "delete from teaching_evaluation_table where course_id = ?";
			          prestmt=con.prepareStatement(sql3);
				      prestmt.setString(1,this.courseid_update.getText());
				       result=prestmt.executeUpdate();
			    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		  finally
		  {
			  if(result>0)
			  {
				  JOptionPane.showMessageDialog(null, "鍒犻櫎鎴愬姛锛�");
				  this.reset();
				  this.findActionPerformed();
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null, "鍒犻櫎澶辫触锛�");
				  this.reset();
			  }
		  }
		
	}
	/**
	 * 鏇存柊璇剧▼鍐呭
	 * @param e
	 */
	private void updateActionPerformed() {
		int result = 0;
		if(this.isEmpty(this.courseid_update.getText())||this.isEmpty(this.coursename_update.getText())||this.isEmpty(this.numberofstu_update.getText()))
		{
			JOptionPane.showMessageDialog(null, "鍐呭涓嶅叏锛�");
		}
		else
		{
			DefaultTableModel dmt=(DefaultTableModel)this.coursetable.getModel(); 
			dmt.setRowCount(0);
			Connection con=null;
			database star=new database();   
			  try {
				 con=star.getCon();
				 String sql = "update course_table set teacher_name=?,user_id=?,student_number=? where course_id= ?";
			     PreparedStatement prestmt=con.prepareStatement(sql);
			       prestmt.setString(1, this.teachername_update.getText());
			       prestmt.setString(2, this.teacherid_update.getText());
			       prestmt.setInt(3, Integer.parseInt(this.numberofstu_update.getText()));
			       prestmt.setString(4, this.courseid_update.getText());
			      result=prestmt.executeUpdate();
		    
		          con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally
			  {
				if(result>0)
				{
					JOptionPane.showMessageDialog(null, "淇敼鎴愬姛");
					this.reset();
					this.findActionPerformed();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "淇敼澶辫触");
					this.reset();
				}
			  }
		}
	}
	/**
	 * 鐐瑰嚮琛ㄦ牸锛屽唴瀹瑰湪涓嬫柟鏄剧ず
	 * @param e 
	 * @param e
	 */
	private void mousePressActionPerformed(MouseEvent e) {
		int row=this.coursetable.getSelectedRow();
		this.coursename_update.setText((String) this.coursetable.getValueAt(row, 0));
		this.courseid_update.setText((String) this.coursetable.getValueAt(row, 1));
		this.teachername_update.setText((String) this.coursetable.getValueAt(row, 2));
		this.teacherid_update.setText((String) this.coursetable.getValueAt(row, 3));
		this.numberofstu_update.setText((String) this.coursetable.getValueAt(row, 4));
	}
	/**
	 * 鏌ヨ璇剧▼鍦ㄨ〃鏍奸噷鏄剧ず
	 * @param e
	 */
	private void findActionPerformed() {
		DefaultTableModel dmt=(DefaultTableModel)this.coursetable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   
		  try {
			 con=star.getCon();
			 StringBuffer sql = new StringBuffer("select course_name,course_id,teacher_name,user_id,student_number from course_table");
	      	 String w= this.coursename.getText().replaceAll ("(.{1})", "$1%");
	 
	      	 if(!this.isEmpty(this.coursename.getText()))
		    	 sql.append(" and course_name like \"%"+w+"\"");
		    
		     PreparedStatement prestmt=con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		      //System.out.println(sql); 
		      ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	         
	                      
	            v.add(rs.getString("course_name"));
	            v.add(rs.getString("course_id")); 
	            v.add(rs.getString("teacher_name")); 
	            v.add(rs.getString("user_id"));
	            v.add(rs.getString("student_number"));
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
	 * 閲嶇疆
	 */
	void reset()
	{
		this.courseid_update.setText("");
		this.coursename_update.setText("");
		this.numberofstu_update.setText("");
	}
}
