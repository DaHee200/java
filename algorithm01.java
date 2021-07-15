
import java.util.Scanner;

public class Student{
    private String name;
    private String no;

    public Student(String name, String no) {
        // super();
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

}


    
public class main{


    public static void main(String[] args){

        Student st1 = new Student("손오공", "1682");
        Student st2 = new Student("손오공", "1682");
        Student st3 = new Student("손오공", "1682");

        ArrayList <Student>list = new ArrayList<Student>();
        
        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student stu : list) {
            System.out.println(stu.getName);
            System.out.println(stu.getNo);
        }

        Scanner scan = new Scanner (System.in);

        while (true) {
            System.out.println("계속 검색하고 싶으시면 y, 종료하고 싶으시면 n");
            String input = scan.next();

                if (input.equals("y")) {
                    System.out.println("검색이 시작됩니다.");
                }
                else if (input.equals("n")){
                    break; 
                    
                }
            }
            // if (input.equals("y")){
            //     System.out.println("검색을 시작합니다.");
            //     String input = scan.next();

            //     for (Student stu : list){
            //         if (stu.getName().equals(name)){
            //             System.out.println("해당하는 학생의 학번은:" + stu.getNo());

            //         }
            //     }
            // }
            // else if (input.equal("n")){
            //     break;
            // }

            System.out.println("프로그램이 종료 되었습니다.");
        }


    }
