interface dish {
    void ride();

}
class airtel implements dish{

    public void ride() {

        System.out.println("i can watching tv");

    }
}
class sun implements dish{

    public void ride() {
        System.out.println("i can watching tv" );
    }
}
class electrisian{
    public void checking(dish d){
        System.out.println( "checking");
        d.ride();
    }

}
public class interface_java {
     public static void main(String[] args) {
         electrisian e=new electrisian();
         airtel a=new airtel();
         sun s=new sun();
         e.checking(a);
         e.checking(s);

     }
}
