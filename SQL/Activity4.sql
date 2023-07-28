-- Adding the grade column
ALTER TABLE salesman ADD grade int;

-- Updating values in grade column
UPDATE salesman SET grade=100;

-- Displaying the data
SELECT * FROM salesman;