public class Friends {


	public static void main(String[] args){
		
    	//3. Create an instance of Classmate for each person in your class.
   	 Classmate Bob1 = new Classmate();
   	 Classmate Bob2 = new Classmate();
   	 Classmate Bob3 = new Classmate();
   	 Classmate Bob4 = new Classmate();
    	//4. set descriptions for each Classmate
   	 Bob1.setDescription("A person who is not Aaron's classmate.");
   	 Bob2.setDescription("A person who is not Aaron's classmate.");
   	 Bob3.setDescription("A person who is not Aaron's classmate.");
   	 Bob4.setDescription("A person who is not Aaron's classmate.");
   	 //5. Use your getter to print out each description
   	 System.out.println(Bob1.getDescription());
   	 System.out.println(Bob2.getDescription());
   	 System.out.println(Bob3.getDescription());
   	 System.out.println(Bob4.getDescription());
   	 
	}





}
class Classmate{
	String description;
    
	//1. create a setter that sets a description for this person
	public void setDescription (String description){
		this.description = description;
	}
	//2. create a getter that gets a description of this person
	public String getDescription (){
		return description;
	}

}



