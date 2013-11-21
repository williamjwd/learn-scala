package com.jwd.scala.sample.xml

import java.io.PrintStream

trait Print {
  def print(ps : PrintStream, level : Int)
}

object Print {
  def apply(ps : PrintStream, level : Int) {
    ps.print("\n")
    for (i <- 1 to level) ps.print("    ")
  }
}