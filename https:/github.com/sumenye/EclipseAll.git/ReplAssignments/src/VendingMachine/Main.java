package VendingMachine;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		 DrinkVendingMachine vending = new DrinkVendingMachine(
	                new Drink("Iced Coffee",4.50,10),
	                new Drink("Iced Tea",2.50,5),
	                new Drink("Smart Water",4.0,20),
	                new Drink("Coke",2.30,13) );
	    
	   System.out.println( vending.drinks.get(0).toString() ); //Drink{name='Iced Coffee', cost=4.5, quantity=10}
	   vending.select(1);
	   
	   
	  }
	}
