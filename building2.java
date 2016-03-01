
public class building2 extends building {
	
	int no_of_flats;

	public building2(int no_of_floors, int no_of_flats) {
		super(no_of_floors);
		this.no_of_flats = no_of_flats;
	}
	
	public int total_rooms()
	{
		int total = no_of_flats*no_of_floors;
		return(total);
	}
}
