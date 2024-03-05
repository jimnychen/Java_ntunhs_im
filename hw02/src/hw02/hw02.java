package hw02;
import java.time.Year;
import java.util.Scanner;
public class hw02 {
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		if(ask("是否發燒(y/n)").equals("y")) {
			if(ask("是否咳嗽(y/n)").equals("y")) {
				if(ask("是否疲倦(y/n)").equals("y")) {
					System.out.println("感冒");
				}else {
					System.out.println("其他系統");
				}
			}else {
				if(ask("是否有高血壓(y/n)}").equals("y")){
					if(ask("是否口乾(y/n)").equals("y")) {
						System.out.println("肝病");						
					}else {
						System.out.println("其他系統");
					}
				}else{
					if(ask("是否盜汗(y/n)").equals("y")) {
						System.out.print("肺病");
					}else {
						System.out.println("其他系統");
					}
				}
			}
		}else {
			System.out.println("正常");
			}
		}
	public static String ask(String question){
		String input = "";
		System.out.println(question);	
		input = sc.nextLine();
		return input;
	}
}
