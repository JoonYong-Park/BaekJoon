import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] arr = new int[9][9];
        int max = arr[0][0];     // 최댓값
        int max_i = 1;           // 행
        int max_j = 1;           // 열

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = scan.nextInt();
                if(max < arr[i][j]){
                    max = arr[i][j];
                    max_i = i+1;
                    max_j = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_i +" "+ max_j);
        scan.close();
    }
}