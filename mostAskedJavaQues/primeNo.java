import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int count=0;
        if(num>1){
            for(int i=1; i<num/2; i++){
                if(num%2==0)
                    count++;
            }
            if(count>1){
                System.out.println("Given no is not a prime no");
            }else{
                System.out.println("Given no is a prime no");
            }
        }
    }
}
