use master
go
drop database qlSv
go
create database qlSv
go 
use qlSv
go
CREATE TABLE classes (
    class_id INT IDENTITY(1,1) PRIMARY KEY,
    class_name NVARCHAR(100) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL
);

CREATE TABLE student (
    student_id INT IDENTITY(1,1) PRIMARY KEY,
    student_name NVARCHAR(100) NOT NULL,
    birth_date DATE NOT NULL,
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES classes(class_id)
);

INSERT INTO classes (class_name, start_date, end_date) VALUES 
('Math 101', '2024-09-01', '2024-12-15'),
('English Literature', '2024-09-01', '2024-12-15'),
('Computer Science 101', '2024-09-01', '2024-12-15');
INSERT INTO student (student_name, birth_date, class_id) VALUES 
('John Doe', '2000-05-15', 1),
('Jane Smith', '1999-08-22', 2),
('Alice Johnson', '2001-12-05', 3),
('Bob Brown', '2000-07-19', 1),
('Carol White', '1998-10-30', 2);
