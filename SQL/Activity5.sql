
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';


UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';


UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Displaying the modified data
SELECT * FROM salesman;