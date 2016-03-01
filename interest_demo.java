
public class interest_demo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SBI s = new SBI(7 );
		AXIS a = new AXIS(8);
		ICICI i = new ICICI(9);
		int s_roi = s.getR_o_i();
		int a_roi = a.getR_o_i();
		int i_roi = i.getR_o_i();
		
		System.out.println(" For SBI Bank \n");
		s.calculateroi(s_roi);
		System.out.println(" \nFor AXIS Bank\n ");
		a.calculateroi(a_roi);
		System.out.println("\nFor ICICI Bank\n");
		i.calculateroi(i_roi);
		
	}

}
