import akka.actor._
import swarmish.common.Position

object Hive {
  object Protocol {
    case class SpawnPawn(forPosition:Position)
  }
}

class Hive extends Actor {
  override def receive: Receive = {
    ???
  }
}