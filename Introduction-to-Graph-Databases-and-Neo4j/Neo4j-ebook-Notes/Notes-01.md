## Learning Neo4j - Ebook by PacktPub
-------------------------------------

####Chapter 1 : Graphs & Graph Theory
---------------------------------

Requirements : Neo4j Community Edition, Java7 or above

######Graphs :

* Invented by Leonhard Euler, while he was trying to solve the '7 bridges of Konigsberg' problem. (Pathfinding Operation)

* A graph is a mathematical representation of two or more entities, connected by a relationship.

* Eg : Social Networks - Facebook, Google+ etc, LinkedIn(Professional Network), PayPal/ebay - Financial Network, Google - Page Rank Algo - Search Engines (Knowledge Graph)

######Components of a Graph :

* Nodes - a.k.a Vertices; representing objects/entities.

* Links - a.k.a Relationships or edges; connection between Nodes.
[Number of edges connected to a Node - Degree of that Node]



######Graph Theory :

* The study of Graph Models & Algorithms. Eg: Social Networks, Biological Studies, Computer Science - Graph Computing Engines, Coding - If a change is made to one 'object' in the code, how much of would it affect(dependency analysis algorithms), Flow/Routing Problems, Google's Page Rank Algorithm.


* Traditional RDBMS Example - NorthWind Case Study : The Foreign Keys help us connect/join data between tables.

* To Convert a RDBMS Architecture into a Graph Architecture - 1) Data Transfer - Export all data as CSV & then import CSVs into Neo4j | 2) Primary/Foreign Keys in a table are converted into the names of a table | 3) The 'join' operation, between Foreign Keys are converted into Relationships with some data properties.
