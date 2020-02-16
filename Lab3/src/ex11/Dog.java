package ex11;

public class Dog extends Pet{

	int noOfMasters;
	Dog(){}
	
	Dog(String n,String o, int m){
		super(n,o ,0);
	  noOfMasters =1;
	}
	Dog(String n,String o){
		super(n,o);
		noOfMasters =2;
	}
	@Override
	public void showDetails(){
		super.showDetails();
		System.out.println("I am a dog. I have " +noOfMasters+ " masters at home.");
		}
}
