package intStringAndAlphabet;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * - 제한사항
 * 1 ≤ s의 길이 ≤ 50
 * s가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
 * return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 s로 주어집니다.
 * - 제한시간 안내
 * 정확성 테스트 : 10초
 * 숫자 문자열과 영단어(카카오) - Level1
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 */

public class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sbAnswer = new StringBuilder();
        String[] charArray = s.split("");
        int i = 0;
        ArrayList<String> charList = new ArrayList<>(Arrays.asList(charArray));
        while ( i < charList.size()) {   // 수정 해야함
            //System.out.println("i의 값 : " + i + ", charList.get("+i+") : "+ charList.get(i)+", sbAnswer : " + sbAnswer);
            if (charList.get(i).equals("0") || charList.get(i).equals("z")) {
                sbAnswer.append("0");
                if (charList.get(i).equals("0")) {
                    i += 1;
                }
                else {
                    i += 4;
                }   // zero, length = 4
            }   // 맨 앞자리가 "0"이거나 "z"인 경우
            else if (charList.get(i).equals("1") || charList.get(i).equals("o")) {
                sbAnswer.append("1");
                if (charList.get(i).equals("1")) {
                    i += 1;
                }
                else {
                    i += 3;
                }   // one, length = 3;
            }   // 맨 앞자리가 "1"이거나 "o"인 경우
            else if (charList.get(i).equals("2")) {
                sbAnswer.append("2");
                i += 1;
            }   // 맨 앞자리가 "2"인 경우
            else if (charList.get(i).equals("3")) {
                sbAnswer.append("3");
                i += 1;
            }   // 맨 앞자리가 "3"인 경우
            else if (charList.get(i).equals("t")) {
                if (charList.get(i+1).equals("w")) {
                    sbAnswer.append("2");
                    i += 3;
                }   // t"w"o인 경우, length = 3
                else {
                    sbAnswer.append("3");
                    i += 5;
                }   // t"h"ree인 경우, length = 5
            }   // 맨 앞자리가 "t"인 경우
            else if (charList.get(i).equals("4")) {
                sbAnswer.append("4");
                i += 1;
            }   // 맨 앞자리가 "4"인 경우
            else if (charList.get(i).equals("5")) {
                sbAnswer.append("5");
                i += 1;
            }   // 맨 앞자리가 "5"인 경우
            else if (charList.get(i).equals("f")) {
                if (charList.get(i+1).equals("o")) {
                    sbAnswer.append("4");
                }   // f"o"ur인 경우, length = 4
                else {
                    sbAnswer.append("5");
                }   // f"i"ve인 경우, length = 4
                i += 4;
            }   // 맨 앞자리가 "f"인 경우
            else if (charList.get(i).equals("6")) {
                sbAnswer.append("6");
                i += 1;
            }   // 맨 앞자리가 "6"인 경우
            else if (charList.get(i).equals("7")) {
                sbAnswer.append("7");
                i += 1;
            }   // 맨 앞자리가 "7"인 경우
            else if (charList.get(i).equals("s")) {
                if (charList.get(i+1).equals("i")) {
                    sbAnswer.append("6");
                    i += 3;
                }   // s"i"x인 경우, length = 3
                else {
                    sbAnswer.append("7");
                    i += 5;
                }   // s"e"ven인 경우, length = 5
            }   // 맨 앞자리가 "s"인 경우
            else if (charList.get(i).equals("8") || charList.get(i).equals("e")) {
                sbAnswer.append("8");
                if (charList.get(i).equals("8")) {
                    i += 1;
                }
                else {
                    i += 5;
                }   // eight, length = 5;
            }   // 맨 앞자리가 "8"이거나 "e"인 경우
            else if (charList.get(i).equals("9") || charList.get(i).equals("n")) {
                sbAnswer.append("9");
                if (charList.get(i).equals("9")) {
                    i += 1;
                }
                else {
                    i += 4;
                }   // nine, length = 4;
            }   // 맨 앞자리가 "9"이거나 "n"인 경우
        }
        //System.out.println("i의 값 : " + i + ", sbAnswer : " + sbAnswer);
        String strAnswer = sbAnswer.toString(); // StringBuilder 에서 String 으로 형변환
        answer = Integer.parseInt(strAnswer);   // String 에서 int 로 형변환
        return answer;
    }

    public static void main(String[] args){
        Solution st = new Solution();
        String s1 = "one4seveneight"; // 0(1) > 3(4) > 4(7) > 9(8) > 14(end)
        //st.solution(s1);    //  1478
        String s2 = "2three45sixseven"; // 0(2) > 1(3) > 6(4) > 7(5) > 8(6) > 11(7) > 16(end)
        st.solution(s2);    //  234567
    }
}

/*
문자열 첫째자리 비교후 숫자면 answer 에 포함
아니면 아래와 같이 비교후 answer 에 포함
만약 동일한게 있으면 그 뒷자리까지 비교
0 > z
1 > o

2 > t w
3 > t h

4 > f o
5 > f i

6 > s i
7 > s e

8 > e
9 > n
 */

