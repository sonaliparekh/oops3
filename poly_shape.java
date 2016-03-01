
public class poly_shape {

	int l,b;

public poly_shape(int l, int b) {
	super();
	this.l = l;
	this.b = b;
}

public poly_shape(int l)
{
	this.l = l;
}

public void square()
{
	System.out.println("Area of Square "+  l*l);
	
}

public void rect()
{
	System.out.println(" Area of rectangle " + l*b);
}

public poly_shape() {
	// TODO Auto-generated constructor stub
}

}
