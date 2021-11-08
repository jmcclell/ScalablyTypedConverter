organization := "org.scalablytyped"
name := "material-ui"
version := "0.0-unknown-d92b16"
scalaVersion := "3.1.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "react" % "0.0-unknown-b0e5ab",
  "org.scalablytyped" %%% "std" % "0.0-unknown-8533be",
  ("com.github.japgolly.scalajs-react" %%% "core" % "1.7.5").cross(CrossVersion.for3Use2_13))
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))