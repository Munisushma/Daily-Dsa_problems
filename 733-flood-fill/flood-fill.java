class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalcolor = image[sr][sc];
        if(originalcolor!=color){
            dfs(image,sr,sc,originalcolor,color);
        }
        return image;
    }

private void dfs(int[][] image,int r ,int c,int originalcolor,int newcolor ){
         if(r<0 || r>=image.length || c<0 || c>=image[0].length || image[r][c]!=originalcolor){
            return;
         }
         image[r][c]=newcolor;
         dfs(image,r+1,c,originalcolor,newcolor);
         dfs(image,r-1,c,originalcolor,newcolor);
         dfs(image,r,c+1,originalcolor,newcolor);
         dfs(image,r,c-1,originalcolor,newcolor);
}
}