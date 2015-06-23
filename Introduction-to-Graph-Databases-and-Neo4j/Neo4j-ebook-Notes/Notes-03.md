## Learning Neo4j - Ebook by PacktPub
-------------------------------------

####Chapter 3 : Getting Started with Neo4j
------------------------------------------



######Neo4j - Key concepts and characteristics

* At first, Neo4j was more like a graph library, as compared to a robust Graph Database Management System as it is today.

* Neo4j is a ACID-compliant database. 

* ACID -> 1) ATOMICITY : Transactions are all or nothing (indicating that if the transaction fails, the entire transaction will be rolledback; it does not save it in parts) | 2) CONSISTENCY : Only valid data is saved (validity of the data can also be checked with a schema in place) | 3) ISOLATION : Transactions do not affect each other - (Transactions will use different instances & therefore, will remain in isolation) | 4) DURABILITY : Written data will not be lost (Persistent storage of data)

* Neo4j has an 'optional schema' structure. This is very handy because a schema-free database is incredibly useful at the beginning of the development cycle; as the project/product reaches a stable release phase - the data model can have a schema. (During the production phase, schema comes in handy, as we rely on consistency.)

* Neo4j is suitable for online transaction processing ; implying that the execition time of a query should be in order of milliseconds (timespan between a web-request & a web-response - Near real-time functionality)

* OLTP - Online Transaction Processing | OLAP - Online Analytical Processing

* Although Neo4j is typically a OTLP solution, it can also be used for OLAP tasks, albeit its slower performance. A suitable solution would be to run two different instances of Neo4j, one for OLTP & the other for OLAP; to keep them independent from one another.

* Neo4j is inherently designed for scalability (fault tolerant systems) - The clustering solution that Neo4j offers is a Master-Slave solution. Each server instance of a particular cluster will - 1) Hold the entire dataset of the database, so that any server can kick-in and respond to a query, | 2) Comply with the Master-Slave scheme - in case of any conflict in the data within the clusters/servers in the database, the Master server instance will decide which data is the correct data, to keep and persist. (In case the Master dies, the remaining members would run a 'Master Election Algorithm' & select a new Master) | 3) The Load balancer would be configured such that, particular types of queries - run on/are optimized for particular clusters (cache mechanism is also present on respective servers)

* Neo4j's clustering solution allows for - Horizontal & Vertical Scalability

* Cypher - Neo4j's declarative query language (declarative is better as compared to imperative languages)



######Typical Use Cases for Neo4j

* Complex 'Join' operations | Path finding queries - Does the path exist ? What is the most optimal way for traversal ?(lowest cost operation)



######Working with Neo4j

* Starting Neo4j - '$ bin/neo4j start'

* 'Graph as a service solution' to install Neo4j on any Cloud Service - Heroku, AWS etc. - GrapheneDB.



