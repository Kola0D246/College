-- EX01 Add contrainsts - PRIMARY KEY, FOREIGN KEY, NOT NULL
-- UNIQUE is added to IFSC Code in Exp 03
USE Bank;

-- ===============================
-- Branches
-- ===============================
ALTER TABLE Branches
ADD CONSTRAINT pk_branches PRIMARY KEY (branch_id),
MODIFY branch_id INT AUTO_INCREMENT;

ALTER TABLE Branches
MODIFY branch_name VARCHAR(100) NOT NULL,
MODIFY city VARCHAR(100) NOT NULL;

-- ===============================
-- Customers
-- ===============================
ALTER TABLE Customers
ADD CONSTRAINT pk_customer PRIMARY KEY (customer_id),
MODIFY customer_id INT AUTO_INCREMENT;

ALTER TABLE Customers
MODIFY customer_name VARCHAR(100) NOT NULL,
MODIFY address TEXT NOT NULL;
    
ALTER TABLE Customers 
MODIFY phone VARCHAR(15) NOT NULL,
ADD CONSTRAINT chk_phone_digits CHECK (phone REGEXP '^[0-9]+$');

-- ===============================
-- Accounts
-- ===============================
ALTER TABLE Accounts
ADD CONSTRAINT pk_accounts PRIMARY KEY (account_id),
MODIFY account_id INT AUTO_INCREMENT;

ALTER TABLE Accounts
MODIFY customer_id INT NOT NULL,
MODIFY branch_id INT NOT NULL,
MODIFY account_type ENUM('saving','current','deposit','salary') NOT NULL,
MODIFY balance DECIMAL(10,2) NOT NULL;

ALTER TABLE Accounts
ADD CONSTRAINT fk_accounts_customer
FOREIGN KEY (customer_id) REFERENCES Customers(customer_id);

ALTER TABLE Accounts
ADD CONSTRAINT fk_accounts_branch
FOREIGN KEY (branch_id) REFERENCES Branches(branch_id);

-- ===============================
-- Transactions
-- ===============================
ALTER TABLE Transactions
ADD CONSTRAINT pk_transactions PRIMARY KEY (transaction_id),
MODIFY transaction_id INT AUTO_INCREMENT;

ALTER TABLE Transactions
MODIFY account_id INT NOT NULL,
MODIFY transaction_type ENUM('deposit','withdraw','transfer') NOT NULL,
MODIFY amount DECIMAL(10,2) NOT NULL,
MODIFY transaction_time DATETIME NOT NULL;

ALTER TABLE Transactions
ADD CONSTRAINT fk_transactions_account
FOREIGN KEY (account_id) REFERENCES Accounts(account_id);

-- ===============================
-- Loan
-- ===============================
ALTER TABLE Loans
ADD CONSTRAINT pk_loans PRIMARY KEY (loan_id),
MODIFY loan_id INT AUTO_INCREMENT;

ALTER TABLE Loans
MODIFY customer_id INT NOT NULL,
MODIFY loan_amount DECIMAL(10,2) NOT NULL,
MODIFY loan_type ENUM('home','car','education','personal','business') NOT NULL,
MODIFY interest_rate DECIMAL(5,2)  NOT NULL;

ALTER TABLE Loans
ADD CONSTRAINT fk_loans_customer
FOREIGN KEY (customer_id) REFERENCES Customers(customer_id);
