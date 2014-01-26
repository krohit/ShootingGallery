
public class DiscH extends Target {

	public DiscH (double x, double y, double velocity, int side) {
			this.x = x;
			this.y = y;
			this.velocity = velocity;
			this.side = side;
			this.theta = 0.0;
	}

	void move(){
		x = x + (Math.cos(theta) * velocity);
		if (x < 0 || x > 800)
			bounce();
	}
	
	void bounce (){
		velocity = -velocity;
		theta = Math.PI - theta;
	}
}
