package traitchain

import scala.collection.Iterable
import java.io.FileReader
import java.io.BufferedReader

class FileIterator(name : String) extends Iterable[String] {
  val reader = new FileReader(name)
  val bufferedReader = new BufferedReader(reader);
  
  override def iterator = new Iterator[String]() {
    var line = bufferedReader.readLine()
    
    override def hasNext() : Boolean = { (line != null) }
    
    override def next() = {
      var temp = line
      line = bufferedReader.readLine()
      temp
    }
  }
}