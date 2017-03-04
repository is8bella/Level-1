package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	Model model;
	View view;

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
		System.out.println("test");
	}


}
