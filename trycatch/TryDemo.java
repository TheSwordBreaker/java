

/**
 * TryDemo
 */

public class TryDemo {

    public static void main(String[] args) {
        
        Thread t = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                try{
                Thread.sleep(500);
                }catch(InterruptedException e)
                {

                }

                System.out.println(i + " " + Thread.currentThread().getName());
            }
        },"kUnal");  
        
        try{
         t.start(); 
        }
        catch(Exception e){
            System.err.println(e);
        }finally{
            t.start();
        }
        
    }
}