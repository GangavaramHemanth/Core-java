public class TestStaticMethod{
    public static void main(String args[]){
        Staticmethod.change();//calling change method
        //creating objects  
        Staticmethod s1 = new Staticmethod(111,"Karan");
        Staticmethod s2 = new Staticmethod(222,"Aryan");
        Staticmethod s3 = new Staticmethod(333,"Sonoo");
        //calling display method  
        s1.display();
        s2.display();
        s3.display();
    }

}
