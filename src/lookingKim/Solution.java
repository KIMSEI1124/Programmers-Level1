package lookingKim;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 제한 사항
 * seoul은 길이 1 이상, 1000 이하인 배열입니다.
 * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
 * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
 * 서울에서 김서방 찾기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12919
 */
public class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(seoul));
        int index = arrayList.indexOf("Kim");
        return answer = "김서방은 " + index +"에 있다";
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        String[] arr1 = new String[]{"Jane", "Kim"};
        st.solution(arr1);
    }
}
