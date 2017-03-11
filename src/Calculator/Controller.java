package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener{
	static Model model;
	static View view;

	public Controller(Model model, View view) {
	this.model = model;
	this.view = view;
	view.addListeners();
	}
	
	Controller(){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		model.addNum(buttonPressed.getText());
		model.getInput1();
		model.getInput2();
		model.getInput3();
		model.getOutput();
		view.viewSetLabel(model.getInput1());
		view.viewSetLabel2(model.getInput2());
		view.viewSetLabel3(model.getInput3());
		view.viewSetLabel4(model.getOutput());
	}


}
