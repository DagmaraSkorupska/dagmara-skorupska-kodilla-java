delimiter $$

create trigger BOOKS_INSERT after insert on BOOKS
for each row
begin
	insert into books_aud (event_date, event_type, book_id, new_title, new_pubyear, new_bestseller )
		values(curtime(), "insert", new.book_id,  new.title, new.pubyear, new.bestseller);
end $$

delimiter ;