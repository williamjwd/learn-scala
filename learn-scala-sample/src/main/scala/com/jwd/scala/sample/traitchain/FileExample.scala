package com.jwd.scala.sample.traitchain

object FileExample extends App {
  new FileIterator("/Users/William/GitHub/learn-scala/learn-scala-sample/src/main/scala/traitchain/FileExample.scala").
    foreach(line => println(line))
}