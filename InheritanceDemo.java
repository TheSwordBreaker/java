/**
 * InheritanceDemo
 */
class Add {

    void add(int a, int b)
    {
        System.out.println("Addition is "+(a+b));
    }
}

class Sub extends Add{
    void sub(int a,int b)
    {
        System.out.println("Subtraction is "+(a-b));
    }
}

class InheritanceDemo extends Sub{
    public static void main(String[] args)
    {
        Sub a = new Sub();
        a.add(5,5);
        a.sub(8,7);
    }
}