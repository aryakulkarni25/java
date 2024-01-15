import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        //logic1- using algo
        int rev=0;
        int count=0;
        while(num!=0){
            rev = num%10;
            count++;
            num=num/10;
        }
        System.out.println("digits in no are: "+count);
}
}
