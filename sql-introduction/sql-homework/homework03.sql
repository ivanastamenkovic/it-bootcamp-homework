-- To execute a query, remove -- before it and click on "Execute/Refresh" (play button)


-- 1. Display the name, qualification, salary, and bonus of employees who have a bonus.

-- SELECT ime, kvalifikacija, plata, premija FROM radnik WHERE premija IS NOT NULL;


-- 2. Display the average salary in the entire company and round it to two decimal places.

-- SELECT ROUND(AVG(plata), 2) FROM radnik;


-- 3. Display the minimum, maximum, average salary, and the number of employees in the entire company. 

-- SELECT MIN(plata), MAX(plata), AVG(plata), COUNT(idbr) FROM radnik;


-- 4. Display the minimum, maximum, average salary, and the number of employees in department 30, rounding to two decimal places.

-- SELECT MIN(plata), MAX(plata), ROUND(AVG(plata),2), COUNT(idbr) FROM radnik WHERE broj_odeljenja = 30;


-- 5. Display the minimum and maximum salary for each qualification. Include only employees from departments 10 and 20 in the calculation.

-- SELECT kvalifikacija, MIN(plata), MAX(plata) FROM radnik WHERE broj_odeljenja IN (10, 20) GROUP BY kvalifikacija;


-- 6. Display the department numbers and average salary in each of them, only for departments where the average salary is higher than 2000.

-- SELECT broj_odeljenja, AVG(plata) FROM radnik GROUP BY broj_odeljenja HAVING AVG(plata) > 2000;


-- 7. Who is the highest-paid employee in the entire company?

-- SELECT ime, plata FROM radnik ORDER BY plata DESC LIMIT 1;