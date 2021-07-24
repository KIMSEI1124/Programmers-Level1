package lottoMaxOrMin;

import java.util.*;

public class Solution {
    public int[] solution(int[] lotto, int[] win_nums) {
        int[] answer = new int[2];
        int grade = 7;  // 6등이면 낙점
        int zeroCount = 0;  // 0의 개수가 몇개인지 확인

        ArrayList<Integer> lottoList = new ArrayList<>();
        ArrayList<Integer> winList = new ArrayList<>();

        for ( int i = 0; lotto.length > i; i++) {
            lottoList.add(lotto[i]);
            winList.add(win_nums[i]);
        }   // 배열을 리스트로 변환

        for (int i = 0; lottoList.size() > i; i++) {
            if (lottoList.contains(winList.get(i))){
                grade -= 1;
            }   // 원소를 포함하고 있을경우
            if (lottoList.get(i) == 0) {
                zeroCount += 1;
            }   // 0을 포함하고 있을경우
        }   // lottoList 에 winList 의 원소가 들어있는지 확인

        if ( grade == 7) {
            grade = 6;
        }   // 최악의 경우 - 예외
        answer[1] = grade;

        if ( grade - zeroCount < 1) {
            grade = 1;
        }   // 최고의 경우 - 예외
        else if ( grade - zeroCount >= 1) {
            grade = grade - zeroCount;
        }   // 최고의 경우 - 정상
        answer[0] = grade;
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int[] lotto1 = new int[] {44, 1, 0, 0, 31, 25};
        int[] win1 = new int[] {31, 10, 45, 1, 6, 19};
        st.solution(lotto1,win1);

        int[] lotto2 = new int[] {0, 0, 0, 0, 0, 0};
        int[] win2 = new int[] {38, 19, 20, 40, 15, 25};
        st.solution(lotto2,win2);

        int[] lotto3 = new int[] {45, 4, 35, 20, 3, 9};
        int[] win3 = new int[] {20, 9, 3, 45, 4, 35};
        st.solution(lotto3,win3);
    }
}
