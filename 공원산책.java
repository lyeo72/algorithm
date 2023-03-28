import java.util.*;
import java.io.*;


public class 공원산책 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // idList 입력 받기
        System.out.print("Enter park (comma-separated): ");
        String parkInput = br.readLine();
        StringTokenizer st1 = new StringTokenizer(parkInput, ",");
        String[] park = new String[st1.countTokens()];
        for (int i = 0; i < park.length; i++) {
            park[i] = st1.nextToken();
        }

        // report 입력 받기
        System.out.print("Enter routes (comma-separated): ");
        String routesInput = br.readLine();
        StringTokenizer st2 = new StringTokenizer(routesInput, ",");
        String[] routes = new String[st2.countTokens()];
        for (int i = 0; i < routes.length; i++) {
            routes[i] = st2.nextToken();
        }

        // solution 함수 호출
        int[] result = solution(park, routes);

        // 결과 출력
        System.out.print("Result: " + result[0] + ", " + result[1]);
        
    }

    public static int[] solution(String[] park, String[] routes) {
        int maxW = park[0].length() -1;
        int maxH = park.length -1;

        // 시작점 [h, w]
        int h = 0;
        int w = 0;

        for(String p : park) {
            w = p.indexOf("S");
            if(w >= 0) {
                break;
            }
            h++;
        }
        
        // 도착지
        int dH = h;
        int dW = w;
        
        for(String route : routes) {
            
        
            String direction = route.split(" ")[0]; // E W S N
            int move = Integer.parseInt(route.split(" ")[1]);

            if(direction.equals("E")) {
                dW = w + move;
                for(int i = 1; i <= move; i++) {
                    if(dW > maxW || park[h].charAt(w+i) == 'X') {
                        dW = w;
                        break;
                    }
                }
                w = dW;
 
            }else if(direction.equals("W")) {
                dW = w - move;
                for(int i = 1; i <= move; i++) {
                    if(dW < 0 || park[h].charAt(w - i) == 'X') {
                        dW = w;
                        break;
                    }
                }
                w = dW;

            }else if(direction.equals("S")) {
                dH = h + move;
                for(int i = 1; i <= move; i++) {
                    if(dH > maxH || park[i + h].charAt(w) == 'X') {
                        dH = h;
                        break;
                    }
                }
                h = dH;

            }else {
                dH = h - move;
                for(int i = 1; i <= move; i++) {
                    if(dH < 0 || park[h - i].charAt(w) == 'X') {
                        dH = h;
                        break;
                    }
                }
                h = dH;
            }
        }
        
        int[] destination = {h, w};
        return destination;
    }
}