package $package$

import akka.actor.ActorSystem

object Main extends App {
  private implicit val system = ActorSystem()
}
