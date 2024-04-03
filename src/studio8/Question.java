package studio8;

//instance variables
public class Question {
	private String prompt;
	private String answer;
	private int points;
	
	// constructor: set instance variables to parameters
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
	}
	
	//display question
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	//check answer 
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	//getters
	public int getPoints() {
		return this.points;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	//main
	public static void main(String[] args) {
		Question q = new Question("What number studio is this?", "8", 2);
		q.displayPrompt();
		System.out.println(q.checkAnswer("hi"));
		System.out.println(q.checkAnswer("8"));
	}
}
