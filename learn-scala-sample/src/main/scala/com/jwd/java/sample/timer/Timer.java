package com.jwd.java.sample.timer;

public class Timer {
	public void oncePerSecond(CallBack cb) {
		while (true) { 
		  cb.callback(); 
		  try {
			Thread.sleep(1000);
		  } catch (InterruptedException e) {
			  e.printStackTrace();
		  } 
		}
	}
	
	public static void main(String args[]) {
		Timer timer = new Timer();
		timer.oncePerSecond(new CallBackImpl());
		/*timer.oncePerSecond(new CallBack() {

			public void callback() {
				System.out.println("Anonymous: time flies like an arrow...");
			}
			
		});
		*/
		
		
	}
}
