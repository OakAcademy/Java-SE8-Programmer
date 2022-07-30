package collectionsexample;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		
		Deque<String> animalsDeque = new LinkedList<>();
		
		animalsDeque.add("Dog");
		animalsDeque.add("Cat");
		animalsDeque.addFirst("Bird");
		animalsDeque.addLast("Lion");
		animalsDeque.push("Monkey");
		animalsDeque.offer("Cow");
		animalsDeque.offerFirst("Horse");
		animalsDeque.offerLast("Sheep");
		
		System.out.println("animalsDeque: " + animalsDeque);
		
		System.out.println("Deleted element: " + animalsDeque.removeFirst());
		
		System.out.println("animalsDeque: " + animalsDeque);
		
		System.out.println("Deleted element: " + animalsDeque.removeLast());
		
		System.out.println("animalsDeque: " + animalsDeque);

	}

}
