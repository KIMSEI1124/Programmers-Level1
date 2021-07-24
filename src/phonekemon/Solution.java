package phonekemon;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
 * nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
 * 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
 * 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
 * 50점
 */

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int takeMon;    // 가져갈수 있는 폰켓몬의 수
        //int myMon = 0;      // 가져온 폰켓몬의 수
        ArrayList<Integer> list = new ArrayList<>(); // 폰켓몬의 종류를 담기위한 ArrayList
        int checkMon;   // 제한사항 3번을 확인하기 위한 변수1 - /
        int checkMon2;  // 제한사항 3번을 확인하기 위한 변수1 - %
        if ( nums.length >= 1 && nums.length <= 10000 && nums.length % 2 == 0) {    // 제한사항 2번
            for(int i = 0; nums.length > i; i++){
                checkMon = nums[i]/200001;
                checkMon2 = nums[i]%200001;
                if ( checkMon != 0 || checkMon2 < 1){    // 제한사항 3번 오류일 경우
                    System.out.println(i + " " + checkMon + " " + checkMon2);
                    System.out.println("정상적이지 않은 폰켓몬의 번호입니다.");
                    break;
                }
            }
        } else {
            if ( nums.length >= 1 && nums.length <= 10000 ) {   // 제한사항 2번 오류일 경우 2가지 case존재
                System.out.println("nums배열의 길이가 짝수가 아닙니다.");    // 2-1Case 배열의 길이가 짝수가 아닐경우
            } else {
                System.out.println("nums배열의 길이가 정상적이지 않습니다."); // 2-2Case 배열의 길이가 1이상 10000이하가 아닐경우
            }
        }
        takeMon = nums.length/2;    // 가져갈수 있는 폰켓몬의 수는 nums배열의 절반이다.
        Arrays.sort(nums); // ArrayList로 가져가기전에 정렬
        System.out.println(Arrays.toString(nums));
        for ( int i = 0; nums.length > i; i++){ // Array에서 ArrayList로 변환 - add()사용
            list.add(nums[i]);
            System.out.println(list);
        }
        int myMon = list.size();
        for ( int i = list.size(); i > 1; i--){ // 중복되는 값 제거하기, 뒤에서 앞으로
            System.out.println("takeMon : " + takeMon + ", myMon : " + myMon);
            System.out.println("List의 " + (i-1) + "번째 값 : " + list.get(i-1)+ ", List의 " + (i-2) + "번째 값 : " + list.get(i-2));
            if(list.get(i-1).equals(list.get(i-2))) {
                System.out.println(list.get(i-1) + " 삭제");
                list.remove(i-1);
                myMon--;
                System.out.println(list);
                if ( takeMon == myMon) {    // 최대 가져갈수 있는 만큼 가져가면 중복된 폰켓몬을 제거하고 for문을 종료한다.
                    for ( int j = list.size(); j > 1; j--) {
                        if ( list.get(j-1) == list.get(j-2)){
                            list.remove(j-1);
                            takeMon--;
                            System.out.println(list);
                        }
                    }
                    break;
                }
            }
        }
        if (myMon < takeMon) {
            answer = takeMon;
        } else {
            answer = takeMon;
        }
        System.out.println("최종 : "+list);
        System.out.println(myMon + " " + takeMon);
        System.out.println("가져갈수 있는 종류의 수는 : "+ answer + "\n");
        return answer;
    }
    public static void main(String[] args){
        Solution st = new Solution();
        int[] nums1 = new int[] {1,1,1,100,100,100,300,300};
        int[] nums2 = new int[] {3,3,3,2,2,4};
        int[] nums3 = new int[] {3,3,3,2,2,2};
        int[] nums4 = new int[] {3,1,2,3};
        st.solution(nums3);
    }
}