package createStrangeStr;

public class Solution {
    /**
     * 제한 사항
     * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
     * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
     * 이상한 문자 만들기 - Level 1
     * https://programmers.co.kr/learn/courses/30/lessons/12930
     */
    /**
     * 문자열을 대문자,소문자 번갈아 나오게 출력
     * @param s 문자열
     * @return 짝수는 - 대문자, 홀수는 소문자인 문자열
     */
    public String solution(String s) {
        String answer = "";
        char[] cArr = s.toCharArray();
        int zeroCount = 0;
        for ( int i = 0; cArr.length > i; i++) {
            char c = cArr[i];
            if ( c != ' ') {    // 공백이 아닐때
                if (zeroCount % 2 == 0) {  // 짝수일 경우
                    if (!Character.isUpperCase(c)) cArr[i] = Character.toUpperCase(c);
                } else {  // 홀수일 경우
                    if (!Character.isLowerCase(c)) cArr[i] = Character.toLowerCase(c);
                }
                zeroCount++;
            }
            else zeroCount = 0; // 공백이면 0으로 만든다.
            answer += cArr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("try hello world");
    }
}
