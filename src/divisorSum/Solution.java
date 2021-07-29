package divisorSum;

/**
 * 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 * 약수의 합 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12928
 */
public class Solution {
    /**
     * 약수의 합을 구한다.
     * @param n 정수
     * @return 약수의 합
     */
    public int solution(int n) {
        int answer = 0;
        for ( int i = 1; n >= i; i++) {
            if ( n % i == 0) answer += i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(12);
    }
}
