/*
  날짜 : 2026-07-16
  문제 : 각도기
  URL : https://school.programmers.co.kr/learn/courses/30/lessons/120829
*/

class Solution {
    public int solution(int angle) {
        if (angle < 90) return 1;
        if (angle == 90) return 2;
        if (angle < 180) return 3;
        return 4;
    }
}
