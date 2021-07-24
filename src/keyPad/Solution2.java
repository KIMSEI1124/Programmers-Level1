package keyPad;

import java.util.ArrayList;

public class Solution2 {
    public StringBuilder solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        ArrayList<ArrayList<String>> myHand = new ArrayList<ArrayList<String>>();

        ArrayList<String> line1 = new ArrayList<>();    // 1 2 3
        ArrayList<String> line2 = new ArrayList<>();    // 4 5 6
        ArrayList<String> line3 = new ArrayList<>();    // 7 8 9
        ArrayList<String> line4 = new ArrayList<>();    // * 0 #
        for (int i = 3; i > line1.size(); ) {
            line1.add(null);    // null, null, null
            line2.add(null);    // null, null, null
            line3.add(null);    // null, null, null
        }
        line4.add("LEFT");
        line4.add(null);
        line4.add("RIGHT"); // LEFT, null, RIGHT
        myHand.add(line1);  // 1 2 3
        myHand.add(line2);  // 4 5 6
        myHand.add(line3);  // 7 8 9
        myHand.add(line4);  // * 0 #
        return answer;
    }

    public void rightTouch(StringBuilder answer, int[] numbers, ArrayList<ArrayList<String>> myHand){
        answer.append("R");

    }

    public void leftTouch(){
        /*
        if ( numbers[i] == 3) {
            for ( int j = 0; myHand.size() > j; j++){
                if(myHand.get(j).contains("RIGHT")) {
                    myHand.get(j).set(myHand.get(j).indexOf("RIGHT"),null);
                }
            }
            myHand.get(0).set(2,"RIGHT");    // line1의 2번째   null, null, RIGHT
        }   // 키패드 3을 눌렀을 경우
        */
    }
}
