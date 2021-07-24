package Dotproduct;

/**
 * 제한사항
 * a, b의 길이는 1 이상 1,000 이하입니다.
 * a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
 * 내적 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/70128
 */

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; a.length > i; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
    public static void main(String[] args){
        Solution st = new Solution();
        int[] a1 = new int[] {-1,0,1};
        int[] b1 = new int[] {-3,-1,0,2};
        st.solution(a1,b1);
    }
}
