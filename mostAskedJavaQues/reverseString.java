import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        /*StringBuilder sb = new StringBuilder();
        sb.append(str);
        StringBuilder rev = sb.reverse();*/

        /*StringBuffer sb = new StringBuffer(str);
        //StringBuffer rev = sb.reverse();

        System.out.println("Reversed string is: "+sb.reverse());*/

        int len = str.length();
        String rev = "";

        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed string is "+rev);
    }
}
