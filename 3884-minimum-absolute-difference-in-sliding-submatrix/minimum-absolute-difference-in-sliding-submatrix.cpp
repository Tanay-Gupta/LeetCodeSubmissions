class Solution {
public:
    int minimum(int x, int y, std::vector<std::vector<int>>& grid, int k) {
        std::vector<int> elements;

        // Scoop values into the basket
        for (int i = x; i < x + k; ++i) {
            for (int j = y; j < y + k; ++j) {
                elements.push_back(grid[i][j]);
            }
        }

        // Sort and check for min difference between distinct elements
        std::sort(elements.begin(), elements.end());
        int minDiff = INT_MAX;

        for (int i = 1; i < elements.size(); ++i) {
            if (elements[i] != elements[i - 1]) {
                minDiff = std::min(minDiff, elements[i] - elements[i - 1]);
                if (minDiff == 1) break;
            }
        }

        return (minDiff == INT_MAX) ? 0 : minDiff;
    }

    std::vector<std::vector<int>> minAbsDiff(std::vector<std::vector<int>>& grid, int k) {
        int m = grid.size();
        int n = grid[0].size();
        std::vector<std::vector<int>> result(m - k + 1, std::vector<int>(n - k + 1));

        for (int i = 0; i <= m - k; ++i) {
            for (int j = 0; j <= n - k; ++j) {
                result[i][j] = minimum(i, j, grid, k);
            }
        }

        return result;
    }
};