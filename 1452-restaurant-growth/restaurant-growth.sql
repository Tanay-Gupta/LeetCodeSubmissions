WITH DailyAmount(visited_on, tot_amount) AS (
    SELECT 
        visited_on,
        SUM(amount)
    FROM Customer
    GROUP BY visited_on
),
SlidingWindow(visited_on, window_sum) AS (
    SELECT
        visited_on,
        SUM(tot_amount) OVER (ORDER BY visited_on ASC ROWS BETWEEN 6 PRECEDING AND CURRENT ROW)
    FROM DailyAmount
)
SELECT 
    SlidingWindow.visited_on AS visited_on,
    SlidingWindow.window_sum AS amount,
    ROUND( SlidingWindow.window_sum/7 , 2 ) AS average_amount 
FROM SlidingWindow
WHERE
    SlidingWindow.visited_on >= (
        SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
        FROM Customer
    )
ORDER BY SlidingWindow.visited_on ASC