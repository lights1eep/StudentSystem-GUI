package team.twww.jwgl.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class image_change {
	/**
     * 改变图片的尺寸
     *
     * @param newWidth, newHeight, path
     * @return boolean
     */
    public boolean changeSize(int newWidth, int newHeight, String path) {
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(path));

            //字节流转图片对象
            Image bi = ImageIO.read(in);
            //构建图片流
            BufferedImage tag = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            //绘制改变尺寸后的图
            tag.getGraphics().drawImage(bi, 0, 0, newWidth, newHeight, null);
            //输出流
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path));
            //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            //encoder.encode(tag);
            ImageIO.write(tag, "jpg", out);
            in.close();
            out.close();
            return true;
        } catch (IOException e) {
        	System.out.println(e.getMessage());
            return false;
        }
    }
	public static void main(String[] args) {
		image_change s=new image_change();
		System.out.println(s.changeSize(1550, 800, "src/team_twww_jwgl_image/st.jpg"));
	}
}
