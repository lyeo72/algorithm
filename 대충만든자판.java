import java.util.*;
import java.io.*;

public class 대충만든자판 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // keymap 입력 받기
        System.out.print("Enter keymap (comma-separated): ");
        String keymapInput = br.readLine();
        StringTokenizer st1 = new StringTokenizer(keymapInput, ",");
        String[] keymap = new String[st1.countTokens()];
        for (int i = 0; i < keymap.length; i++) {
            keymap[i] = st1.nextToken();
        }

        // targets 입력 받기
        System.out.print("Enter targets (comma-separated): ");
        String targetsInput = br.readLine();
        StringTokenizer st2 = new StringTokenizer(targetsInput, ",");
        String[] targets = new String[st2.countTokens()];
        for (int i = 0; i < targets.length; i++) {
            targets[i] = st2.nextToken();
        }

        // solution 함수 호출
        int[] result = solution(keymap, targets);

        // 결과 출력
        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        // TODO: 문제 해결 코드 작성


        for(String t : targets) {
            for(int i = 0; i < t.length(); i++) {
                // t.charAt(i)
                
                keymap[0].charAt(i)
                keymap[1].charAt(i)
        

            }

        }


        
        return answer;
    }
}
