import java.util.*;
import java.util.stream.Stream;
import java.io.*;


public class 신고결과 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // idList 입력 받기
        System.out.print("Enter id_list (comma-separated): ");
        String idListInput = br.readLine();
        StringTokenizer st1 = new StringTokenizer(idListInput, " ");
        String[] idList = new String[st1.countTokens()];
        for (int i = 0; i < idList.length; i++) {
            idList[i] = st1.nextToken();
        }

        // report 입력 받기
        System.out.print("Enter targets (comma-separated): ");
        String reportInput = br.readLine();
        StringTokenizer st2 = new StringTokenizer(reportInput, ",");
        String[] report = new String[st2.countTokens()];
        for (int i = 0; i < report.length; i++) {
            report[i] = st2.nextToken();
        }

        // k 입력 받기
        System.out.print("Enter targets (comma-separated): ");
        int k = Integer.parseInt(br.readLine());

        // solution 함수 호출
        int[] result = solution(idList, report, k);

        // 결과 출력
        System.out.print("Result: ");
        
    }

    public static int[] solution(String[] idList, String[] report, int k) {

        int[] result = new int[idList.length];

        // List<String> resultList = new ArrayList<>();;

        // 중복 신고 방지
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        Iterator<String> reported = reportSet.iterator();

        List<String> reportList = new ArrayList<>();

        while(reported.hasNext()) {
            reportList.add(reported.next().split(" ")[1]);
        }

        List<String> reportedMember = new ArrayList<>();
        for(String id : idList) {
            int num = Collections.frequency(reportList, id);
            if(num >= k) {
                reportedMember.add(id);
            }
        }

        List<String> a = new ArrayList<>();
        for(String member : reportedMember){
            if(reported.next().split(" ")[1].equals(member)) {
                String reportMember = reported.next().split(" ")[0];
                a.add(reportMember);
            }
        }

        System.out.println(a);




        // report = reportList.toArray(new String[0]);
        // Map<String, Integer> reportNum = new LinkedHashMap<>();

        
        // for(String id : idList) {
        //     reportNum.put(id, 0);
        // }

        
        
        // for(int i = 0; i < report.length; i++) {
        //     String reportedId = report[i].split(" ")[1];
        //     int num = reportNum.get(reportedId);
        //     reportNum.put(reportedId, ++num);
        // }

        // int i = 0;
        // for(String id : idList) {
            
        //     result[i] = reportNum.get(id);
        //     i++;
        // }

        
        

        return result;
    }
}
