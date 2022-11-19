class animal{
    String name;
    public void  eat(){
        System.out.println("i can eat");
    }
}
class dog extends animal{
    public void display(){
        System.out.println("my name is");
    }

}
class inheritance_java {
    public static void main(String[] args) {
        dog pappi=new dog();
        pappi.name="ragu";
        pappi.display();
        pappi.eat();
    }
}
