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
여기서는 while이 불필요 --> 의도는 수열이 1 1 1 1 처럼 같은 숫자가 나오는 상황을 제거하려고 했으나 이것마저 등비 혹은 등차수열임
오히려 무한루프만 만들게 됨
  */
