package 인터페이스_예제;

import java.util.Random;

public class PlusGame implements IGame{

	Random ran = new Random();
	
	private int num1;
	private int num2;
	private String[] array = {"+","-","/","*"};
	private int index;

	public PlusGame() {}
	
	public PlusGame(Random ran, int num1, int num2, String[] array, int index) {
		this.ran = ran;
		this.num1 = num1;
		this.num2 = num2;
		this.array = array;
		this.index = index ;
	}

	public void makeRandom() {
		this.num1 = ran.nextInt(9) + 1;
		this.num2 = ran.nextInt(9) + 1;
		this.index = ran.nextInt(4);
	}

	public String getQuizMsg() {
		int tmp;
		if (this.num1 < this.num2) {
			tmp = this.num1;
			this.num1 = this.num2;
			this.num2 = tmp;
		}
		return this.num1 + " " + this.array[index] + " " + this.num2 + " = ";
	}
	
	public boolean checkAnswer(int answer) {
		int tmp;
		if (this.array[index].equals("+")) {
			if (this.num1 + this.num2 == answer) 
				return true;
			else 
				return false;
		}
		else if (this.array[index].equals("-")) {
			if (this.num1 < this.num2) {
				tmp = this.num1;
				this.num1 = this.num2;
				this.num2 = tmp;
			}
			if (this.num1 - this.num2 == answer) 
				return true;
			else 
				return false;
		}
		else if (this.array[index].equals("*")) {
			if (this.num1 * this.num2 == answer) 
				return true;
			else 
				return false;
		}
		else if (this.array[index].equals("/")) {
			if (this.num1 / this.num2 == answer) 
				return true;
			else 
				return false;
		}
		else
			return false;
	}
}
