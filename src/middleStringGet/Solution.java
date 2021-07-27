package middleStringGet;

/**
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 * 가운데 글자 가져오기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12903
 */

public class Solution {
    /**
     * 가운데 문자를 가져오는 메서드
     * @param s 문자열
     * @return 문자열의 중앙 1,2글자
     */
    public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder(s);
        int answerLength = answer.length();
        answer.delete(answerLength/2+1,answerLength);
        if ( answerLength % 2 == 0) answer.delete(0,answerLength/2-1);
        else answer.delete(0,answerLength/2);
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        String s1 = "abcde";
        st.solution(s1);
    }
}
