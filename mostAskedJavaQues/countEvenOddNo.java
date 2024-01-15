import java.util.Scanner;

public class countEvenOddNo {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        int even_count=0;
        int odd_count=0;

        while(num!=0){
            rev = num%10;
            if(rev%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num = num/10;
        }
        System.out.println("Even digits in given no: "+even_count);
        System.out.println("Odd digits in given no: "+odd_count);

    }
}
