package year2016;

/**
 * 제한 조건
 * 2016년은 윤년입니다.
 * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
 * 2016년 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] months = new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;
        for ( int i = 0; a-1 > i; i++) {
            totalDay += months[i];
        }
        totalDay += b;
        switch (totalDay%7) {
            case 0:
                answer = "THU";
                break;
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            default:
                answer = "WED";
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(5,24);
    }
}
