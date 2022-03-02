# SoccerStats_Java

# Product Description
This backend application will include CRUD functionality within a Spring Boot Rest API to search for players and see their corresponding statistics. 

Link to front-end connected project https://github.com/jrwalk16/Soccer_FrontEnd


# User Stories

* As a user, I want to be able to add a player to the database.
* As a user, I want to be able to update a players statistics.
* As a user, I want to be able to add a team to a players information.




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

