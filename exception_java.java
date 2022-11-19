public class exception_java {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c =3;
        try {
          int arr[]={0,2,};
           System.out.println(arr[1]);
          // c = a / b;
        }catch (ArithmeticException e){
            System.out.println("pradeep");
        }catch (NullPointerException e){
          System.out.println("ram");
        }
        System.out.println(c);
        System.out.println("program");
    }
}
