package com.jwd.java.sample.designpatterns;

interface Currency {
	public String getSymbol();
}

class Rupee implements Currency {
	public String getSymbol() {
		return "Rs";
	}
}

class SGDDollar implements Currency {
	public String getSymbol() {
		return "SGD";
	}
}

class USDollar implements Currency {
	public String getSymbol() {
		return "USD";
	}
}

class CurrencyFactory {

	public static Currency createCurrency(String country) {
		if (country.equalsIgnoreCase("IN")) {
			return new Rupee();
		} else if (country.equalsIgnoreCase("SG")) {
			return new SGDDollar();
		} else if (country.equalsIgnoreCase("US")) {
			return new USDollar();
		}
		throw new IllegalArgumentException("No such currency");
	}
}

public class FactoryMethodSample {
	public static void main(String args[]) {		
		Currency currency = CurrencyFactory.createCurrency("IN");
		System.out.println(currency.getSymbol());
		
		currency = CurrencyFactory.createCurrency("US");
		System.out.println(currency.getSymbol());
	}
}
