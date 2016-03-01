

public class building1 extends building {

	int no_of_rooms;
	public building1(int no_of_floors, int no_of_rooms) {
		super(no_of_floors);
		this.no_of_rooms = no_of_rooms;
		
	}

	public int total_flats(int total2)
	{
		return(no_of_rooms*total2);
	}
}
