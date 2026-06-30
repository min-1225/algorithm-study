class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a = common[1] - common[0];
        int b = common[2] - common[1];
        
        int c = common[1] / common[0];   /* 공비 */
        
        while(common[2] != common[0]) {
            if (a == b) {
                answer = common[common.length-1] + a;
            }
            else
                answer = common[common.length-1] * c;
        }
        
        return answer;
    }
}

/*
여기서는 while이 불필요
오히려 무한루프만 만들게 됨
  */
