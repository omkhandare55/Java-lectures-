public class ain {
    public static void main(String[] args) {
        Child1 D1=new Child1();
        System.out.println();
        Child2 D2=new Child2();
        

    }
    
}
class Parent1{
    boolean isAlive;
    Parent1(boolean value){
        isAlive=value;
        System.out.println("having two Childs");
        System.out.println(isAlive);
    } 
    void speak(){
        System.out.println("Parent");
    }   
}
class Child1 extends Parent1{
    Child1(){
        super(true);
        System.out.println("Child1");
    }
    
}
class Child2 extends Parent1{
    Child2(){
        super(true);
        System.out.println("Child2");

    }
     void speak(){
        System.out.println("Child2");
    }   
}o999
