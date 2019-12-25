//import java.util.Scanner;


class hello
{
    static int add(int ... i)
    {   int sum = 0;
        for(int k : i)
        {
            sum += k;
        }
        return sum;
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter number A:");
        // int a = scan.nextInt();
        // System.out.println("Enter number B:");
        // int b = scan.nextInt();

        // System.out.println("Addition is "+ (a+b));

 }
    public static void main(String[] args) {
        // add();
        System.out.println("Hello world");
     
        
        System.out.println(add(1,2,3,4,5,6,7,8,9,45));
        // int k[][]={
        //     {45,80,96,78}
        //     ,{78,87},
        //     {78,2,3,5,6,}
        // };


        // for (int i[] : k) {
        //     for(int j : i )
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
            
        // }
    }

}