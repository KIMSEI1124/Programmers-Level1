package failureLate;

import java.util.*;

/**
 * 제한사항
 * 스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
 * stages의 길이는 1 이상 200,000 이하이다.
 * stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
 * 각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
 * 단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
 * 만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
 * 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.
 * 실패율 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/42889
 */

public class Solution3 {
    /**
     *
     * @param N 스테이지 레벨
     * @param stages 사용자가 도전중인 스테이지
     * @return  실패율
     */
    public ArrayList<Integer> solution(int N, int[] stages) {
        ArrayList<Double> failureList = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for ( int i = 1; N >= i; i++) {
            int playerCount = 0;
            int failCount = 0;
            double failure;
            for (int stage : stages) {
                if (stage >= i) {
                    playerCount += 1;
                }
                if (stage == i) {
                    failCount += 1;
                }
            }
            if ( playerCount != 0) {
                failure = (double) failCount / playerCount;
                for ( int j = failureList.size()-1; j >= 0; j--) {
                    if (failureList.size() == 0) {
                        failureList.add(failureList.size(), failure);
                        break;
                    } else {
                        if (failureList.get(j) == 0) ;
                        else if (failureList.get(j) < failure) ;
                        else if (failureList.get(j) >= failure) {
                            failureList.add(j + 1, failure);
                            break;
                        }
                    }
                }
            }
            else {
                failureList.add(failureList.size(), 0.0);
                answer.add(answer.size(), i);
            }   // 스테이지에 아무도 도달하지 못했을 경우
            System.out.println(failureList);
            System.out.println(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution3 st = new Solution3();
        int[] s1 = new int[] {2, 1, 2, 6, 2, 4, 3, 3};
        //st.solution(5,s1);
        int[] s2 = new int[] {4,4,4,4,4};
        //st.solution(4,s2);
        int[] s3 = new int[] {2,1,2,4,2,4,3,3};
        st.solution(5,s3);
    }
}
