
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        HashMap<Integer, Integer> rowMin = new HashMap<>();
        HashMap<Integer, Integer> colMax = new HashMap<>();

        // Store minimum of each row
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }

            rowMin.put(i, min);
        }

        // Store maximum of each column
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }

            colMax.put(j, max);
        }

        List<Integer> ans = new ArrayList<>();

        // Find common values
        for (int i = 0; i < m; i++) {
            int rowMinVal = rowMin.get(i);

            for (int j = 0; j < n; j++) {
                if (rowMinVal == colMax.get(j)) {
                    ans.add(rowMinVal);
                }
            }
        }

        return ans;
    }
}