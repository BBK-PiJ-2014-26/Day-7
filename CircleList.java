public class CircleList {

	public static void main(String[] args) {

		Circle circle1 = new Circle("first"); 
		Circle circle2 = new Circle("second"); 
		circle1.addFirst(circle2);
		Circle circle3 = new Circle("third"); 
		circle1.addCircle(circle3);
		Circle circle4 = new Circle("fourth"); 
		circle3.addCircle(circle4);
		Circle circle5 = new Circle("fifth"); 
		circle4.addCircle(circle5);
		Circle circle6 = new Circle("sixth"); 
		circle5.addCircle(circle6);
		Circle circle7 = new Circle("seventh"); 
		circle6.addCircle(circle7);
		Circle circle8 = new Circle("eighth"); 
		circle7.addCircle(circle8);
		Circle circle9 = new Circle("ninth"); 
		circle8.addCircle(circle9);
		Circle circle10 = new Circle("tenth"); 
		circle9.addCircle(circle10);
		circle1.printListForwards();
		circle1.deleteCircle(circle4);
		circle1.printListForwards();
		circle5.deleteCircle(circle1);
		circle2.printListForwards();

	}

}