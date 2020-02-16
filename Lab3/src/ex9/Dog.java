package ex9;

public class Dog extends Pet{

	int noOfMasters;
	Dog(){}
	
	Dog(String n,String o,int a ,int m){
		super(n,o,a);
	  noOfMasters =1;
	}
	Dog(String n,String o){
		super(n,o);
	}
}
