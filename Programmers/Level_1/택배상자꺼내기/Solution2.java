class Solution {
    public int solution(int n, int w, int num) {
        int targetIndex = num - 1;

        int targetRow = targetIndex / w;
        int offset = targetIndex % w;

        int targetCol;
        if (targetRow % 2 == 0) {
            targetCol = offset;
        } else {
            targetCol = w - 1 - offset;
        }

        int totalRows = (n + w - 1) / w;
        int lastRow = totalRows - 1;

        int answer = 1;

        int fullRowsAbove = Math.max(0, lastRow - targetRow - 1);
        answer += fullRowsAbove;

        if (lastRow > targetRow) {
            int lastRowCount = n % w;
            if (lastRowCount == 0) {
                lastRowCount = w;
            }

            boolean hasBoxOnLastRow;

            if (lastRow % 2 == 0) {
                hasBoxOnLastRow = targetCol < lastRowCount;
            } else {
                hasBoxOnLastRow = targetCol >= w - lastRowCount;
            }

            if (hasBoxOnLastRow) {
                answer++;
            }
        }

        return answer;
    }
}
