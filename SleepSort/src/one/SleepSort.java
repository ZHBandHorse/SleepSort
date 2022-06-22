package one;

import java.util.Arrays;

public class SleepSort {

	public static void main(String[] args) {
		int[] arr = {5,22,10,7,59,3,16,4,11,8,14,24,27,25,26,28,23,99};
        for (int i = 0; i < arr.length; i++) {
			
			new MyRunable(arr[i]).start();
			
		}
	}
	
	static class MyRunable extends Thread{
		int time;
		public MyRunable(int time) {
			this.time = time;
		}
		public MyRunable() {
			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(time*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(time+",");
		}
		
		
	}
}
