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
        Set numHash = new HashSet<>();    // 중복을 허용하지 않는 성질을 이용
        ArrayList<Integer> primeNum = new ArrayList<>();
        for(int i = 0; nums.length-2 > i; i++) {    // nums배열의 안에 있는 값의 조합
            for ( int j = i+1; nums.length-1 > j; j++ ) {
                for ( int k = j+1; nums.length > k; k++) {
                    int sum = nums[i] + nums[j] + nums[k];  // 3가지의 자연수를 더한 값
                    numHash.add(sum);
                }
            }
        }
        ArrayList<Integer> numList = new ArrayList<Integer>(numHash);  // 배열안에 있는 값들의 모음 중복이 없다.
        Collections.sort(numList);  // ArrayList를 정렬해주었다.

        // ========================================================== 2,997이하의 소수구하기
        primeNum.add(2);
        for ( int i = 2; i <= 2997; i++){
            for( int j = 0; primeNum.size() > j; j++) {
                if(j%primeNum.get(j)==0) {
                    break;
                }
                if ( j+1 == primeNum.size()) {
                    primeNum.add(i);
                }
            }
        }
        System.out.println(primeNum);
        System.out.println(numList);
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        for ( int i = 2; i >=1000; i++) {
            int[] nums2 = new int[] {i};
        }
        int[] nums1 = new int[] {1,2,3,4};
        st.solution(nums1);
    }
}