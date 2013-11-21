package com.jwd.scala.sample.xml

trait Tag extends Print {
  val name: String;
  def isLeaf : Boolean
  
  def toXML : String
}