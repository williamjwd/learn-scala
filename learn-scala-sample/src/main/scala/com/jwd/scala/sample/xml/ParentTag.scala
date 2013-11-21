package com.jwd.scala.sample.xml

import scala.collection.immutable.List
import java.io.PrintStream

class ParentTag(val name : String) extends Tag {
  def isLeaf = false
  
  var children = List[Tag]()
  
  def addParent(parent : ParentTag) : ParentTag = {
	 children ::= parent
	 parent
  }
  
  def addParents(parents : List[ParentTag]) : Unit = {
	  children :::= parents
  }
  
  def addLeaf(leaf : LeafTag) : LeafTag = {
	 children ::= leaf
	 leaf
  }
  
  def addLeaves(leaves : List[LeafTag]) : Unit = {
    children :::= leaves
  }
  
  def toXML : String = {
    "\n<" + name + ">" + children.foldLeft("\t"){(child1, child2) => (child1 + child2.toXML)} + "\n</" + name + ">"
  }
  
  def print(ps : PrintStream, level : Int) {
    Print(ps, level)
    ps.print("<" + name + ">");
    children.foreach(child => child.print(ps, level + 1))
    Print(ps, level)
    ps.print("</" + name + ">");
  }
}