import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int hap = 0;
        int min = 100;

        for(int i = 0; i < 7; i++){
            num = Integer.parseInt(br.readLine());
            if(num % 2 != 0){
                hap += num;
                if(min > num){
                    min = num;
                }
            }
        }
        if(hap == 0){
            System.out.println(-1);
            return;  
        }
        System.out.println(hap);
        System.out.println(min);
    }
}