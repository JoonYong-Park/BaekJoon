import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String str = br.readLine();
            int count = 0;
            int plus = 0;

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j)=='O'){
                    plus++;
                    count += plus;
                }
                else {
                    plus = 0;
                }
            }
            System.out.println(count);
        }
    }
}