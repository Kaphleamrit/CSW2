import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestStar {

	static class Star implements Comparable<Star> {
		int x;
		int y;
		int z;

		public Star(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public double distance() {
			return Math.sqrt(x * x + y * y + z * z);
		}

		@Override
		public int compareTo(KClosestStar.Star o) {
			return this.distance() > o.distance() ? -1 : this.distance() < o.distance() ? 1 : 0;
		}

		@Override
		public String toString() {
			return "( " + x + ", " + y + ", " + z + " )";
		}
	}

	static List<Star> getKClosed(List<Star> list, int k) {
		PriorityQueue<Star> pq = new PriorityQueue<Star>(k);

		for (int i = 0; i < list.size(); i++) {
			pq.add(list.get(i));

			if (pq.size() > k)
				pq.poll();
		}

		return new ArrayList<Star>(pq);

	}

	public static void main(String[] args) {
		Star star1 = new Star(0, 1, 3);
		Star star2 = new Star(0, 99, 3);
		Star star3 = new Star(0, 1, 13);
		Star star4 = new Star(0, 1, 1);
		Star star5 = new Star(0, 1, 5);
		Star star6 = new Star(0, 11, 3);
		Star star7 = new Star(0, 1, 39);

		List<Star> list = new ArrayList<>(Arrays.asList(star1, star2, star3, star4, star5, star6, star7));

		System.out.println(getKClosed(list, 3));

	}
}
