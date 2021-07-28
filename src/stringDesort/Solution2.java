package stringDesort;

import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return answer = String.join("",arr);
    }
    public static void main(String[] args) {
        Solution2 st = new Solution2();
        st.solution("Zbcdefg");
    }
}
