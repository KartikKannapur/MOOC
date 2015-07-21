## Introduction to Big Data with Apache Spark
----------------------------------------------


##### Week 04

* Spark - High Speed In-memory Analytics over Hadoop | In-memory data storage for fast Iterative Queries | Compatible with HDFS, HBase, Sequence Files etc. | General Execution Graphs

* Shark - Port of Apache Hive to run with Spark - Since Hadoop's execution engines make queries slow, SHARK is a good alternative for Spark.

* Although the MapReduce programming paradigm greatly simplified big data analysis, iterative data sharing jobs took longer to execute.

* Spark Programming Model - RDDs [Resilient Distributed Databases] | RDDs are distributed collections of objects that can be cached in-memory across cluster nodes | They are automatically rebuilt on failure.

* pySpark - Python Programming Interface to Spark | Parallel during runtime | Based on the concept of RDDs  

* A Spark Program/Application consists of 2 sub-programs - A Driver Program & A Worker Program | The Drivers Program runs on the Main/Drivers Machine & the Workers Program runs on other nodes in the cluster or local threads. | RDDs are distributed across the Workers.

* The first thing a Spark Program does, is it creates a 'SparkContext' object, which tells Spark how and where to access the cluster. | Python Programs must use constructors to create a new 'SparkContext' object. (PySpark Shell and Databricks Cloud Console will create this automatically for us) | We then use the SparkContext object to create RDDs

* The 'master' parameter for the SparkContext determines which type and size of the cluster to use - Local & Remote.

* The execution of Spark & PySpark is very verbose, with many INFO logs.

* Spark provides a Unified Platform - Streaming, ML-Lib, GraphX, Shark(Spark Hive).

* Spark is predominantly written in Scala

* Data Sources(Input file to Spark) - Local files, HDFS, Hive or any other file format that Hadoop supports.

* Spark - Easy to use, Interactive Shell

* RDDs - Resilient Distributed Datasets - Fault Tolerance | In-memory caching (Partial data caching can be done as well).

* Spark is better than Storm for Data Streaming.

* 






##### Map Reduce Quick Refresher: 

* Main purpose : Scalability - in terms of infrastructures & data, Fault tolerance system,

* Map() Reduce() Functions | Most of the time we may just need Mappers()

* Tuning MapReduce() Jobs on Hadoop is painful

* Pig & Hive internally generate multiple MapReduce() jobs.

