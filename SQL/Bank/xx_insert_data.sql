-- EX2.3 Insert Values
USE Bank;

-- ===============================
-- Branches
-- ===============================
INSERT INTO Branches (branch_name, city) VALUES
('Main Branch', 'Mumbai'),
('North Branch', 'Delhi'),
('East Branch', 'Kolkata');

-- ===============================
-- Customers
-- ===============================
INSERT INTO Customers (customer_name, address, phone) VALUES
('Alice Sharma', '123 MG Road, Mumbai', '9876543210'),
('Rahul Verma', '45 Nehru Street, Delhi', '9123456780'),
('Priya Singh', '78 Park Street, Kolkata', '9988776655');

-- ===============================
-- Accounts
-- ===============================
INSERT INTO Accounts (customer_id, branch_id, account_type, balance) VALUES
(1, 1, 'saving', 50000.00),
(2, 2, 'current', 120000.50),
(3, 3, 'fixed', 250000.00),
(1, 1, 'salary', 35000.75);

-- ===============================
-- Transactions
-- ===============================
INSERT INTO Transactions (account_id, transaction_type, amount, transaction_time) VALUES
(1, 'deposit', 10000.00, '2026-02-01 23:35:42'),
(1, 'withdraw', 5000.00, '2026-02-03 12:58:37'),
(2, 'deposit', 25000.50, '2026-01-25 05:02:12'),
(3, 'deposit', 50000.00, '2026-01-30 09:25:09'),
(4, 'deposit', 20000.00, '2026-02-02 20:41:39');

-- ===============================
-- Loans
-- ===============================
INSERT INTO Loans (customer_id, loan_amount, loan_type, interest_rate) VALUES
(1, 500000.00, 'home', 7.5),
(2, 300000.00, 'car', 8.0),
(3, 150000.00, 'education', 6.5),
(1, 200000.00, 'personal', 12.0);
