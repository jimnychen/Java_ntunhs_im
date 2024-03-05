package hw02_2;
import java.util.Random;
import java.util.Scanner;
public class hw02_2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Random rand = new Random();
		int guess = 0;
		int ans = rand.nextInt(101);
		int upper , lower;
		lower = 1;
		upper = 100;
		while(true) {
			
			System.out.println("請輸入"+lower+"~"+upper+"的數字");
			guess = sc.nextInt();
			if(guess>ans) {
				upper = guess;
			}
			if(guess<ans) {
				lower = guess;
			}
			if(guess == ans) {
				break;
			}
			}
		System.out.print("你猜中了");
	}
}
