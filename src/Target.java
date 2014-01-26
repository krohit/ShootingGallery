
abstract class Target {
	double x; //position of x init top left
	double y; //position of y init top left
	double velocity;
	double theta; //angle of mvmt
	int side; //size of target
	
	Target (){}
	
	public int getX(){
		return (int) x;
	}
	
	public int getY(){
		return (int) y;
	}
	
	public int getSide(){
		return side;
	}
	
	public double getVelocity(){
		return (double) velocity;
	}
	
	public double getTheta(){
		return (double) theta;
	}
	
	abstract void move();
	
	abstract void bounce();

}