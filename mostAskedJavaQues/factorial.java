import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        long facto=1;
        for(int i=1; i<=num; i++){
            facto=facto*i;
        }
        System.out.println("Factorial of "+num+"is "+facto);
}
}