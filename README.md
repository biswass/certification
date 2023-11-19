Dockerization :

mvn clean package 
java -jar .\target\certification-0.0.1-SNAPSHOT.jar
docker run -p8887:8084 certification:latest			// You can access the insurance service on http://localhost:8888/health
docker tag certification:latest <yourDockerId>/certification:latest
docker push <yourDockerId>/certification:latest		// You should be logged into docker with your dockerId <yourDockerId>

// Now anyone can pull your docker image above