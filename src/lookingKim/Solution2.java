package lookingKim;

public class Solution2 {
    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for ( int i = 0; seoul.length > i; i++ ) {
            if ( seoul[i] == "Kim") index = i;
        }
        return answer = "김서방은 " + index +"에 있다";
    }   // 여기서는 정상적으로 출력된다.

    public static void main(String[] args) {
        Solution2 st = new Solution2();
        String[] arr1 = new String[]{"Jane", "Kim"};
        System.out.println(st.solution(arr1));
    }
}
