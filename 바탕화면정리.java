import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
      int lux = 0;
       int luy = 0;
       int rdx = 0;
       int rdy = 0;

        List<String> paperList = Arrays.asList(wallpaper);

        //가장 위쪽의 최솟값
        for(int i = 0; i < wallpaper.length; i++) {
            if(paperList.get(i).contains("#")){
                lux = i;
                break;
            }
        }

        // 가장 아래쪽의 최댓값
        for(int i = wallpaper.length -1; i >= 0; i--) {
            if(paperList.get(i).contains("#")){
                rdx = i; // 최대값이기 때문에 + 1 (i 가 0 부터 시작하기 때문에 +1)
                break;
            }
        }

        
        luy = wallpaper[0].length();
        for(int i = 0; i < wallpaper.length; i++) {
            int index = paperList.get(i).indexOf("#");
            int lastIndex = paperList.get(i).lastIndexOf("#");


            if(index == -1){
                continue;
            }
        
            // 가장 왼쪽의 최소값 
            if(luy > index) {
                luy = index;
            }

            // 가장 오른쪽의 최대값
            if (rdy < lastIndex) {
                rdy = lastIndex; //0부터 시작 + 최댓값
            }
            
        }

       int[] result = {lux, luy, rdx + 1, rdy + 1};
        return result;
    }
}