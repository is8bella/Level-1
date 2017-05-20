import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Review {
	JFrame frame = new JFrame();
	JButton button = new JButton("Submit");
	JButton button2 = new JButton("Hint");
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JLabel riddle = new JLabel("Why did the chicken cross the road?");

public static void main(String[] args) {
	Review review = new Review();
}

public void riddeellll(){
	frame.setVisible(true);
	frame.add(panel);
	panel.add(riddle);
	panel.add(answer); 
	panel.add(button);
	panel.add(button2);
}


}