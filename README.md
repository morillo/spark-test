# Spark Test Project

A simple Apache Spark application written in Scala that demonstrates basic DataFrame operations.

## Overview

This project creates a simple Spark application that:
- Creates a DataFrame with sample numeric data (1-5)
- Displays the DataFrame contents
- Runs in local mode for easy testing

## Prerequisites

- Java 17 or higher
- Apache Maven 3.6+
- Apache Spark 4.0.1 (for spark-submit)
- Scala 2.13.16

## Project Structure

```
spark-test/
├── pom.xml                           # Maven configuration
├── src/
│   └── main/
│       └── scala/
│           └── com/
│               └── example/
│                   └── spark/
│                       └── SparkTest.scala    # Main Spark application
└── target/                           # Build output (generated)
    └── spark-test-1.0-SNAPSHOT.jar   # Compiled JAR file
```

## Building the Project

```bash
mvn clean package
```

This will:
- Compile the Scala source code
- Run tests (if any)
- Create a fat JAR with all dependencies at `target/spark-test-1.0-SNAPSHOT.jar`

## Running the Application

### Option 1: Using spark-submit (Recommended)

```bash
spark-submit --class com.morillo.spark.SparkTest --master "local[2]" target/spark-test-1.0-SNAPSHOT.jar
```

### Option 2: Using Maven exec plugin

```bash
mvn exec:java
```

## Expected Output

When running successfully, you should see output similar to:

```
+------+
|number|
+------+
|     1|
|     2|
|     3|
|     4|
|     5|
+------+
```

## Dependencies

- **Apache Spark Core 4.0.1**: Core Spark functionality
- **Apache Spark SQL 4.0.1**: DataFrame and SQL operations
- **Scala Library 2.13.16**: Scala standard library

## Configuration

The application is configured to run in local mode with all available cores (`local[*]`). For production deployment, modify the master configuration in the Scala code or pass different parameters to spark-submit.

## Development

This project uses:
- **Maven** for build management
- **Scala Maven Plugin** for Scala compilation
- **Maven Shade Plugin** for creating fat JARs

## License

This project is for demonstration purposes.