import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingExample
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("New JFrame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		
		JButton button = new JButton("Button namesake");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "hello");
			}
		});
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}
}

