select issues.SUMMARY as task_name, issueslists.NAME as List_task
from issues join issueslists
on issues.ISSUESLIST_ID = issueslists.ID;

select issues.SUMMARY as task_name, users.ID, users.LASTNAME
from issues join users
on issues.USER_ID_ASSIGNEDTO = users.id; 

select users.FIRSTNAME, users.LASTNAME, count(*) as number_of_tasks
from users join issues on issues.USER_ID_ASSIGNEDTO = users.id
group by USER_ID_ASSIGNEDTO;