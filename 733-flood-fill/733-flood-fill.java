class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) dfs(image, sr, sc, color, newColor);
        return image;
    }
    
    public int[][] dfs(int[][] image, int i, int j, int color, int newColor) {
        //if (image[i][j] == color) {
            //image[i][j] = newColor;
            //if (i > 0) dfs(image, i-1, j, color, newColor);
           // if (i < image.length-1) dfs(image, i+1, j, color, newColor);
          //  if (j > 0) dfs(image, i, j-1, color, newColor);
          //  if (j < image[0].length-1) dfs(image, i, j+1, color, newColor);
      //  }
        
       if (image[i][j] != color) return image; 
       image[i][j] = newColor;
       if (i > 0) dfs(image, i-1, j, color, newColor);
       if (i < image.length-1) dfs(image, i+1, j, color, newColor);
       if (j > 0) dfs(image, i, j-1, color, newColor);
       if (j < image[0].length-1) dfs(image, i, j+1, color, newColor);
       return image;
    }
}