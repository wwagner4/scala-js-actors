import ScalaJSKeys._

scalaJSSettings

name := "Scala.js actors"

libraryDependencies += "org.scalajs" %%% "scalajs-pickling" % "0.3.1"

libraryDependencies += "org.scala-lang.modules.scalajs" %% "scalajs-test-bridge" % scalaJSVersion % "test"

scalaJSTestFramework in Test := "org.scalajs.actors.test.ActorsTestFramework"
