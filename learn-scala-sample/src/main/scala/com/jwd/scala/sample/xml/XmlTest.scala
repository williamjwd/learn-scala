package com.jwd.scala.sample.xml;

import scala.util.parsing.json.JSON

object XmlTest {
  def main(args: Array[String]) {
	
    val data = 
	  <shopping>
			<item name="bread" quantity="3" price="2.50"/>
			<item name="milk" quantity="2" price="3.50"/>
		</shopping>
	
	
	
	
	val res =  
		for (
		    item <- data \ "item";
		    price = (item \ "@price").text.toDouble;
		    qty = (item \ "@quantity").text.toInt)
		  yield (price * qty)
		
	
	printf("$%.2f\n", res.sum);
  }
}