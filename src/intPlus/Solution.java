package intPlus;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 제한사항(
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 * 두 개 뽑아서 더하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/68644
 */

public class Solution {
    public ArrayList solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        for ( int i = 0; numbers.length-1 > i; i++) {
            for ( int j = i+1; numbers.length > j; j++) {
                int checkInt = numbers[i] + numbers[j];
                if(!answer.contains(checkInt)) { // checkInt 가 answer 에 존재하지 않으면 값을 추가
                    answer.add(checkInt);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        int[] nums1 = new int[] {2,1,3,4,1};
        st.solution(nums1);
    }
}
