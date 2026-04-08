-- EX2.3 Insert Values
USE College;

-- Department Table
INSERT INTO Department (dept_name) VALUES
('Applied Sciences'),
('Computer Science'),
('Information Technology'),
('Electrical Engineering'),
('Mechanical Engineering'),
('Civil Engineering');

-- Department Table
INSERT INTO Course (course_name, course_type, dept_id) VALUES
('BSc Honors','Major','1'),
('MSc Honors','Major','1'),

('BTech CSE','Major','2'),
('MTech CSE','Major','2'),
('Block Chain','Elective','2'),
('Artificial Intelligence','Elective','2'),

('BTech IT','Major','3'),
('MTech IT','Major','3'),
('Cloud Computing','Elective','3'),
('Cyber Security','Elective','3'),

('BTech EE','Major','4'),
('BTech EC','Major','4'),
('MTech EE','Major','4'),
('MTech EC','Major','4'),

('BTech ME','Major','5'),
('MTech ME','Major','5'),
('Industrial Robotics','Elective','5'),
('Mechatronic','Major','5'),

('BTech CE','Major','6'),
('MTech CE','Major','6');

-- Faculty - HODs
INSERT INTO Faculty (faculty_name, designation, dept_id, salary) VALUES
('Amit Shriradhe','HOD','1',145000.00),
('Poonam Sagar','HOD','2',145000.00),
('Amrit Bhatnagar','HOD','3',145000.00),
('Joseph Smith','HOD','4',145000.00),
('Amandeep Singh','HOD','5',145000.00),
('Dhruv Mourya','HOD','6',145000.00);

-- Faculty
INSERT INTO Faculty (faculty_name, designation, dept_id, salary) VALUES
('Arjun Nair', 'Professor', 1, 120000.00),
('Farah Khan',  'Professor', 1, 118000.00),
('Ritika Sharma', 'Professor', 1, 121000.00),
('Daniel D''Souza', 'Professor', 1, 119500.00),
('Meena Iyer', 'Asst Professor', 1, 82000.00),
('Harpreet Gill', 'Asst Professor', 1, 80000.00),

('Sandeep Reddy', 'Professor', 2, 120000.00),
('Nusrat Ali', 'Professor', 2, 117000.00),
('Priyanka Das', 'Professor', 2, 118500.00),
('Karthik Subramani', 'Professor', 2, 122000.00),
('Sneha Pillai', 'Asst Professor', 2, 83000.00),
('Zubin Contractor', 'Asst Professor', 2, 81000.00),

('Rahul Chatterjee', 'Professor', 3, 119000.00),
('Fatima Noor', 'Professor', 3, 121500.00),
('Devansh Patel', 'Professor', 3, 120500.00),
('Grace Thomas', 'Professor', 3, 118000.00),
('Anjali Menon', 'Asst Professor', 3, 82000.00),
('Manoj Tiwari', 'Asst Professor', 3, 80500.00),

('Vikram Rao', 'Professor', 4, 122000.00),
('Shazia Mir', 'Professor', 4, 117500.00),
('Neeraj Yadav', 'Professor', 4, 118800.00),
('Esther Koshy', 'Professor', 4, 121000.00),
('Rohan Bansal', 'Asst Professor', 4, 83000.00),
('Ayesha Siddiqui', 'Asst Professor', 4, 81000.00),

('Gurpreet Kaur', 'Professor', 5, 120500.00),
('Sameer Sheikh', 'Professor', 5, 118000.00),
('Lavanya Krishnan', 'Professor', 5, 119500.00),
('Abhishek Mishra', 'Professor', 5, 121200.00),
('Tanya Fernandes', 'Asst Professor', 5, 82000.00),
('Ritesh Parmar', 'Asst Professor', 5, 80000.00),

('Aditya Joshi', 'Professor', 6, 120000.00),
('Mary Kurien', 'Professor', 6, 118700.00),
('Imran Qureshi', 'Professor', 6, 121000.00),
('Pallavi Ghosh', 'Professor', 6, 119000.00),
('Nikhil Solanki', 'Asst Professor', 6, 83000.00),
('Farzana Begum', 'Asst Professor', 6, 81000.00);

