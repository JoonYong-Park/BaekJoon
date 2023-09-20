import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        long num = Integer.parseInt(br.readLine());
        long hap = 1;

        for(long i = num; i > 0; i--){
            hap *= i;
        }
        System.out.println(hap);
    }
}
