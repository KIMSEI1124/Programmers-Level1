package primeNumber;

import java.util.*;

/**
 *제한사항
 * nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
 * nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
 * 소수 만들기 - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/12977
 */

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet numHash = new HashSet<>();    // 중복을 허용하지 않는 성질을 이용
        ArrayList<Integer> primeList = new ArrayList<>();

        threeNumPlus(nums, numHash);

        ArrayList<Integer> numList = new ArrayList<Integer>(numHash);  // numList배열안에 있는 값들의 모음 중복X
        Collections.sort(numList);  // ArrayList를 정렬

        return answer;
    }


    public void threeNumPlus(int[] nums, HashSet numHash) {
        for (int i = 0; nums.length - 2 > i; i++) {
            for (int j = i + 1; nums.length - 1 > j; j++) {
                for (int k = j + 1; nums.length > k; k++) {
                    int sum = nums[i] + nums[j] + nums[k];  // 3가지의 자연수를 더한 값
                    numHash.add(sum);
                }
            }
        } // nums배열의 안에 있는 값의 조합, 중복을 이용하지 않는 성질을 이용하였다.
    }   // 3개의 정수를 더하여 HashSet에 넣는 메서드

    public static void main(String[] args) {
        Solution st = new Solution();
        for ( int i = 2; i >=1000; i++) {
            int[] nums2 = new int[] {i};
        }
        int[] nums1 = new int[] {1,2,7,6,4};
        st.solution(nums1);
    }
}