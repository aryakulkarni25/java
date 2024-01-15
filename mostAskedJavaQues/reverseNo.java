import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        //logic1- using algo
        /*int rev=0;
        while(num!=0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println("Reversed no is: "+rev);*/

        //logic2- using StringBuffer
        /*StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reversed no is: "+rev);*/

        //logic3- using StringBuilder
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        //StringBuilder sb = new StringBuilder();
        //sb.append(num); these two lines are the another syntax u can use for this class
        StringBuilder rev = sb.reverse();
        System.out.println("Reversed no is: "+rev);
    }
}
