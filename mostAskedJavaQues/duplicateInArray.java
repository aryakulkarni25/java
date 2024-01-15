import java.util.HashSet;

public class duplicateInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,5,1,1};
        /*for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is "+arr[i]);
                
                }
            }
        }*/

        HashSet <Integer>nums = new HashSet();
        for(int value:arr){
            if(nums.add(value)==false){     //hashset cannot contain duplicate values(it returns false for duplicate nnd true for unique)
                System.out.println("Duplicate element is "+value);
            }
        }
    }
}
