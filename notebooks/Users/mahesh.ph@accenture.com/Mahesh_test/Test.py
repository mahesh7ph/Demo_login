# Databricks notebook source
from pyspark.sql.types import *
spark
sc
def Test():
  mydf=sc.parallelize([('ABCD','1122'),('Arun','222'),('Loki','3333')])

  spark_schema=StructType([StructField('Name', StringType(), True),StructField('ZIP',StringType(),True)])
  
  #print(spark_schema)
  mydf=spark.createDataFrame(mydf,schema=spark_schema)
  #display(mydf)
  return mydf

  
#Test()  