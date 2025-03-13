package Graphs;

public class flood_fill {

        public static void dfs(int[][] ans, int[][] image, int unicolor, int color, int row, int col){
            ans[row][col] = color;
            for(int i = -1; i <= 1; i++) {
                for(int j = -1; j <= 1; j++) {
                    int r = row + i;
                    int c = col + j;
                    if ((i == 0 || j == 0) && !(i != 0 && j != 0) && i != j && c >= 0 && c < ans[0].length && r >= 0 && r < ans.length && image[r][c] == unicolor && ans[r][c] != color) {
                        dfs(ans, image, unicolor, color, r, c);
                    }
                }
            }
        }

        public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int[][] ans = image;
            int unicolor = image[sr][sc];
            dfs(ans, image, unicolor, color, sr, sc);
            return ans;
        }

        public static void main(String[] args) {
            int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
            int sr = 1;
            int sc = 1;
            int color = 2;
            int[][] result = floodFill(image, sr, sc, color);

            // Print the result image
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
}
