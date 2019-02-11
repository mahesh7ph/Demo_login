# Databricks notebook source
from pyspark.sql.types import *
spark
sc
def Test1():
  
  mydf=sc.parallelize([('MSD','1122'),('ABD','222'),('Buttler','3333')])

  spark_schema=StructType([ StructField('Name', StringType(), True),StructField('ZIP',StringType(),True)])
  #print(spark_schema)
  mydf=spark.createDataFrame(mydf,schema=spark_schema)
  return mydf
  #display(mydf)