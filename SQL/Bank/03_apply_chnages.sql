-- EX03 Alter, Update and Delete
USE Bank;

-- ===============================
-- ALTER TABLE: Add new column
-- ===============================
ALTER TABLE Branches
ADD ifsc_code VARCHAR(11) NOT NULL UNIQUE;

-- ===============================
-- UPDATE: Update a single cell
-- ===============================
UPDATE Branches
SET branch_name = 'Central Branch'
WHERE branch_id = 1;

-- ===============================
-- UPDATE: Update multiple rows based on condition
-- ===============================
UPDATE Accounts
SET balance = balance * 1.05
WHERE account_type = 'saving'
AND account_id IS NOT NULL;

-- ===============================
-- ALTER TABLE: Drop a column
-- ===============================
ALTER TABLE Loans
DROP COLUMN interest_rate;

-- ===============================
-- DELETE: Delete a single row
-- ===============================
DELETE FROM Transactions
WHERE transaction_id = 4;

-- ===============================
-- DELETE: Delete multiple rows based on condition
-- ===============================
START TRANSACTION;
DELETE FROM transactions
WHERE account_id IN (
    SELECT account_id
    FROM accounts
    WHERE balance < 40000
);
DELETE FROM accounts
WHERE balance < 40000;
COMMIT;

