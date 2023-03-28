import java.util.*;
import java.util.stream.Collectors;
import java.io.*;


public class 덧칠하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력 받기
        System.out.print("Enter n (comma-separated): ");
        int n = Integer.parseInt(br.readLine());
        

        // m 입력 받기
        System.out.print("Enter n (comma-separated): ");
        int m = Integer.parseInt(br.readLine());
        

        // section 입력 받기
        System.out.print("Enter section (comma-separated): ");
        String sectionInput = br.readLine();
        StringTokenizer st2 = new StringTokenizer(sectionInput, ",");
        int[] section = new int[st2.countTokens()];
        for (int i = 0; i < section.length; i++) {
            section[i] = Integer.parseInt(st2.nextToken());
        }

        // solution 함수 호출
        int result = solution(n, m, section);

        // 결과 출력
        System.out.print("Result: " + result);
        
    }

    public static int solution(int n, int m, int[] section) {
        List<Integer> sectionList = Arrays.stream(section).boxed().collect(Collectors.toList());

        int answer = 0;

        int max = 0;

        for(int sec : sectionList) {
            if(sec > max) {
                answer++;
                max = sec + m - 1;
            }
        }
       return answer;
    }
}