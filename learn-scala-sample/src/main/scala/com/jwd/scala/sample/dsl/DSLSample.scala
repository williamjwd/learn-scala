package com.jwd.scala.sample.dsl

import scala.util.parsing.combinator._

import scala.util.parsing.combinator._ 

object DSLSample extends App {
  object RepeatParser extends JavaTokenParsers { 
    var count = 0 // set by ÒnÓ

    def repeat = "repeat" ~> n <~ "times" ~ block
    def n      = wholeNumber ^^ {
      reps => count = reps.toInt
    }
    def block  = "{" ~> lines <~ "}"
    def lines  = rep(line)
    def line   = "say" ~> message ^^ {
      msg => for (i <- 1 to count) println(msg)
    }
    def message = stringLiteral 
  }

  val input = 
    """repeat 10 times {
      say "hello"
    }"""

  RepeatParser.parseAll(RepeatParser.repeat, input)
}