package intSort;

import java.util.Arrays;
import java.util.Collections;

/**
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 정수 내림차순으로 배치하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        for ( int i = arr.length-1; i >= 0; i--) {
            answer += Long.parseLong(arr[i]) * Math.pow(10,arr.length-1-i);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        long n = 111111;
        st.solution(n);
    }
}
