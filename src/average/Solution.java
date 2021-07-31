package average;

/**
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 * 평균 구하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12944
 */
public class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for ( int i : arr) answer += i;
        return answer = answer/arr.length;
    }
}
