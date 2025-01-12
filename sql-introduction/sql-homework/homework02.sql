-- To execute a query, remove -- before it and click on "Execute/Refresh" (play button)


-- 1. Display the name and job position of the manager and analyst from department 10.

-- SELECT ime, posao FROM radnik WHERE posao IN ('upravnik', 'analiticar') AND broj_odeljenja = 10;


-- 2. Display the names of five employees whose names do not contain the letter 'A'.

-- SELECT ime FROM radnik WHERE ime NOT LIKE '%a%' AND ime NOT LIKE '%A%' LIMIT 5;


-- 3. Display the name and salary of employees whose salary is between 2600 and 3000. 

-- SELECT ime, plata FROM radnik WHERE plata BETWEEN 2600 AND 3000;


-- 4. Display the name, salary, and bonus of employees who have the job position 'driver'. Sort the results by bonus in descending order.

-- SELECT ime, plata, premija FROM radnik WHERE posao = 'vozac' ORDER BY premija DESC;