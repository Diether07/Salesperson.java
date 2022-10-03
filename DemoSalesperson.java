/*Chapter 8 Exercise 6a
 * Programmer: Diosdado Cartas
 * Date: October 1, 2022
 * File name: DemoSalesPerson.java
 * 
 * Create a class named Salesperson. Data fields for Salesperson include an integer ID number and a double annual sales amount. 
 * Methods include a constructor that requires values for both data fields, as well as get and set methods for each of the data fields. 
 * Write an application named DemoSalesperson that declares an array of 10 Salesperson objects. Set each ID number to 9999 and 
 * each sales value to zero. Display the 10 Salesperson objects. Save the files as Salesperson.java and DemoSalesperson.java.
 * */
public class DemoSalesperson {

	public static void main(String[] args) {
		//array size to 10 
		Salesperson[] salesperson = new Salesperson[10];
		
		for (int i = 0; i < salesperson.length; i++) {
			salesperson[i] = new Salesperson(9999,0.0);
		}
		
		System.out.println("Sales object");
		for (int i = 0; i < salesperson.length; i++) {
			System.out.println("ID: " + salesperson[i].getId() + " Sales amount: " + salesperson[i].getAnnualSA());
		}
	
	
	}

}
