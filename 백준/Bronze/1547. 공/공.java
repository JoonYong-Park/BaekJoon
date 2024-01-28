import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cup = {1,0,0};
        int m = sc.nextInt();

        for(int i = 0 ; i < m ; i++){
            int x = Integer.parseInt(sc.next()) - 1;
            int y = sc.nextInt() - 1;
            int temp = 0 ;

            temp = cup[x];
            cup[x] = cup[y];
            cup[y] = temp;
        }

        for(int i = 0; i < 3; i++){
            if(cup[i] == 1)
                System.out.println(i+1);
        }
    }
}