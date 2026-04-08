-- EX02: Add Constraints
USE College;

-- ------------------
-- Department Table
-- ------------------

ALTER TABLE Department
ADD CONSTRAINT pk_dept PRIMARY KEY (dept_id);

ALTER TABLE Department
MODIFY dept_id INT AUTO_INCREMENT,
MODIFY dept_name VARCHAR(100) NOT NULL UNIQUE;

-- --------------------
-- Course Table
-- --------------------

ALTER TABLE Course
ADD CONSTRAINT pk_course PRIMARY KEY (course_id);

ALTER TABLE Course
MODIFY course_id INT AUTO_INCREMENT,
MODIFY course_name VARCHAR(100) NOT NULL UNIQUE,
MODIFY dept_id INT NOT NULL;

ALTER TABLE Course
ADD CONSTRAINT fk_course_dept
FOREIGN KEY (dept_id) REFERENCES Department(dept_id);

-- --------------------
-- Faculty Table
-- --------------------

ALTER TABLE Faculty
ADD CONSTRAINT pk_faculty PRIMARY KEY (faculty_id);

ALTER TABLE Faculty
MODIFY faculty_id INT AUTO_INCREMENT,
MODIFY faculty_name VARCHAR(100) NOT NULL,
MODIFY dept_id INT NOT NULL,
MODIFY salary DECIMAL(8,2) NOT NULL;

ALTER TABLE Faculty
ADD CONSTRAINT fk_faculty_dept
FOREIGN KEY (dept_id) REFERENCES Department(dept_id);

-- --------------------
-- Student Table
-- --------------------

ALTER TABLE Student
ADD CONSTRAINT pk_student PRIMARY KEY (stud_id);

ALTER TABLE Student
MODIFY stud_id INT AUTO_INCREMENT,
MODIFY stud_name VARCHAR(100) NOT NULL,
MODIFY stud_email VARCHAR(150) NOT NULL UNIQUE,
MODIFY admission_yr YEAR NOT NULL;

ALTER TABLE Student
ADD CONSTRAINT chk_email CHECK (stud_email LIKE '%@college.in'),
ADD CONSTRAINT chk_year CHECK (admission_yr>=200);

-- --------------------
-- Enrollment Table
-- --------------------

ALTER TABLE Enrollment
ADD CONSTRAINT compk_stud_course_ids PRIMARY KEY (stud_id, course_id),
MODIFY stud_id INT NOT NULL,
MODIFY course_id INT NOT NULL;

ALTER TABLE Enrollment
ADD CONSTRAINT fk_stud_id FOREIGN KEY (stud_id) REFERENCES Student(stud_id) ON DELETE CASCADE,
ADD CONSTRAINT fk_course_id FOREIGN KEY (course_id) REFERENCES Course(course_id);