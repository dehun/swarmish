name := "queen"

version := "0.1"

scalaVersion := "2.12.4"

mainClass := Some("swarmish.queen.QueenMain")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test,
  "com.typesafe.akka" %% "akka-remote" % "2.5.9"
)