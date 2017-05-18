name := "$name$"
organization := "$organization$"
version := "0.0.1"
scalaVersion := "$scala_version$"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val catsV          = "$cats_version$"
  val akkaV          = "$akka_version$"
  val ficusV         = "$ficus_version$"
  val scalaMockV     = "$scala_mock_version$"
  val catsScalatestV = "$cats_scalatest_version$"

  Seq(
    "org.typelevel"     %% "cats-core"                   % catsV,
    "com.iheart"        %% "ficus"                       % ficusV,
    "com.typesafe.akka" %% "akka-actor"                  % akkaV,
    "org.scalamock"     %% "scalamock-scalatest-support" % scalaMockV % "it,test",
    "com.ironcorelabs"  %% "cats-scalatest"              % catsScalatestV % "it,test",
    "com.typesafe.akka" %% "akka-testkit"                % akkaV % "it,test"
  )
}

lazy val root = project.in(file(".")).configs(IntegrationTest)
Defaults.itSettings
Revolver.settings
enablePlugins(JavaAppPackaging)

initialCommands := """
import cats._
import cats.data._
import cats.implicits._
import akka.actor._
import akka.pattern._
import akka.util._
import scala.concurrent._
import scala.concurrent.duration._
""".stripMargin
