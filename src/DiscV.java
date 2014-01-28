
public class DiscV extends Target{

	public DiscV (double x, double y, double velocity, int side, String imageDraw) {
		this.x = x;
		this.y = y;
		this.velocity = velocity;
		this.side = side;
		this.theta = Math.PI / 2;
		this.imageDraw = imageDraw;
	}
	
	public void move (){
		y = y + (Math.sin(theta) * velocity);
		if (y < (0-side) || y > 800)
			bounce();
	}
	
	void bounce (){
		velocity = -velocity;
		theta = Math.PI - theta;
	}
	
	
}
