-- EX01: Create Database Structure

CREATE DATABASE College;
USE College;

CREATE TABLE Department(
	dept_id INT,
    dept_name VARCHAR(100)
);

CREATE TABLE Course(
	course_id INT,
    course_name VARCHAR(100),
    course_type ENUM('Major','Elective') NOT NULL,
    dept_id INT
);

CREATE TABLE Faculty(
	faculty_id INT,
    faculty_name VARCHAR(100),
    designation ENUM('HOD','Proffesor','Ass. Proffesor') NOT NULL,
    dept_id INT,
    salary  DECIMAL(8,2)
);

/*
CREATE TABLE Subjects(
	sub_id INT,
    sub_name VARCHAR(100)
);
*/

/*
CREATE TABLE Sub_Course_Faculty(
	course_id INT,
	sub_id INT,
    faculty_id INT
);
*/

CREATE TABLE Student(
	stud_id INT,
    stud_name VARCHAR(100),
    stud_email VARCHAR(150),
    admission_yr INT
);

CREATE TABLE Enrollment(	-- for many-to-many relation
	stud_id INT,
    course_id INT
);