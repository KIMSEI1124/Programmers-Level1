package sumDigits;

/**
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 * 자릿수 더하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = String.valueOf(n);
        String[] arr = nStr.split("");
        for ( int i = 0; arr.length > i; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(123);
    }
}
