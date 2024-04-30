import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    record phonenumber(String number){}
    public static void main(String[] args) throws Exception {
        Set<phonenumber> number = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String in ="a";
        while (!in.equals("0")) {
            System.out.println("請輸入手機號碼，輸入0結束");
            in = sc.nextLine();
            if (!in.equals("0")) {
                number.add(new phonenumber(in));    
            }
            
        }
        System.out.println("你輸入的手機號碼數量有"+number.size());
        System.out.println(number);
    }
}
