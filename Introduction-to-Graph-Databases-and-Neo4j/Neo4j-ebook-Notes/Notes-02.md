## Learning Neo4j - Ebook by PacktPub
-------------------------------------

####Chapter 2 : Graph Databases
-------------------------------

A comparision between traditional databases & modern-day graph databases, such as Neo4j.

######Background :

* Database - Organized collection of data.

* Databases can be broadly classified into 3 types - Navigational Databases, Relational Databases, NoSQL Databases.

* Navigational Databases - Networks or hierarchies as the basic structure of data. | Both these database systems were built based on the premise that elements in the data, would be linked by pointers (pointing from one element to another - Linked Lists of Data) | Navigational Databases eventually led the way to RDBMS.

* Relational Database Management Systems(RDBMS) - Essentially Set Operations | Birth of the Structured Query Language(SQL) | Normalization- Minimize database redundancy & Save space. -> This process involves splitting recurring data into different tables & then performing a 'join' to aggregate the data. | Although the RDBMS had/has several advantages, it also has many disadvantages(leading to a Graph Database System) - 1) As the data grows, query time increases ; 2) As the relationship between data in the various tables increases, it becomes increasingly hard to write complex join operations ; 3)RDBMS Systems impose a rigid schema(less dynamic/ on-the-go).

######NoSQL Databases :

Task Oriented Databases -> 1) Key-Value stores 2) Document Stores 3) Column-Famiy Stores 4) Graph Databases

* 1. Key Value Stores - Simplest type of NoSQL Databases | keys & values are aligned in an inherently schemaless data model | Extremely high scalablity

* 2. Document Stores - Most well known & Most used type of NoSQL Database | Semi-structured data can be stored in an unit called a 'Document' & can be retrieved in a schema-less fashion | Eg: MongoDB, CouchDB, Virtuoso

* 3. Column-Family Stores - Families of columns in a Table structure, that specify the keys | Eg: Implementations in Apache Cassandra, Hbase, Map-Reduce.


######Graph Databases

* Graph-oriented databases also fall in the NoSQL Category.

* They help manage very high complexity of data/data structure.

* Eg: Neo4j, AllegroGraph, FlockDB etc.

* Allows for more complex relationships to be built & queried.



######The Property Graph Model of Graph Databases :

* Underlying data model of Graph Databases - Property Graph Model(Essentially means that data is stored as a Graph/in a Graph - via Nodes & Relationships)

* Key Features - No rigid schema i.e schema-less | Easy to deal with semi-structured data | Relationships are explicit(They are not obscure or estb. at query time with a join operation) | Relationships can have properties too(Poles apart from the RDBMS world)

* Node Labels - Way to semantically catergorize/bundle nodes in a graph. | This helps us create sub-graphs | 

* Chosing a Graph database depends on the chracteristics of the dataset in hand & the query patters being used to extract information out of the database.

* Join operations on a RDBMS are analogous to Traversals in a Graph Database.

* One of the key performance characteristics of the graph database is - as soon as you "grab" a starting node, the database will only explore the vicinity of that starting node and will be completely oblivious to anything that is not connected to the starting node.

* ETL - Extract, Transfer & Load

* Use cases for which Graph Databases are not the best option - 1) Large data with 'set' oriented queries - A traditional RDBMS structure is the best fit| 2) Simple queries with read-write patterns, aggregation etc would be best suited for a key-value store or a document store.
