package com.jwd.scala.sample.exception

import java.io.BufferedReader
import java.io.IOException
import java.io.FileReader

object ErrorHandler {
  def errorHandler(e : IOException) = println(e)
  
  val file = "/Users/William/prince.rtf"
  val input = new BufferedReader(new FileReader(file))
try {
  try {
    for (line <- Iterator.continually(input.readLine()).takeWhile(_ != null)) {
      Console.println(line)
    }
  } finally {
    input.close()
  }
} catch {
  case e:IOException => errorHandler(e)
}

def main(args: Array[String]) {
	
  }
}