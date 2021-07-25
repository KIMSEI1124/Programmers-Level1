package budget;

import java.util.Arrays;

/**
 * 제한사항
 * d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
 * d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
 * budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다.
 * 예산 - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */

public class Solution {
    /**
     * 최대로 구매할수 있는 물품의 수를 구한다.
     * @param d 물품의 가격이 들어있는 배열
     * @param budget 예산
     * @return  구매할수 있는 물품의 수
     */
    public int solution(int[] d, int budget) {
        int answer = 0;
        int totalPrice = 0;
        Arrays.sort(d); // 정렬하여 낮은 가격을 앞으로
        for ( int i = 0; i < d.length; i++) {
            totalPrice += d[i];
            if( totalPrice > budget){
                break;
            }// 예산금액에 도달하면 종료
            answer += 1;
        }
        return answer;
    }
}
