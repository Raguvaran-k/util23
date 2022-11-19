public class Animal {
    public int legcount;
    public  void display(){
        System.out.println("I am an Animal,");
        System.out.println("I have"+ legcount+"legs,");

    }
}
class main{
    public static void main(String[] args) {
        Animal a=new Animal();
        a.legcount=4;
        a.display();
    }
}