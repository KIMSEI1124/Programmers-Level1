package caesarPassword;

import java.util.Arrays;

/**
 * 제한 조건
 * 공백은 아무리 밀어도 공백입니다.
 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
 * s의 길이는 8000이하입니다.
 * n은 1 이상, 25이하인 자연수입니다.
 * 시저 암호 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12926
 */
class Solution {
    /**
     * 
     * @param s 암호화 전 문자열
     * @param n 암호화 할때 n만큼 민다
     * @return  시저 암호
     */
    public String solution(String s, int n) {
        String answer = "";
        char[] cArr = new char[s.length()];
        for ( int i = 0; s.length() > i; i++ ) {
            if ( 97 <= (int) s.charAt(i) && (int) s.charAt(i) <= 122 && (int) s.charAt(i) + n > 122)
                cArr[i] = (char) ((int) s.charAt(i) + n - 26);
            else if ( 65 <= (int) s.charAt(i) && (int) s.charAt(i) <= 90 && (int) s.charAt(i) + n > 90)
                cArr[i] = (char) ((int) s.charAt(i) + n - 26);
            else if ( (int) s.charAt(i) == 32)
                cArr[i] = ' ';
            else cArr[i] = (char) ((int) s.charAt(i) + n);
        }   // 문자의 아스키코드를 arr에 저장한다.
        for ( int i = 0; cArr.length > i; i++) {
            answer += cArr[i];
        }
        return answer;
    }

    /*
    공백 32
    a-z, 97-122
    A-Z, 65-90
    */

    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("a B z", 4);    
    }
}