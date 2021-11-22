enablePlugins(ScalaJSPlugin)

name := "scalajs command line template"
scalaVersion := "2.13.1" // or any other Scala version >= 2.11.12

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// for use npm commonjs modules
scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }