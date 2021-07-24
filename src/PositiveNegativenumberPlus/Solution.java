package PositiveNegativenumberPlus;

/**
 * 제한사항
 * absolutes의 길이는 1 이상 1,000 이하입니다.
 * absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
 * signs의 길이는 absolutes의 길이와 같습니다.
 * signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
 * 음양 더하기 - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/76501?language=java
 */
public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
            for ( int i = 0; absolutes.length > i; i++ ) {
                System.out.println((i + 1) + "번째");
                if (signs[i] == false) {
                    absolutes[i] = -absolutes[i];
                }
                answer += absolutes[i];
            }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        int[] ab1 = new int[] {4,7,12};
        boolean[] sign1 = new boolean[] {true,false,true};
        st.solution(ab1,sign1);
    }
}
