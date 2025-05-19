1. Write a query to fetch the names of employees and their department name.

 select e.employee_id, e.first_name, e.last_name, d.department_name
from employees e
join departments d on e.department_id = d.department_id;


2. Find the total hours logged by each employee across all projects.

 select e.employee_id, concat(e.first_name, ' ', e.last_name) as name, sum(ep.hours_logged) AS total_hours_logged
from  employees e
join employee_projects ep on e.employee_id = ep.employee_id
group by e.employee_id, e.first_name, e.last_name;




3. Retrieve the department name and count of employees in each department.

select d.department_name, count(e.employee_id) as employee_count from departments d
left join employees e on d.department_id = e.department_id
group by d.department_name;


4. Identify employees who work on more than 2 projects.

 select e.employee_id, concat(e.first_name, ' ', e.last_name) as name, count(ep.project_id) as project_count
from employees e
join employee_projects ep ON e.employee_id = ep.employee_id
group by e.employee_id, e.first_name, e.last_name
having count(ep.project_id) > 2;


5. Write a query to find employees who do not work on any project.

 select e.employee_id, concat(e.first_name,' ',e.last_name) as name, ep.project_id 
from employees e 
left join employee_projects ep on e.employee_id = ep.employee_id 
where ep.project_id is NULL;


6. Find employees earning a salary greater than the average salary of their department.

select e.employee_id, concat(e.first_name, ' ', e.last_name) as name
from employees e
where e.salary > (select avg(e1.salary) from employees e1 where e1.department_id = e.department_id);

7. Write a query using a self join to display employee names along with their manager name.

select concat(e.first_name, ' ', e.last_name) as employee_name, concat(m.first_name, ' ', m.last_name) as manager_name
from employees e
left join departments d on e.employee_id = d.department_id
left join employees m on d.manager_id = m.employee_id ;

8. Identify projects where the total hours logged by all employees exceed 500.

select p.project_id, p.project_name,sum(ep.hours_logged) as total_hours_logged
from projects p join employee_projects ep ON p.project_id = ep.project_id
group by p.project_id, p.project_name
having total_hours_logged > 500;


9. Retrieve the name of the department where the manager has the highest salary.

select d.department_name from departments d
join employees e ON d.manager_id = e.employee_id
order by e.salary desc limit 1;



10. Display employees who have logged more than 40 hours on any project using a CASE statement to classify them as 'Overtime' or 'Normal.'

select concat(e.first_name, ' ', e.last_name) as name,
case
when ep.hours_logged > 40 then "Overtime"
when ep.hours_logged < 40 then "Normal"
else "Not Started Project"
end as projects_log_hours 
from employees e left join employee_projects ep on e.employee_id=ep.employee_id;

11. Find employees who were hired after January 1, 2020, and have not been allocated to any projects.

Select e.* from employees e left join employee_projects ep on e.employee_id = ep.employee_id
where e.hire_date > '2020-01-01' and ep.project_id is NULL ;

12. Write a query to display employees whose total salary transactions (including bonuses/deductions) exceed 10,000.

select e.employee_id, e.first_name, e.last_name, sum(t.amount) AS total_transactions
from employees e
join transactions t on e.employee_id = t.employee_id
where t.transaction_type in ('Salary', 'Bonus', 'Deduction')  
group by e.employee_id
having sum(t.amount) > 10000;


14. List employees whose salary is the highest in their respective department.

select e.employee_id, e.first_name, e.last_name, e.department_id, e.salary
from employees e
where e.salary = (select max(e1.salary) from employees e1 where e1.department_id = e.department_id) order by e.department_id;


15. Display the average hours logged by employees for each project.

select p.project_name, avg(ep.hours_logged) as avg_hours_logged
from employee_projects ep
join projects p on ep.project_id = p.project_id
group by p.project_id;


16. Write a query to fetch all employees who belong to the same department as "John Doe" using self joins.

select e1.employee_id, e1.first_name, e1.last_name, e1.department_id
from employees e1
join employees e2 ON e1.department_id = e2.department_id
where e2.first_name = 'John' AND e2.last_name = 'Doe';



17. Find the departments where no projects have started.

select d.department_id, d.department_name
from departments d
left join employees e ON d.department_id = e.department_id
left join employee_projects ep ON e.employee_id = ep.employee_id
left join projects p ON ep.project_id = p.project_id AND p.start_date is NOT NULL
group by d.department_id, d.department_name
having count(p.project_id) = 0;


19. List employees whose names start with the letter 'A' and have logged more than 20 hours on any project.

Select concat(e.first_name, ' ', e.last_name) as name from employees e left join employee_projects ep on e.employee_id = ep.employee_id
where e.first_name like 'A%' and ep.hours_logged > 20 ;


20. Identify the total transactions per employee along with their latest transaction date.

select e.employee_id, concat(e.first_name, ' ', e.last_name) as name, count(t.transaction_id) AS total_transactions, 
max(t.transaction_date) as latest_transaction_date
from employees e join transactions t on e.employee_id = t.employee_id
group by e.employee_id;





