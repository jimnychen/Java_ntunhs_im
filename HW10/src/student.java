import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class student {
     private Map<String,Integer> student =new HashMap<String,Integer>();
    public Scanner sc =new Scanner(System.in);
     void add(String StudentName,Integer Grade){
        student.put(StudentName,Grade);
        return;
     }
     String search(String key){
        if(student.containsKey(key)){
            return key+"的成績是"+student.get(key);
        }else{
            return "找不到"+key+"的成績，這個學生是否有登記在系統中?";
        }
     }
     String changeGrade(String key){
        if(student.containsKey(key)){
            System.out.println("輸入修改後之成績");
            Integer grade =0;
            while (grade == 0) {
                try {
                grade= sc.nextInt();
                student.put(key,grade);
                } catch (Exception e) {
                System.out.println("請輸入數字");
                }
            }
            sc.nextLine();
            return key+"修改後的成績是"+student.get(key);
            
        }else{
            return "找不到"+key+"，這個學生是否有登記在系統中?";
        }
     }
     String remove(String key){
        if(student.containsKey(key)){
            student.remove(key);
            return "移除完成";
        }else{
            return "找不到"+key+"，這個學生是否有登記在系統中?";
        }
     }
     void showAll(){
      this.student.forEach((key,value)-> System.out.println(key+":"+value));  
      return;
     }
    }


