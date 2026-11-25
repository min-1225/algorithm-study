/*
  날짜 : 2026-11-25
  문제 : 2720번 세탁소 사장 동혁
  url : https://acmicpc.net/problem/2720
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();

            int quarter = num / 25;
            num %= 25;

            int dime = num / 10;
            num %= 10;

            int nickel = num / 5;
            num %= 5;

            int penny = num;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}
