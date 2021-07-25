package mockTest;

import java.util.Arrays;

/**
 * 제한 조건
 * 시험은 최대 10,000 문제로 구성되어있습니다.
 * 문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
 * 가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
 * 모의고사 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */

public class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] person1 = new int[] {1, 2, 3, 4, 5};  // 1번 수포자 : 1, 2, 3, 4, 5 > length = 5
        int[] person2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};  // 2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5 > length = 8
        int[] person3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5  > length = 10
        int person1Count = 0;
        int person2Count = 0;
        int person3Count = 0;
        for ( int i = 0; answers.length > i; i++){
            if ( i > 4 && i % 5 == 0) {
                person1 = Arrays.copyOf(person1,i+5);
                person1[i] = person1[i-5];
            }   else if ( i > 4 ) {
                person1[i] = person1[i-5];
            } // person1 배열 오류를 막기 위해서
            if ( i > 7 && i % 8 == 0) {
                person2 = Arrays.copyOf(person2,i+8);
                person2[i] = person2[i-8];
            }   else if ( i > 7 ) {
                person2[i] = person2[i-8];
            } // person2 배열 오류를 막기 위해서
            if ( i > 9 && i % 10 == 0) {
                person3 = Arrays.copyOf(person3,i+10);
                person3[i] = person3[i-10];
            }   else if ( i > 9 ) {
                person3[i] = person3[i-10];
            } // person3 배열 오류를 막기 위해서
            if ( person1[i] == answers[i]) {
                person1Count += 1;
            }
            if ( person2[i] == answers[i]) {
                person2Count += 1;
            }
            if ( person3[i] == answers[i]) {
                person3Count += 1;
            }
            //System.out.println((i+1)+"번째 문제");
            //System.out.println("person1의 정답수 : " + person1Count + ", person2의 정답수 : " + person2Count + ",person3의 정답수 : " + person3Count);
        }
        if ( person1Count > person2Count && person1Count > person3Count) {
            answer = new int[] {1};
        }
        else if ( person1Count == person2Count && person1Count > person3Count ) {
            answer = new int[] {1,2};
        }
        else if ( person1Count == person3Count && person1Count > person2Count ) {
            answer = new int[] {1,3};
        }
        else if ( person2Count > person1Count && person2Count > person3Count ) {
            answer = new int[] {2};
        }
        else if ( person2Count == person3Count && person2Count > person1Count) {
            answer = new int[] {2,3};
        }
        else if ( person3Count > person1Count && person3Count > person2Count) {
            answer = new int[] {3};
        }
        else {
            answer = new int[] {1,2,3};
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        int[] answers1 = new int[] {1,2,3,4,5};
        //st.solution(answers1);  // [1]
        int[] answers2 = new int[] {1,3,2,4,2};
        //st.solution(answers2);  // [1,2,3]
        int[] answers3 = new int[] {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
        st.solution(answers3);  // [1]
    }
}
