package GymClothes;

import java.util.HashMap;
import java.util.Map;

/**
 * 제한사항
 * 전체 학생의 수는 2명 이상 30명 이하입니다.
 * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
 * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
 * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
 * 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
 * 체육복 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/42862
 */

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; // 수업에 참여 가능한 학생수
        Map<Integer,Integer> student = new HashMap<>(); // 학생 번호, 총 체육복의 개수
        Map<Integer,Integer> reserveClothes = new HashMap<>();  // 학생 번호, 여분의 체육복 개수
        Map<Integer,Integer> missClothes = new HashMap<>();  // 학생 번호, 잃어버린 체육복 개수
        for ( int i = 1; n >= i; i++){  // 여분의 체육복을 가져온 학생 검사
            student.put(i,1);
            for ( int j = 0; reserve.length > j; j++){  //
                if ( i==reserve[j]){    // i를 학생의 번호라고 생각하고 학생의 번호와 여분의 체육복을 가져온 학생의 번호가 같으면 Key>학생의 번호,Value>1을 넣는다..
                    reserveClothes.put(i,1);
                } else if(j == reserve.length-1 && reserveClothes.size() != i){   // 만약 없을경우 학생의 번호칸에 0을 저장함
                    reserveClothes.put(i,0);
                }
            }
            for ( int j = 0; lost.length > j; j++){  //
                if ( i==lost[j]){    // i를 학생의 번호라고 생각하고 학생의 번호와 도난당한 학생의 번호가 같으면 Key>학생의 번호,Value>-1을 넣는다..
                    missClothes.put(i,-1);
                } else if(j == lost.length-1 && missClothes.size() != i){   // 만약 없을경우 학생의 번호칸에 0을 저장함
                    missClothes.put(i,0);
                }
            }
            if ( i == n) {  // 아래 진행할때 조건을 맞추기 위해서 넣었다.
                student.put(0,0);
                student.put(n+1,0);
            }
        }
        for (int i = 1; n >= i;i++) {   // 학생들의 총 체육복 개수 파악
            student.put(i, student.get(i)+reserveClothes.get(i)+missClothes.get(i));
        }
        for (int i = 1; n >= i;i++) {
            if(student.get(i) == 0 && student.get(i+1) == 2) {  // 자신이 0이고 오른쪽번호가 체육복을 2개가지고 있을 경우
                student.put(i,1);
                student.put(i+1,student.get(i+1)-1);
            } else if ( student.get(i) == 0 && student.get(i-1) == 2) { // 자신이 0이고 왼쪽번호가 체육복을 2개 가지고 있을 경우
                student.put(i,1);
                student.put(i-1,student.get(i-1)-1);
            }
            if ( student.get(i) != 0) {
                answer += 1;
            }
        }
        System.out.println(student);
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        Solution st = new Solution();

        int n1 = 5; // 사람수
        int[] lost1 = new int[] {2,4};   // 도난 당한 학생 번호
        int[] reserve1 = new int[] {1,3,5}; // 여분의 체육복을 가져온 학생 번호
        //st.solution(n1,lost1,reserve1);

        int n2 = 5; // 사람수
        int[] lost2 = new int[] {2,4};   // 도난 당한 학생 번호
        int[] reserve2 = new int[] {4}; // 여분의 체육복을 가져온 학생 번호
        //st.solution(n2,lost2,reserve2);

        int n3 = 3; // 사람수
        int[] lost3 = new int[] {3};   // 도난 당한 학생 번호
        int[] reserve3 = new int[] {1}; // 여분의 체육복을 가져온 학생 번호
        st.solution(n3,lost3,reserve3);
    }
}
