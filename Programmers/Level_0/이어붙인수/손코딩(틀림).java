class Solution {
    public int solution(int[] num_list) {
        
        String even = new String;
        String odd = new String;
        
        for (int i = 0; i < num_list[].length - 1; i++) {
            if (num_list[i] % 2 == 0) {
                even.append(num_list[i].toString);
            }
            else
                odd.append(num_list[i].toString);
        }
        
        String answer() {
            System.out.println("홀수만 이어 붙인 수는 " + odd + "이고 짝수만 이어 붙인 수는 " + even + "입니다.")
        }
        
        return answer;
    }
}
