/**
 * InnerDemo
 */
class Outer{
    int a = 7;
    void show(){
        System.out.println(" Outer is show is called");
    }

    class inner{
        void display(){
            System.out.println(" Inner display is called");
        }
    }
    
}
public class InnerDemo {
    public static void main(String[] args)
    {   Outer a =  new Outer();
        a.show();

        Outer.inner b = a.new inner();
        b.display();

    }
    
}