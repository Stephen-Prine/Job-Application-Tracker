# Job-Application-Tracker
Provides a form for entries of Companies that I've applied for. Keeps track of Company Name, date applied, a link to either the job posting/ company website, and some key notes. It then adds them to my MySQL database and displays a list of all the entries. I know there's going to unfortunately be a lot of entries ;[
                
## This is the back end portion of the Job-Application-Tracker application repository  
There are two repositories for this little project. This is the Spring Boot application for the backend to make REST api calls to the data base for the react front end.
* In Spring Boot I created the the entity for the the table that will store the entries from the front end.
* Created the Repository and Service layers to communicate with the database using Spring-data-JPA and MySQL-Driver. 
* Used Lombok dependency for the boilerplate code. 
* Built the controller for all the CRUD operations calls from the front end required for the application.  

# Video Demo Inside the job-application-tracker-ui Repository 
