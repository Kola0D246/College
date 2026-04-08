-- EX04 Implement Joins
USE Bank;

-- ===============================
-- INNER JOIN: List accounts with customer names and branch names
-- ===============================
SELECT a.account_id, c.name AS customer_name, b.branch_name, a.account_type, a.balance
FROM Accounts a
INNER JOIN Customers c ON a.customer_id = c.customer_id
INNER JOIN Branches b ON a.branch_id = b.branch_id;

-- ===============================
-- LEFT JOIN: List all customers and their loans (if any)
-- ===============================
SELECT c.customer_id, c.name, l.loan_id, l.loan_amount, l.loan_type
FROM Customers c
LEFT JOIN Loans l ON c.customer_id = l.customer_id;

-- ===============================
-- RIGHT JOIN: List all branches and accounts (if any) in them
-- ===============================
SELECT b.branch_id, b.branch_name, a.account_id, a.account_type, a.balance
FROM Accounts a
RIGHT JOIN Branches b ON a.branch_id = b.branch_id;

-- ===============================
-- FULL OUTER JOIN: List all customers and all accounts (requires UNION in MySQL)
-- ===============================
SELECT c.customer_id, c.name, a.account_id, a.account_type, a.balance
FROM Customers c
LEFT JOIN Accounts a ON c.customer_id = a.customer_id
UNION
SELECT c.customer_id, c.name, a.account_id, a.account_type, a.balance
FROM Customers c
RIGHT JOIN Accounts a ON c.customer_id = a.customer_id;

-- ===============================
-- SELF JOIN: List customers with the same city
-- ===============================
SELECT c1.customer_id AS Customer1_ID, c1.name AS Customer1, c2.customer_id AS Customer2_ID, c2.name AS Customer2
FROM Customers c1
INNER JOIN Customers c2 ON c1.address LIKE CONCAT('%', SUBSTRING_INDEX(c2.address, ',', -1))
WHERE c1.customer_id <> c2.customer_id;

-- ===============================
-- CROSS JOIN: Show all possible combinations of branches and account types
-- ===============================
SELECT b.branch_name, a.account_type
FROM Branches b
CROSS JOIN (SELECT DISTINCT account_type FROM Accounts) a;
