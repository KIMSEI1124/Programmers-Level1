package primeNumFinder;

import java.util.ArrayList;

/**
 * 제한 조건
 * n은 2이상 1000000이하의 자연수입니다.
 * 소수 찾기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 */
public class Solution {
    public int solution(int maxInt) {
        int answer = 0;

        ArrayList<Integer> primeNum = new ArrayList<>();
        int sqrtInt = (int) Math.sqrt(maxInt);

        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        long start = System.currentTimeMillis();
        st.solution(50000);
        long end = System.currentTimeMillis();
        System.out.println("수행시간 : " + (end - start) + "ms");
    }
}
