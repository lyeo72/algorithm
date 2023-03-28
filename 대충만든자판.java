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
        int[] result = solution (keymap, targets);

        // 결과 출력
        System.out.print("Result: " + result[0] + ", " + result[1]);
        
    }

    public static int[] solution(String[] keymaps, String[] targets) {

        List<HashMap<String, Integer>> keymapList = new ArrayList<>();

        for(String keymap : keymaps) {
            keymapList.add(new HashMap<String, Integer>());
        }

        int index = 0;
        for(String keymap : keymaps) {
            for(int i = 0; i < keymap.length(); i++) {
                keymapList.get(index).put(String.valueOf(keymap.charAt(i)), i);
            }
            index++;
        }

        for(String target : targets) {
            for(int i = 0; i < target.length(); i++) {
                keymapList.get(i).get(target.charAt(i));
                
            }

        }



        return null;
    }
}