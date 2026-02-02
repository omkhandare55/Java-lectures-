//POLYMORPHISM:-

// Method overloading:-
/*class sum{
   // int x,y,z;
    int a,b,c;
    /*A(){
        x=0;
        y=0;
        z=0;
    } 
    A(int x){
        this.x=x;
    }
    A(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }*/
    /*sum(int a,int b){
        System.out.println(a+b);
    }
    sum(int a,int b,int c){
         System.err.println(a+b+c);
    }*/
/*} 
class A{
    void dispaly(int x)
    {
        System.out.println(x+" " +"int");
    }
}
class B extends A{
    void dispaly(Integer y){
        System.out.println(y+ " " +"Integer");
    }
}

 /*  Polymorphism :-
        Note:- on the basis of function return type method overloading not done 
        Ex if you Chande the return type of method display it cant accepet it
        it is only on different type of arguments/parameters or on different number of arguments/parameters */
public class Dsalec1 {
    public static void main(String[] args) {
       /*  A a=new A();
        A b=new A(10);
        System.err.println(a.x);
        System.err.println(b.x);
        A c= new A(10,20,30);
        System.out.println(c.x+ " "+c.y + " " +c.z);*/
        /*sum s1=new sum(5,10);
        sum s2=new sum(5,10,30) */
        /*B b1=new B();
        b1.dispaly(5);
        b1.dispaly((Integer)5); */
        /*b a1=new b();
        a1.dispaly();*/
        //cat c1=new cat();
        //dog d1=new dog();
        print p=new print();
       // p.print(c1);
        //p.print(d1);
        Amimal a=new dog();
       // new print().print(c1);
      
       p.print(new cat());




       

    }
    
}
//method overwriting:-
class a{
    void display()
{
System.out.println("A");
}
}
class b extends a{
    void dispaly(){
        System.out.println("B");
    }
}
// upcasting:- 
//here cat and dog is animal aslo
//ex double = int but int!=double
class Amimal{
    void speak(){
        int x=20;
        System.out.println("Speak");
    }
}
class cat extends Amimal{
    void speak(){
        //imp  When we want parent calss only
        System.out.println("Meow");
    }
}
class dog extends Amimal{
    int x=10;
    void speak(){
        
      System.out.println("Bark");
    }
}
class print{
    void print(Amimal a){
        //a.speak();
        if (a instanceof dog){
        dog d=(dog)a;
        d.speak();
    }
    else if (a instanceof cat){
        cat c=(cat)a;
        c.speak();
    }
}
}
/* Animal a=d; so we can only acess the parent class by it  */