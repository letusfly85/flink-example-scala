name := "flink-example-scala"

organization := "io.jellyfish85.examples.flink"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.11"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val flinkVersion = "1.3.0"
  val kafkaVersion = "0.10.2"
  Seq(
    "org.apache.flink" %  "flink-core" % flinkVersion,
    "org.apache.flink" %% "flink-scala" % flinkVersion,
    "org.apache.flink" %% "flink-clients" % flinkVersion,
    "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
    "org.apache.flink" %%  "flink-connector-kafka-0.10" % flinkVersion
  )
}
