package Calculator;

import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	

	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton buttondiv = new JButton("/");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton buttonx = new JButton("x");
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton buttonplus = new JButton("+");
	JButton buttonsub = new JButton("-");
	JButton button0 = new JButton("0");
	JButton buttonclear = new JButton("c");
	JButton buttonequals = new JButton("=");
	
	JLabel label1 = new JLabel("");
	JLabel label2 = new JLabel("");
	JLabel label3 = new JLabel("");
	JLabel label4 = new JLabel("");
	
	void viewSetLabel(String num){
		label1.setText(num);
	}
	void viewSetLabel2(String num){
		label2.setText(num);
	}
	void viewSetLabel3(String num){
		label3.setText(num);
	}
	void viewSetLabel4(String num){
		label4.setText(num);
	}
	
	public View(){
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		panel.setLayout(new GridLayout(5, 4));
		frame.add(panel);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttondiv);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonx);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonsub);
		panel.add(buttonclear);
		panel.add(button0);
		panel.add(buttonequals);
		panel.add(buttonplus);

	
	}
	void addListeners(){
		button1.addActionListener(new Controller());
		button2.addActionListener(new Controller());
		button3.addActionListener(new Controller());
		button4.addActionListener(new Controller());
		button5.addActionListener(new Controller());
		button6.addActionListener(new Controller());
		button7.addActionListener(new Controller());
		button8.addActionListener(new Controller());
		button9.addActionListener(new Controller());
		button0.addActionListener(new Controller());
		buttonx.addActionListener(new Controller());
		buttondiv.addActionListener(new Controller());
		buttonsub.addActionListener(new Controller());
		buttonclear.addActionListener(new Controller());
		buttonplus.addActionListener(new Controller());
		buttonequals.addActionListener(new Controller());
	}
	
}
