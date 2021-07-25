package divisorCountAndPlus;

import java.util.HashSet;

/**
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 * 약수의 개수가 짝수이면 덧셈, 홀수이면 뺄셈
 * 약수의 개수와 덧셈 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/77884
 */
public class Solution {
    /*
    생각
    - 전체를 말고 절반만 돌게 한다. ex)8이면 1, 2, 3, 4까지....
    - 중복이 있을수 있으니 HashSet 을 사용한다.
    -
     */
    public int solution(int left, int right) {
        int answer = 0;
        HashSet divisor = new HashSet();
        for ( int i = left; right >= i; i++) {
            divisor.clear();
            for ( int j = 1; i >= j; j++) {
                if ( i % j == 0) {
                    divisor.add(j);
                }
            }
            if ( divisor.size() % 2 == 0 ) {
                answer += i;
            }   // 나머지가 0이면 짝수
            else {
                answer -= i;
            }   // 나머지가 0이면 아니면 홀수
            //System.out.println(i + "번째, answer의 값 : " + answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int l1 = 13;
        int r1 = 17;
        //st.solution(l1,r1);
        int l2 = 24;
        int r2 = 27;
        st.solution(l2,r2);
    }
}
