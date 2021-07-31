package collatzGuess;

/**
 * 제한 사항
 * 입력된 수, num은 1 이상 8000000 미만인 정수입니다.
 * 콜라츠 추측 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12943
 */
public class Solution {
    public int solution(int num) {
        int answer = 0;
        long longNum = num;
        for ( int i = 0; 500 >= i; i++) {
            if ( longNum == 1) break;
            answer += 1;
            longNum = ( (longNum % 2) == 0) ? longNum /= 2 :  ((longNum*3)+1);
        }
        return answer = ( answer > 500) ? -1 : answer;
    }

    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution(626331);
    }
}
