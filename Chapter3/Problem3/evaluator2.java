package random;

public class evaluator2 {

	public static void main(String[] args) {
		randomstack list= new randomstack();
		list.push(15);
		list.push(8);
		list.push(7);
		list.push(5);
		list.push(10);
//		list.push(20);
//		list.push(21);
//		list.push(25);
		
		System.out.println(list.peek());
		System.out.println(list.min(list.stack));
		list.pop();
		list.pop();
		System.out.println(list.peek());
		System.out.println(list.min(list.stack));
	}

}
