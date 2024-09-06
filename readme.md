# Docker Assignment

## Description
Docker assignment 1 according to the assignment I have created 2 Java Spring Boot services. One is just a static service that provides a list of users and a welcome message. The second uses a MySQL database. Using the API of microservice B, we can create and read users. To deploy both the services and the database, I created a `docker-compose.yaml` file.

## Requirements
- Postman
- Docker
- Docker Compose
- Git
- Any IDE (Optional)

## Developer Instructions
To run the application, follow the instructions below:

1. Clone the repository:
   ```bash
   git clone https://github.com/Yashika1410/Docker.git
   cd Docker
   ```
2. Deploy services:
    ```bash
    docker-compose up
    ```
3. Import Docker.postman_collection.json into Postman.
4. Make requests using the Postman collection and test the service.
## To Build the Images and Deploy:
1.  Follow the steps above until `cd Docker`. After that given below steps:-
    ```bash
        cd microservice-a
        ## Build the Docker image for microservice A:
        docker build -t <Dockerhub-username>/docker-microservice-a .
        ## Build the Docker image for microservice B:
        cd ../microservice-b
        docker build -t <Dockerhub-username>/docker-microservice-b .
        ## (Optional) Push these images to your Docker Hub:
        docker login
        docker push <Dockerhub-username>/docker-microservice-a:latest
        docker push <Dockerhub-username>/docker-microservice-b:latest
    ```
2. Open docker-compose.yaml and replace my Docker Hub username with yours.
3. Run docker-compose up in the project's root directory
   

