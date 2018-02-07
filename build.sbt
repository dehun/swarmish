name := "swarmish"

version := "0.1"

scalaVersion := "2.12.4"

lazy val common = project
lazy val queen = project.dependsOn(common)
lazy val hive = project.dependsOn(common)

lazy val root = (project in file(".")).aggregate(common, queen, hive)



libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test,
  "com.typesafe.akka" %% "akka-remote" % "2.5.9"
)
