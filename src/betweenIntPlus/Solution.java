package betweenIntPlus;

/**
 * 제한 조건
 * a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
 * a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
 * a와 b의 대소관계는 정해져있지 않습니다.
 * 두 정수 사이의 합 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12912
 */
public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if ( b > a) {
            for (int i = a; b >= i; i++) {
                answer += (long) i;
            }
        }   // 정수 b가 더 큰 경우
        else if ( a > b) {
            for (int i = b; a >= i; i++) {
                answer += (long) i;
            }
        }   // 정수 a가 더 큰 경우
        else {
            answer = (long) a;
        }   // 두 정수가 동일한 경우
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(3,5);
    }
}
