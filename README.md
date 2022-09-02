# Kafka download

Version - 1.1.0

		  Binary downloads:
				Scala 2.11  - kafka_2.11-1.1.0.tgz (asc, sha512)

Part 1 :
----------------------------------------

#command to start zookeeper

zookeeper-server-start.bat C:\kafka_2.11-1.1.0\config\zookeeper.properties

#path

C:\kafka_2.11-1.1.0\bin\windows>zookeeper-server-start.bat C:\kafka_2.11-1.1.0\config\zookeeper.properties

#command to start kafka server

kafka-server-start.bat C:\kafka_2.11-1.1.0\config\server.properties

#path

C:\kafka_2.11-1.1.0\bin\windows>kafka-server-start.bat C:\kafka_2.11-1.1.0\config\server.properties

#command to create topic

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic first_topic

#path

C:\kafka_2.11-1.1.0\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic first_topic

#command to Consume a message

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first_topic

#path

C:\kafka_2.11-1.1.0\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first_topic

Part 2 :
----------------------------------------

1.start zookeeper

2.start kafka server

3.start kafka-publisher java project

4.start kafak-consumer java project

GET : localhost:8080/consumeStringMessage

GET : localhost:9091/publishJson

GET : localhost:8080/consumeStringMessage

GET : localhost:8080/consumeJsonMessage

Part 3 :
------------------------------------------

1.Create spring-cloud-stream-publisher spring project.
	
	cloud stream messaging
	kafka
	web
	lombok
	
2.Create spring-cloud-stream-consumer spring project.
	
	cloud stream messaging
	kafka
	lombok


#start zookeeper

zookeeper-server-start.bat C:\kafka_2.11-1.1.0\config\zookeeper.properties

C:\kafka_2.11-1.1.0\bin\windows>zookeeper-server-start.bat C:\kafka_2.11-1.1.0\config\zookeeper.properties

#start kafka server

kafka-server-start.bat C:\kafka_2.11-1.1.0\config\server.properties

C:\kafka_2.11-1.1.0\bin\windows>kafka-server-start.bat C:\kafka_2.11-1.1.0\config\server.properties

#List down all available topics

kafka-topics.bat --list --zookeeper localhost:2181

C:\kafka_2.11-1.1.0\bin\windows>kafka-topics.bat --list --zookeeper localhost:2181

#create topic

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic cloud_stream_topic

C:\kafka_2.11-1.1.0\bin\windows>kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic cloud_stream_topic

#Produce a message

kafka-console-producer.bat --broker-list localhost:9092 --topic cloud_stream_topic

#Consume a message

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic cloud_stream_topic

C:\kafka_2.11-1.1.0\bin\windows>kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic cloud_stream_topic



