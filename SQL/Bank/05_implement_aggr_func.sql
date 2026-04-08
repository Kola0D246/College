USE Bank;

-- ===============================
-- 1. COUNT: Total number of customers
-- ===============================
SELECT COUNT(*) AS total_customers
FROM Customers;

-- ===============================
-- 2. SUM: Total balance across all accounts
-- ===============================
SELECT SUM(balance) AS total_balance
FROM Accounts;

-- ===============================
-- 3. AVG: Average balance of saving accounts
-- ===============================
SELECT AVG(balance) AS avg_saving_balance
FROM Accounts
WHERE account_type = 'saving';

-- ===============================
-- 4. MIN/MAX: Minimum and Maximum loan amounts
-- ===============================
SELECT MIN(loan_amount) AS min_loan, MAX(loan_amount) AS max_loan
FROM Loans;

-- ===============================
-- 5. GROUP BY with COUNT: Number of accounts per branch
-- ===============================
SELECT branch_id, COUNT(account_id) AS total_accounts
FROM Accounts
GROUP BY branch_id;

-- ===============================
-- 6. GROUP BY with SUM: Total loan amount per customer
-- ===============================
SELECT customer_id, SUM(loan_amount) AS total_loans
FROM Loans
GROUP BY customer_id;
