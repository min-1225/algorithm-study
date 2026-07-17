/*
  날짜 : 2026-07-17
  문제 : 홀짝 구분하기
  URL : https://school.programmers.co.kr/learn/courses/30/lessons/181944
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        sc.close();
    }
}
