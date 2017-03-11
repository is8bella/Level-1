package Calculator;

public class Model {
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
		input1 = input1 + num;
		System.out.println(input1);
		
	}
	
}
