package keyPad;

import java.util.ArrayList;

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
    public StringBuilder solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        ArrayList<ArrayList<String>> myHand = new ArrayList<ArrayList<String>>();

        ArrayList<String> line1 = new ArrayList<>();    // 1 2 3
        ArrayList<String> line2 = new ArrayList<>();    // 4 5 6
        ArrayList<String> line3 = new ArrayList<>();    // 7 8 9
        ArrayList<String> line4 = new ArrayList<>();    // * 0 #
        for(int i = 3; i > line1.size();) {
            line1.add(null);    // null, null, null
            line2.add(null);    // null, null, null
            line3.add(null);    // null, null, null
        }
        line4.add("LEFT"); line4.add(null); line4.add("RIGHT"); // LEFT, null, RIGHT
        myHand.add(line1);  // 1 2 3
        myHand.add(line2);  // 4 5 6
        myHand.add(line3);  // 7 8 9
        myHand.add(line4);  // * 0 #

        for( int i = 0; numbers.length > i; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) { // 키패드1,4,7을 누를경우
                answer.append("L");
                if ( numbers[i] == 1) {
                    for ( int j = 0; myHand.size() > j; j++){   // LEFT가 어디에 있는지 찾는다.
                        if(myHand.get(j).contains("LEFT")) {    // 찾으면
                            myHand.get(j).set(myHand.get(j).indexOf("LEFT"),null);  //LEFT를 null로 교체한다.
                        }
                    }
                    myHand.get(0).set(0,"LEFT");    // line1의 0번째   LEFT, null, null > 로 수정한다.
                }   // 키패드 1을 눌렀을 경우
                else if ( numbers[i] == 4) {
                    for ( int j = 0; myHand.size() > j; j++){
                        if(myHand.get(j).contains("LEFT")) {
                            myHand.get(j).set(myHand.get(j).indexOf("LEFT"),null);
                        }
                    }
                    myHand.get(1).set(0,"LEFT");    // line2의 0번째 LEFT, null, null
                }   // 키패드 4를 눌렀을 경우
                else if ( numbers[i] == 7) {
                    for ( int j = 0; myHand.size() > j; j++){
                        if(myHand.get(j).contains("LEFT")) {
                            myHand.get(j).set(myHand.get(j).indexOf("LEFT"),null);
                        }
                    }
                    myHand.get(2).set(0,"LEFT");    // line3의 0번째 LEFT, null, null
                }   // 키패드 7을 눌렀을 경우
            }   // 키패드 1, 4, 7을 눌렀을 경우
            else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) { // 키패드3,6,9을 누를경우
                answer.append("R");
                if ( numbers[i] == 3) {
                    for ( int j = 0; myHand.size() > j; j++){
                        if(myHand.get(j).contains("RIGHT")) {
                            myHand.get(j).set(myHand.get(j).indexOf("RIGHT"),null);
                        }
                    }
                    myHand.get(0).set(2,"RIGHT");    // line1의 2번째   null, null, RIGHT
                }   // 키패드 3을 눌렀을 경우
                else if ( numbers[i] == 6) {
                    for ( int j = 0; myHand.size() > j; j++){
                        if(myHand.get(j).contains("RIGHT")) {
                            myHand.get(j).set(myHand.get(j).indexOf("RIGHT"),null);
                        }
                    }
                    myHand.get(1).set(2,"RIGHT");    // line2의 2번째   null, null, RIGHT
                }   // 키패드 6을 눌렀을 경우
                else if ( numbers[i] == 9) {
                    for ( int j = 0; myHand.size() > j; j++){
                        if(myHand.get(j).contains("RIGHT")) {
                            myHand.get(j).set(myHand.get(j).indexOf("RIGHT"),null);
                        }
                    }
                    myHand.get(1).set(2,"RIGHT");    // line3의 2번째   null, null, RIGHT
                }   // 키패드 9를 눌렀을 경우
            }   // 키패드 3, 6, 9를 눌렀을 경우
            else if (numbers[i] == 2) { // 키패드 2를 눌렀을 경우
                if (myHand.get(0).get(0).equals("RIGHT") || myHand.get(0).get(2).equals("RIGHT") || myHand.get(1).get(1).equals("RIGHT")) {
                    // 1, 3, 5에 오른손이 있을 경우
                        for ( int j = 0; myHand.size() > j; j++){
                            if(myHand.get(j).contains("RIGHT")) {
                                myHand.get(j).set(myHand.get(j).indexOf("RIGHT"),null);
                            }
                        }
                        myHand.get(0).set(1,"RIGHT");    // line1의 1번째   null, RIGHT, null
                        answer.append("R");
                }
                else if (myHand.get(0).get(0).equals("LEFT") || myHand.get(0).get(2).equals("LEFT") || myHand.get(1).get(1).equals("LEFT")) {
                    // 1, 3, 5에 왼손이 있을 경우
                    for ( int j = 0; myHand.size() > j; j++){
                        if(myHand.get(j).contains("LEFT")) {
                            myHand.get(j).set(myHand.get(j).indexOf("LEFT"),null);
                        }
                    }
                    myHand.get(0).set(1,"LEFT");    // line1의 1번째   null, LEFT, null
                    answer.append("L");
                }
                else {
                    if ( hand == "right") {
                        for ( int j = 0; myHand.size() > j; j++){
                            if(myHand.get(j).contains("RIGHT")) {
                                myHand.get(j).set(myHand.get(j).indexOf("RIGHT"),null);
                            }
                        }
                        myHand.get(0).set(1,"RIGHT");    // line1의 1번째   null, RIGHT, null
                        answer.append("R");
                    } // 오른손잡이 일 경우
                    else {
                        for ( int j = 0; myHand.size() > j; j++){
                            if(myHand.get(j).contains("LEFT")) {
                                myHand.get(j).set(myHand.get(j).indexOf("LEFT"),null);
                            }
                        }
                        myHand.get(0).set(1,"LEFT");    // line1의 1번째   null, LEFT, null
                        answer.append("L");
                    }   // 왼손잡이 일 경우
                } // 1, 3, 5에 양손이 존재하지 않거나 동시에 존재할때
            }
            else if (numbers[i] == 5 || numbers[i] == 8) {

            }
            else if (numbers[i] == 0) {

            }
            else {
                System.out.println("정상적이지 않은 키패드");
            }   // 잘못된 키패드를 눌렀을 경우
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.println(line4);
            System.out.println("====================");
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args){
        Solution st = new Solution();
        int[] nums1 = new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String rightHand = "right";
        String leftHand = "left";
        st.solution(nums1,rightHand);
    }
}

/*
    1   2   3   // 2는 1,3,5 확인
    4   5   6   // 5는 2,4,6,8 확인
    7   8   9   // 8는 5,7,9,0 확인
    *   0   #   // 0는 8만 확인
    [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"
>>  [L, R, L, L, L, R, L, L, R, R, L]
 */