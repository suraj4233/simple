import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        int n,a=0,b=0,c=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        n=sc.nextInt();
        System.out.println("series are: ");
        for (int i = 1; i <=n; i++) 
        {
          a=b;
          b=c;
          c=a+b
          System.out.println(a+" ");    
        }
    }
    
}
