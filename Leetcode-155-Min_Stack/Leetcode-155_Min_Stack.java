import java.util.*;

class Untitled {
	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(0);
		obj.push(1);
		obj.push(0);
		int min = obj.getMin();
		System.out.println(min);
		obj.pop();
//		obj.top();
		min = obj.getMin();
		System.out.println(min);
		
	}
}

class MinStack {
	Stack<Integer> minstack;
	LinkedList<Integer> minVal;
	
	
	public MinStack() {
		minstack = new Stack<Integer>();
		minVal = new LinkedList<Integer>();
	}
	
	public void push(int val) {
		minstack.push(val);
		if (minVal.isEmpty()){
			minVal.add(val);
		} else {
			int top = minVal.getLast();
			if (val <= top){
				minVal.add(val);
			} else if (minVal.contains(val)){
				int pos = minVal.indexOf(val);
				minVal.add(pos, val);
			}
		}
	}
	
	public void pop() {
		if (!minstack.isEmpty()){
			Integer	 remove = minstack.pop();
			if (minVal.contains(remove)){
				minVal.remove(remove);
			}
		}

	}
	
	public int top() {
		return minstack.peek();
	}
	
	public int getMin() {
		return minVal.getLast();
	}
}
