package Practice;

public class Table {
	synchronized void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
			
	}
    class MyThread extends Thread
    {
    	Table t;
    	MyThread(Table t){
    		this.t=t;
    		
    	}
    	public void run() {
    		t.printTable(5);
    	}
    }
    class MyThread1 extends Thread{
    	Table t;
    	MyThread1(Table t){
    		this.t=t;
    		
    	}
    	public void run() {
    		t.printTable(100);
    	}
    }
    public class TestSynchronization{
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		Table obj=new Table();
		MyThread t1=new MyThread(obj);
	    MyThread1 t2=new MyThread1(obj);
	    t1.start();
	    t2.start();
        
	}

}
}