package primeNumber;

import java.util.Arrays;

/**
 * 제한사항
 * nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
 * nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
 * 소수 만들기 - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/12977
 */

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);  // 배열 정렬

        // TODO 숫자 배열중에서 가장 큰수를 찾기
        int maxNum = 0;
        for (int i = (nums.length - 1); i > nums.length - 4; i--) {
            maxNum += nums[i];
        }

        // TODO 가장 큰수보다 작은 소수구하기
        int[] primeArr = new int[maxNum+1];
        int sqrtMaxNum = (int) Math.sqrt(maxNum);

        for (int i = 0; i <= maxNum; i++) primeArr[i] = i; // primeArr 에 숫자를 집어넣는다.
        primeArr[1] = 0;   // 1은 0으로 취급

        for (int i = 2; i <= sqrtMaxNum; i++) {
            if (primeArr[i] == 0) continue;
            for (int j = i + i; j <= maxNum; j += i) primeArr[j] = 0;
        }

        // TODO 숫자 배열의수 더해서 비교하기
        for ( int i = 0; nums.length > i; i++) {
            for ( int j = i+1; nums.length > j; j++) {
                for ( int k = j+1; nums.length > k; k++) {
                    int matchNum = nums[i] + nums[j] + nums[k];
                    for ( int a = 0; primeArr.length > a; a++) {
                        if ( matchNum == primeArr[a]) {
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int[] nums1 = new int[]{1,2,7,6,4};
        System.out.println(st.solution(nums1));
    }
}