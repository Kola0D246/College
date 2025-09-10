USE student;

CREATE TABLE student (
	id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL
    );

INSERT INTO student VALUE (001, "Koustubh", 20);
INSERT INTO student VALUE (002, "UTKARSH", 19);
INSERT INTO student VALUE (003, "HARDIK", 18);

SELECT * FROM student;