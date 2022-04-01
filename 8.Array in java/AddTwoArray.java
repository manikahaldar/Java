import java.util.Scanner;
class AddTwoArray{
    public static void String(String args[]){
           Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row: ");
        int m = sc.nextInt();
        System.out.println("Enter size of column: ");
        int n = sc.nextInt();

        int array1[][]= new int[m][n];
        System.out.println("Enter the elements of the array1: ");
        for(int i = 0; i<m ;i++){
        for(int j = 0 ; j<n ; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter size of row: ");
        int m = sc.nextInt();
        System.out.println("Enter size of column: ");
        int n = sc.nextInt();

        int array2[][]= new int[m][n];
        System.out.println("Enter the elements of the array2: ");
        for(int x = 0; x<m ;x++){
        for(int y = 0 ; y<n ; y++){
                array2[x][y] = sc.nextInt();
            }
        }
        int add[p][q] = array1[i][j] + array2[x][y];
        System.out.println("----------------Array-----------------");
        for(int p = 0; p<m ;p++){
            for(int q = 0 ; q<n ; q++){
               System.out.print(add[p][q]+" ");
            }
            System.out.println();
        }
    }
}