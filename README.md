A **REST** API tool for `Team` and `Player` built using Java **`SpringBoot`** and used the **`MySQL`** database to store the data with the help of Object Relational Mapping(ORM)-**`Hibernate`**

# Get Started

## Usage
This is an example of running a service locally(`localhost`) using port `9090`.
```
localhost:9090/<endpoints>
```

Here is a list of all the endpoints that you get on both the entities, the `Team` and the `Player`

- Create      
- Find by id 
- Update
- Delete
- List

## **Endpoints for Team**

**Create team** (POST)

Here, to create a team you need to place the Json object of team in the Request Editor of Postman and hit the below URL. And you will be using the `POST` method to store the team info.
```
localhost:9090/team
```
![Create Team](/src/main/resources/outputs/createdTeam.png?raw=true "Title")

**FindById Team** (GET)

With the help this endpoint you can get the specific team from the multiple teams in the Json objects.
Here you will be using the `GET` to fetch the data.

So lets fetch the data of team 2.
```
localhost:9090/team/{teamId}
```
![getTeamById](/src/main/resources/outputs/getTeamById.png?raw=true "Title")

**Update Team** (PUT)

To update the team you need to specify the `teamId` as a `pathVariable` using the PUT method.

So lets update the team 1's *location* to `Bombay` from `Mumbai`
```
localhost:9090/team/{teamId}
```
![updateTeam](/src/main/resources/outputs/updateTeam.png?raw=true "Title")


**Delete Team** (DELETE)

Let us now Delete the team 2 using the Delete method.
```
localhost:9090/team/{teamId}
```
![updateTeam](/src/main/resources/outputs/deleteTeam.png?raw=true "Title")


**List Teams** (GET)

This will get you the list of all the teams present in the database.
```
localhost:9090/teams
```
```
[
    {
        "name": "MI",
        "location": "Bombay",
        "id": 1,
        "players": [
            {
                "name": "Hardik",
                "age": 28,
                "createdAt": "2022-02-20T17:54:30.095+00:00",
                "id": 1,
                "upadatedAt": "2022-02-20T17:54:30.095+00:00"
            },
            {
                "name": "Rohit",
                "age": 29,
                "createdAt": "2022-02-20T17:08:22.994+00:00",
                "id": 2,
                "upadatedAt": "2022-02-20T17:08:22.994+00:00"
            }
        ],
        "created": null,
        "updated": "2022-02-20T17:48:56.587+00:00"
    },
    {
        "name": "KKR",
        "location": "Kolkata",
        "id": 2,
        "players": [
            {
                "name": "Shubhman",
                "age": 25,
                "createdAt": "2022-02-20T17:19:40.270+00:00",
                "id": 4,
                "upadatedAt": "2022-02-20T17:19:40.270+00:00"
            }
        ],
        "created": "2022-02-20T17:11:21.097+00:00",
        "updated": "2022-02-20T17:11:21.097+00:00"
    }
]
```

## **Endpoints for Players**
Everything remains the same as of the endpoints of team.

**Create Player** (POST)
```
localhost:9090/team/{teamId}/player
```
![Create player](/src/main/resources/outputs/Addplayer.png?raw=true "Title")


**FindById Player** (GET)
```
localhost:9090/player/{playerId}
```
![getPlayerById](/src/main/resources/outputs/getPlayerById.png?raw=true "Title")


**Update Player** (PUT)
```
localhost:9090/player/{playerId}
```
From thisendpoint you can u[date the data of the player by just giving the `playerId` as the pathVariable, by using the `PUT` method

Let's update the player 1's name and age from Hardik to Krunal. 

![update player](/src/main/resources/outputs/updatePlayer.png?raw=true "Title")

The following is the result of the above operation.

![update player](/src/main/resources/outputs/updatePlayer1.png?raw=true "Title")


**Delete Player** (DELETE)
```
localhost:9090/player/{playerId}
```
Deleteting the data of player 1 results in below output.
![Delete player](/src/main/resources/outputs/DeletePlayer.png?raw=true "Title")


**List Player** (GET)
```
localhost:9090/players
```
![List Players](/src/main/resources/outputs/getPlayers.png?raw=true "")