import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        int cnt = 0;

        n /= 100;
        n *= 100;

        while(n%f != 0){
            n++;
            cnt++;
        }
        if (cnt < 10){
            System.out.println("0" + cnt);
        }
        else{
            System.out.println(cnt);
        }
    }
}
