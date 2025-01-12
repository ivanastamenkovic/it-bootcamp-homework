-- To execute a query, remove -- before it and click on "Execute/Refresh" (play button)


-- 1. Display who is the highest paid employee in the entire company.

-- SELECT ime, plata FROM radnik WHERE plata = (SELECT MAX(plata) FROM radnik);


-- 2. Display the name and qualification of all employees who have the same salary as Jovan. Sort the results by name in descending order.

-- SELECT ime, kvalifikacija FROM radnik WHERE plata = (SELECT plata FROM radnik WHERE ime = 'Jovan') ORDER BY ime DESC;


-- 3. Display the name, job title, and salary of employees in department 10 ("broj_odeljenja = 10") who have the same job title as employees in the 'Plan' department ("ime_odeljenja = Plan").

-- SELECT ime, posao, plata FROM radnik WHERE broj_odeljenja = 10 AND posao = (SELECT posao FROM odeljenje WHERE ime_odeljenja = 'Plan');


-- 4. Display all data about departments that have employees.

-- SELECT * FROM odeljenje WHERE broj_odeljenja in (SELECT broj_odeljenja FROM radnik);


-- 5. Display the name and salary of all employees whose salary is higher than the average salary in the company.

-- SELECT ime, plata + COALESCE(premija, 0) AS ukupna_primanja
-- FROM radnik
-- WHERE plata + COALESCE(premija, 0) > (SELECT AVG(plata + COALESCE(premija, 0)) FROM radnik);


-- 6. Display all data about departments and employees for departments whose names start with the letters 'd' or 'r'.

-- SELECT o.*, r.*
-- FROM odeljenje AS o 
-- FULL OUTER JOIN radnik AS r 
-- ON o.broj_odeljenja = r.broj_odeljenja 
-- WHERE ime_odeljenja LIKE 'D%' OR ime_odeljenja LIKE 'd%' OR ime_odeljenja LIKE 'R%' OR ime_odeljenja LIKE 'r%';