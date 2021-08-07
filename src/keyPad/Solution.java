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
    static int[][] keyPad = new int[][]
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 0, 11}};   // * = 10, # = 11

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand = 10;
        int rightHand = 11;

        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) { // 1, 4, 7을 눌렀을 경우
                leftHand = num;
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {   // 3, 6, 9를 눌렀을 경우
                rightHand = num;
                answer += "R";
            } else {  // 2, 5, 8, 0을 눌렀을 경우
                if (getLeftLength(num, leftHand)
                        < getRightLength(num, rightHand)) { // 왼손이 더 가까울 경우
                    leftHand = num;
                    answer += "L";
                } else if (getLeftLength(num, leftHand)
                        > getRightLength(num, rightHand)) {   // 오른손이 더 가까울 경우
                    rightHand = num;
                    answer += "R";
                } else {    // 거리가 동일한 경우
                    if ( hand.equals("left")) { // 왼손잡이인 경우
                        leftHand = num;
                        answer += "L";
                    } else {    // 오른손잡이인 경우
                        rightHand = num;
                        answer += "R";
                    }
                }
            }
        }
        return answer;
    }

    public int getLeftLength(int num, int leftHand) {
        int xPadPoint = -1;
        int yPadPoint = -1;
        int xHandPoint = -1;
        int yHandPoint = -1;
        for (int y = 0; keyPad.length > y; y++) {
            for (int x = 0; keyPad[y].length > x; x++) {
                if (num == keyPad[y][x]) {
                    xHandPoint = x;
                    yHandPoint = y;
                }
                if (leftHand == keyPad[y][x]) {
                    xPadPoint = x;
                    yPadPoint = y;
                }
                if (xHandPoint != -1 && xPadPoint != -1) {
                    break;
                }
            }
        }
        int leftLength = Math.abs(xPadPoint - xHandPoint) + Math.abs(yPadPoint - yHandPoint);
        return leftLength;
    }

    public int getRightLength(int num, int rigthHand) {
        int xPadPoint = -1;
        int yPadPoint = -1;
        int xHandPoint = -1;
        int yHandPoint = -1;
        for (int y = 0; keyPad.length > y; y++) {
            for (int x = 0; keyPad[y].length > x; x++) {
                if (num == keyPad[y][x]) {
                    xHandPoint = x;
                    yHandPoint = y;
                }
                if (rigthHand == keyPad[y][x]) {
                    xPadPoint = x;
                    yPadPoint = y;
                }
                if (xHandPoint != -1 && xPadPoint != -1) {
                    break;
                }
            }
        }
        int rightLength = Math.abs(xPadPoint - xHandPoint) + Math.abs(yPadPoint - yHandPoint);
        return rightLength;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        int[] nums1 = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String rightHand = "right";
        String leftHand = "left";
        System.out.println(st.solution(nums1, leftHand));
    }
}