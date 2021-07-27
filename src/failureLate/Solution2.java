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

public class Solution2 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] failureArray = new double[N][2];
        for( int i = 0; N > i; i++ ) {
            double countPlayer = 0;    // 스테이지에 도전한 플레이어
            double countFailPlayer = 0;   // 스테이지클리어에 실패한 플레이어
            for (int stage : stages) {
                if ((i + 1) == stage) {
                    countFailPlayer += 1;
                }   // 배열의 원소와 동일하면 실패한 플레이어 증가
                if ((i + 1) <= stage) {
                    countPlayer += 1;
                }   // 배열의 원소와 동일하면 플레이한 플레이어 증가
            }
            if ( countPlayer == 0) {
                failureArray[i][0] = -1.0;    // 플레이어가 아무도 도달하지 못했을경우
            }
            else {
                failureArray[i][0] = (countFailPlayer / countPlayer);
            }
            failureArray[i][1] = (i+1);
        }

        // failureArray 정렬
        Arrays.sort(failureArray, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return (int) (o1[0] - o2[0]);
            }
        });
        for ( int i = 0; failureArray.length > i; i++) {
            answer[i] = (int) failureArray[i][1];
        }
        for ( int i = 0; failureArray.length > i; i++ ) {
            for ( int j = 0; 2 > j; j++){
                System.out.print(failureArray[i][j]);
                if ( j == 0 ) {
                    System.out.print( " ");
                } else {
                    System.out.println(" ");
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }   // 3,5,9-13,15-22,24

    public static void main(String[] args) {
        Solution2 st = new Solution2();
        int[] s1 = new int[] {2, 1, 2, 6, 2, 4, 3, 3};
        st.solution(5,s1);  // 3,4,2,1,5
        int[] s2 = new int[] {4,4,4,4,4};
        //st.solution(4,s2);
        int[] s3 = new int[] {2,1,2,4,2,4,3,3};
        //st.solution(5,s3);
    }
}