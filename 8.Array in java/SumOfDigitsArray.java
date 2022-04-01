import java.util.Scanner;
class SumOfDigitsArray{
    public int sum_of_digits(int[] arr){
        int sum = 0;
        for(int i : arr){     // Using for-each loop
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the nymber of element: ");    //Size of an array
        num = sc.nextInt();
        
        int arr[] = new int[num];
        for (int i =0 ; i<num ; i++){
            System.out.print("Enter the element at index of "+i+" is :");
            arr[i] =sc.nextInt();
        }
        System.out.println("-------------Array-----------");
        for(int j = 0; j<num ; j++){
            System.out.print(arr[j]+" ");
        }

        SumOfDigitsArray s = new SumOfDigitsArray();
        int result = s.sum_of_digits(arr);
        System.out.println("\nSum of Elements in array is: "+ result);
    }
}