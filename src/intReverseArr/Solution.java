package intReverseArr;

import java.util.ArrayList;

/**
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 자연수 뒤집어 배열로 만들기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12932
 */
public class Solution {
    public ArrayList solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        while (true) {
            answer.add( (int) n%10 );
            if ( n < 10 ) break;
            else n = n/10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        long n = 1000000000;
        st.solution(n);
    }
}
