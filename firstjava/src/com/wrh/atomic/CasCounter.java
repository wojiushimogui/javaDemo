package com.wrh.atomic;

public class CasCounter {
	
	private SimulatedCAS simulatedCAS = null;
	public int getValue(){
		return simulatedCAS.getValue();
	}

	public int increment(){
		int oldValue = simulatedCAS.getValue();
		while(!simulatedCAS.compareAndSwap(oldValue, oldValue+1))
			oldValue = simulatedCAS.getValue();
		return oldValue;
	}

	public CasCounter(SimulatedCAS cas){
		this.simulatedCAS = cas;
	}

	public static void main(String[] args) throws InterruptedException {
			CasCounter counter = new CasCounter(new SimulatedCAS());
			Thread[] ts = new Thread[10000];
			for(int i = 0; i <10000; i++){
				ts[i] = new CounterThread(counter);

			}
			for(Thread t : ts){
				t.start();
			}

			for(Thread t : ts){
				t.join();
			}

			System.out.println("counter: "+ counter.getValue());
	}
}

class CounterThread extends Thread {
	CasCounter counter = null;

	public CounterThread(CasCounter counter) {

		this.counter = counter;
	}

	@Override
	public void run() {
		counter.increment();
	}
}

class SimulatedCAS {

	private volatile int value = 0;
	public synchronized int getValue(){
		return value;

	}
	public synchronized boolean compareAndSwap(int expectedValue, int newValue){
		if(value == expectedValue){
			value = newValue;
			return true;
		}			
		return false;
	}
}
