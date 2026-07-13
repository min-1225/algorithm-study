class Solution {
    public int solution(int n, int w, int num) {
        int[][] boxes = new int[100][w];

        int number = 1;
        int row = 0;

        while (number <= n) {
            if (row % 2 == 0) {
                for (int col = 0; col < w && number <= n; col++) {
                    boxes[row][col] = number++;
                }
            } else {
                for (int col = w - 1; col >= 0 && number <= n; col--) {
                    boxes[row][col] = number++;
                }
            }
            row++;
        }

        int targetRow = 0;
        int targetCol = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < w; c++) {
                if (boxes[r][c] == num) {
                    targetRow = r;
                    targetCol = c;
                }
            }
        }

        int answer = 0;

        for (int r = targetRow; r < row; r++) {
            if (boxes[r][targetCol] != 0) {
                answer++;
            }
        }

        return answer;
    }
}
