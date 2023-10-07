import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[][] xy = new int[t][2];

        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(xy, (arr_1, arr_2) -> {
            if(arr_1[0] == arr_2[0])  {
                return arr_1[1] - arr_2[1];
            }
            else {
                return arr_1[0] - arr_2[0];
            }
        });

        for(int i = 0; i < t; i++){
            System.out.println(xy[i][0]+" "+xy[i][1]);
        }
    }
}