package newIdRecommend;

import java.util.Locale;
import java.util.regex.Pattern;

/**
 * [문제]
 * 신규 유저가 입력한 아이디를 나타내는 new_id가 매개변수로 주어질 때,
 * "네오"가 설계한 7단계의 처리 과정을 거친 후의 추천 아이디를 return 하도록 solution 함수를 완성해 주세요.
 * [제한사항]
 * new_id는 길이 1 이상 1,000 이하인 문자열입니다.
 * new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
 * new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.
 * [아이디 수정 단계]
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 * 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
 * [카카오 아이디의 규칙]
 * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
 * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
 * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
 * 신규 아이디 추천 - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 */

public class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        int dotCount = 0;
        if( !Pattern.matches("^[A-Z]*$",new_id)){  // 대문자 발견시 소문자로 변경 - 1
            new_id = new_id.toLowerCase(Locale.ROOT);
        }
        sb.append(new_id);
        //System.out.println(1 + " " + sb);
        if(!Pattern.matches("^[a-z0-9-_.]*$", sb)){ // 소문자,숫자,빼기,밑줄,점 제외 발견시 삭제 - 2
            for(int i = sb.length(); i > 0;i--){
                if(!Pattern.matches("^[a-z0-9-_.]*$", sb.substring(i - 1, i))) {
                    sb.delete(i-1,i);
                }
            }
        }
        //System.out.println(2 + " " + sb);
        for ( int i = sb.length(); i > 0; i--) {
            if (Pattern.matches("^[.]*$", sb.substring(i-1,i))) { // count해서 count가 2이상일시 하나만 남기고 삭제, 0이나 1이면 진행 - 3
                dotCount += 1;
                if ( dotCount == 2) {
                    sb.delete(i,i+1);
                    dotCount -= 1;
                }
            } else {
                dotCount = 0;
            }
        }
        //System.out.println(3 + " " + sb);
        if  ( sb.length() > 0 && Pattern.matches("^[.]*$",sb.substring(0,1))) {  // 맨 처음이 점이면 삭제 - 4.1
            sb.delete(0,1);
        }
        if ( sb.length() > 0 && Pattern.matches("^[.]*$",sb.substring(sb.length()-1, sb.length()))) { // 맨 마지막이 점이면 삭제 - 4.2
            sb.delete(sb.length()-1, sb.length());
        }
        //System.out.println(4 + " " + sb);
        if ( sb.length() == 0) {    // 문자열이 공백이면 a 추가 - 5
            sb.append("a");
        }
        //System.out.println(5 + " " + sb);
        if ( sb.length() > 15) {    // 문자열의 길이가 15초과일경우 16이상은 삭제 - 6
            sb.delete(15,1000);
            if (Pattern.matches("^[.]*$",sb.substring(sb.length()-1, sb.length()))) { // 삭제하고 난뒤 15번째 자리가 점일경우 삭제
                sb.delete(sb.length()-1, sb.length());
            }
        }
        //System.out.println(6 + " " + sb);
        if (sb.length() < 3) {      // 문자열의 길이가 3미만일 경우 - 7
            for ( int i = sb.length(); 3 > i; i++) {  // 맨 마지막 문자를 복사한다.
                sb.append(sb.substring(sb.length()-1,sb.length()));
            }
        }
        //System.out.println(7 + " " + sb);
        String answer = sb.toString();
        return answer;
    }
    
    public String solution2(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase(Locale.ROOT); // 대문자를 소문자로 변경 - 1
        answer = new_id;
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args){
        Solution st = new Solution();
        String new_id1 = ".aa-.";
        st.solution(new_id1);
    }
}

// 3,4,5,11,15,20,21,22,25 > 3,4,5,11,15