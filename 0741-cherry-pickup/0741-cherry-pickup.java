class Solution {
    
  public int cherryPickup(int[][] grid) {
        int[][][] dp = new int[grid.length][grid.length][grid.length];

        return Math.max(0, helper(grid, dp, 0, 0, 0));  // return 0 if there is no path from 0,0 to n-1,n-1
    }

    private int helper(int[][] grid, int[][][] dp, int r1, int c1, int  c2) {

        // we can deduce r2 because r1 + c1 == r2 + c2, since with each move either r or c of a person gets incremented by exactly one (Manhattan distance to origin stays equal)
        // this way we reduce the 4D dp problem to a 3D one (we save space by reducing the number of things we store in a state)
        int r2 = r1 + c1 - c2;

        // check if current state is out of bounds or on thorns
        if (r1 >= grid.length || c1 >= grid.length || r2 >= grid.length || c2 >= grid.length || grid[r1][c1] == -1 || grid[r2][c2] == -1) {
            return Integer.MIN_VALUE;   // current state should not be included in the solution
        }

        // check if we have already computed a solution for this state
        if (dp[r1][c1][c2] != 0) return dp[r1][c1][c2];

        // check if we reached the end state (note that if r1,c1 reached the end, this implies that r2,c2 also reached the end)
        if (r1 == grid.length - 1 && c1 == grid.length - 1) {
            return grid[r1][c1];
        }

        // compute and return answer for current state
        int result = grid[r1][c1];

        // in case the second person is on the same position, don't pick up the same cherry twice. Note that r1 == r2 <--> c1 == c2 (eg. they can't be on the same row without also being on the same column) 
        if (r1 != r2) {
            result += grid[r2][c2];
        }

        // pick best possible next state
        int bestNextState = Math.max(helper(grid, dp, r1 + 1, c1, c2),  // down, down 
                                    helper(grid, dp, r1, c1 + 1, c2 + 1));  // right, right    
        bestNextState = Math.max(bestNextState, helper(grid, dp, r1 + 1, c1, c2 + 1));   // down, right
        bestNextState = Math.max(bestNextState, helper(grid, dp, r1, c1 + 1, c2));   // right, down

        result += bestNextState;
        dp[r1][c1][c2] = result;    // store current state such that it can be re-used

        return result;
    }
}