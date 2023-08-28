import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr2[i][j] = scan.nextInt()+arr1[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
