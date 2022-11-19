import java.util.Scanner;

public class if_ava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your value");
        int tamil= sc.nextInt();
        int eng= sc.nextInt();
        int math= sc.nextInt();
        int soc= sc.nextInt();
        int sci= sc.nextInt();
        int total=tamil+eng+math+soc+sci;
         float percentage=total/5f;
         if (percentage<=50) {
             System.out.println(" get a pass mark");
         }
         else if (tamil<50) {
             System.out.println("to get a pass mark");
         }
         else if (eng<50) {
             System.out.println("to get a pass mark");
         }
         else if (math<50) {
             System.out.println("to get a pass mark");
         }
         else if (soc<50) {
             System.out.println("to get a pass mark");
         }
         else if (sci<50) {
             System.out.println("to get a pass mark");
         }
else {
             System.out.println("fail");

         }
    }


        }

