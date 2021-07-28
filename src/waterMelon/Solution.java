package waterMelon;

/**
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 * 수박수박수박수박수박수? - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12922
 */
public class Solution {
    public String solution(int n) {
        String answer = "";
        for ( int i = 0; n > i; i++) {
            if ( i % 2 == 0) answer += "수"; // 나머지가 0이면 "수"추가
            else answer += "박"; // 나머지가 1이면 "박"추가
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(3);
    }
}
