## Learning Neo4j - Ebook by PacktPub
-------------------------------------

####Chapter 4 : Modelling Data for Neo4j
------------------------------------------


######Data Constructs 

* The underlying data structure/data model of Neo4j - 'Property Graph', is flexible enough to support a myraid of real world datasets.

* Nodes : Entities

* Relationships : Connection between Nodes in a Graph. Join, unlike in RDBMS, are no longer a query-time operation. They are traversals through the graph(from node-to-node). Relationships always have a 'start node' & a 'end node' and a direction between the nodes. They can be self-referencing, but never dangling.

* Properties : Both Nodes & Relationships can have properties, in the form of name:value pairs.

* Lables : Creation of sub-graphs. Labels can be used for indexing, graph sharding etc.



######Graph Modelling

* Index Lookups are similar to searching for a key-value pair.

* There is no single perfect way to model a graph database (Use case specific) | We may also want to make multiple iterations over a graph model before it reaches a stable stage, this is directly dependent on the nature of queries we are running.

* Good Practice : Multiple relationships between two nodes for different use case scenarios. (The advantage here is that, there is no additinal table/schema to be created or modified - it is only the traversal that changes)

* Graph Modelling Pattern - 'Granulate Pattern'. Granulated pattern indicating that data can be split down further in the database (Ref: Normalization in a database).

* [Concept - Data Normalization & De-normalization in a Database]

* Graph Indexing - Handy when we are querying for specific patterns - range queries, time series etc. (Could be a Tree structure)

* Common Pitfalls - 1) Using properties/property definitions that are very verbose. Suggestion - Splitting the properties into seperate nodes and connecting them using a relationship. | 2) Multiple property definitions eing defined for the same node. Suggestion - Split the properties into seperate nodes via some clustering(similar concepts in the same node) | 3) Unconnected or dangling graphs. | 4) When nodes in a graph are extremely dense i.e have multiple connections or are connected to multiple nodes. In such cases the traversal algo should evaluate all possible relationships and this process may be time consuming. Such cases should generally be avoided in a graph database. A possible solution to this problem is to fan-out & have indirect connections to the actual node, by creating dummy nodes in-between which contain some meta-data.
