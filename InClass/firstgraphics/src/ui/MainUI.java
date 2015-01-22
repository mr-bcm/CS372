package ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MainUI extends JFrame {
	private ComplexObject obj = new ComplexObject();
	int x = 100, y = 150;
	
	public MainUI() {
		setBounds(new java.awt.Rectangle(50, 50, 500, 500));
		
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent ev) {
				x = ev.getX();
				y = ev.getY();
				MainUI.this.repaint();
			}

			@Override
			public void mouseEntered(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

			@Override
			public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseReleased(MouseEvent e) {}
		});
		
		Timer tm = new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				x += 3;
				y += 3;
				MainUI.this.repaint();
			}
		});
		tm.setInitialDelay(500);
		tm.start();
	}

	@Override
    public void paint(Graphics g) {
        super.paint(g);
        
        obj.draw((Graphics2D) g, x, y);
    }


	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
	}

}
