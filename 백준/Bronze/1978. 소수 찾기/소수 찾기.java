import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] arr = new int[n];
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1){
                continue;
            }
            int j = 2;

            while (true) {
                if(arr[i] % j == 0 && arr[i] != 2){  // j = 2
                    break;
                }
                j++;
                if(j >= arr[i]){
                    max++;
                    //System.out.println(arr[i]);
                    break;
                }
            }
        }
        System.out.println(max);
    }
}