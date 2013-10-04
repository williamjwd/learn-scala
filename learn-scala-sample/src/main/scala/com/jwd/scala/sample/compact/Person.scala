package com.jwd.scala.sample.compact

class Person (var name : String, val age : Int)

object Test {
  def print(people : Array[Person]) = people.map(p => println("Name: " + p.name + "; Age: " + p.age))
	
  def printLine() = println("------------------------------")
	
  def main(args: Array[String]) {
	val people = Array(new Person("Scott", 30), new Person("Lynn", 25), new Person("Smith", 15), new Person("Linda", 10))
	val (minors, adults) = people partition (_.age < 18)
	
	print(minors);
	printLine();
	print(adults);
	
  }
}