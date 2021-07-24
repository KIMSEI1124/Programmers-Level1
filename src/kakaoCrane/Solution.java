package kakaoCrane;

/**
 * [제한사항]
 * board 배열은 2차원 배열로 크기는 "5 x 5" 이상 "30 x 30" 이하입니다.
 * board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
 *      0은 빈 칸을 나타냅니다.
 *      1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
 * moves 배열의 크기는 1 이상 1,000 이하입니다.
 * moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
 */

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int checkInt; // 제한사항 2번을 위한 int
        int[] resultArray = new int[moves.length+1];
        int moveDoll;
        int k = 0;
        if (board.length >= 5 && board.length <= 30 && moves.length >= 1 && moves.length <= 1000) {    // 제한사항 1,3
            for (int i = 0; board.length > i; i++) {
                if (board[i].length == board.length) {
                    for (int j = 0; board[i].length > j; j++) {
                        checkInt = board[i][j];
                        if (checkInt < 0 && checkInt > 100) {    // 제한사항 2
                            System.out.println("제한사항 2 오류");
                        }
                    }
                } else {
                    if (moves.length >= 1 && moves.length <= 1000) {
                        System.out.println("제한사항 1 오류");
                    } else if (board.length >= 5 && board.length <= 30) {
                        System.out.println("제한사항 3 오류");
                    }
                }
            }
        } else {
            System.out.println("제한사항 1 오류");
        }
        for (int i = 0; moves.length > i; i++) { // moves 배열의 길이만큼 반복
            for(int j = 0;board.length > j ;j++) {
                if ( board[j][moves[i] - 1 ] != 0) {
                    System.out.println("resultArray의 크기 : " + resultArray.length + ", " +
                            "추가할 값 : " + board[j][moves[i] - 1] + ", k : " + k + ", i : " + i + ", j : " + j);
                    resultArray[k] = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    System.out.println("추가 성공 : " + resultArray[i]);
                    k++;
                    if (k >= 2 && resultArray[k - 1] == resultArray[k - 2]) {
                        resultArray[k - 2] = resultArray[k];
                        resultArray[k - 1] = resultArray[k];
                        answer = answer + 2;
                        k = k - 2;
                        System.out.println("삭제 성공, answer의 값 : " + answer);
                    } else if ( k >= 2 && resultArray[k - 1] != resultArray[k - 2]) {
                        System.out.println("삭제 없음");
                    } else if ( k <= 2 ){
                        System.out.println("k가 2보다 작음");
                    } else {
                        System.out.println("작동 오류");
                    }
                    break;
                } 
            }
        }
        System.out.println("실행 완료, answer의 값 : " + answer);
        return answer;
    }

    public static void main(String[] args){
        Solution st = new Solution();
        /*
        int[][] board = new int[][] {{0,0,0,0,0},
                                     {0,0,1,0,3},
                                     {0,2,5,0,1},
                                     {4,2,4,4,2},
                                     {3,5,1,3,1}};
        int[] moves = new int[] {1,5,3,5,1,2,1,4}; // 4 <3 <1 1> 3> 2 0 4
        */
        int[][] board = new int[][] {{0,0,1,0,0},
                {0,0,1,0,0},
                {0,2,1,0,0},
                {0,2,1,0,0},
                {0,2,1,0,0}};
        int[] moves = new int[] {1,2,3,3,2,3,1,4}; // 0 <2 <1 1> 2>
        st.solution(board,moves);
    }
}
