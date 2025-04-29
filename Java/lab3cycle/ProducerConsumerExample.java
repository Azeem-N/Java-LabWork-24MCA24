package lab3cycle;

class SharedBuffer {
	private int data;
	private boolean available = false;

public synchronized void produce(int value){
		while (available) { 
			try{
				wait();
			}catch(InterruptedException e){
	System.out.println("Producer interrupted.");
}
}
data=value;
available=true;
	System.out.println("Produced: " + data);
	notify(); 
}

	public synchronized void consume() {
		while (!available){ 
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("Consumer interrupted.");
			}
}
		System.out.println("Consumed: " + data);
		available=false;
		notify(); 
}
}
	class Producer extends Thread {
		private SharedBuffer buffer;
		public Producer(SharedBuffer buffer){
			this.buffer=buffer;
}
		public void run() {
			for(int i=1;i<=6;i++){ 
				buffer.produce(i);
				try{
					Thread.sleep(500); 
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
	class Consumer extends Thread {
		private SharedBuffer buffer;
		public Consumer(SharedBuffer buffer) {
			this.buffer = buffer;
		}
		public void run() {
			for (int i=1;i<=6;i++){ 
				buffer.consume();
				try {
					Thread.sleep(500); 
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
	public class ProducerConsumerExample {
		public static void main(String[] args) {
			SharedBuffer buffer = new SharedBuffer();
			Producer producer = new Producer(buffer);
			Consumer consumer = new Consumer(buffer);
			producer.start();
			consumer.start();
}



}
