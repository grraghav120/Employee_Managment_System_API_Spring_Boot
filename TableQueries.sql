use employeManagementSystem

CREATE TABLE Addresses(
	Id INT PRIMARY KEY IDENTITY(1,1),
	Line1 VARCHAR(MAX) NOT NULL,
	City VARCHAR(MAX) NOT NULL,
	State VARCHAR(MAX) NOT NULL,
	PinCode INT NOT NULL
)

CREATE TABLE Employees(
	Id INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(MAX) NOT NULL,
	PhoneNo INT NOT NULL,
	Email VARCHAR(max),
	DOB DATE,
	DOJ DATE,
	Salary INT,
	AddressId INT,
	FOREIGN KEY (AddressId) REFERENCES Addresses(Id)
)

CREATE TABLE Departments(
	Id INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(MAX) NOT NULL,
	HOD VARCHAR(MAX) NOT NULL,
)

CREATE TABLE Departments_Employees(
	Id INT PRIMARY KEY IDENTITY(1,1),
	EmployeeId INT NOT NULL,
	DepartmentId INT NOT NULL,
	FOREIGN KEY (EmployeeId) REFERENCES Employees(Id),
	FOREIGN KEY (DepartmentId) REFERENCES Departments(Id)
)

CREATE TABLE Roles(
	Id INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(MAX) NOT NULL,
)

CREATE TABLE Projects(
	Id INT PRIMARY KEY IDENTITY(1,1),
	Name VARCHAR(MAX) NOT NULL,
	StartTime DATE NOT NULL,
	EndTime DATE NULL,
	Status VARCHAR(MAX) NOT NULL,
)

CREATE TABLE Employees_Projects_Roles(
	Id INT PRIMARY KEY IDENTITY(1,1),
	EmployeeId INT NOT NULL,
	ProjectId INT NOT NULL,
	RoleId INT NOT NULL,
	FOREIGN KEY (EmployeeId) REFERENCES Employees(Id),
	FOREIGN KEY (ProjectId) REFERENCES Projects(Id),
	FOREIGN KEY (RoleId) REFERENCES Roles(Id)
)

-- 1-> YES , 0->NO
CREATE TABLE Attendances(
	Id INT PRIMARY KEY IDENTITY(1,1),
	EmployeeId INT NOT NULL,
	Status INT NOT NULL,
	AttendanceDate DATE NOT NULL,
	FOREIGN KEY (EmployeeId) REFERENCES Employees(Id),
)

INSERT INTO Addresses VALUES
('Ameerpet','Hyderabad','Telangana','123456'),
('Rambagh','Agra','UP','234555'),
('Kamla Nagar','Agra','UP','323223'),
('Sector 17A','Gurgaon','Haryana','12344')

INSERT INTO Employees VALUES
('Tarun',98879239,'tarun@gmail.com','2004-05-09','2022-02-10',10000,2),
('Sakshi',987272,'sakshi@gmail.com','2002-12-12','2024-3-10',40000,2)

INSERT INTO Departments VALUES
('IT','Rajesh'),
('HR','Nandni'),
('Engineering','Rahul'),
('Sales','Raghav'),
('Marketing','Sanjay')

INSERT INTO Roles VALUES
('Junior Software Engineer'),
('Senior Software Engineer'),
('Associate Software Engineer'),
('Database Engineer'),
('Java Developer'),
('Angular Developer'),
('Manager'),
('CEO'),
('Senior Manager'),
('Product Manager'),
('HR Head'),
('Talent Acquisition'),
('Campus Connect HR'),
('Sales Head'),
('Sales Manager'),
('L1 Support')

INSERT INTO Projects VALUES
('ABC','2024-02-02','2025-03-14','Running'),
('XYZ','2022-02-02','2025-03-16','Running'),
('PQR','2024-02-02','2024-03-14','Completed')

SELECT * FROM Employees

INSERT INTO Departments_Employees VALUES
(22,1),
(13,4),
(6,3),
(6,4)

INSERT INTO Employees_Projects_Roles VALUES
(4,1,3),
(4,2,3),
(5,3,2),
(18,3,1),
(21,2,4)
