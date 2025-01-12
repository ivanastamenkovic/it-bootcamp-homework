-- To execute a query, remove -- before it and click on "Execute/Refresh" (play button)


-- 1. Add yourself to the "radnik" table with all the necessary data for the table columns.

-- INSERT INTO radnik (idbr, ime, posao, kvalifikacija, rukovodilac, datum_zaposlenja, plata, broj_odeljenja) VALUES (7000, 'Ivana', 'QA', 'SSS', 5780, '2023-03-04', 1000, 20);
-- there is a column called "premija" (bonus), which is intentionally left without an entry, so that field currently outputs [null]
-- you may need to change the idbr since it must be unique

-- use this query to check your record:
-- SELECT * FROM radnik WHERE idbr = 7000;


-- 2. Display all the data from the "odeljenje" table.

-- SELECT * FROM odeljenje;


-- 3. Display the name, qualification, and salary for each employee from the "radnik" table. 

-- SELECT ime, kvalifikacija, plata FROM radnik;


-- 4. In the "radnik" table, update the qualification and salary for yourself, which you added in the previous homework assignment.

-- UPDATE radnik SET kvalifikacija = 'VSS', plata = 1200 WHERE idbr = 7000;
-- again, don't forget to change the idbr to the value you used in the first query


-- 5. Display the project names and funds for projects that have funds equal to or less than 3,000,000.

-- SELECT imeproj, sredstva FROM projekat WHERE sredstva <= 3000000;