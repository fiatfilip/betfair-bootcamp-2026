CREATE TABLE author(
                       id UUID,
                       name varchar(32),
                       PRIMARY KEY("id")
)

    INSERT INTO author VALUES ('6240cc3d-62ba-452c-a05a-148d72e3b767', 'Agatha Christie')
INSERT INTO author VALUES ('f724cbc8-6318-45cd-8e48-db432e6be799', 'Oscar Ilde')
INSERT INTO author VALUES ('118e6447-87fe-4bc1-a9b6-42c20d1d78a4', 'Intruder')

SELECT name AS "NUMELE" FROM author

UPDATE author SET name = 'Oscar Wilde' where id = 'f724cbc8-6318-45cd-8e48-db432e6be799'

Delete from author where id =  '118e6447-87fe-4bc1-a9b6-42c20d1d78a4'

CREATE TABLE book
(
    id uuid NOT NULL,
    title character varying(64) NOT NULL,
    author uuid NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (id),
    CONSTRAINT book_fk FOREIGN KEY (author)
        REFERENCES public.author (id) MATCH SIMPLE
        ON UPDATE cascade
        ON DELETE NO ACTION
)

DROP TABLE Book

select * from book

    INSERT INTO book VALUES ('ce9142bd-bc2c-40c1-9ae1-220ae2053737', 'The Mysterious Affair at Styles', '6240cc3d-62ba-452c-a05a-148d72e3b767'), ('b6cafbdc-a38f-4b51-b697-e6c74fce9d34', 'Murder on the Orient Express', '6240cc3d-62ba-452c-a05a-148d72e3b767')

select a.name, b.title from book b, author a where a.name like '%gatha%'

select a.name, b.title FROM author a
                                LEFT JOIN book b
                                          ON a.id = b.author


