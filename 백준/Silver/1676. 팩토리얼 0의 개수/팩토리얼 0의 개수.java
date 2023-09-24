import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(num >= 5){  // 2의 갯수는 항상 5보다 많으니 5의 갯수만 구한다.
            cnt += num / 5;
            num /= 5;
        }
        System.out.println(cnt);
    }
}
