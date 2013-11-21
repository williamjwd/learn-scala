package com.jwd.scala.sample.xml

import java.io.PrintStream

class LeafTag(override val name : String, val columnName : String) extends Tag {
  def isLeaf = true
  
  def toXML : String = {
    "<" + name + ">" + columnName + "</" + name + ">"
  }
  
  override def print(ps : PrintStream, level : Int) = {
    Print(ps, level)
    ps.print(toXML)
  }
}