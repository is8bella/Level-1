import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	public static void main(String[] args) {
		char currentLetter;
		TypingTutor tutor = new TypingTutor();
	}
	public TypingTutor(){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		String currentLetter = generateRandomLetter() + "";
		label.setText(currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);	
		frame.pack();
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		String currentLetter = generateRandomLetter() + "";
		label.setText(currentLetter);
		
	}


}
