package knum;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] checkCommandsArray;
        int cheekInt;
        int a; // a번째 부터
        int b; // b까지 자르고
        int c; // c번째 숫자 고르기
        if(array.length >= 1 && array.length <= 100 && commands.length >= 1 && commands.length <= 50){ // 제한사항 1,3번
            for(int i = 0; array.length > i; i++) {
                cheekInt = array[i];
                if( cheekInt < 1 && cheekInt > 100) { // 제한사항 2번
                    System.out.println("Int - Error"); // 제한사항 2번 오류메세지
                    break;
                }
            }
        } else {
            if ( array.length >= 1 && array.length <= 100 ) {
                System.out.println("commands Length Error"); // 제한사항 3번 오류메세지
            } else if (commands.length >= 1 && commands.length <= 50 ){
                System.out.println("Array Length Error"); // 제한사항 1번 오류메세지
            } else {
                System.out.println("Array Length And commands Length Error"); // 제한사항 1,3번 오류메세지
            }
        }
        for ( int i = 0; commands.length > i; i++){
            checkCommandsArray = commands[i];
            if ( checkCommandsArray.length == 3){ // 제한사항 4번
                a = checkCommandsArray[0];
                b = checkCommandsArray[1];
                c = checkCommandsArray[2];
                System.out.println(a + " " + b + " " + c);
                int[] sortArray = Arrays.copyOfRange(array,a-1,b);
                Arrays.sort(sortArray);
                //answer[i] = sortArray[c-1]; ??.. 프로그래머스는 통과함.
            } else {
                System.out.println("Commends Length Error");    //제한사항 4번 오류메세지
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] intArray = new int[] {1,5,2,6,3,7,4};
        int[][] int2Array = new int[][] {{2,5,3},{4,4,1},{1,7,9}};
        Solution st = new Solution();
        st.solution(intArray,int2Array);
    }
}
