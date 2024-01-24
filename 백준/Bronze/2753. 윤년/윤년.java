import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 4 == 0 ){
            if(num % 100 != 0 || num % 400 == 0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        else {
            System.out.println("0");
        }
    }
}