/*
  날짜 : 2026-08-05
  문제 : 진료 순서 정하
  URL : https://school.programmers.co.kr/learn/courses/30/lessons/120835?language=java

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        
        for(int i = 0; i < emergency.length; i++){
            answer[i] = emergency.length;
        }
        
        
        for(int i = 0; i < emergency.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if (emergency[j] < emergency[i]) {
                    answer[i]--;
                }
            }
        }
        
        
        return answer;
    }
}
