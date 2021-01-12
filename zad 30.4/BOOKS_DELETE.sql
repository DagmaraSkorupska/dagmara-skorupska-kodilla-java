delimiter $$

create trigger BOOKS_DELETE after delete on BOOKS
for each row
begin
	insert into books_aud (event_date, event_type, book_id )
		values(curtime(), "delete", old.book_id );
end $$

delimiter ;