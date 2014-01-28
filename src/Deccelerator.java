
public class Deccelerator extends Region {
	public Deccelerator()
	{
		x = 0;
		y = 0;
		velocity = 0;
		delta = 0;
		height = 0;
		width = 0;
		velChange = 0;
		xtBound = 0;
		xbBound = 0;
		ytBound = 0;
		ybBound = 0;
	}
	
	public Deccelerator(double x, double y, double v, int w, int h, double vc, int xt, int xb, int yt, int yb)
	{
		this.x = x;
		this.y = y;
		velocity = v;
		height = h;
		width = w;
		velChange = vc;
	}
	
	public void setVC(int vc)
	{
		velChange = vc;
	}
	
	public void setV(int v)
	{
		velocity = v;
	}
	
	public void move()
	{
		y = y + velocity;
	}
	
	public void bounce()
	{
        velocity = -velocity;
    }
}
