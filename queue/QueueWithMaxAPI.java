import java.util.Deque;
import java.util.LinkedList;

public class QueueWithMaxAPI {
	Deque<Integer> queue = new LinkedList<>();
	Deque<Integer> maxKeeper = new LinkedList<>();


	public  void enqueue(int data) {
		queue.add(data);

		while(!maxKeeper.isEmpty()) {
			if(maxKeeper.getLast().compareTo(data) >= 0) break;

			maxKeeper.removeLast();
		}

		maxKeeper.addLast(data);
	}

	public int deque() throws Exception {
		if(!queue.isEmpty()) {
			int res = queue.remove();
			if(res == maxKeeper.getFirst()) {
				maxKeeper.removeFirst();
			}
			return res;
		}

		throw new Exception("empty");
	}




















public static void main(String[] args) {
	
}

}