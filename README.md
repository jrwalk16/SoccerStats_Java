# Capstone-Project Backend

### Product Description
This backend application will include CRUD functionality within a Spring Boot Rest API to search for players and see their corresponding statistics. 

Link to front-end connected project https://github.com/jrwalk16/Soccer_FrontEnd

### Process

I wanted to create a backend application that allows a user to create, update and retrieve information about soccer players and teams. The application does not have a delete functionality since a player or team does not stop existing once they have been entered in the database.

### Things to add in the future

1. Functionality to integrate the tables in a more complex way that allows the user to track a players stats by team. So a front end user could see all the goals/assists a player has with team 1 & team 2.


### Issues Encountered
1. Had issues properly connecting my github link to heroku to deploy the project. Issues appeared to be related to the version of Java to build the application. In the future during my planning stage I will do more research about the compatability between my intended project and hosting platform/software.


### User Stories

* As a user, I want to be able to add a player to the database.
* As a user, I want to be able to update a players statistics.
* As a user, I want to be able to add a team to a players information.
* As a user, I want to be able to return one or all players.




### Entity Relationship Diagram

![Soccer](https://user-images.githubusercontent.com/77462898/156220602-c43b69ad-41e4-4e03-ba6c-f556db228284.png)


### Endpoints

| ENDPOINT                                                | FUNCTIONALITY |
|---------------------------------------------------------| :--- |
| GET /api/players/                                      | GET all players
| GET /api/players/{playerId}/                           | GET player by ID
| POST /api/players/                                     | CREATE a new player
| PUT /api/players/{playerId}/_                          | UPDATE a player by ID
| POST /api/players/{playerId}/teams/                    | CREATE a new team
| GET /api/players/{playerId}/teams/{teamId}             | GET a team by ID
| GET /api/players/{playerId}/teams/                      | GET all teams for a player


### Tools Used

![postman](https://user-images.githubusercontent.com/77462898/152444063-eaca287a-b7af-489a-b3f7-663e8eca2ad3.png)
![postgres logo](https://user-images.githubusercontent.com/77462898/152444380-ffb0ab5c-6a19-4c2a-830c-be25c418d370.png)
![SpringBoot](https://user-images.githubusercontent.com/77462898/152444031-3b6663aa-3610-48a2-bae1-9564dc10e471.png)
![intelliJ logo](https://media.git.generalassemb.ly/user/40878/files/8cd52480-851c-11ec-9421-b7c2fbc16551)


### POM Dependencies

```Java
  <dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
    </dependency>
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-entitymanager</artifactId>
        <version>6.0.0.Alpha7</version>
        <type>pom</type>
    </dependency>
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.0.0.CR1</version>
        <type>pom</type>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>2.6.3</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.4.0-b180830.0359</version>
        </dependency>
        <dependency>
        ```


 







