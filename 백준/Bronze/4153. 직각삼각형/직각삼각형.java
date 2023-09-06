import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());  // 토큰화

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            boolean d1 = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
            boolean d2 = Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
            boolean d3 = Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2);

            if (a == 0 && b == 0 && c == 0) {
                break;
            } 
            else if (d1) {
                System.out.println("right");
            }
            else if (d2) {
                System.out.println("right");
            }
            else if (d3) {
                System.out.println("right");
            } 
            else {
                System.out.println("wrong");
            }
        }

    }
}