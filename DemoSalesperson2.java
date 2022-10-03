/*Chapter 8 Exercise 6 b
 * Programmer: Diosdado Cartas
 * Date: October 02, 2022
 * File: DemoSalesperson2.java
 * 
 * Modify the DemoSalesperson application so each Salesperson has a successive ID number 
 * from 111 through 120 and a sales value that ranges from $25,000 to $70,000, increasing by $5,000 
 * for each successive Salesperson. Save the file as DemoSalesperson2.java.
 * */
public class DemoSalesperson2 {
	public static void main(String[] args) {
		Salesperson[] salesperson = new Salesperson[10];
		
		for(int i = 0; i < salesperson.length; i++) {
			salesperson[i] = new Salesperson(111+i,25000+5000*i);
			
		}
		
		for (int i = 0; i < salesperson.length; i++) {
			System.out.println("Id: #" + salesperson[i].getId() + "\t Annual Sales Amount: $" + salesperson[i].getAnnualSA());
		}

		
	}
}
