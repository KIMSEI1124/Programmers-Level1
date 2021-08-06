package shortfallMoney;

/**
 * 부족한 금액 계산하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/82612
 */
public class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        // TODO 총 필요한 금액 계산
        for ( int i = 1; count >= i; i++) {
            totalPrice += price * i;
        }
        // TODO 부족한 금액 계산
        return answer = ( totalPrice - money > 0) ? totalPrice - money : 0;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        System.out.println(st.solution(3, 20, 4));
    }
}
