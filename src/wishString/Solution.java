package wishString;

import java.util.Arrays;

/**
 * 제한 조건
 * strings는 길이 1 이상, 50이하인 배열입니다.
 * strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
 * 모든 strings의 원소의 길이는 n보다 큽니다.
 * 인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
 * 문자열 내 마음대로 정렬하기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12915
 */
public class Solution {
    /**
     * 문자열을 index 위치한 문자를 정렬하여 문자열을 정렬한다.
     * @param strings 문자열
     * @param n index 번호
     * @return 정렬한 문자열
     */
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] arr = new String[strings.length];
        Arrays.sort(strings);
        for ( int i = 0; strings.length > i; i++) {
            arr[i] = strings[i].substring(n) + i;
        }
        Arrays.sort(arr);   // 정렬
        for ( int i = 0; strings.length > i; i++ ) {
            answer[i] = strings[Integer.parseInt(arr[i].substring(arr[i].length()-1))]; // 문자열 뒤에 있는 숫자만 남기고 자른다.
        }   // subString ENG
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static void main(String[] args) {
        Solution st = new Solution();
        String[] arr1 = new String[]{"aaaaaaaaba", "aabaaaaaaaa", "aaabaaaaaa", "aacaaaaaaa"};    // 1,2,4,3 >> 4,2,1,3
        st.solution(arr1,3);
        String[] arr2 = new String[]{"ae", "be", "ce", "ae"};   // 1, 4, 2, 3
        st.solution(arr2,1);
    }
}
