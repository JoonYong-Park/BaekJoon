import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String str = br.readLine();
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }
    }
}