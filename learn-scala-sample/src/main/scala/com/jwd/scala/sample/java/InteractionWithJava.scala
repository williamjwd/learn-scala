package com.jwd.scala.sample.java

import java.util.Calendar

object InteractionWithJava {
	def main(args: Array[String]) {
		val now = Calendar.getInstance().getTime();
		println(now);	
	}
}