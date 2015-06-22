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

* Neo4j is inherently designed for scalability - 

Page 65 of 222
