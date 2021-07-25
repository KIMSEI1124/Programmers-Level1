package stringPY;

/**
 * 제한사항
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.
 * 문자열 내 p와 y의 개수 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12916?language=java
 */
public class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0; int yCount = 0;
        StringBuilder sb = new StringBuilder(s);
        for ( int i = 0; sb.length() > i; i++) {
            if ( sb.substring(i,i+1).equals("p") || sb.substring(i,i+1).equals("P")) {
                pCount += 1;
            }
            else if ( sb.substring(i,i+1).equals("y") || sb.substring(i,i+1).equals("Y")) {
                yCount += 1;
            }
        }
        if ( pCount == yCount) answer = true;
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("pPoooyY");
    }
}
