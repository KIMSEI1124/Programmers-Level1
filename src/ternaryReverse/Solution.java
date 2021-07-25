package ternaryReverse;

import java.util.ArrayList;

/**
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 * 3진법 뒤집기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */

public class Solution {
    /**
     * 10진법 > 3진법 > 뒤집기 > 10진법
     * @param n 자연수
     * @return  3진법으로 치환하고 reverse 된 10진법
     */
    /*
    몫이 1이 되면 종료
    나머지를 계속 이어 붙인다.
    StringBuilder 로 이어 붙이면 자동으로 reverse 되있다.
    거기서 형변환을 한뒤 10진법으로 바꾸면 교환
     */
    public int solution(int n) {
        int answer = 0;
        int exponentiation = 0;
        double dbAnswer = 0;
        ArrayList<Integer> ternary = new ArrayList();
        while (true) {
            if ( n < 3) {
                ternary.add(n);
                break;  }
            ternary.add(n%3);
            n = n / 3;
        }   // n(10진법)	> n(3진법) > 앞뒤반전(3진법)
        System.out.println(ternary);
        for ( int i = ternary.size()-1; i >= 0; i--) {
            dbAnswer += ternary.get(i)*Math.pow(3,exponentiation);  // 거듭제곱 함수 사용
            System.out.println( "answer의 값 : " + dbAnswer + ", ternary.get("+i+")의 값 : " + ternary.get(i) + ", exponentiation의 값 : " + exponentiation + ", 자리수의 값 : " + Math.pow(3,exponentiation));
            exponentiation += 1;
        }
        answer = (int) dbAnswer;    // 형변환
        System.out.println("answer의 값 : " + answer);
        return answer;
    }   // 2, 4, 5, 6, 8, 9
    public static void main(String[] args) {
        Solution st = new Solution();
        //st.solution(45);
        //st.solution(125);
        st.solution(3333333);
    }
}
/*
1
7

1
4
13
54 + 13 = 67
162 + 67 = 229
 */
