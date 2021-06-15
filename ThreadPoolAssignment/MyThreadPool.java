import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyThreadPool implements ThreadPoolExecutorService,Runnable {
	int n,f;
    Queue<Runnable> queue;
	public MyThreadPool(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
		f=0;
		queue = new LinkedList<Runnable>();
		MyExecutor ob = new MyExecutor();
	}

	public MyThreadPool() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void myExecute(Runnable obj) {
		// TODO Auto-generated method stub
		queue.add(obj);
		if(f<n)
		{
			f++;
			Thread th = new Thread(new MyThreadPool());
			th.start();
			
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		while(true)
		{
			if(queue.size()!=0)
				queue.poll().run();
		}}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
	}

}
