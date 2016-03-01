

public class ass1 extends shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ass1 a = new ass1();
		double sum_rect,sum_tr;
		sum_rect = a.rect();
		sum_tr = a.triangle();
		System.out.println("Area of Rectangle = " + sum_rect);
		System.out.println("Area of Triangle = " +sum_tr);
	}

}
