package com.jwd.scala.sample.traitsample

abstract class Bird 

trait Swimming {
    def swim() = println("I'm swimming")
}

trait Flying {
    def flyMessage: String
    def fly() = println(flyMessage)
}

class Duck extends Bird with Flying with Swimming {
    val flyMessage = "I'm a good flyer"
}

class Hawk extends Bird with Flying with Swimming {
    val flyMessage = "I'm an excellent flyer"
}

class Sparrow extends Bird with Flying {
    val flyMessage = "I'm an excellent flyer"
}

class Penguin extends Bird with Swimming

object TraitSample extends App {
  val flyingBirds = List(
    new Duck,
    new Hawk,
    new Sparrow)

  flyingBirds.foreach(bird => bird.fly())

  val swimmingBirds = List(
    new Duck,
    new Hawk,
    new Penguin)

  swimmingBirds.foreach(bird => bird.swim())
  
  val gordonsSparrow = new Sparrow with Swimming
  gordonsSparrow.swim
}