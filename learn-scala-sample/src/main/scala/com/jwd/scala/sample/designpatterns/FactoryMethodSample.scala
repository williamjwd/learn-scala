package com.jwd.scala.sample.designpatterns

trait Currency {
	def getSymbol : String;
}

class Rupee extends Currency {
	def getSymbol = "Rs"
}

class SGDDollar extends Currency {
	def getSymbol = "SGD"
}

class USDollar extends Currency {
	def getSymbol = "USD"
}

object Currency {
  def apply(country: String) = country match {
    case "IN" => new Rupee
    case "SG" => new SGDDollar
    case "US" => new USDollar
  }
}

object FactoryMethodSample extends App {
  var currency = Currency("IN");
  System.out.println(currency.getSymbol);
		
  currency = Currency("US");
  System.out.println(currency.getSymbol);
}