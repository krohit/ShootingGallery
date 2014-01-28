
abstract class Region {

	
	double x; // Top left region point
	double y; // Top left region point
	double velocity;
	double delta; // Angle for velocity to act on
	double width; // width of regional boundary
	double height; // height of regional boundary
	double velChange; // adjusts velocity within region
	int xtBound,xbBound; // x top and bottom boundary
	int ytBound,ybBound; // y top and bottom boundary
	
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
	
	public double getV()
	{
		return velocity;
	}
	
	public double getVC()
	{
		return velChange;
	}
	
	public void setVC(double vc)
	{
		velChange = vc;
	}
	
	public void setYBound(int a, int b)
	{
		ytBound = a;
		ybBound = b;
	}
	
	public void setXBound(int a, int b)
	{
		xtBound = a;
		xbBound = b;
	}
	
	abstract void move();
	
	abstract void bounce();
}
