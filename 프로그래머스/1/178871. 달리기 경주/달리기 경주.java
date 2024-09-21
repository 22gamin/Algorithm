import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {

        Map<String, Integer> play = new HashMap<>();
        
        // hashmap에 값 넣기
        int cnt = 0;
        for (int i = 0; i < players.length; i++){
            play.put(players[i],cnt);
            cnt++;
        }
        
        // 순위 변동
        for (int j = 0; j < callings.length; j++){
            
            Integer a = play.get(callings[j]); //불린 선수의 원래 순위
            String beforePlayer = players[a-1];
            
            play.put(callings[j], a-1);
            play.put(beforePlayer, a);
            
            players[a-1] = callings[j];
            players[a] = beforePlayer;
        }
        
        
        return players;
    }
}