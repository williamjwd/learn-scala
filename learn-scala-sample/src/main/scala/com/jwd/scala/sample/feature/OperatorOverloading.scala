package com.jwd.scala.sample.feature

class Complex(val r : Int, val i : Int) {
	override def toString() = r + " + " + i + "i"
	
	def +(c : Complex) = new Complex(r + c.r, i + c.i)	
}

object Test {
  def main(args: Array[String]) {
	  val c1 = new Complex(1, 2)
	  val c2 = new Complex(3, 1)

	  val c3 = c1 + c2 // c1.+(c2)
	  
	  println(c3)
	}
}

