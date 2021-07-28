package stringHandling;

import java.util.regex.Pattern;

/**
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * 문자열 다루기 기본 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12918
 */
public class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if ( s.length() == 4 || s.length() == 6 ) answer = Pattern.matches("^[0-9]*$",s);
        return  answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        System.out.println(st.solution("a234"));
        System.out.println(st.solution("aaaaaa"));
        System.out.println(st.solution("111111"));
        System.out.println(st.solution("111"));
    }
}
