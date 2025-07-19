with cte0 as (
    select player_id as p_id,min(event_date) as first_login
    from Activity group by player_id
),
cte1 as ( 
    select a.player_id as player_id
    from Activity a join cte0 as c
    on a.player_id = c.p_id
    and datediff(a.event_date,c.first_login) = 1
)
select 
    round(count(player_id)/(select count(distinct player_id) from Activity),2) as fraction
    from cte1;