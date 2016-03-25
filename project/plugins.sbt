// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.6")

// Web plugins
addSbtPlugin("com.typesafe.sbt" % "sbt-coffeescript" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-jshint" % "1.0.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-rjs" % "1.0.7")
addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-mocha" % "1.1.0")
addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.2")

// Play enhancer - this automatically generates getters/setters for public fields
// and rewrites accessors of these fields to use the getters/setters. Remove this
// plugin if you prefer not to have this feature, or disable on a per project
// basis using disablePlugins(PlayEnhancer) in your build.sbt
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.1.0")

// Play Ebean support, to enable, uncomment this line, and enable in your build.sbt using
// enablePlugins(PlayEbean).
// addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "1.0.0")
addSbtPlugin("com.heroku" % "sbt-heroku" % "0.5.1")
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
//resolvers+= "our Libraries" at "https://github.com/oguna/asciiart-converter-java/"

//sbt-github-repo
/*resolvers ++= Seq(
  "jgit-repo" at "http://download.eclipse.org/jgit/maven",
  "hexx-releases" at "http://hexx.github.io/maven/releases"
)

addSbtPlugin("com.github.hexx" % "sbt-github-repo" % "0.1.0")*/