package com.jwd.scala.sample.patternmatch

object PatternMatching extends App {
  def multitypes(in: Any): String = in match {    
    case i:Int => "You are an int!"
    case "Alex" => "You must be Alex"
    case s:String => "I don't know who you are but I know you are a String"
    case true | false => "You are a boolean"
    case _ => "I haven't a clue who you are"    
  }  
  
  println(multitypes("Alex"));
  println(multitypes("Smith"));
  println(multitypes(true));
  println(multitypes(1));
  println(multitypes(1.1));
  
}