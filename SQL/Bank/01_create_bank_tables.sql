-- EX01 Create Bank Tables
CREATE DATABASE Bank;
USE Bank;

-- Branches Table
CREATE TABLE Branches (
    branch_id INT,
    branch_name VARCHAR(100),
    city VARCHAR(100)
);

-- Customers Table
CREATE TABLE Customers (
    customer_id INT,
    customer_name VARCHAR(100),
    address TEXT,
    phone VARCHAR(15)
);

-- Accounts Table
CREATE TABLE Accounts (
    account_id INT,
    customer_id INT,
    branch_id INT,
    account_type ENUM('saving','current','fixed','salary'),
    balance DECIMAL(10,2)
);

-- Transactions Table
CREATE TABLE Transactions (
    transaction_id INT,
    account_id INT,
    transaction_type ENUM('deposit','withdraw','transfer'),
    amount DECIMAL(10,2),
    transaction_time DATETIME
);

-- Loans Table
CREATE TABLE Loans (
    loan_id INT,
    customer_id INT,
    loan_amount DECIMAL(10,2),
    loan_type ENUM('home','car','education','personal','business'),
    interest_rate DECIMAL(5,2)
);
