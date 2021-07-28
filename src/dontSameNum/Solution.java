package dontSameNum;

import java.util.ArrayList;

/**
 * 제한사항
 * 배열 arr의 크기 : 1,000,000 이하의 자연수
 * 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 * 같은 숫자는 싫어 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12906
 */

public class Solution {
    public ArrayList solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int num : arr) {
            if (answer.size() > 0 && num != answer.get(answer.size() - 1)) { // 원소가 두개 이상일 경우 마지막 원소와 들어올 원소를 비교
                answer.add(num);
            } else if (answer.size() == 0) {   // 사이즈가 0일때 한개의 원소를 추가
                answer.add(num);
            }
        }
        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int[] arr = new int[]{1,1,3,3,0,1,1};   // 1, 3, 0, 1 출력
        st.solution(arr);
    }
}
