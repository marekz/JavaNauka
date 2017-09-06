package GuessNumber;

public class PlayGame {
	
	Integer generatedValue;
	Integer userAnswer;
	Integer counter = 1;
	
	public PlayGame(Integer generatedValue) {
		this.generatedValue = generatedValue;
		this.getUserAnswer();
	}
	
	private void getUserAnswer() {
		this.AskQuestion();		
		this.compareResult();		
	}
	
	private void AskQuestion() {
		AskAboutNumber askQuestion = new AskAboutNumber();
		this.userAnswer = askQuestion.AskQuestion();
	}
	
	private void compareResult() {
		
		if(generatedValue.equals(userAnswer)) {
			System.out.println("Your answer is OK!");
			System.out.println("Generated value : " + generatedValue);
			System.out.println("You gave the answer in " + this.counter + " step!" );
			
		} else if(this.userAnswer > this.generatedValue){
			System.out.println("Wrong value, select a lower value ...");
			this.counter = this.counter + 1;
			this.getUserAnswer();
			
		
		} else if(this.userAnswer < this.generatedValue) {
			System.out.println("Wrong value, select a higher value...");
			this.counter = this.counter + 1;
			this.getUserAnswer();
		}	
	}
}
