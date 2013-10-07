resolvers ++= Seq(
  Resolver.url("kbilling-releases", url("http://kbilling.github.io/libs/ivy/releases"))(Resolver.ivyStylePatterns)
)

organization := "com.example.ninjas"

name := "kbilling-plans"

version := "0.2"

scalaVersion := "2.10.3"

libraryDependencies += "com.killingbilling" %% "kbilling-types" % "0.2"
