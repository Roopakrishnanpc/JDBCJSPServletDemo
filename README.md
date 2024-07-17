mysql> use seveltexampledb;
Database changed
mysql> show tables;
+---------------------------+
| Tables_in_seveltexampledb |
+---------------------------+
| brand                     |
| cache_example             |
| customer                  |
| employee                  |
| employeecheck             |
| entity                    |
| hql_entity                |
| jpa                       |
| laptop                    |
| laptop_student            |
| login                     |
| persistent_entity         |
| personentity              |
| persons                   |
| student                   |
| students                  |
+---------------------------+
16 rows in set (0.00 sec)

mysql> describe brand;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| bid         | int          | NO   | PRI | NULL    |       |
| customer_id | int          | YES  | MUL | NULL    |       |
| baname      | varchar(255) | YES  |     | NULL    |       |
| price       | varchar(255) | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> describe cache_example;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int          | NO   | PRI | NULL    |       |
| name  | varchar(255) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> describe customer;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int          | NO   | PRI | NULL    |       |
| name  | varchar(255) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> describe employee;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| personID  | int          | NO   | PRI | NULL    |       |
| firstName | varchar(255) | YES  |     | NULL    |       |
| lastName  | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe employeecheck;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| personID  | int          | NO   | PRI | NULL    |       |
| firstName | varchar(255) | YES  |     | NULL    |       |
| lastName  | varchar(255) | YES  |     | NULL    |       |
| positions | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
4 rows in set (0.00 sec)

mysql> describe entity;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| marks  | int          | NO   |     | NULL    |       |
| rollno | int          | NO   | PRI | NULL    |       |
| sname  | varchar(255) | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe hql_entity;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| marks     | int          | NO   |     | NULL    |       |
| rollno    | int          | NO   | PRI | NULL    |       |
| stud_name | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe jpa;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| rollno   | int          | NO   | PRI | NULL    |       |
| learning | varchar(255) | YES  |     | NULL    |       |
| name     | varchar(255) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe laptop;
+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int          | NO   | PRI | NULL    |       |
| lame  | varchar(255) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> describe laptop_student;
+----------------+------+------+-----+---------+-------+
| Field          | Type | Null | Key | Default | Extra |
+----------------+------+------+-----+---------+-------+
| lap_id         | int  | NO   | MUL | NULL    |       |
| student_rollno | int  | NO   | MUL | NULL    |       |
+----------------+------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> describe login;
+-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| uname | varchar(20) | YES  |     | NULL    |       |
| pass  | varchar(20) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> describe persistent_entity'
    '> '
    -> ;
Empty set (0.01 sec)

mysql> describe persistent_entity;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| marks     | int          | NO   |     | NULL    |       |
| rollno    | int          | NO   | PRI | NULL    |       |
| stud_name | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe personentity'
    '> ;
    '> ;
    '> ^C
mysql> describe personentity;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| personID  | int          | NO   | PRI | NULL    |       |
| firstName | varchar(255) | YES  |     | NULL    |       |
| lastName  | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe persons;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| PersonID  | int          | YES  |     | NULL    |       |
| LastName  | varchar(255) | YES  |     | NULL    |       |
| FirstName | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe student;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| marks  | int          | NO   |     | NULL    |       |
| rollno | int          | NO   | PRI | NULL    |       |
| sname  | varchar(255) | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> describe students;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| rollno    | int         | NO   | PRI | NULL    |       |
| stud_name | varchar(50) | YES  |     | NULL    |       |
| marks     | int         | YES  |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)
