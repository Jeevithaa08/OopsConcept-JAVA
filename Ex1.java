package Day3Project;
import java.util.*;
class Receipe{
	String str="pizza, burger, nachos, chat items";
	int pizza=200;
	int Burger=180;
	int nachos=100;
	int chatitems=20;
	
	
    void display() {
    System.out.println("The name of the receipe is:" +str);	
    System.out.println("The price of one pizza is :" +pizza);
    System.out.println("The price of one burger is :" +Burger);
    System.out.println("The price of one nachos is :" +nachos);
    System.out.println("The price of other chat items starts from :" +chatitems);
   
    
    
}
}
public class Ex1{
	public static void main(String[] args) {
		
		Receipe r1 = new Receipe();
		r1.display();
	
}
	
	
}
	
	
