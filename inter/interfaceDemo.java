package inter;
/**
 * interfaceDemo
 */

interface Demo {
    void show();
    default void love()
    {
        System.out.println(" love is not ill ");
    }
}
class my implements Demo{
    public void show()
    {
        System.out.println("IN show");
    }
}


/**
 * interfaceDemo
 */
public class interfaceDemo {
    
}

