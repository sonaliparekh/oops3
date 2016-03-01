
public class final_build {
	public static void main(String args[]){
		building1 b1 = new building1(5,6);
		building2 b2 = new building2(6,4);
		
		
		int total1 = b2.total_rooms();
		System.out.println("Total no_flats "  +total1 );
		
		int total3 = b1.total_flats(total1);
		System.out.println("Total no_of rooms " + total3);
	}
}
