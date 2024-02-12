package top;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class myFrame extends JFrame{

	public myFrame() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Guess The Number Game");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,600);
		frame.setResizable(false);
		
		ImageIcon img = new ImageIcon("num.jpg");
		frame.setIconImage(img.getImage());
		frame.getContentPane().setBackground(new Color(154,206,223));
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("GUESS THE NUMBER");
		l1.setFont(new Font("Times New Roman",Font.PLAIN,25));
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setVerticalAlignment(JLabel.TOP);
		JLabel l2 =  new JLabel("SET THE NUMBER BEFRORE STARTING THE GAME")
		frame.add(l1);
	}
}