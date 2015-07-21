## Introduction to Big Data with Apache Spark
----------------------------------------------

##### Week 03

* Data is growing faster than computation speeds.

* Storage is getting cheaper.

* Eg: Facebook's daily logs - 60TB, Google's Web Index - 10+ PB

* Even though storage is getting significantly cheaper, the processing times + Read/Write Speeds slow down the pipeline.

* Problem : A single machine can no longer store or process all the data required for a project. Solution : Distributed Systems

* Map - Shuffle - Reduce (MR Jobs are iterative and they involve a lot of disk I/O operations for each iteration). This inturn makes the process slow. Solution : Apache SPARK

* Spark : In-Memory | Keeping more data in-memory, rather than writing to and reading from the disk each time. 

* MapReduce : HDFS -> Read1 + Processing + Write_To_Disk -> HDFS -> Read2_From_HDFS + Processing + Write_Back ...So on

* Spark : HDFS/Disk -> Read to In-memory -> Processing + Store back in In-memory -> Read from In-memory ... so on | Making this process much faster [Order of 10 - 100 times faster]

* RDDs : Resilient Distributed Datasets
