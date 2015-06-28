## Learning Neo4j - Ebook by PacktPub
-------------------------------------

####Chapter 5 : Importing Data into Neo4j
------------------------------------------

* Importing unconnected data/data structures is always simpler, than importing connected, and more so Graph Connected data, into a graph database such as Neo4j.

* Every import problem is different, just like every graph/graph problem is different. 

* There are many tools that may help us resolve the issue at hand. Importing data into a Graph DB. The key aim is to use the right tools for the right import problems(mapping of sorts).

* Importing Small Data Sets - Spreadsheets data in typically small and easy to format. This can be imported into Neo4j via 1) Format your data in Spreadsheets | 2) Generate Cypher Queries to read and & import | 3) Execute Cypher Statements in Neo4j

* We can also import data using Neo4j Shell Tools - bin/Neo4j-shell - 1) Format data into CSV | 2) Cypher Import Statements via Shell | 3) Execute commands from Neo4j Shell

* Scaling the Import Functionality - Although there are a number of things we can do to tweak the performance of the loading/importing operation; there is a limit to the transactional write performance that you will get from running a Neo4j server. Solution - Batch Importer
