package traitchain

import scala.collection.immutable.List
import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
    def get(): Int
    def put(x: Int)
    def getAll
}

class BasicIntQueue extends IntQueue {
    private val buf = new ArrayBuffer[Int]
    def get() = buf.remove(0)
    def put(x: Int) { buf.append(x) }
    def getAll {
      buf.foreach(x => println(x));
    }
  }

trait EvenFiltering extends IntQueue {
  abstract override def put(x: Int) { 
    if (x % 2 == 0) super.put(x); 
  }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { 
    super.put(2 * x); 
  }
}

object TraitChain extends App {
	val queue = new BasicIntQueue with Doubling with EvenFiltering 
	queue.put(5)
	queue.put(6)
	queue.put(8)
	queue.getAll	
}