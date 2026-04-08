USE Bank;

-- ===============================
-- ALTER TABLE examples
-- ===============================

-- 1. Add a new column: IFSC code in Branches
ALTER TABLE Branches
ADD ifsc_code VARCHAR(11) NOT NULL DEFAULT 'NA';

-- 2. Modify a column: increase phone length in Customers
ALTER TABLE Customers
MODIFY phone VARCHAR(20) NOT NULL;

-- 3. Change column data type: change balance to DECIMAL(12,2) in Accounts
ALTER TABLE Accounts
MODIFY balance DECIMAL(12,2) NOT NULL;

-- 4. Rename a column: transaction_type to txn_type in Transactions
ALTER TABLE Transactions
CHANGE COLUMN transaction_type txn_type ENUM('deposit','withdraw','transfer') NOT NULL;

-- 5. Drop a column: remove interest_rate from Loans
ALTER TABLE Loans
DROP COLUMN interest_rate;

-- 6. Add a new column with default value
ALTER TABLE Accounts
ADD opened_date DATE NOT NULL DEFAULT CURRENT_DATE;

-- ===============================
-- UPDATE examples
-- ===============================

-- 1. Update a single cell: change branch name for branch_id = 1
UPDATE Branches
SET branch_name = 'Central Branch'
WHERE branch_id = 1;

-- 2. Update multiple rows: increase all savings account balances by 5%
UPDATE Accounts
SET balance = balance * 1.05
WHERE account_type = 'saving';

-- 3. Update multiple columns in a row
UPDATE Customers
SET address = '99 New Street, Mumbai', phone = '9998887776'
WHERE customer_id = 1;

-- 4. Update using a JOIN: change account_type for customer with loan
UPDATE Accounts a
JOIN Loans l ON a.customer_id = l.customer_id
SET a.account_type = 'premium'
WHERE l.loan_type = 'home';

-- ===============================
-- DELETE examples
-- ===============================

-- 1. Delete a single row
DELETE FROM Customers
WHERE customer_id = 3;

-- 2. Delete multiple rows based on condition
DELETE FROM Accounts
WHERE balance < 40000;

-- 3. Delete all rows in a table (truncate style)
DELETE FROM Transactions;

-- 4. Delete rows using JOIN: remove accounts of customers without branches
DELETE a
FROM Accounts a
LEFT JOIN Branches b ON a.branch_id = b.branch_id
WHERE b.branch_id IS NULL;

-- 5. Delete table column data by setting to NULL (soft delete)
UPDATE Branches
SET ifsc_code = NULL;

-- 6. Delete all rows in Loans table where loan_amount < 200000
DELETE FROM Loans
WHERE loan_amount < 200000;
