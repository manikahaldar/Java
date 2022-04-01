import java.util.Scanner;
class MultiDArray{
    public static void main(String args[]){
        // 1st way to create multi dimensional array
        System.out.println("--------------2x2 array------------");
        int arr1[][];
        arr1 = new int [2][2];
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 3;
        arr1[1][1] = 4;
        
        for(int i = 0 ; i<2 ; i++){
            for(int j=0 ; j<2 ; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }

        // 2nd way to create multi dimensional array
        System.out.println("--------------3x3 array------------");
        int arr2[][]={{1,2,3},{2,4,5},{4,4,5}};  
        for(int i=0;i<3;i++){  
            for(int j=0;j<3;j++){  
                System.out.print(arr2[i][j]+" ");  
            }  
            System.out.println();  
        }

        // Taking Input from user
        System.out.println("-------------Creating this array taking input From user input-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row: ");
        int m = sc.nextInt();
        System.out.println("Enter size of column: ");
        int n = sc.nextInt();

        int array[][]= new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<m ;i++){
        for(int j = 0 ; j<n ; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("----------------Array-----------------");
        for(int i = 0; i<m ;i++){
            for(int j = 0 ; j<n ; j++){
               System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
   }
}