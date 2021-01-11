package 教务管理系统;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ImageIcon icon = new ImageIcon("src/team_twww_jwgl_image/1.jpg");
		g.drawImage(icon.getImage(), 0, 0, null);
	}
}