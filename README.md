# Kafka download

Version - 1.1.0

		  Binary downloads:
				Scala 2.11  - kafka_2.11-1.1.0.tgz (asc, sha512)
 
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

