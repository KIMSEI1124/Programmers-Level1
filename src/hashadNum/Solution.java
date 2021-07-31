package hashadNum;

/**
 *제한 조건
 *x는 1 이상, 10000 이하인 정수입니다.
 *하샤드 수 - Level 1
 *https://programmers.co.kr/learn/courses/30/lessons/12947
 */

public class Solution {
    public boolean solution(int x) {
        boolean answer;
        int sumNum = 0;
        int y = x;
        do {
            sumNum += x % 10;
            x /= 10;
        }
        while (x != 0);
        return answer= ( ( y % sumNum) == 0) ? true : false;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        System.out.println(st.solution(1));
    }
}
