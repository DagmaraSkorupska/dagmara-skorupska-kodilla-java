create table ISSUESLISTS
(
ID SERIAL primary key,
NAME varchar(100)
);

create table ISSUES
(
ID SERIAL primary key,
ISSUESLIST_ID bigint unsigned not null,
foreign key(ISSUESLIST_ID) references ISSUESLISTS(ID),
SUMMARY varchar(100),
DESCRIPTION varchar(1024),
USER_ID_ASSIGNEDTO bigint unsigned not null,
foreign key(USER_ID_ASSIGNEDTO) references USERS(ID)
);

insert into ISSUESLISTS (NAME) values (‘ToDo’);
insert into ISSUESLISTS (NAME) values (“InProgress”);
insert into ISSUESLISTS (NAME) values (“Done”);

insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) values (1, "lazienka", "sprzatnie wanny", 1);

insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) values (1, "kuchnia", "sprzatnie lodowki", 2);

insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) values (1, "pokoj", "sprzatnie szafek", 3);

insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) values (1, "piwnica", "segregacja sprzetow sportowych", 4);

insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) values (1, "strych", "segregacja ubran letnich", 5);

insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (3, "trening1", "plywanie", 1);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values  (3, "trening2", "bieganie", 2);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (3, "trening3", "plywanie", 4);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (3, "trening4", "rower", 4);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (3, "trening5", "bieganie", 4);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (2, "zakupy", "lidl", 1);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values  (2, "zakupy", "biedronka", 2);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (2, "zakupy", "bartosz", 3);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (2, "zakupy", "lidl", 5);



insert into ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO) 
values (2, "zakupy", "biedronka", 5);

commit;
