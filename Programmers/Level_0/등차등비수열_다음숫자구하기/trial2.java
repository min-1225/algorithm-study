class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        
        int c = common[1] / common[0];   /* 공비 */
        
        if (a == b) {
            answer = common[common.length-1] + a;
        }
        else
            answer = common[common.length-1] * c;
        
        return answer;
    }
}

/*
변수 c의 경우 comon[0]이 0일 때 에러 발생
-> 등차수열이 아닐 때에만 계산하는 방식으로 변경
*/
