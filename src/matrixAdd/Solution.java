package matrixAdd;

import java.util.Arrays;

/**
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 * 행렬의 덧셈 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 */
public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new  int[arr1.length][arr1[0].length];
        for ( int i = 0; arr1.length > i; i++) {
            for ( int j = 0; arr1[0].length > j; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        //System.out.println(Arrays.toString(answer[0]));
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int[][] arr1 = new int[][] {{1,2},{2,3}};
        int[][] arr2 = new int[][] {{3,4},{5,6}};
        st.solution(arr1,arr2);
    }
}
