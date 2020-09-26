select issues.SUMMARY as Nazwa_zadania, issueslists.NAME as Lista_zadan
from issues join issueslists
on issues.ISSUESLIST_ID = issueslists.ID;

select issues.SUMMARY as Nazwa_zadania, users.ID, users.LASTNAME as Nazwisko
from issues join users
on issues.USER_ID_ASSIGNEDTO = users.id; 

select users.FIRSTNAME as Imie, users.LASTNAME as Nazwisko, count(*) as Ilosc_zadan
from users join issues on issues.USER_ID_ASSIGNEDTO = users.id
group by USER_ID_ASSIGNEDTO;