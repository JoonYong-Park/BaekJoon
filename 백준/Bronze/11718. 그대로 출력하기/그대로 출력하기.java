import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            String str = scan.nextLine();
            System.out.println(str);
        }
        scan.close();
    }
}