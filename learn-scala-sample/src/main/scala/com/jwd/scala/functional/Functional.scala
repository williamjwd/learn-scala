package com.jwd.scala.functional

import java.io.FileWriter
import java.io.File

object Functional extends App {
	def writeAndClose(c: { def close() })(f: => Unit) {
	  try {
	    f
	  } finally {
	    c.close();
	  }
	}
	
	val writer = new FileWriter(new File("/Users/William/test.txt"));
	writeAndClose(writer) {
	  writer.write("Thinking Functionally!");
	}
}