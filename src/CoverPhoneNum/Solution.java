package CoverPhoneNum;

/**
 * 제한 조건
 * s는 길이 4 이상, 20이하인 문자열입니다.
 * 핸드폰 번호 가리기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12948
 */

public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String last_phone_number = phone_number.substring(phone_number.length()-4);
        //System.out.println(last_phone_number);
        for ( int i = 0; (phone_number.length() -4) > i; i++){
            answer += "*";
        }
        return answer += last_phone_number;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("1243567890");
    }
}
