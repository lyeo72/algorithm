import java.util.*;
import java.io.*;


public class reqw {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // s 입력 받기
        System.out.print("Enter s (comma-separated): ");
        String s = br.readLine();

        // skip 입력 받기
        System.out.print("Enter skip (comma-separated): ");
        String skip = br.readLine();
        
        // index 입력 받기
        System.out.print("Enter index (comma-separated): ");
        int index = Integer.parseInt(br.readLine());

        // solution 함수 호출
        String result = solution (s, skip, index);

        // 결과 출력
        System.out.print("Result: " + result);
        
    }

    public static String solution(String s, String skip, int index) {

        String anwer = "";

        String[] alpabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        List<String> apList = new ArrayList<>(Arrays.asList(alpabet));

        List<String> skipList = new ArrayList<>(Arrays.asList(skip.split("")));

        for(int i = 0; i < s.length(); i++) {
            int newIndex = (apList.indexOf(String.valueOf(s.charAt(i))) + index) % 25;
            
            for(int j = index + 1; j <= newIndex; i++){
                if(skipList.contains(apList.get(j))){
                    newIndex++;
                }
            }
            anwer += apList.get(newIndex);
        }

       
        return anwer;
    }
}