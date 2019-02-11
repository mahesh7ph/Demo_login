# Databricks notebook source
# MAGIC %run /Users/mahesh.ph@accenture.com/Mahesh_test/Test

# COMMAND ----------

# MAGIC %run /Users/mahesh.ph@accenture.com/Mahesh_test/Test1

# COMMAND ----------

from pyspark.sql.types import *
#from "/Users/mahesh.ph@accenture.com/Test" import Test
#dbutils.notebook .run("/Users/mahesh.ph@accenture.com/Mahesh_test/Test",30)

#%run '/Users/mahesh.ph@accenture.com/Mahesh_test/Test.py'

spark
sc
def UnionTest1():
  print("heloo")
  testdf=Test()
  #display(testdf)
  test1df=Test1()
  #concatinating two df
  mydf=testdf.union(test1df)
  display(mydf)
UnionTest1()  
  

# COMMAND ----------

