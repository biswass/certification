Downloading and running :
git clone https://github.com/biswass/certification.git
cd <to the directory>
mvn clean compile
Set JAVAPATH to your jdk directory eg : C:\Program Files\Java\jdk-1.8
Add jdk/bin folder to your PATH variable eg : C:\Program Files\Java\jdk-1.8
Download Eclipse or any other IDE and setup maven
Import this sourcecode as maven project
Right Click on project > Maven > Update project
Go to IAM Application.java > Right click > Run as > Java application
Hit localhost:8084/health

Dockerization :

mvn clean package 
java -jar .\target\certification-0.0.1-SNAPSHOT.jar
docker run -p8887:8084 certification:latest			// You can access the insurance service on http://localhost:8888/health
docker tag certification:latest <yourDockerId>/certification:latest
docker push <yourDockerId>/certification:latest		// You should be logged into docker with your dockerId <yourDockerId>

// Now anyone can pull your docker image above