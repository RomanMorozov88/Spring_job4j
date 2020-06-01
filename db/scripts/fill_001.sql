create table if not exists accidents (
   accident_id SERIAL PRIMARY KEY,
   accident_name CHARACTER VARYING(100),
   accident_text CHARACTER VARYING(500),
   accident_address CHARACTER VARYING(100)
);

insert into accidents
values (1, 'test_name_01', 'test_text_01', 'test_address_01')
on conflict do nothing;