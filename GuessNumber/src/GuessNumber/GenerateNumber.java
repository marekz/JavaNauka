package GuessNumber;

public class GenerateNumber {
	
	private Integer randomValue;
	private Integer minValue = 0;
	private Integer maxValue = 999;

	public GenerateNumber() {
		this.setRandomValue();
	}

	public Integer getRandomValue() {
		return randomValue;
	}

	public void setRandomValue() {
		this.randomValue = this.minValue + (int)(Math.random() * ((this.maxValue - this.minValue) + 1));
	}
	

}
