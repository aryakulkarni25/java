import java.util.Arrays;
public class largestInArray {
    public static void main(String[] args) {
        int arr[] = {12,34,55,8,22};
        
        //logic1-algo
        /*int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in array is "+max);*/

        //logic2- Arrays.sort()
        int len = arr.length;
        System.out.println("Largest :"+findMax(arr,len));
    }
        public static int findMax(int[] arr,int len){
            Arrays.sort(arr);
            return arr[len-1];
        }
        
    
}
