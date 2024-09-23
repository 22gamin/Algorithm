class Solution {
    public int solution(int[][] dots) {
        
        if ( gradient(dots[0],dots[1]) == gradient(dots[2],dots[3]) ||
           gradient(dots[2],dots[3]) == gradient(dots[0],dots[1]) ||
           gradient(dots[0],dots[3]) == gradient(dots[1],dots[2])){
            return 1;
        }
        else return 0;
    }
    
    public double gradient(int[] x, int[] y){
        return (y[1]-x[1])* 1.0 / (y[0]-x[0]); 
    }
}