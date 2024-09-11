# Kafka download

Version - 1.1.0

		  Binary downloads:
				Scala 2.11  - kafka_2.11-1.1.0.tgz (asc, sha512)

Part 1 :
----------------------------------------

#command to start zookeeper
zookeeper-server-start.bat C:\kafka_2.11-1.1.0\config\zookeeper.properties

#command to start kafka server
kafka-server-start.bat C:\kafka_2.11-1.1.0\config\server.properties

#command to create topic
kafka-topics.bat --bootstrap-server localhost:9092 --create --topic mytopic --partitions 2 --replication-factor 3

#command to Consume a message
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first_topic

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


#List down all available topics
kafka-topics.bat --list --zookeeper localhost:2181

#Produce a message
kafka-console-producer.bat --broker-list localhost:9092 --topic cloud_stream_topic

#Consume a message
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic cloud_stream_topic





