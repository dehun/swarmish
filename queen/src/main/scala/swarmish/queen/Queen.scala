package swarmish.queen

import akka.actor.Actor
import swarmish.common.Position

object Queen {
  case class LocatePawn(position: Position)
}

class Queen extends Actor {
  override def receive = {
    case _ => ???
  }
}
