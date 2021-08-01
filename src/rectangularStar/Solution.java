package rectangularStar;

import java.util.Scanner;

/**
 * 제한 조건
 * n과 m은 각각 1000 이하인 자연수입니다.
 * 직사각형 별찍기 - Level 1
 * https://programmers.co.kr/learn/courses/30/lessons/12969
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(a + b);

        String star = "";
        for ( int i = 0; a > i; i++) {
            star += "*";
        }
        for (int i = 0; b > i; i++) {
            System.out.println(star);
        }
    }
}
