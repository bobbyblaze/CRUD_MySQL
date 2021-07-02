# CRUD_MySQL
Maven - Spting Boot - RESTful CRUD API with MySQL database.
To use this program firstly create MySQL database table with id, login_name and password. 
Set every one of them to "Not Null" and set the Id to "Primary Key" and "Auto Increment".

After this you are all set with the database. 

In the application.yml set up your username and password to the database with the url to it,
to create a succesfull connection.

------------------------------------------------------------------------------------------------------
To add, update or delete users from the database using the program you will need to use curl commands:

// create
curl -X POST
-H "Content-Type:application/json" \ 
-d '{"login_name": "George", "password": "George123"}' 
"http://localhost:8080/users"

// update 
curl -X PUT
-H "Content-Type:application/json" \ 
-d '{"id": "5", "login_name": "George", "password": "George123"}' 
"http://localhost:8080/users/3" -v

// delete
curl -X DELETE "http://localhost:8080/users/2" 

----------------------------------------------------
You can use this online site to put the commands in:
https://reqbin.com/curl
