class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] pos ={a,b,c};
        Arrays.sort(pos);
        int x = pos[0];
        int y=pos[1];
        int z=pos[2];
        if(z-x==2){
            return new int[]{0,0};
        }
        int minMoves = (y-x<=2)||(z-y<=2)?1:2;
        int maxMoves = (y-x-1)+(z-y-1);
        return new int[]{minMoves,maxMoves};
    }
   
}  