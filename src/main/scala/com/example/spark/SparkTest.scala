package com.example.spark

import org.apache.spark.sql.SparkSession

object SparkTest {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark Test")
      .master("local[*]")
      .getOrCreate()
    
    import spark.implicits._
    
    val data = Seq(1, 2, 3, 4, 5)
    val df = data.toDF("number")
    df.show()
    
    spark.stop()
  }
}
