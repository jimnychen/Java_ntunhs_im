import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         ArrayList<Integer> arr = new ArrayList<Integer>();
         Scanner sc = new Scanner(System.in);
         String in=" ";
         System.out.println("請輸入一串數字，輸入a結束");
         while(!in.equals("a")){
            try {
                in = sc.nextLine();
                arr.add(Integer.parseInt(in));
            } catch (Exception e) {
                if(!in.equals("a"))System.out.println("請輸入數字");
            }
         };
         arr.sort(Comparator.naturalOrder());
         System.out.println("最大值"+arr.get(arr.size()-1));
         System.out.println("最小值"+arr.get(0));
         int sum = 0;
         for (int num : arr) { 
            sum += num; 
        } 
        System.out.println("平均值"+(double)sum/arr.size());
    }
}
