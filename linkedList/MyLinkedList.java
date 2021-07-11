// create a single linkedlist with nodes as 23, 54, 38, 40 as its date values
/**
 * MyLinkedList
 */
public class MyLinkedList {
	Student head;
	int size;

	public MyLinkedList() {
		size = 0;
	}

	public void addLast(String name, int reg) {
		Student toAdd = new Student(name, reg);
		if (head == null)
			head = toAdd;
		else {
			Student tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = toAdd;
		}
		size++;
	}

	public void addFirst(String name, int reg) {
		Student toAdd = new Student(name, reg);
		toAdd.next = head;
		head = toAdd;
		size++;
	}

	public void addPos(int pos, String name, int reg) throws Exception {

		if (pos < 0 || pos > size)
			throw new Exception("position is not valid");
		else if (pos == 0)
			addFirst(name, reg);
		else if (pos == size)
			addLast(name, reg);

		else {
			int flag = 1;

			Student toAdd = new Student(name, reg);
			Student temp = head;
			while (flag < pos) {
				temp = temp.next;
				flag++;
			}
			toAdd.next = temp.next;
			temp.next = toAdd;
			size++;
		}

	}

	public void deleteFirst() throws Exception {
		if (head == null)
			throw new Exception("No deletion in empty list");
		else {
			head = head.next;
			size--;
		}

	}

	public void deleteLast() throws Exception {
		if (head == null)
			throw new Exception("No deletion in empty list");
		else {
			Student temp = head;

			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			size--;

		}
	}

	public void deletePos(int pos) throws Exception {
		if (pos < 0 || pos >= size)
			throw new Exception("not valid position");
		if (pos == 0)
			deleteFirst();
		else if (pos == size - 1)
			deleteLast();
		else {
			int flag = 1;
			Student temp = head;
			while (flag < pos) {
				temp = temp.next;
				flag++;
			}
			temp.next = temp.next.next;
			size--;
		}
	}

	// needs debugging
	public void deleteKthLastNode(int k) {

		Student fast = head;
		Student slow = head;

		while (k >= 0) {
			fast = fast.next;
			k--;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next;

	}

	// list is sorted
	public void removeDuplicates() {
		Student currNode = head;

		while (currNode != null) {
			Student distinct = currNode.next;

			while (distinct != null && currNode.reg == distinct.reg)
				distinct = distinct.next;

			currNode.next = distinct;
			currNode = distinct;
		}
	}

	public void removeDuplicates(int k) {
		Student currNode = head;

		while (currNode != null) {
			Student distinct = currNode.next;
			int counter = 1;

			while (distinct != null && currNode.reg == distinct.reg) {
				distinct = distinct.next;
				counter++;

			}
			if (counter > k) {

				currNode.next = distinct;
				currNode = distinct;
			} else {
				currNode = currNode.next;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Student tempNode = head;
		while (tempNode != null) {
			sb.append(tempNode);
			tempNode = tempNode.next;
		}
		return sb.toString();
	}
}

class Driver2 {
	public static void main(String[] args) throws Exception {
		MyLinkedList list1 = new MyLinkedList();

		list1.addLast("one", 1);
		list1.addLast("four", 4);
		list1.addLast("five", 5);
		list1.addLast("three", 3);
		list1.addLast("one", 1);
		list1.addLast("three", 3);

		System.out.println(list1);
		listPivoting(list1.head, 3);
		System.out.println(list1);
		// System.out.println(isPalindrome(list1.head));
		// MyLinkedList list2 = new MyLinkedList();

		// list1.addLast("Ram", 1);
		// // list2.addLast("Shyam", 2);
		// list1.addLast("Hari", 3);
		// list1.addLast("anyone", 3);

		// // list2.addLast("Sita", 4);
		// list1.addLast("Bishnu", 5);
		// list1.addLast("someone", 5);
		// list1.addLast("none", 5);

		// list1.addLast("Jack", 6);
		// System.out.println(list1);
		// list1.removeDuplicates(2);
		// System.out.println(list1);

		// list1.deleteKthLastNode(1);
		// System.out.println(list1);
		// MyLinkedList mergeList = mergeTwoLinkedLists(list1, list2);
		// System.out.println(mergeList);
		// Student mergedHead = mergeRec(list1.head, list2.head);
		// Student temp = mergedHead;
		// while (temp != null) {
		// System.out.println(temp);
		// temp = temp.next;
		// }
		// Student revHead = reverse(mergeList.head);
		// Student temp = revHead;
		// while (temp != null) {
		// System.out.println(temp);
		// temp = temp.next;
		// }

	}

	public static Student mergeRec(Student A, Student B) {
		if (A == null)
			return B;
		if (B == null)
			return A;
		if (A.reg < B.reg) {
			A.next = mergeRec(A.next, B);
			return A;
		} else {
			B.next = mergeRec(A, B.next);
			return B;
		}
	}

	public static MyLinkedList mergeTwoLinkedLists(MyLinkedList list1, MyLinkedList list2) {
		MyLinkedList toReturn = new MyLinkedList();
		Student temp1 = list1.head;
		Student temp2 = list2.head;
		while (temp1 != null && temp2 != null) {
			if (temp1.reg < temp2.reg) {
				toReturn.addLast(temp1.name, temp1.reg);
				temp1 = temp1.next;
			} else {
				toReturn.addLast(temp2.name, temp2.reg);
				temp2 = temp2.next;
			}
		}
		if (temp1 != null) {

			while (temp1 != null) {
				toReturn.addLast(temp1.name, temp1.reg);
				temp1 = temp1.next;
			}
		} else if (temp2 != null) {
			while (temp2 != null) {
				toReturn.addLast(temp2.name, temp2.reg);
				temp2 = temp2.next;
			}
		}

		return toReturn;

	}

	public static Student reverse(Student head) {

		Student currNode = head;
		Student prevNode = null;
		Student nextNode = null;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
		return head;
	}

	public static boolean isPalindrome(Student head) {
		Student slow = head;
		Student fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Student revHead = reverse(slow);
		Student normalCurr = head;
		Student revCurr = revHead;

		while (normalCurr != null && revCurr != null) {
			if (normalCurr.reg != revCurr.reg)
				return false;
			normalCurr = normalCurr.next;
			revCurr = revCurr.next;
		}
		return true;
	}

	public static Student listPivoting(Student head, int x) {

		Student lessHead = new Student("", 0);
		Student equalHead = new Student("", 0);
		Student moreHead = new Student("", 0);

		Student lessIter = lessHead;
		Student equalIter = equalHead;
		Student moreIter = moreHead;

		Student iter = head;

		while (iter != null) {
			if (iter.reg < x) {
				lessIter.next = iter;
				lessIter = lessIter.next;
			} else if (iter.reg == x) {
				equalIter.next = iter;
				equalIter = equalIter.next;
			} else {
				moreIter.next = iter;
				moreIter = moreIter.next;
			}
			iter = iter.next;
		}

		moreIter.next = null;
		equalIter.next = moreHead.next;
		lessIter.next = equalHead.next;

		return lessHead.next;
	}
}

class Student {
	String name;
	int reg;
	Student next;

	public Student(String name, int reg) {
		this.name = name;
		this.reg = reg;
		this.next = null;
	}

	@Override
	public String toString() {
		return "[ " + name + ", " + reg + " ]";
	}
}

// wap to create a single linked list containing information about a student
// name and regno and display the list.