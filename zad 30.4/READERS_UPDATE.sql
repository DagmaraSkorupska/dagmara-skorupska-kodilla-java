delimiter $$

create trigger READERS_UPDATE after update on READERS
for each row
begin
	insert into readers_aud (event_date, event_type, reader_id, 
							new_firstname, new_lastname, new_peselid,  new_vip_level,
							old_firstname, old_lastname, old_peselid,  old_vip_level)
		values(curtime(), "update", old.reader_id, 
				new.firstname, new.lastname, new.peselid,  new.vip_level,
				old.firstname, old.lastname, old.peselid,  old.vip_level);
end $$

delimiter ;