name := "flink-example-scala"

organization := "io.jellyfish85.examples.flink"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.11"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val flinkV       = "1.3.0"
  Seq(
    "org.apache.flink" % "flink-core" % flinkV,
    "org.apache.flink" %% "flink-scala" % flinkV,
    "org.apache.flink" %% "flink-clients" % flinkV,
    "org.apache.flink" %% "flink-streaming-scala" % flinkV
  )
}
