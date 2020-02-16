package ex8;

public class Main {
public static void main(String[] args){
Pet p = new Pet("Lissie","Smith",3);

p.showDetails();
Cat c = new Cat("Kyan", "Silva", 4, 4);
c.showDetails();


Cat newBornCat = new Cat("Tom", "Apple");
newBornCat.showDetails();

Pet newBornPet = new Pet("Lissie","Smith");
newBornPet.showDetails();
}
}//end of the demo class