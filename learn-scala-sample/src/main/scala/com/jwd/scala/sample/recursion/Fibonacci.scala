package com.jwd.scala.sample.recursion

import scala.annotation.tailrec

object Fibonacci extends App {
	def fib3( n : Int) : Unit = { 
	  @tailrec
	  def fib_tail( n: Int, a:BigInt, b:BigInt): BigInt = {
	    printf("%5d - %d\n", n, a+b);
		n match {
	  		case 1 => a+b 
	  		case _ => fib_tail( n-1, b, a+b )
	    }
	  }
	  
	  fib_tail( n, -1, 1)
	}
	
	fib3(10);
}