package stringPY;

import java.util.Locale;

// StringBuilder 사용 안하고 풀기
public class Solution2 {
    boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        s = s.toLowerCase();
        for ( int i = 0; s.length() > i; i++) {
            if ( s.charAt(i) == 'p') count += 1;
            else if (s.charAt(i) == 'y') count -= 1;
        }
        if ( count%2 == 0) answer = true;
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        st.solution("pPoooyY");
    }
}
