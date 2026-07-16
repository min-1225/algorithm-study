/*
  날짜 : 2026-07-16
  문제 : 아이스 아메리카노
  URL : https://school.programmers.co.kr/learn/courses/30/lessons/120819
*/

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int num = money / 5500;
        int change = money % 5500;
        
        answer[0] = num; 
        answer[1] = change;
        
        return answer;
    }
}

====
/*더 쉽게는*/
class Solution {
    public int[] solution(int money) {
        return new int[] { money / 5500, money % 5500 };
    }
}
