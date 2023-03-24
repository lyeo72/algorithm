import java.util.*;
import java.io.*;


public class 카드뭉치 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // card1 입력 받기
        System.out.print("Enter keymap (comma-separated): ");
        String card1Input = br.readLine();
        StringTokenizer st1 = new StringTokenizer(card1Input, " ");
        String[] card1 = new String[st1.countTokens()];
        for (int i = 0; i < card1.length; i++) {
            card1[i] = st1.nextToken();
        }

        // card2 입력 받기
        System.out.print("Enter targets (comma-separated): ");
        String card2Input = br.readLine();
        StringTokenizer st2 = new StringTokenizer(card2Input, " ");
        String[] card2 = new String[st2.countTokens()];
        for (int i = 0; i < card2.length; i++) {
            card2[i] = st2.nextToken();
        }

        // goal 입력 받기
        System.out.print("Enter targets (comma-separated): ");
        String goalInput = br.readLine();
        StringTokenizer st3 = new StringTokenizer(goalInput, " ");
        String[] goal = new String[st3.countTokens()];
        for (int i = 0; i < goal.length; i++) {
            goal[i] = st3.nextToken();
        }

        // solution 함수 호출
        String result = solution(card1, card2, goal);

        // 결과 출력
        System.out.print("Result: ");
        
    }

    public static String solution(String[] card1, String[] card2, String[] goal) {
        String result = "Yes";

        List<String> card1List = new ArrayList<>(Arrays.asList(card1));
        List<String> card2List = new ArrayList<>(Arrays.asList(card2));
    
        System.out.println(goal.length);

       for(int i = 0; i < goal.length; i++){
            if(card1List.size() != 0 && goal[i].equals(card1List.get(0))){
                card1List.remove(card1List.get(0));

            }else if(card2List.size() != 0 && goal[i].equals(card2List.get(0))){
                card2List.remove(card2List.get(0));
            }else {
                result = "No";
                break;
            }
       }
        return result;
    }
}
