class A{
    A()
    {
        System.out.println("A default Constructor");
    }  

    A(int s)
    {
        System.out.println("A Parameterized Constructor");
    }  
    
    
}

class B extends A{
    /**
     *
     */
    
    private static final int _3 = 3;

    B()
    {
        //super()  this is called by default
        System.out.println("B default Constructor");
    }    
    
    B(int s)
    {   super(_3);
        System.out.println("B Parameterized Constructor");
    }  
    void doSomething()
    {
        //super()  this is called by default
        System.out.println("B is Doing Something");
    }    
}

class SuperDemo{

    public static void main(String[] args) {
        B example = new B(8);
        example.doSomething();

        
    }

}