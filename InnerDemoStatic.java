/**
 * InnerDemo
 */
class Outer{
    int a = 7;
    void show(){
        System.out.println(" Outer is show is called");
    }

    static class inner{
        void display(){
            System.out.println(" Inner Static display is called");
        }
    }
    
}
public class InnerDemoStatic {
    public static void main(String[] args)
    {   Outer a =  new Outer();
        a.show();

        Outer.inner b = new Outer.inner();
        b.display();

    }
    
}