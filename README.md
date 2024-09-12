# Kafka download

Kafka version : 3.7.1

		  Binary downloads:
				Scala 2.12  - kafka_2.12-3.7.1.tgz
Part 1 :
----------------------------------------

command to start zookeeper
----------------------------------------
zookeeper-server-start.bat ../../config/zookeeper.properties

command to start kafka server
----------------------------------------
kafka-server-start.bat ../../config/server.properties

command to create topic
----------------------------------------
kafka-topics.bat --bootstrap-server localhost:9092 --create --topic mytopic --partitions 2 --replication-factor 1

command to Consume a message
----------------------------------------
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic first_topic

List down all available topics
----------------------------------------
kafka-topics.bat --list --bootstrap-server localhost:9092

Produce a message
----------------------------------------
kafka-console-producer.bat --broker-list localhost:9092 --topic cloud_stream_topic

Describe a topic
----------------------------------------
kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic first_topic

Increase the number of partitions
----------------------------------------
kafka-topics.bat --bootstrap-server localhost:9092 --alter --topic first_topic --partitions 5

Delete Topic
----------------------------------------
kafka-topics.bat --bootstrap-server localhost:9092 --delete --topic first_topic

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
