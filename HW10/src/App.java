
public class App {
    public static void main(String[] args) throws Exception {
       student student = new student(); 
       String in ="a";
       while(in!="0"){
            System.out.println("請輸入功能 1：新增 2：查詢 3:修改 4：刪除 5：顯示全部 0離開");
            in = student.sc.nextLine();
            switch(in){
                case "0":
                in="0";
                break;
                case "1":
                System.out.println("請輸入學生姓名");
                String Name = student.sc.nextLine();
                String grade="a";
                while (grade.equals("a")) {
                    try {
                        System.out.println("請輸入學生成績");
                        grade = student.sc.nextLine();
                        student.add(Name,Integer.valueOf(grade));
                    } catch (Exception e) {
                        System.out.println("成績只能為數字");
                        student.sc.nextLine();
                    }
                }
                break;
                case "2":
                System.out.println("請輸入欲查詢學生姓名");
                System.out.println(student.search(student.sc.nextLine()));
                break;
                case "3":
                System.out.println("請輸入欲修改學生姓名");
                System.out.println(student.changeGrade(student.sc.nextLine()));
                break;
                case "4":
                System.out.println("請輸入欲刪除學生姓名");
                System.out.println(student.remove(student.sc.nextLine()));
                break;
                case "5":
                student.showAll();
                break;
                default:
                System.out.println(in+"是無效的輸入");
                break;
            }
       }
    }
}
