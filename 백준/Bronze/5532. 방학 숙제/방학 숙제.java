import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        double m = 0;

        m = Math.max((double)A/(double)C, (double)B / (double)D);
        m = Math.ceil(m); // 올림
        L -= m;

        System.out.print(L);
    }
}