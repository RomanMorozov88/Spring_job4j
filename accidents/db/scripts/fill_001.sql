create table accidents (
   accident_id SERIAL PRIMARY KEY,
   accident_name CHARACTER VARYING(100),
   accident_text CHARACTER VARYING(500),
   accident_address CHARACTER VARYING(100)
);

insert into accidents (accident_name, accident_text, accident_address)
values ('test_name_01', 'test_text_01', 'test_address_01');