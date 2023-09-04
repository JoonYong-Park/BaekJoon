import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {       // 배열 -1로 초기화
            arr[i] = -1;
        }

        String S = in.nextLine();

        for(int i = 0; i < S.length(); i++) {       // 문자열 S의 길이만큼 반복
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1) {	            // arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {	    // arr 배열 출력
            System.out.print(val + " ");
        }
    }
}