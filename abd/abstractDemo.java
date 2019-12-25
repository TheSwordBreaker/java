package abd;
abstract class Human{
    public abstract void eat();

    public void walk(){
        System.out.println("Walk");
    }
}
class Man extends Human{
    public void eat()
    {
        System.out.println("Eat human");
    }
    public void walk(){
        System.out.println("Walk man");
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        Man m = new Man();
        m.eat();
    }
    
}