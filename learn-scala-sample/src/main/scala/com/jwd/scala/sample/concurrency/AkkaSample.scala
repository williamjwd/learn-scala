package com.jwd.scala.sample.concurrency
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.ActorLogging

case class Greeting(who: String)

class GreetingActor extends Actor with ActorLogging {
  def receive = {
    case Greeting(who) => log.info("Hello " + who)
    case value : Int => log.info("Received a number");
    case _ => log.error("Invalid message");
  }
}

object AkkaSample extends App {
  val list = List(Greeting("Smith"), 10, Greeting("Scott"), 20, Greeting("James"), true, Greeting("John"), 1.1)
  val system = ActorSystem("MySystem")
  val greeter = system.actorOf(Props[GreetingActor], name = "greeter")
  
  list.foreach(value => {
    greeter ! value            
  });  
}
