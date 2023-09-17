import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            boolean bool = true;
            String str = br.readLine();

            if (str.equals("0")) break;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    bool = false;
                    break;
                }
            }
            System.out.println(bool == true ? "yes" : "no");
        }
    }
}