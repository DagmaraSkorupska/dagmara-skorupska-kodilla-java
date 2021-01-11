delimiter $$

create trigger READERS_DELETE after delete on READERS
for each row
begin
	insert into readers_aud (event_date, event_type, reader_id)
		values(curtime(), "delete", old.reader_id);
end $$

delimiter ;