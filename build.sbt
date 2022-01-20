name := "test-git-action"
idePackagePrefix := Some("org.apache.test")
version := "0.1"
scalaVersion := "2.11.12"

val sparkVersion = "2.2.2"

resolvers += "Hortonworks Repository" at "https://repo.hortonworks.com/content/repositories/releases/"
libraryDependencies += "com.hortonworks.shc" % "shc-core" % "1.1.0.3.1.7.5000-4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion % "provided"

assembly / assemblyJarName := "spark-hbase-" + scalaVersion + "-assembly-fatjar-1.0.jar"
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

