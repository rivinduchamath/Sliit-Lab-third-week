package ex10;

public class Dog extends Pet{

	int noOfMasters;
	Dog(){}
	
	Dog(String n,String o, int m){
		super(n,o ,0);
	  noOfMasters =1;
	}
	Dog(String n,String o){
		super(n,o);
	}
	@Override
	public void showDetails(){
		super.showDetails();
		}
}
