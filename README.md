# spring-cloud
Spring Cloud

For mysql docker:
Download the official mysql image and run this command to build a container:
docker run --detach --name=test-mysql --env="MYSQL_ROOT_PASSWORD=your_password" --publish 3306:3306 mysql
This command it's building a container with test-mysql name, then sets the password with which you will connect to mysql, then exports the port.
