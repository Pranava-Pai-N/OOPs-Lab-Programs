import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class KeyEventMouseeventSimulator extends JFrame implements KeyListener,MouseListener
{
	public KeyEventMouseeventSimulator()
	{
		 setTitle("Mouse Event Listener");
		 setSize(500,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setLocationRelativeTo(null);
		 addKeyListener(this);
		 addMouseListener(this);
		 setFocusable(true);	 
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(()->{
			KeyEventMouseeventSimulator simulator = new KeyEventMouseeventSimulator();
			simulator.setVisible(true);
		});
	}
	

	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse Clicked at : ( "+e.getX()+","+e.getY()+")");

	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed at : ( "+e.getX()+","+e.getY()+")");

	}

	
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released at : ( "+e.getX()+","+e.getY()+")");
	}

	
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
	}
	
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited");

	}
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed : "+e.getKeyChar());
	}

	
	public void keyPressed(KeyEvent e) {
		System.out.println("Key Typed : "+KeyEvent.getKeyText(e.getKeyCode()));
	}

	
	public void keyReleased(KeyEvent e) {
		System.out.println("Key Typed : "+KeyEvent.getKeyText(e.getKeyCode()));
	}
}
