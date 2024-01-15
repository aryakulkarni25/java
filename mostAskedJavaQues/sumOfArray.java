public class sumOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }

        int even_count=0;
        int odd_count=0;
        for(int value:arr){      //enhanced for loop
            if(value%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }

        System.out.println("Even elements in the array: "+even_count);
        System.out.println("Odd elements in the array: "+odd_count);
        System.out.println("Sum of elements in the array is "+sum);
    }
}
