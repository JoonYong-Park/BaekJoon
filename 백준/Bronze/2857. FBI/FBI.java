import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[5];
        boolean fbi = false;

        for(int i = 0; i < 5; i++) name[i] = br.readLine();
        for(int i =0; i < 5; i++)
            if (name[i].contains("FBI")) {
                System.out.print((i + 1) + " ");
                fbi = true;
            }
        if(!fbi) System.out.println("HE GOT AWAY!");
    }
}
