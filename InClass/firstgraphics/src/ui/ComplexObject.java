package ui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class ComplexObject {
	BufferedImage img = null;
	
	public void draw(Graphics2D g, int x, int y) {
        g.draw(new Line2D.Double(x, y, x+50, y+50));
        
        Paint currPaint = g.getPaint();
        g.setPaint(Color.BLACK);
        g.draw(new Rectangle2D.Double(x+50, y+50, 50, 50));
        g.setPaint(Color.RED);
        g.fill(new Rectangle2D.Double(x+51, y+51, 49, 49));
        
        g.setPaint(new GradientPaint(x+100, y+100, Color.RED, x+150, y+100, Color.BLACK));
        g.fill(new RoundRectangle2D.Double(x+100, y+100, 50, 50, 10, 10));
        g.setPaint(currPaint);

        if (img == null) {
	        try {
	            URL url = this.getClass().getClassLoader().getResource("resources/mac.png");    	
	            img = ImageIO.read(url);
	        }
	        catch (Exception ex) {}
        }
        if (img != null)
        	g.drawImage(img, null, x, y+50);
        
        g.draw(new Ellipse2D.Double(x, y, 150, 150));
	}
}
