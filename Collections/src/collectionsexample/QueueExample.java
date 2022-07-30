package collectionsexample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> animalsQueue = new LinkedList<>();
		
		animalsQueue.add("Dog");//throws an error
		animalsQueue.offer("Cat");//return null
		animalsQueue.offer("Cow");
		animalsQueue.offer("Lion");
		animalsQueue.offer("Monkey");
		
		System.out.println("animalsQueue: " + animalsQueue);
		System.out.println("size of animalsQueue: " + animalsQueue.size());
		System.out.println("The first element: " + animalsQueue.element());//throws an error
		System.out.println("The first element: " + animalsQueue.peek());//return null
		//System.out.println("Removed element: " + animalsQueue.remove());
		
		System.out.println("animalsQueue: " + animalsQueue);
		
		while(!animalsQueue.isEmpty()) {
			
			System.out.println("Deleted element: " + animalsQueue.poll());
			
		}
		
		System.out.println("animalsQueue: " + animalsQueue);
		
		//System.out.println("The first element: " + animalsQueue.element());
		
		System.out.println("Removed element: " + animalsQueue.poll());

	}

}
