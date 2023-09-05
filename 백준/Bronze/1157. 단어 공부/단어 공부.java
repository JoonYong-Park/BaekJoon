import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] arr = new int[26];
        int max = -1;
        char index = '?';

        for(int i = 0; i < str.length(); i++) {
            if('a'<= str.charAt(i) && str.charAt(i) <= 'z') {        // 소문자
                arr[str.charAt(i) - 'a']++;
            }
            else if ('A'<= str.charAt(i) && str.charAt(i) <= 'Z') {   // 대문자
                arr[str.charAt(i) - 'A']++;
            }
        }
        for(int j = 0; j < 26; j++) {
            if(arr[j] > max){
                max = arr[j];
                index = (char)(j +'A');
            }
            else if(arr[j] == max) {
                index = '?';
            }
        }
        System.out.println(index);
    }
}