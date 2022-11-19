import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class filehandling_java {
    public static void main(String[] args) throws IOException{
        File obj1 =new File("D:\\vam.txt");
        obj1.createNewFile();
        System.out.println("file created");
        FileWriter obj = new FileWriter("C:\\AMD\\vam.txt");
        obj.write("this is a pradeep");
        System.out.println("file has been written");
        obj.close();
//        File obj2 = new File("C:\\AMD\\vam.txt ");
//        Scanner reader = new Scanner(obj1);
//        String data = reader.nextLine();
//        System.out.println(data);
       // obj1.delete();
        if(obj1.delete()){
            System.out.println("object deleted");
        }
        else{
            System.out.println("Already deleted");
        }
    }
}

