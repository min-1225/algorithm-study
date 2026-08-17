/**
  날짜 : 2026-08-17
  문제 : 영어 끝말잇기
  URL : https://school.programmers.co.kr/learn/courses/30/lessons/12981
*/


class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        
        /**
            각 사람에게 부여된 번호와 차례가 온 횟수
        */
        String[][] person = new String[n][];
        
        int[][] answer = new int[n][];
        
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < 100; i++) {
                person[i][j] = words[i][j];
                int len = person[i][j].length; // 단어길이
                while(i < 99 && j <= n-1) {
                    if(person[i][j].charAt(len-1) == person[i+1][j] || person[i][j].charAt(len-1) == person[0][j+1]) {
                    answer.append("["+i+","+j+"]").toString;
                    }
                    else answer.append([0,0]);
                }
                
            }
        }
        
        return answer;
    }
}
