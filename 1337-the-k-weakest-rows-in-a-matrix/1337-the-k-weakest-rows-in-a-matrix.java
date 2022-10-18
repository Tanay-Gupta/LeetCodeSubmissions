class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] strength = new int[mat.length][2];
for (int i = 0; i < mat.length; i++) {
    int lvlSum = 0;
    for (int j = 0; j < mat[i].length; j++) {
        lvlSum += mat[i][j];
    }
    strength[i] = new int[]{i, lvlSum};
}

for (int i = 0; i < strength.length; i++) {
    for (int j = i + 1; j < strength.length; j++) {
        if (strength[i][1] > strength[j][1] ||
                (strength[i][1] == strength[j][1]
                        && strength[i][0] > strength[j][0])) {
            int[] temp = strength[j];
            strength[j] = strength[i];
            strength[i] = temp;
        }
    }
}

int[] res = new int[k];
for (int i = 0; i < k; i++) {
    res[i] = strength[i][0];
}

return res;
    }
}