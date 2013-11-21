package com.jwd.scala.sample.xml

object TestXML extends App {
  val leaves = List(new LeafTag("Leaf1", "skuNo"),
    			new LeafTag("Leaf2", "description"),
  				new LeafTag("Leaf3", "price"))
  
	val p = new ParentTag("Root")
  
	p.addParent(new ParentTag("Element1"))
	  .addLeaves(leaves)
	  
	p.addParent(new ParentTag("Element2"))
	  .addLeaves(leaves)
	  
	p.addParent(new ParentTag("Element3"))
	  .addLeaves(leaves)
	
	p.print(System.out, 0);
}