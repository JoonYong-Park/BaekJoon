import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n1 = st.nextToken();
        String n2 = st.nextToken();

        long hap=0;
        for(int i=0; i<n1.length(); i++){
            for(int j=0; j<n2.length(); j++){
                hap += (n1.charAt(i)-'0')*(n2.charAt(j)-'0');
            }
        }

        System.out.println(hap);
    }
}
