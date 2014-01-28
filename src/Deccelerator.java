
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
	}
	
	Public Deccelerator(int x, int y, int v, int w, int h, int vc)
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
		velChange = vc
	}
	
	public void setV(int v)
	{
		velocity = v;
	}
	
}
