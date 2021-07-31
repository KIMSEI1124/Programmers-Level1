package gcdAndlcm;

/**
 * 제한 사항
 * 두 수는 1이상 1000000이하의 자연수입니다.
 * 최대공약수와 최소공배수 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12940
 */

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max;
        if ( n > m) max = n;
        else max = m;
        int gcd = 1;
        int lcm;
        for ( int i = 2; max >= i;i++){
            if ( n % i == 0 && m % i == 0) {
                n /= i;
                m /= i;
                gcd *= i;   // 최대공약수 > 공약수들의 곱
                i--;
            }
            if ( n == i || m == i) {
                break;
            }
        }
        lcm = gcd * (n * m);  // 최소공배수 > 공약수들의 곱 * 서로소
        answer[0] = gcd;
        answer[1] = lcm;
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(72,60);
    }
}
