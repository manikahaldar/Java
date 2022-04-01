import java.util.Scanner;

class SingleDArray{
    public static void main(String args[]){
        // int arr[];
        // arr = new int[5];
        // arr[0] = 25;
        // arr[1] = 55;
        // arr[2] = 48;
        // arr[3] = 12;
        // arr[4] = 87;

        // for(int i=0; i<arr.length; i++){
        //    System.out.println("The Single Dimentional array is: "+arr[i]);
        // }

        // Taking the input from user
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

    }
}