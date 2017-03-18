package Calculator;

public class Model {
	boolean operatorPressed;
	String input1 = ""; 
	String input2 = "";
	String input3 = "";
	String output = ""; 

	String getInput1(){
		return input1;
	}
	String getInput2(){
		return input2;
	}
	String getInput3(){
		return input3;
	}
	String getOutput(){
		return output;
	}
	
	void addNum(String num){

	if (num.equals("c")) {
		input1 = "";
		input2 = "";
		input3 = "";
		output = "";
		operatorPressed = false;
	}
		
	else if (num.equals("=")) {
		calculate();
	}
	else if (num.equals("+")||num.equals("-")||num.equals("x")||num.equals("/")) {
		input2 = num;
		operatorPressed = true;
	}
	else if (operatorPressed == false){
		input1 = input1 + num;
	}
	else if (operatorPressed == true){
		input3 = input3 + num;
	}
	}
	
	void calculate(){
		
		int sandal = Integer.parseInt(input1);
		int sandal2 = Integer.parseInt(input3);
		int mainsandal = 0;
		if (input2.equals("+")) {
			mainsandal = sandal + sandal2;
		}
		if (input2.equals("-")) {
			mainsandal = sandal - sandal2;
		}
		if (input2.equals("x")) {
			mainsandal = sandal * sandal2;
		}
		if (input2.equals("/")) {
			mainsandal = sandal/sandal2;
		}
		output = mainsandal + "";
		System.out.println(output);
	}
	
}
