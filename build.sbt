name := "swarmish"

version := "0.1"

scalaVersion := "2.12.4"

lazy val root = (project in file("."))

lazy val queen = project.dependsOn(root)
lazy val hive = project.dependsOn(root)

//libraryDependencies ++= Seq(
//  "com.typesafe.akka" %% "akka-actor" % "2.4.17",
//  "com.typesafe.akka" %% "akka-remote" % "2.4.17",
//)
