package dartsGame;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * [1차]다트 게임 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */
public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        ArrayList<String> dartResultList = new ArrayList<>();
        System.out.println(Arrays.toString(dartResult.split("S")));
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("1S2D*3T");
    }
}
