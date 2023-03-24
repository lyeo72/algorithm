import java.util.*;


class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
       
        String result = "Yes";

        List<String> card1List = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2List = new ArrayList<>(Arrays.asList(cards2));
    
      
      for(int i = 0; i < goal.length; i++){
            if( card1List.size() != 0 && goal[i].equals(card1List.get(0))){
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