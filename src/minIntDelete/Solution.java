package minIntDelete;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다. > 중복이 없다.
 * 제일 작은 수 제거하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12935
 */
public class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> answer = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        boolean isRun = true;
        int checkInt = 1;
        while (isRun) {
            if (answer.contains(checkInt)){
                answer.remove(answer.indexOf(checkInt));
                break;
            }
            checkInt++;
        }
        if ( answer.size() == 1) { // 배열의 길이가 1인 경우
            answer.clear();
            answer.add(-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int[] arr1 = new int[]{4,3,2,1};
        st.solution(arr1);
        int[] arr2 = new int[]{10};
        st.solution(arr2);
    }
}
