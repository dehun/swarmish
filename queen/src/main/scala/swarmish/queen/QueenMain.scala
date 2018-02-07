package swarmish.queen

import akka.actor.{ActorSystem, Props}

object QueenMain {
  def main(args: Array[String]): Unit = {
    val system = ActorSystem()
    system.actorOf(Props[Queen])
    Console.println("queen starting up")
  }
}
