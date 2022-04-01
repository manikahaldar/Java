//Find the minimum and maximum value of an array using method and the taking input from user

import java.util.Scanner;

class FindMinAndMaxValue{
    public int min(int[] arr){
        int min = arr[0];
        for (int i =0 ; i <arr.length ; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int max(int[] arr){
        int max = arr[0];
        for (int i =0 ; i <arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
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

        // Call the non-static function
        FindMinAndMaxValue f = new FindMinAndMaxValue();
        int minimum = f.min(arr);
        int maximum = f.max(arr);
        System.out.println("\nThe minimum value of array is: "+minimum);
        System.out.println("The maximum value of array is: "+maximum);

    }  
}