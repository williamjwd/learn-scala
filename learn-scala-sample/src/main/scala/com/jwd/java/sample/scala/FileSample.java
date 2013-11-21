package com.jwd.java.sample.scala;

import java.util.Iterator;

public class FileSample {
	public static void main(String args[]) {
		Iterator<String> i = IterableWrapper(new traitchain.FileIterator("/Users/William/GitHub/learn-scala/learn-scala-sample/src/main/scala/traitchain/FileExample.scala")) ;
	}
}

