package secretMap;

/**
 * 비밀 지도 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/17681
 */
public class Solution {
    /**
     *
     * @param n 지도의 크키 n * n
     * @param arr1 지도 1의 10진 정수형 배열
     * @param arr2 지도 2의 10진 정수형 배열
     * @return #과 공백으로 이루어진 문자열 배열
     */
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] binaryMap1 = new int[n][n];
        int[][] binaryMap2 = new int[n][n];
        String[][] secretMap = new String[n][n];

        for ( int i = 0; arr1.length > i; i++) {
            int quotient1 = arr1[i];
            int quotient2 = arr2[i];
            for ( int j = n-1; j >= 0; j--) {
                binaryMap1[i][j] = quotient1%2;
                binaryMap2[i][j] = quotient2%2;
                quotient1 /= 2;
                quotient2 /= 2;
            }
        }   // 이진 배열 생성

        for ( int i = 0; n > i; i++) {
            for ( int j = 0; n > j; j++) {
                if ( binaryMap1[i][j] == 1 || binaryMap2[i][j] == 1) secretMap[i][j] = "#";
                else secretMap[i][j] = " ";
            }
        }   // 비교하여 secretMap 배열 생성
        /*
        for (int i = 0; n > i; i++){
            for ( int j = 0; n > j; j++) {
                System.out.print(binaryMap1[i][j] + " ");
                if ( j == n - 1) {
                    System.out.println("");
                }
            }
        }   // 2차원 배열 확인하는 for 문 - binaryMap1
        System.out.println("==========");
        for (int i = 0; n > i; i++){
            for ( int j = 0; n > j; j++) {
                System.out.print(binaryMap2[i][j] + " ");
                if ( j == n - 1) {
                    System.out.println("");
                }
            }
        }   // 2차원 배열 확인하는 for 문 - binaryMap2
                System.out.println("==========");
        for (int i = 0; n > i; i++){
            for ( int j = 0; n > j; j++) {
                System.out.print(secretMap[i][j] + " ");
                if ( j == n - 1) {
                    System.out.println("");
                }
            }
        }   // 2차원 배열 확인하는 for 문 - SecretMap
        */ // 2차원 배열 확인하는 출력문
        for ( int i = 0; secretMap.length > i; i++) {
            String key = "";
            for ( int j = 0; n > j; j++){
                key += secretMap[i][j];
            }
            answer[i] = key;
        }   // answer 배열에 string 추가
        return answer;
    }

    public static void main(String[] args){
        Solution st = new Solution();
        int[] arr1by1 = new int[] {9, 20, 28, 18, 11};
        int[] arr1by2 = new int[] {30, 1, 21, 17, 28};
        st.solution(5,arr1by1,arr1by2);
    }
}
