SELECT
  user_id,
  name,
  mail
FROM Users
where BINARY RIGHT(mail, 4) = '.com' AND mail REGEXP '^[a-zA-Z][a-zA-Z-._0-9]*@leetcode[.]com$' 
