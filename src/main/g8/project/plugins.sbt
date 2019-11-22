resolvers += Classpaths.sbtPluginReleases

// Workaround: coursier has an issue with sbt-native-packager
// https://github.com/coursier/coursier/issues/450
classpathTypes += "maven-plugin"

addSbtPlugin("org.scalameta" %% "sbt-scalafmt" % "2.2.1")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
addSbtPlugin("io.spray" %% "sbt-revolver" % "0.9.1")
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.5.0")
