delimiter $$

create trigger BOOKS_UPDATE after update on BOOKS
for each row
begin
	insert into books_aud (event_date, event_type, book_id, 
							new_title, new_pubyear, new_bestseller,
                            old_title, old_pubyear, old_bestseller)
		values(curtime(), "update", old.book_id,
				   new.title, new.pubyear, new.bestseller,
				   old.title, old.pubyear, old.bestseller);
end $$

delimiter ;