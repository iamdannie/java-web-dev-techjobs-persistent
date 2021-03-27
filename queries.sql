## Part 1: Test it with SQL
listed columns and their data types in the table
id int, employer varchar, name varchar, skills varchar, employer_id int, job_id int
## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location "Saint Louis City"
## Part 3: Test it with SQL
DROP TABLE
## Part 4: Test it with SQL
SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id=skills_id
WHERE job_skills.job_id IS NOT NULL
ORDER BY skill.name ASC