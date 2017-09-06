package Pola;

public class CheckValues {
	
	private Double valA;
	private Double valB;
	private Double valC;
	
	public CheckValues(Double A, Double B, Double C) {
		this.valA = A;
		this.valB = B;
		this.valC = C;
	}
	
	public Boolean CheckValue()
	{
		if (valA + valB < valC) {
			return false;
		}
		else if (valB + valC < valA) {
			return false;
		}
		else if (valC + valA < valB) {
			return false;
		} else 
			return true;
	}
}
