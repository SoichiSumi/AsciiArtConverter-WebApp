name := """asciiart-converter-server"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"
unmanagedBase := baseDirectory.value / "lib"

//キャッシュが残るのでバージョン変更時は
// activator clean-> activator run
libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  "commons-codec" % "commons-codec" % "1.10",
  "junit" % "junit" % "4.12",
  "org.webjars" %% "webjars-play" % "2.5.0",
  filters
)
herokuAppName in Compile := "asciiart-converter"

routesGenerator:=InjectedRoutesGenerator
resolvers+="webjars" at "http://webjars.github.com/m2"

// avoid an error "your input is too long " in windows environment
import com.typesafe.sbt.packager.Keys.scriptClasspath
scriptClasspath := {
  val originalClasspath = scriptClasspath.value
  val manifest = new java.util.jar.Manifest()
  manifest.getMainAttributes().putValue("Class-Path", originalClasspath.mkString(" "))
  val classpathJar = (target in Universal).value / "lib" / "classpath.jar"
  IO.jar(Seq.empty, classpathJar, manifest)
  Seq(classpathJar.getName)
}
mappings in Universal += (((target in Universal).value / "lib" / "classpath.jar") -> "lib/classpath.jar")

//pipelineStages:= Seq(rjs, digest, gzip)

//unmanagedSourceDirectories += project.in(file(".")).dependsOn(githubRepo)

//lazy val githubRepo = uri("git://github.com/oguna/asciiart-converter-java.git")


fork in run := true