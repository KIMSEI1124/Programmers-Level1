package dartsGame;

/**
 * [1차]다트 게임 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/17682
 */

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String str = "";
        int[] dartResultArray = new int[3]; int index = 0;
        for ( int i = 0; dartResult.length() > i; i++) {
            char c = dartResult.charAt(i);
            if( c >= '0' && c <= '9') str += c; // 숫자일 경우
            else if ( c == 'S' || c == 'D' || c == 'T') {
                int score = Integer.parseInt(str);
                if ( c == 'S') score = (int) Math.pow(score, 1); // 싱글일 경우
                else if ( c == 'D') score = (int) Math.pow(score, 2);   // 더블일 경우
                else score = (int) Math.pow(score, 3);  // 트리플일 경우
                str = "";
                dartResultArray[index++] = score;
            }
            else if ( c == '*' || c == '#') {
                if ( c == '*') {
                    dartResultArray[index-1] = dartResultArray[index-1] * 2;
                    if ( index - 2 >= 0) {
                        dartResultArray[index - 2] = dartResultArray[index - 2] * 2;
                    }   // 배열 오류가 발생하지 않기 위해
                }   // 스타상일 경우 ( 2배 )
                else {
                    dartResultArray[index-1] = dartResultArray[index-1] * (-1);
                }   // 아차상일 경우 ( -2배 )
            }
       }
        for ( int score : dartResultArray ) answer += score;
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("1S2D*3T"); //  1^1 * 2+ 2^2 * 2 + 3^3
    }
}
