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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import team.twww.jwgl.util.database;
import team.twww.jwgl.util.image_change;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
/**
 * 閺屻儲澹樼�涳妇鏁�
 * @author 10265
 *
 */
public class FindStudent extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable studenttable;
	private JTextField studentname;
	private JTextField studentname_update;
	private JTextField studentid_update;
	private JTextField password_update;
	private JTextField sex_update;
	private JTextField phonenumber_update;
	private JTextField college_update;
	private JTextField hometown_update;
	private JTextField idnumber_update;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("deprecation")
	public FindStudent() {
		setFrameIcon(new ImageIcon(FindStudent.class.getResource("/team_twww_jwgl_image/6814ca38cc554987564cfe86613ccc5.png")));
		getContentPane().setBackground(Color.WHITE);
		
		JLabel label = new JLabel("\u5B66\u751F\u540D");
		label.setIcon(new ImageIcon(FindStudent.class.getResource("/team_twww_jwgl_image/2.png")));
		label.setFont(new Font("鐎瑰缍�", Font.PLAIN, 20));
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
	//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(561, 684, "src/team_twww_jwgl_image/16.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/16.jpg");
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
		JScrollPane scrollPane = new JScrollPane();
		
		studentname = new JTextField();
		studentname.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		studentname.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setIcon(new ImageIcon(FindStudent.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		button.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findActionPerformed();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u5B66\u751F\u7BA1\u7406", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(55)
					.addComponent(label)
					.addGap(36)
					.addComponent(studentname, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(button)
					.addContainerGap(82, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(studentname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addGap(58)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel label_1 = new JLabel("\u5B66\u751F\u540D");
		label_1.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		studentname_update = new JTextField();
		studentname_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		studentname_update.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5B66\u53F7");
		label_2.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		studentid_update = new JTextField();
		studentid_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		studentid_update.setEditable(false);
		studentid_update.setColumns(10);
		
		JLabel label_3 = new JLabel("\u5BC6\u7801");
		
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
		
		JLabel label_6 = new JLabel("\u5B66\u9662");
		label_6.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		college_update = new JTextField();
		college_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		college_update.setColumns(10);
		
		JLabel label_7 = new JLabel("\u7C4D\u8D2F");
		label_7.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		hometown_update = new JTextField();
		hometown_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		hometown_update.setColumns(10);
		
		JLabel label_8 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7");
		label_8.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		idnumber_update = new JTextField();
		idnumber_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		idnumber_update.setEditable(false);
		idnumber_update.setColumns(10);
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setIcon(new ImageIcon(FindStudent.class.getResource("/team_twww_jwgl_image/dd3e2eca3df5463a6e044fe630a54fe.png")));
		update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed();
			}
		});
		
		JButton delete = new JButton("\u5220\u9664");
		delete.setIcon(new ImageIcon(FindStudent.class.getResource("/team_twww_jwgl_image/ad3bf4b6fc0088dc64ba4248cc7db8e.png")));
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
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(label_2)
								.addComponent(label_3)
								.addComponent(label_4))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(studentname_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(studentid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(password_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(sex_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(99)
							.addComponent(update)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(98)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_5)
										.addComponent(label_6)
										.addComponent(label_7))
									.addGap(26)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(hometown_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(college_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(phonenumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_8)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(idnumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(30, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(delete)
							.addGap(82))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(studentname_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(phonenumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(studentid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(college_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(password_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(hometown_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(sex_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8)
						.addComponent(idnumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(update)
						.addComponent(delete))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		studenttable = new JTable();
		studenttable.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mousePressActionPerformed(e);
			}
		});
		studenttable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u751F\u540D", "\u5B66\u53F7", "\u5BC6\u7801", "\u6027\u522B", "\u624B\u673A\u53F7", "\u5B66\u9662", "\u7C4D\u8D2F", "\u8EAB\u4EFD\u8BC1\u53F7"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(studenttable);
		getContentPane().setLayout(groupLayout);
		setTitle("\u67E5\u8BE2\u5B66\u751F");
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 561, 652);
		this.findActionPerformed();
	}
	private void deleteActionPerformed() {
		int result=0;
		DefaultTableModel dmt=(DefaultTableModel)studenttable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   //閺夆晝鍋炵敮鎾极閻楀牆绁﹂幖瀛樻尵濞堟垹鐚鹃敓锟�
		  try {
			 con=star.getCon();
			 String sql = "delete from student_information_table where user_id= ?";
		     PreparedStatement prestmt=con.prepareStatement(sql);
		     prestmt.setInt(1, Integer.parseInt(this.studentid_update.getText()));
		       result=prestmt.executeUpdate();
		       String sql3 = "delete from user_table where user_id = ?";
		          prestmt=con.prepareStatement(sql3);
			      prestmt.setString(1,this.studentid_update.getText());
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
	private void updateActionPerformed() {
		int result1 = 0,result2=0;
		if(this.isEmpty(this.studentname_update.getText())||this.isEmpty(this.studentid_update.getText())
		   ||this.isEmpty(this.password_update.getText())||this.isEmpty(this.sex_update.getText())
		   ||this.isEmpty(this.phonenumber_update.getText())||this.isEmpty(this.college_update.getText())
		   ||this.isEmpty(this.hometown_update.getText())||this.isEmpty(this.idnumber_update.getText()))
		{
			JOptionPane.showMessageDialog(null, "閸愬懎顔愭稉宥呭弿閿涳拷");
		}
		else
		{
			DefaultTableModel dmt=(DefaultTableModel)this.studenttable.getModel(); 
			dmt.setRowCount(0);
			Connection con=null;
			database star=new database();   
			  try {
				 con=star.getCon();
				 String sql = "update student_information_table set student_name=?,phone_number=?,hometown=? where user_id= ?";
			     PreparedStatement prestmt=con.prepareStatement(sql);
			       prestmt.setString(1, this.studentname_update.getText());
			       prestmt.setString(2, this.phonenumber_update.getText());
			       prestmt.setString(3, this.hometown_update.getText());
			       prestmt.setInt(4, Integer.parseInt(this.studentid_update.getText()));
			      result1=prestmt.executeUpdate();
			      
			      String sql1 = "select college_id from college_table where college_name=?";
				     PreparedStatement prestmt1=con.prepareStatement(sql1);
				       prestmt1.setString(1, this.college_update.getText());
				       
				      ResultSet rs=prestmt1.executeQuery();
				      int college_id_update = 0;
				      while(rs.next())
				      {
				    	  college_id_update=rs.getInt(1);
				      }
				      rs.close();
				      
			      String sql2 = "update student_information_table set college_id=? where user_id= ?";
				     PreparedStatement prestmt2=con.prepareStatement(sql2);
				       prestmt2.setInt(1, college_id_update);
				       prestmt2.setInt(2, Integer.parseInt(this.studentid_update.getText()));
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
	private void findActionPerformed() {
		DefaultTableModel dmt=(DefaultTableModel)this.studenttable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   
		  try {
			 con=star.getCon();
			 StringBuffer sql = new StringBuffer("select "
	      	 		+ "student_name,student_information_view.user_id,"
	      	 		+ "user_password,sex,phone_number,"
	      	 		+ "college_name,hometown,id_card"
	      	 		+ " from student_information_view,user_table where student_information_view.user_id=user_table.user_id");
	      	 String w= this.studentname.getText().replaceAll ("(.{1})", "$1%");
	 
	      	 if(!this.isEmpty(this.studentname.getText()))
		    	 sql.append(" and student_name like \"%"+w+"\"");
		    
		     PreparedStatement prestmt=con.prepareStatement(sql.toString());
		       ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	            v.add(rs.getString("student_name"));
	            v.add(String.valueOf(rs.getInt("user_id"))); 
	            v.add(rs.getString("user_password")); 
	            v.add(rs.getString("sex"));
	            v.add(rs.getString("phone_number"));
	            v.add(rs.getString("college_name"));
	            v.add(rs.getString("hometown"));
	            v.add(rs.getString("id_card"));
	            dmt.addRow(v);
	      
	          }
		
	         rs.close();
	    
	          con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 閻愮懓鍤悰銊︾壐閿涘苯婀稉瀣桨閺勫墽銇氶崘鍛啇
	 * @param e
	 */
	private void mousePressActionPerformed(MouseEvent e) {
		int row=this.studenttable.getSelectedRow();
		this.studentname_update.setText((String) this.studenttable.getValueAt(row, 0));
		this.studentid_update.setText(String.valueOf(this.studenttable.getValueAt(row, 1)));
		this.password_update.setText((String) this.studenttable.getValueAt(row, 2));
		this.sex_update.setText((String) this.studenttable.getValueAt(row, 3));
		this.phonenumber_update.setText((String) this.studenttable.getValueAt(row, 4));
		this.college_update.setText((String) this.studenttable.getValueAt(row, 5));
		this.hometown_update.setText((String) this.studenttable.getValueAt(row, 6));
		this.idnumber_update.setText((String) this.studenttable.getValueAt(row, 7));
		
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
		studentname_update.setText("");
		studentid_update.setText("");
		password_update.setText("");
		sex_update.setText("");
		phonenumber_update.setText("");
		college_update.setText("");
		hometown_update.setText("");
		idnumber_update.setText("");
	}
}
