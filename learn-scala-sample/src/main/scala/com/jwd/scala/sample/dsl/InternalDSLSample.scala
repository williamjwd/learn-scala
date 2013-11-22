package com.jwd.scala.sample.dsl

object InternalDSLSample extends App {

  class MyInt(value: Int) {
    def times() = {
      (value)
    }    
  }
  var value = ""
  
  implicit def myInt(i: Int) = new MyInt(i)

  def write(v : String) = {
	value = v
	this
  }
  
  def to (c : (Unit)) = {
    c
  }
  
  def console(times : Int) = {
    for (i <- 1 to times) {
      println(value);
    }
  }
  
  def log(times : Int) = {
    
  }
    
  write("Scala") to console(10 times)  
}