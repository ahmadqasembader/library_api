CREATE DATABASE library

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    author VARCHAR,
    book_title VARCHAR(255),
    iban VARCHAR(20),
    year_of_publish INT,
    number_of_pages INT
);

INSERT INTO books (author, book_title, iban, year_of_publish, number_of_pages)
VALUES
    ('John Doe', 'Sample Book 1', 'ISBN12345', 2020, 200),
    ('Jane Smith', 'Sample Book 2', 'ISBN67890', 2018, 300),
    ('Alice Johnson', 'Sample Book 3', 'ISBNABCDE', 2015, 150),
    ('Bob Wilson', 'Sample Book 4', 'ISBNFGHIJ', 2022, 250);
