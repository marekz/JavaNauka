package Pola;

public class CalculateField {
	
	private Double valA;
	private Double valB;
	private Double valC;
	private Double circuit;
	private Boolean Status;
	
	public CalculateField(Double A, Double B, Double C) {
		this.valA = A;
		this.valB = B;
		this.valC = C;
	}
	
	public Boolean CheckValue() {
		CheckValues chkV = new CheckValues(valA, valB, valC);
		this.Status = chkV.CheckValue();

		return this.Status;
	}
	
	private void CircuitCalculate() {
		this.circuit = (this.valA + this.valB + this.valC)/2; 
	}
	
	public String calculateField() {
		Double result;
		String resultInString;
		if(Status == true) {
			this.CircuitCalculate();

			result = Math.sqrt(this.circuit * (this.circuit - this.valA) * (this.circuit - this.valB) * (this.circuit - this.valC));

			resultInString = "" + result;
			
		} else {
			resultInString = "Błędnie wprowadzone dane";
		}
		
		return resultInString;
		
	}
}