-- Student
INSERT INTO Student (stud_name, stud_email, admission_yr) VALUES
('Aarav Mehta',        'aarav.mehta@college.in', 2022),
('Nisha Verma',        'nisha.verma@college.in', 2023),
('Faizan Ansari',      'faizan.ansari@college.in', 2021),
('Snehal Patil',       'snehal.patil@college.in', 2022),
('Joel Varghese',      'joel.varghese@college.in', 2024),
('Harini Iyer',        'harini.iyer@college.in', 2023),
('Manpreet Kaur',      'manpreet.kaur@college.in', 2021),
('Rohit Kulkarni',     'rohit.kulkarni@college.in', 2022),
('Zara Khan',          'zara.khan@college.in', 2024),
('Tashi Lepcha',       'tashi.lepcha@college.in', 2023),
('Vivek Reddy',        'vivek.reddy@college.in', 2022),
('Ananya Bose',        'ananya.bose@college.in', 2023),
('Imtiyaz Shaikh',     'imtiyaz.shaikh@college.in', 2021),
('Divya Nair',         'divya.nair@college.in', 2024),
('Chris Dsouza',       'chris.dsouza@college.in', 2022),
('Pooja Yadav',        'pooja.yadav@college.in', 2023),
('Lakshay Bhatia',     'lakshay.bhatia@college.in', 2021),
('Fatima Rahman',      'fatima.rahman@college.in', 2022),
('Tejas Gowda',        'tejas.gowda@college.in', 2024),
('Mitali Desai',       'mitali.desai@college.in', 2023),
('Sahil Choudhary',    'sahil.choudhary@college.in', 2022),
('Neha Pillai',        'neha.pillai@college.in', 2023),
('Armaan Qureshi',     'armaan.qureshi@college.in', 2024),
('Keerthi Rao',        'keerthi.rao@college.in', 2021),
('Akhil Thomas',       'akhil.thomas@college.in', 2022),
('Riya Banerjee',      'riya.banerjee@college.in', 2023),
('Yusuf Pathan',       'yusuf.pathan@college.in', 2021),
('Shruti Jha',         'shruti.jha@college.in', 2022),
('Pranav Shinde',      'pranav.shinde@college.in', 2024),
('Maria George',       'maria.george@college.in', 2023),
('Kunal Thakur',       'kunal.thakur@college.in', 2022),
('Ayesha Mirza',       'ayesha.mirza@college.in', 2023),
('Siddharth Roy',      'siddharth.roy@college.in', 2021),
('Tanvi Shetty',       'tanvi.shetty@college.in', 2024),
('Reuben Mathew',      'reuben.mathew@college.in', 2022),
('Gauri Sawant',       'gauri.sawant@college.in', 2023),
('Sameera Begum',      'sameera.begum@college.in', 2021),
('Karthik Raj',        'karthik.raj@college.in', 2022),
('Navya Purohit',      'navya.purohit@college.in', 2024),
('Rizwan Memon',       'rizwan.memon@college.in', 2023),
('Adarsh Tiwari',      'adarsh.tiwari@college.in', 2022),
('Meghna Krishnan',    'meghna.krishnan@college.in', 2023),
('Samar Abbas',        'samar.abbas@college.in', 2021),
('Lavina Dutta',       'lavina.dutta@college.in', 2024),
('Naveen Poojary',     'naveen.poojary@college.in', 2022),
('Heena Parveen',      'heena.parveen@college.in', 2023),
('Chaitanya Naidu',    'chaitanya.naidu@college.in', 2021),
('Simran Arora',       'simran.arora@college.in', 2022),
('Dilip Soren',        'dilip.soren@college.in', 2024),
('Alisha Fernandes',   'alisha.fernandes@college.in', 2023),
('Pratik Mondal',      'pratik.mondal@college.in', 2022),
('Noor Jahan',         'noor.jahan@college.in', 2023),
('Abhay Chauhan',      'abhay.chauhan@college.in', 2021),
('Ishita Kapur',       'ishita.kapur@college.in', 2024),
('Sufiyan Ahmed',      'sufiyan.ahmed@college.in', 2022),
('Radhika Menon',      'radhika.menon@college.in', 2023),
('Tenzin Bhutia',      'tenzin.bhutia@college.in', 2021),
('Deepika Rawat',      'deepika.rawat@college.in', 2022),
('Varun Saxena',       'varun.saxena@college.in', 2024),
('Salma Sheikh',       'salma.sheikh@college.in', 2023);

INSERT INTO Enrollment (stud_id, course_id)
SELECT stud_id, course_id
FROM (
    SELECT 
        s.stud_id,
        c.course_id,
        ROW_NUMBER() OVER (PARTITION BY s.stud_id ORDER BY c.course_id) AS rn
    FROM Student s
    JOIN Course c
        ON c.dept_id = s.dept_id
    WHERE s.admission_yr = 2022
      AND c.course_type = 'Elective'
) x
WHERE rn <= 2;
