package ex9;

public class Cat extends Pet{
	
private int livesLeft;

public Cat() {this.livesLeft = 7;}

 public Cat(String n, String o, int a,int l) {
  super(n, o, a);
  this.livesLeft = l;
}
 public Cat(String n, String o) {
	 super(n, o); 
	  
	  this.livesLeft = 7;
 }
 public void showDetails(){
	 System.out.println("I am a cat. "+
	 		this.livesLeft + " lives remain for me.");
	 }
 
}//end of the pet class