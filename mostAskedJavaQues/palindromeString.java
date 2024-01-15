import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String strOrg = str;
        StringBuilder rev = new StringBuilder(str).reverse();
        String strRev = String.valueOf(rev);
        
        if(strOrg.equals(strRev)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }
}
