public class Circle {

	private String data;
	private Circle next;
	public static Circle start = null;

	public Circle(String data) {
		this.data = data;
		this.next = null;
	}

	public void addFirst(Circle circle) {
		this.next = circle;
		start = this;
		circle.next = start;
	}

	public void addCircle(Circle circle) {
		if (this.next == start) {
			this.next = circle;
			circle.next = start;
		} else {
			this.next.addCircle(circle);
		}
	}

	public String getData() {
		return data;
	}

	public void printListForwards() {
		if (this.next == start) {
			System.out.println(this.getData());
		} else { 
			System.out.println(this.getData());
			next.printListForwards();
		}
	}


	public boolean deleteCircle(Circle circle) {
		if (this.next.data.equals(circle.data)) {
			if (circle.data.equals(start.data)) {
				start = next.next;
				this.next = start;
				return true;
			} else {
				this.next = next.next;
				return true;
			}
		} else {
			return this.next.deleteCircle(circle);
		}
	}
			
}
