
abstract class Region {

	
	double x; // Top left region point
	double y; // Top left region point
	double velocity;
	double delta; // Angle for velocity to act on
	double width; // width of regional boundary
	double height; // height of regional boundary
	
	public int getX()
	{
		return (int) x;
	}
	
	public int getY()
	{
		return (int) y;
	}
	
	public int getW()
	{
		return (int) width;
	}
	
	public int getH()
	{
		return (int) height;
	}
	
	public int getV()
	{
		return velocity;
	}
	
	public double int getSize()
	{
		return (int); 
	}
}
