package com.jwd.scala.sample.concurrency

object ParallelProcessing extends App {
	def process(value : Int) = {
	  println("START : " + value);
	  println("CALCULATED : " + (value * value));
	  println("DONE : " + value);
	}
	
	val list = (1 to 10).toList
	
	println("Started processing...");
	
	list.par.foreach(value => process(value));
	
	println("Done processing...");
}