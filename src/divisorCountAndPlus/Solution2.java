package divisorCountAndPlus;

public class Solution2 {
    public int solution(int left, int right) {
        int answer = 0;
        for ( int i = left; right >= i; i++) {
            int count = 0;
            for ( int j = 1; i >= j; j++) {
                if ( i % j == 0) {
                    count += 1;
                }
            }
            if ( count % 2 == 0) {
                answer += i;
            }   // 나머지가 0이면 짝수
            else {
                answer -= i;
            }   // 나머지가 0이면 아니면 홀수
        }
        return answer;
    }   // HashSet을 사용하지 않고 해봤다.

    public static void main(String[] args) {
        Solution st = new Solution();
        int l1 = 13;
        int r1 = 17;
        st.solution(l1,r1);
        int l2 = 24;
        int r2 = 27;
        st.solution(l2,r2);
    }
}
