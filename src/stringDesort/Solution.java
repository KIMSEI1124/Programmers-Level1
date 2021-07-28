package stringDesort;

import java.util.Arrays;
import java.util.Collections;

/**
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 * 문자열 내림차순으로 배치하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12917
 */
public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; arr.length > i; i++){
            answer += arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("Zbcdefg");
    }
}
