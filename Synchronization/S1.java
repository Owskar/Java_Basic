class Table {
	public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e1) {
				System.out.println(e1);
			}

			System.out.println(n * i);
		}
	}
}

class myThread1 extends Thread {

	Table t;

	myThread1(Table t) {

		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class myThread2 extends Thread {
	Table t;

	myThread2(Table t) {
		this.t = t;

	}

	public void run() {
		t.printTable(7);
	}
}

class S1 {
	public static void main(String args[]) {
		Table b = new Table();
		myThread1 t1 = new myThread1(b);
		myThread2 t2 = new myThread2(b);

		t1.start();
		t2.start();

	}
}