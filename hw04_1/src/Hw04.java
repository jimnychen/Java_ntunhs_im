import java.util.Scanner;
public class Hw04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text ="";
		System.out.println("這是可以陪你聊程式!你可以問我一些問題");
		while(true) {
			
			System.out.print(" 你說:");
			text = sc.nextLine();
			if(text.equals("0")) {
				System.out.print("離開聊天程式");
				break;
			}
			text=text.replace("嗎","");
			text=text.replace("?","!");
			text=text.replace("會不會", "會");
			text=text.replace("能不能", "能");
			text=text.replace("你能","我能");
			text=text.replace("你會", "我會");
			System.out.println("我說:"+text);
			
			
		}
		
		
	}
}
