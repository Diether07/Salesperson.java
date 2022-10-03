
public class Salesperson {
	private int id;
	private double annualSA;  // Annual sales Amount
	
	public Salesperson(int id, double annualSA) {
		setId(id);
		setAnnualSA(annualSA);
	}

	//Getters and Setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getAnnualSA() {
		return annualSA;
	}


	public void setAnnualSA(double annualSA) {
		this.annualSA = annualSA;
	}

	

}
