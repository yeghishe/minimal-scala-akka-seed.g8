minimal-scala-akka-seed.g8
=========================

## To create a new project run

```
sbt new yeghishe/minimal-scala-akka-seed.g8
```

## Overview
The project is intended to be used as an activator template to generate akka projects.
From the command line, you can execute `activator new <YOUR PROJECT NAME> minimal-scala-akka-seed` to generate a project. From activator UI find the template named `minimal-scala-akka-seed` and generate your project using it.

Once the project is generated you get few things out of the box:
* [Config](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Config.scala) is handled using [Ficus](https://github.com/ceedubs/ficus). Make sure to create your case classes for new config values you add in typesafe config. You can later mix in `Config` trait or import your values from `Config` object.
* The project comes with [Cats](http://typelevel.org/cats/) library also.
* The project uses [ScalaTest](http://www.scalatest.org/) for unit testing.
* [Scalafmt](https://github.com/olafurpg/scalafmt) is being used for code formatting.
* [Scalastyle](http://www.scalastyle.org/) is being used fro code style checking.
* [Scoverage](https://github.com/scoverage/sbt-scoverage) is being used for code coverage .
* [Sbt Revolve](https://github.com/spray/sbt-revolver) is being used for local development.
* [Sbt native packager](https://github.com/sbt/sbt-native-packager) is being used  for packaging and deployment.

