package com.jwd.scala.sample.functional

object Fold {
	val numbers = List(5, 15, 30, 20, 35, 45)
	
	def main(args : Array[String]) {
	  println(numbers.foldLeft(0) {(l, r) => (l + r)})
	}
}