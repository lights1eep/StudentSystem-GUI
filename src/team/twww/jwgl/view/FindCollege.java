package team.twww.jwgl.view;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.LayoutStyle.ComponentPlacement;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Vector;
import javax.swing.ImageIcon;
/**
 * 娣诲姞瀛﹂櫌
 * @author 10265
 *
 */
public class FindCollege extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField collegename;
	private JTable collegetable;
	private JTextField collegename_update;
	private JTextField collegeid_update;
	private JTextField dean_update;
	private JTextField phonenumber_update;

	/**
	 * Create the frame.
	 */
	JDesktopPane desktopPane=new JDesktopPane();
	@SuppressWarnings("deprecation")
	public FindCollege() {
		setFrameIcon(new ImageIcon(FindCollege.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		setClosable(true);
		setIconifiable(true);
		setTitle("\u67E5\u8BE2\u5B66\u9662");
		setBounds(100, 100, 549, 612);
		JPanel	contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.getContentPane().getSize().getWidth();
		this.getContentPane().getSize().getHeight();
		image_change s=new image_change();
		//System.out.println("w="+this.getSize().getWidth()+"h="+this.getSize().getHeight());
		s.changeSize(561, 684, "src/team_twww_jwgl_image/14.jpg");
		
		 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/14.jpg");
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
		JLabel label = new JLabel("\u5B66\u9662\u540D");
		label.setIcon(new ImageIcon(FindCollege.class.getResource("/team_twww_jwgl_image/8ffa42b3ba72df58d3641a479c47ed3.png")));
		label.setFont(new Font("瀹嬩綋", Font.PLAIN, 20));
		
		collegename = new JTextField();
		collegename.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		collegename.setColumns(10);
		
		JButton find = new JButton("\u67E5\u8BE2");
		find.setIcon(new ImageIcon(FindCollege.class.getResource("/team_twww_jwgl_image/8ee2d307275985731ea4c125f65a4d5.png")));
		find.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		find.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findActionPerformed();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		//panel.add(tu,new Integer(Integer.MIN_VALUE));
		panel.setBorder(new TitledBorder(null, "\u5B66\u9662\u7BA1\u7406", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(80)
							.addComponent(label)
							.addGap(35)
							.addComponent(collegename, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(find))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 429, GroupLayout.PREFERRED_SIZE)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 421, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(collegename, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label)
						.addComponent(find))
					.addGap(48)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		
		JLabel label_1 = new JLabel("\u5B66\u9662\u540D\u79F0");
		label_1.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		collegename_update = new JTextField();
		collegename_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		collegename_update.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5B66\u9662\u7F16\u53F7");
		label_2.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		collegeid_update = new JTextField();
		collegeid_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		collegeid_update.setEditable(false);
		collegeid_update.setColumns(10);
		
		JLabel label_3 = new JLabel("\u9662\u957F");
		label_3.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		dean_update = new JTextField();
		dean_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		dean_update.setColumns(10);
		
		JLabel label_4 = new JLabel("\u5B66\u9662\u7535\u8BDD");
		label_4.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		
		phonenumber_update = new JTextField();
		phonenumber_update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		phonenumber_update.setColumns(10);
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setIcon(new ImageIcon(FindCollege.class.getResource("/team_twww_jwgl_image/dd3e2eca3df5463a6e044fe630a54fe.png")));
		update.setFont(new Font("瀹嬩綋", Font.PLAIN, 16));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateActionPerformed();
			}
		});
		
		JButton delete = new JButton("\u5220\u9664");
		delete.setIcon(new ImageIcon(FindCollege.class.getResource("/team_twww_jwgl_image/ad3bf4b6fc0088dc64ba4248cc7db8e.png")));
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
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(collegename_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(dean_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_2)
							.addGap(18)
							.addComponent(collegeid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_4)
							.addGap(18)
							.addComponent(phonenumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(46, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(78)
					.addComponent(update)
					.addPreferredGap(ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
					.addComponent(delete)
					.addGap(72))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(collegename_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(collegeid_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(dean_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(phonenumber_update, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(update)
						.addComponent(delete))
					.addGap(25))
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
				"\u5B66\u9662\u540D", "\u5B66\u9662\u53F7", "\u9662\u957F", "\u5B66\u9662\u7535\u8BDD"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
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
	 * 鍒犻櫎瀛﹂櫌淇℃伅
	 */
	private void deleteActionPerformed() {
		if(this.isEmpty(this.collegeid_update.getText())||this.isEmpty(this.collegename_update.getText())||this.isEmpty(this.dean_update.getText())||this.isEmpty(this.phonenumber_update.getText()))
		{
			JOptionPane.showMessageDialog(null, "鍐呭涓嶅叏锛�");
		}
		{
			int result=0;
			DefaultTableModel dmt=(DefaultTableModel)collegetable.getModel(); 
			dmt.setRowCount(0);
			Connection con=null;
			database star=new database();   //鏉╃偞甯撮弫鐗堝祦鎼存挾娈戠猾锟�
			  try {
				 con=star.getCon();
				 String sql = "delete from college_table where college_id= ?";
			     PreparedStatement prestmt=con.prepareStatement(sql);
			     prestmt.setInt(1, Integer.parseInt(this.collegeid_update.getText()));
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
	}
	/**
	 * 
	 * 淇敼瀛﹂櫌淇℃伅
	 */
	private void updateActionPerformed() {
		int result = 0;
		if(this.isEmpty(this.collegeid_update.getText())||this.isEmpty(this.collegename_update.getText())||this.isEmpty(this.dean_update.getText())||this.isEmpty(this.phonenumber_update.getText()))
		{
			JOptionPane.showMessageDialog(null, "鍐呭涓嶅叏锛�");
		}
		else
		{
			DefaultTableModel dmt=(DefaultTableModel)this.collegetable.getModel(); 
			dmt.setRowCount(0);
			Connection con=null;
			database star=new database();   
			  try {
				 con=star.getCon();
				 String sql = "update college_table set college_name=?,college_dean=?,phone_number=?,college_id=? where college_id=?";
			     PreparedStatement prestmt=con.prepareStatement(sql);
			       prestmt.setString(1, this.collegename_update.getText());
			       prestmt.setString(2, this.dean_update.getText());
			       prestmt.setString(3, this.phonenumber_update.getText());
			       prestmt.setInt(4, Integer.parseInt(this.collegeid_update.getText()));
			       prestmt.setInt(5, Integer.parseInt(this.collegeid_update.getText()));
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
	 * 鐐瑰嚮琛ㄦ牸锛屽湪涓嬮潰鏄剧ず
	 */
	private void mousePressActionPerformed(MouseEvent e) {
		int row=this.collegetable.getSelectedRow();
		this.collegename_update.setText((String) this.collegetable.getValueAt(row, 0));
		this.collegeid_update.setText(String.valueOf(this.collegetable.getValueAt(row, 1)));
		this.dean_update.setText((String) this.collegetable.getValueAt(row, 2));
		this.phonenumber_update.setText((String) this.collegetable.getValueAt(row, 3));
		
	}
	/**
	 * 鏌ユ壘瀛﹂櫌
	 */
	protected void findActionPerformed() {
		DefaultTableModel dmt=(DefaultTableModel)this.collegetable.getModel(); 
		dmt.setRowCount(0);
		Connection con=null;
		database star=new database();   
		  try {
			 con=star.getCon();
			 StringBuffer sql = new StringBuffer("select college_name,college_dean,phone_number,college_id from college_table");
	      	 String w= this.collegename.getText().replaceAll ("(.{1})", "$1%");
	 
	      	 if(!this.isEmpty(this.collegename.getText()))
		    	 sql.append(" and college_name like \"%"+w+"\"");
		    
		     PreparedStatement prestmt=con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		      
		      ResultSet rs=prestmt.executeQuery();
	        while (rs.next()) {
	                Vector<String> v=new Vector<String>();
	         
	                      
	            v.add(rs.getString("college_name"));
	            v.add(rs.getString("college_id"));
	            v.add(rs.getString("college_dean")); 
	            v.add(rs.getString("phone_number")); 
	           
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
		collegename_update.setText("");;
		collegeid_update.setText("");
		dean_update.setText("");
		phonenumber_update.setText("");
	}
}
