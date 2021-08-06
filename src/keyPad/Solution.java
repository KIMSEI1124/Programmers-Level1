package keyPad;

/**
 * [제한사항]
 * numbers 배열의 크기는 1 이상 1,000 이하입니다.
 * numbers 배열 원소의 값은 0 이상 9 이하인 정수입니다.
 * hand는 "left" 또는 "right" 입니다.
 * "left"는 왼손잡이, "right"는 오른손잡이를 의미합니다.
 * 왼손 엄지손가락을 사용한 경우는 L, 오른손 엄지손가락을 사용한 경우는 R을 순서대로 이어붙여 문자열 형태로 return 해주세요.
 * 키패드 누르기 - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/67256
 */

public class Solution {
    static String[][] keyPad = new String[][]
            {{"1", "2", "3"},
             {"4", "5", "6"},
             {"7", "8", "9"},
             {"L", "0", "R"}};
    static String answer = "";
    static int count = 0;

    public String solution(int[] numbers, String hand) {

        return answer;
    }

    // 아래 두 메서드로 왼손 오른손, 2차원 배열에 L,R값을 추가 삭제 가능
    public void findLeftHand(int[] numbers) {
        for ( int i = 0; numbers.length > i; i++) {
            if ( keyPad[(int) (numbers[i]/3.3)][((numbers[i]-1)%3)] == "L") {
                keyPad[(int) (numbers[count]/3.3)][((numbers[count]-1)%3)].replaceAll("L","");
            }
        }
    }

    public void answerLeftAdd(int[] numbers) {
        answer += "L";  // 추가하고
        // TODO 1차원 배열[count]값을 가지고 2차원 배열에서 그 값을 찾아서 그 자리에 "L"로 추가한다. ex) 1L
        findLeftHand(numbers);
        keyPad[(int) (numbers[count]/3.3)][((numbers[count]-1)%3)] += "L";
        count++;
    }

    public static void main(String[] args){
        Solution st = new Solution();
        int[] nums1 = new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String rightHand = "right";
        String leftHand = "left";
        st.solution(nums1,rightHand);
        char a = 'a';
        String str = String.valueOf(a);
    }
}