package com.project.simple

import cats.effect._
import org.http4s._
import org.http4s.dsl.io._
import org.http4s.blaze.server._
import org.http4s.implicits._

import scala.concurrent.ExecutionContext.global

object Main extends IOApp {
  val helloWorldService = HttpRoutes
    .of[IO] {
      case GET -> Root / "hello" / name =>
        Ok(s"Hello, $name.")
    }
    .orNotFound

  def run(args: List[String]): IO[ExitCode] =
    BlazeServerBuilder[IO](global)
      .bindHttp(8080, "localhost")
      .withHttpApp(helloWorldService)
      .serve
      .compile
      .drain
      .as(ExitCode.Success)
}
