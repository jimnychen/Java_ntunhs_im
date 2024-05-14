
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class student {
    File StudentData = new File("./student.csv");
    student(){
        if(!StudentData.exists()) {
            try {
                StudentData.createNewFile();
            } catch (IOException e) {
                System.err.println(e);
            }
            
        }else{
            loadFromCsv("student.csv");
        }
    }
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
     void writeToCsv(String file){
        try {
           BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String,Integer> entry:student.entrySet()){
                writer.write(entry.getKey()+","+entry.getValue());
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
                    System.err.println(e);
        }
        
     }
     void loadFromCsv(String file){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line = reader.readLine())!=null){
                String studentName= line.split(",")[0];
                int grade = Integer.parseInt(line.split(",")[1]);
                student.put(studentName, grade);
            }
            reader.close();
        } catch (Exception e) {
                    System.err.println(e);
        }
     }
    }


