package random;

public class stacks {
	public static Object min = Integer.MAX_VALUE;
	Object data;
	stacks next;
	
	stacks(Object data, stacks next){
		this.data = data;
		this.next = next;
	}

	stacks() {
	}
}
