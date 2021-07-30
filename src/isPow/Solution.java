package isPow;

/**
 * 제한 사항
 * n은 1이상, 50000000000000 이하인 양의 정수입니다.
 * 정수 제곱근 판별 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12934
 */
public class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrtInt = Math.sqrt(n);
        double check = sqrtInt%1;
        if (check != 0) answer = -1; // 정수가 양의 제곱근이 아니면
        else {  // 정수가 양의 제곱근이면
            answer = (long) Math.pow(sqrtInt+1,2);
        }
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        long n = 3;
        st.solution(n);
    }
}
