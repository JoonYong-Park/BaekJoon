import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());      // a
        int down = Integer.parseInt(st.nextToken());    // b
        int length = Integer.parseInt(st.nextToken());  // v

        int day = (length - down) / (up - down);  // 정상까지 남은 거리가 up과 같을때
        if ((length - down) % (up - down) != 0)   // 정상까지 남은 거리가 up과 같지 않을때
            day++;

        System.out.println(day);
    }
}