package primeNumFinder;

public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int sqrtInt = (int) Math.sqrt(n);   // 시간 단축을 위해서
        int[] arr = new int[n + 1];   // array 는 0부터 시작

        for (int i = 0; i <= n; i++) arr[i] = i; // arr 에 숫자를 집어넣는다.
        arr[1] = 0;   // arr 1은 0으로 취급

        for (int i = 2; i <= sqrtInt; i++) {
            if (arr[i] == 0) continue;
            for (int j = i + i; j <= n; j += i) arr[j] = 0;
        }
        for (int i = 0; i < arr.length; i++) if (arr[i] != 0) answer++;
        return answer;
    }

    public static void main(String[] args) {
        Solution2 st = new Solution2();
        long start = System.currentTimeMillis();
        st.solution(1000000);
        long end = System.currentTimeMillis();
        System.out.println("수행시간 : " + (end - start) + "ms");
    }
}
