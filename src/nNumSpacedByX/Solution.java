package nNumSpacedByX;

/**
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 * x만큼 간격이 있는 n개의 숫자 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12954
 */
public class Solution {
    public long[] solution(long x, int n) {  // 문제에서는 매겨변수 x의 타입이 int 형이지만 오류가 뜬다.
        long[] answer = new long[n];
        for ( int i = 1; n >= i; i++) {
            answer[i-1] = (x*i);
        }
        return answer;
    }
}
