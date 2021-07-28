package dividingNumArr;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 * 나누어 떨어지는 숫자 배열 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12910
 */

public class Solution {
    /**
     *
     * @param arr 숫자 배열
     * @param divisor 나누는 정수
     * @return  arr % divisor 나머지가 0인 정수
     */
    public ArrayList solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for ( int num : arr) {
            if ( num % divisor == 0) answer.add(num);
        }
        if ( answer.size() == 0) answer.add(-1);    // 원소가 없을 경우 -1을 return 하기 위해서
        Collections.sort(answer);   // 정렬
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        int[] arr1 = new int[] {5, 9, 7, 10};   // return : 5, 10
        st.solution(arr1,5);
    }
}
