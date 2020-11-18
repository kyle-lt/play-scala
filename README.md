# Summary

This project was created from cloning the 2.6.x branch of [Play Samples](https://github.com/playframework/play-samples).

The Starter Project makes a WebClient call to the REST API when hitting the homepage (http://localhost:9000).

![Home Page](/README_Images/Play_Scala_Home_Page.png)

The API runs on http://localhost:9001/v1/posts.  You can also send a POST, see details at the [REST API project](https://github.com/playframework/play-samples/tree/2.6.x/play-scala-rest-api-example).

It returns a JSON payload, e.g.,

```json
[{"id":"1","link":"/v1/posts/1","title":"title 1","body":"blog post 1"},{"id":"2","link":"/v1/posts/2","title":"title 2","body":"blog post 2"},{"id":"3","link":"/v1/posts/3","title":"title 3","body":"blog post 3"},{"id":"4","link":"/v1/posts/4","title":"title 4","body":"blog post 4"},{"id":"5","link":"/v1/posts/5","title":"title 5","body":"blog post 5"}]
```

## Running

### Prerequisites
In order to run this project, you'll need:
- Docker
- Docker Compose

   > __Note:__  The Docker versions must support Docker Compose File version 3.4+

### Steps to Run

1. Copy the `.env_sample` file and name it `.env`. Edit the Java Agent Section

   > __Note:__  Information regarding Java Agent Config can be found [here](https://docs.appdynamics.com/display/PRO45/Java+Agent+Configuration+Properties).

```bash
# AppD Java Agent
APPDYNAMICS_AGENT_ACCOUNT_ACCESS_KEY=
APPDYNAMICS_AGENT_ACCOUNT_NAME=
APPDYNAMICS_CONTROLLER_HOST_NAME=
APPDYNAMICS_CONTROLLER_PORT=
APPDYNAMICS_CONTROLLER_SSL_ENABLED=
# App, Tier and Node names are set in docker-compose.yml individually
```

If you want to build, run `docker-compose build`

Or you can just run with the images on Docker Hub using `docker-compose up -d`

## AppD Results

### Application Flow Map

![Application Flow Map](/README_Images/Application_Flow_Map.png)

### Tiers and Nodes

![Tiers and Nodes](/README_Images/Tiers_and_Nodes.png)

### Transaction Snapshot Flow Map

### Transaction Snapshot Waterfall

### Transaction Snapshot Web Call Graph

### Transaction Snapshot Web Call Graph Exit Call

### Transaction Snapshot REST API Call Graph
