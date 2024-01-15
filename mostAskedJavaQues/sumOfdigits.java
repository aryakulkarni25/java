import java.util.Scanner;

public class sumOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        //logic1- using algo
        int rev=0;
        while(num!=0){
            rev = rev + num%10;
            num=num/10;
        }
        System.out.println("Sum of digits in no is: "+rev);
}}
