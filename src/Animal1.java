public class Animal1 {
    //Multilevel Inheritance Example
    void eat(){System.out.println("eating...");}
}
class PIG extends Animal1{
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Rat {
    void weep(){System.out.println("weeping...");}
}
class TestInheritance2{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }}
