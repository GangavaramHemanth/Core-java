public class Animal {
    //Single Inheritance Example
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        Rat d=new Rat();
        d.bark();
        d.eat();
    }}
