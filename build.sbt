resolvers += Resolver.url(
  "kbilling-types releases", url("http://killingbilling.github.io/kbilling-types/releases/")
)(Resolver.ivyStylePatterns)

organization := "com.example.ninjas"

name := "kbilling-plans"

version := "0.1"

scalaVersion := "2.10.1"

libraryDependencies += "com.killingbilling" %% "kbilling-types" % "0.1"
