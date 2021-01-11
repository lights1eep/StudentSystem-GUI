package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
/**
 * 閺屻儴顕楅弫娆忕瑎
 * @author 10265
 *
 */
public class FindTeacher extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField teachername;
	private JTable teachertable;
	private JTextField teachername_update;
	private JTextField teacherid_update;
	private JTextField password_update;
	private JTextField sex_update;
	private JTextField phonenumber_update;
	private JTextField college_update;
	JComboBox<String> jobBox = new JComboBox<String>();
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public FindTeacher() {
		setFrameIcon(new ImageIcon(FindTeacher.class.getResource("/team_twww_jwgl_image/0dd80da105b38fc898845251d963f52.png")));
		getContentPane().setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u6559\u5E08\u540D");
		label.setIcon(new ImageIcon(FindTeacher.class.getResource("/team_twww_jwgl_image/2.png")));
		label.setFont(new Font("鐎瑰缍�", Font.PLAIN, 20));
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(561, 684, "src/team_twww_jwgl_image/18.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/18.jpg");
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
		teachername = new JTextField();
		teachername.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		teachername.setColumns(10);
		
		JButton find = new JButton("\u67E5\u8BE2");
		find.setIcon(new ImageIcon(FindTeacher.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		find.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findActionPerformed();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u6559\u5E08\u7BA1\u7406", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(27)
							.addComponent(teachername, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addGap(43)
							.addComponent(find)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(47, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(find)
						.addComponent(teachername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		
		JLabel label_1 = new JLabel("\u6559\u5E08\u540D");
		label_1.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		teachername_update = new JTextField();
		teachername_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		teachername_update.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6559\u5E08\u5DE5\u53F7");
		label_2.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		teacherid_update = new JTextField();
		teacherid_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		teacherid_update.setEditable(false);
		teacherid_update.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5BC6\u7801");
		label_3.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		password_update = new JTextField();
		password_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		password_update.setEditable(false);
		password_update.setColumns(10);
		
		JLabel label_4 = new JLabel("\u6027\u522B");
		label_4.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		sex_update = new JTextField();
		sex_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		sex_update.setEditable(false);
		sex_update.setColumns(10);
		
		JLabel label_5 = new JLabel("\u624B\u673A\u53F7");
		label_5.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		phonenumber_update = new JTextField();
		phonenumber_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		phonenumber_update.setColumns(10);
		
		JLabel label_6 = new JLabel("\u804C\u79F0");
		label_6.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		jobBox.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		
		jobBox.setModel(new DefaultComboBoxModel<String>(new String[] {"\u6559\u6388", "\u526F\u6559\u6388", "\u8BB2\u5E08", "\u52A9\u6559"}));
		
		JLabel label_7 = new JLabel("\u5B66\u9662");
		label_7.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		college_update = new JTextField();
		college_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		college_update.setColumns(10);
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setIcon(new ImageIcon(FindTeacher.class.getResource("/team_twww_jwgl_image/f57f700c713a978870b0a2453d6998a.png")));
		update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed();
			}
		});
		
		JButton delete = new JButton("\u5220\u9664");
		delete.setIcon(new ImageIcon(FindTeacher.class.getResource("/team_twww_jwgl_image/ad3bf4b6fc0088dc64ba4248cc7db8e.png")));
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
					.addGap(43)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(label_3)
						.addComponent(label_4)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(teachername_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(teacherid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(password_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(update, Alignment.TRAILING))
							.addGap(55)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5)
								.addComponent(label_6)
								.addComponent(label_7))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(college_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(jobBox, 0, 86, Short.MAX_VALUE)
											.addComponent(phonenumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addContainerGap(44, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(delete)
									.addContainerGap())))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(sex_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(teachername_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(phonenumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(teacherid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(jobBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(password_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(college_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(sex_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(update)
						.addComponent(delete))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		teachertable = new JTable();
		teachertable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePressActionPerformed(e);
			}
		});
		teachertable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u6559\u5E08\u540D", "\u6559\u5E08\u5DE5\u53F7", "\u5BC6\u7801", "\u6027\u522B", "\u624B\u673A\u53F7", "\u804C\u79F0", "\u5B66\u9662"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(teachertable);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setIconifiable(true);
		setTitle("\u67E5\u8BE2\u6559\u5E08");
		setBounds(100, 100, 568, 687);
		this.findActionPerformed();
	}

	
	private void deleteActionPerformed() {
		int result=0;
		DefaultTableModel dmt=(DefaultTableModel)teachertable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   //閺夆晝鍋炵敮鎾极閻楀牆绁﹂幖瀛樻尵濞堟垹鐚鹃敓锟�
		  try {
			 con=star.getCon();
			 String sql = "delete from teacher_information_table where user_id= ?";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     prestmt.setInt(1, Integer.parseInt(this.teacherid_update.getText()));
		       result=prestmt.executeUpdate();
		       String sql3 = "delete from user_table where user_id = ?";
		          prestmt=con.prepareStatement(sql3);
			      prestmt.setString(1,this.teacherid_update.getText());
			       result=prestmt.executeUpdate();
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		  finally
		  {
			  if(result>0)
			  {
				  JOptionPane.showMessageDialog(null, "閸掔娀娅庨幋鎰閿涳拷");
				  this.reset();
				  this.findActionPerformed();
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null, "閸掔娀娅庢径杈Е閿涳拷");
				  this.reset();
			  }
		  }
		
	}


	private void findActionPerformed() {
		DefaultTableModel dmt=(DefaultTableModel)this.teachertable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   
		  try {
			 con=star.getCon();
			 StringBuffer sql = new StringBuffer("select "
	      	 		+ "teacher_name,teacher_information_view.user_id,"
	      	 		+ "user_password,sex,phone_number,"
	      	 		+ "job_title,college_name "
	      	 		+ "from teacher_information_view,user_table where teacher_information_view.user_id=user_table.user_id "
	      	 	);
	      	 String w= this.teachername.getText().replaceAll ("(.{1})", "$1%");
	 
	      	 if(!this.isEmpty(this.teachername.getText()))
		    	 sql.append(" and teacher_name like \"%"+w+"\"");
		    
		     PreparedStatement prestmt=con.prepareStatement(sql.toString());
		       
		      ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	         
	                      
	            v.add(rs.getString("teacher_name"));
	            v.add(String.valueOf(rs.getInt("user_id")));     v.add(rs.getString("user_password")); 
	            v.add(rs.getString("sex"));
	            v.add(rs.getString("phone_number"));
	            v.add(rs.getString("job_title"));
	            v.add(rs.getString("college_name"));
	            

	            dmt.addRow(v);
	      
	          }
		
	         rs.close();
	    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	private void updateActionPerformed() {
		int result1 = 0,result2=0;
		if(this.isEmpty(this.teachername_update.getText())||this.isEmpty(this.teacherid_update.getText())
		   ||this.isEmpty(this.password_update.getText())||this.isEmpty(this.sex_update.getText())
		   ||this.isEmpty(this.phonenumber_update.getText())||this.isEmpty(this.college_update.getText()))
		{
			JOptionPane.showMessageDialog(null, "閸愬懎顔愭稉宥呭弿閿涳拷");
		}
		else
		{
			DefaultTableModel dmt=(DefaultTableModel)this.teachertable.getModel(); 
			dmt.setRowCount(0);
			Connection con=null;
			database star=new database();   
			  try {
				 con=star.getCon();
				 String sql = "update teacher_information_table set teacher_name=?,phone_number=?,job_title=? where user_id= ?";
			     PreparedStatement prestmt=con.prepareStatement(sql);
			       prestmt.setString(1, this.teachername_update.getText());
			       prestmt.setString(2, this.phonenumber_update.getText());
			       int index=this.jobBox.getSelectedIndex();
			       if(index==0)   prestmt.setString(3, "閺佹瑦宸�");
			       else if(index==1)   prestmt.setString(3, "閸擃垱鏆�閹猴拷");
			       else if(index==2)   prestmt.setString(3, "鐠佹彃绗�");
			       else   prestmt.setString(3, "閸斺晜鏆�");
			       prestmt.setInt(4, Integer.parseInt(this.teacherid_update.getText()));
			      result1=prestmt.executeUpdate();
			      
			      String sql1 = "select college_id from college_table where college_name=?";//闁俺绻冪�涳箓娅岄崥宥嗙叀閹垫儳顒熼梽銏犲娇
				     PreparedStatement prestmt1=con.prepareStatement(sql1);
				       prestmt1.setString(1, this.college_update.getText());
				       
				      ResultSet rs=prestmt1.executeQuery();
				      int college_id_update = 0;
				      while(rs.next())
				      {
				    	  college_id_update=rs.getInt(1);
				      }
				      rs.close();
				      
			      String sql2 = "update teacher_information_table set college_id=? where user_id= ?";
				     PreparedStatement prestmt2=con.prepareStatement(sql2);
				       prestmt2.setInt(1, college_id_update);
				       prestmt2.setInt(2, Integer.parseInt(this.teacherid_update.getText()));
				      result2=prestmt2.executeUpdate();
		    
		          con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally
			  {
				if(result1>0&&result2>0)
				{
					JOptionPane.showMessageDialog(null, "娣囶喗鏁奸幋鎰");
					this.reset();
					this.findActionPerformed();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "娣囶喗鏁兼径杈Е");
					this.reset();
				}
			  }
		}
		
	}


	private void mousePressActionPerformed(MouseEvent e) {
		int row=this.teachertable.getSelectedRow();
		this.teachername_update.setText((String) this.teachertable.getValueAt(row, 0));
		this.teacherid_update.setText(( String.valueOf(this.teachertable.getValueAt(row, 1))));
		this.password_update.setText((String) this.teachertable.getValueAt(row, 2));
		this.sex_update.setText((String) this.teachertable.getValueAt(row, 3));
		this.phonenumber_update.setText((String) this.teachertable.getValueAt(row, 4));
		int index=0;
		if((boolean)this.teachertable.getValueAt(row, 5).equals("閸擃垱鏆�閹猴拷"))
			index=1;
		else if((boolean)this.teachertable.getValueAt(row, 5).equals("鐠佹彃绗�"))
			index=2;
		else if((boolean)this.teachertable.getValueAt(row, 5).equals("閸斺晜鏆�"))
			index=3;
		this.jobBox.setSelectedIndex(index);
		this.college_update.setText((String) this.teachertable.getValueAt(row, 6));
		
		
	}


	private boolean  isEmpty(String str)
	{
		if(str==null||"".equals(str))
			return true;
		else
			return false;
	}
	/**
	 * 闁插秶鐤�
	 */
	void reset()
	{
		teachername_update.setText("");
		teacherid_update.setText("");
		password_update.setText("");
		sex_update.setText("");
		phonenumber_update.setText("");
		college_update.setText("");
		jobBox.setSelectedIndex(0);
	}
}
