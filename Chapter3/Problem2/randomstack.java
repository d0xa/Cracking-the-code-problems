package random;

public class randomstack {
	stacks stack = new stacks();
	public void push(Object var) {
		stack = new stacks(var, stack);
	}
	public Object pop() {
		stacks temp = stack;
		stack = stack.next;
		stack.min = Integer.MAX_VALUE;
		return temp.data;
	}
	public Object min(stacks stack) {
		if(stack.next == null)
			return stacks.min;
		else {
			if((int)stack.data < (int)stacks.min) {
				stacks.min = stack.data;
			}
			return min(stack.next);
		}
	}
	public stacks popAll() {
		return null;
	}
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Trying to peek at empty stack");
			return null;
		}
		return stack.data;
	}

	public int size() {
		int size = 0;
		if(isEmpty())
			return 0;
		else {
			while(!isEmpty()) {
				size++;
				stack = stack.next;
			}
			return size;
		}
	}
	public boolean isEmpty() {
		return (stack == null);
	}
}

