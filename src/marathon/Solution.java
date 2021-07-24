package marathon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 */

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        boolean check;
        ArrayList<String> partList = new ArrayList<>();
        ArrayList<String> comList = new ArrayList<>();
        if ( participant.length < 1 && participant.length > 100000 ) {
            System.out.println("제한사항 1번");
        }
        if ( completion.length+1 != participant.length ) {
            System.out.println("제한사항 2번");
        }
        for (int i = 0; participant.length > i; i++) {
            check = Pattern.matches("^[a-z]*${1,20}",participant[i]); // a-z의 소문자 1개 이상 20개 이하.
            if (!check){
                System.out.println("제한사항 3번. 선수의 이름은 : " + participant[i]);
            }
        }
        //Arrays.sort(participant);    // 참가한 선수 정렬
        //Arrays.sort(completion);    // 완주한 선수 정렬
        for (int i = 0; completion.length > i; i++){ // 정렬한 배열을 ArrayList에 넣는다.
            partList.add(participant[i]);
            comList.add(completion[i]);
            if ( completion.length-1 == i) {
                partList.add(participant[i+1]);
            }
        }
        Collections.sort(partList);
        Collections.sort(comList);
        System.out.println(partList);
        System.out.println(comList);
        for (int i = 0; partList.size()-1 > i; i++){
            System.out.println(i);
            System.out.println(partList.get(i) + " " + comList.get(i));
            if(!partList.get(i).equals(comList.get(i))){
                comList.add(i,null);
                System.out.println("실행");
            }
        }
        if ( partList.size() != comList.size()){
            comList.add(null);
        }
        //System.out.println(partList);
        //System.out.println(comList);
        System.out.println(comList.indexOf(null));
        answer = partList.get(comList.indexOf(null));
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        Solution st = new Solution();
        String[] partStr1 = new String[] {"leo", "kiki", "eden"};
        String[] comStr1 = new String[] {"eden", "kiki"};
        st.solution(partStr1,comStr1);
        String[] partStr2 = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comStr2 = new String[] {"josipa", "filipa", "marina", "nikola"};
        st.solution(partStr2,comStr2);
        String[] partStr3 = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] comStr3 = new String[] {"stanko", "ana", "mislav"};
        //st.solution(partStr3,comStr3);
    }
}

// 다르면 그자리에 넣어버리고 비교후 출력