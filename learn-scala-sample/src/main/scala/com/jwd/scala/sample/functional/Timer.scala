package com.jwd.scala.sample.functional

object Timer {
	def oncePerSecond(callback: () => Unit) {
		while (true) { 
		  callback(); 
		  Thread sleep 1000 
		}
	}
	
	def timeFlies() {
		println("time flies like an arrow...")
	}
	
	def main(args: Array[String]) {
		oncePerSecond(timeFlies)
		
		// Anonymous Function
		//oncePerSecond(() => println("Anonymous: time flies like an arrow..."))
	}
}