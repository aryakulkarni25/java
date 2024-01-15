import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int n1=0,n2=1,sum=0;
        System.out.println("Fibonacci series:");
        System.out.println(n1+"\n"+n2);
        for(int i=2; i<num; i++){
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
}
}