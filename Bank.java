
public class Bank {
int r_o_i;
int principal = 1000;
int time=4;



public Bank(int r_o_i) {
	super();
	this.r_o_i = r_o_i;
	
}

public void setR_o_i(int r_o_i) {
	this.r_o_i = r_o_i;
}

public int getR_o_i() {
	setR_o_i(r_o_i);
	return r_o_i;
}
	
public void calculateroi(int roi)
{
	System.out.println(" Rate of interest  "+ r_o_i*principal*time);
}

}
