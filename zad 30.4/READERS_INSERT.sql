delimiter $$

create trigger READERS_INSERT after insert on READERS
for each row
begin
	insert into readers_aud (event_date, event_type, reader_id, new_firstname, new_lastname, new_peselid,  new_vip_level)
		values(curtime(), "insert", new.reader_id, new.firstname, new.lastname, new.peselid,  new.vip_level);
end $$

delimiter ;