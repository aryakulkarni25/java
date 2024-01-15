import java.util.Arrays;

public class checkEqualArrays {
    public static void main(String[] args) {
        int a1[]={1,2,3,4,5};
        int b1[]={1,2,3,4,1};
        
        /*if(Arrays.equals(a1,b1)){
            System.out.println("Arrays are equal.");
        }else{System.out.println("Arrays are not equal.");}*/

        boolean status = true;
        if(a1.length==b1.length){
            for(int i=0; i<a1.length; i++){
                if(a1[i]!=b1[i]){
                    status =false;
                }
            }

        }else{status=false;}

        if (status==true) {
            System.out.println("Arrays are equal.");
        }else{System.out.println("Arrays are not equal.");}
    }
    
}
