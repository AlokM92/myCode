package alok;

public class EvenOdd implements Runnable{

	Object obj=new Object();
	int no=1;
	int remain;
	 EvenOdd(int remain) {
		this.remain=remain;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.print("inside run");
		synchronized (obj) {
			while(no<100){
			if(no%2!=remain){
				try{
					obj.wait();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
			
			System.out.print(Thread.currentThread().getName()+" "+no);
			no++;
			obj.notifyAll();	
			
		}
		}
	}
		public static void main(String args[]){
			EvenOdd o=new EvenOdd(1);
			EvenOdd e=new EvenOdd(0);
			Thread t1=new Thread(o, "Odd");
			Thread t2=new Thread(e, "Even");
			t1.start();
			t2.start();
				
				
				}
		
		
	}


