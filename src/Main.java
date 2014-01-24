import java.awt.*;
import java.applet.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;

public class Main extends JApplet implements Runnable, MouseListener { 

    Thread t;   
    int timeStep = 100;
    Random r = new Random();
    
    
    ArrayList <Target> targets = new ArrayList <Target> (); // Target Setup
    ArrayList <Region> regions = new ArrayList <Region> (); // Region Setup
    
    public void init() {
    	resize(800,800);
    	
    	targets.add(new Target()); // Targets population
    	regions.add(new Region()); // Regions population
    	
        addMouseListener(this);
        t = new Thread(this);
        t.start();
    }
    
    public void paint (Graphics g) {
    	
    	g.setColor(Color.white); // Background flushing
    	g.fillRect(0,0,800,800);
    	
    	g.setColor(Color.black);
    	for(int i = 0; i < targets.size(); i++) // Target painting
    	{
    		g.fillOval(targets.get(i).getX(), targets.get(i).getY(), targets.get(i).getSize(), targets.get(i).getSize());
    	}
    	
    	g.setColor(Color.red);
    	for(int i = 0; i < regions.size(); i++) // Region painting
    	{
    		g.fillRect(regions.get(i).getX(), regions.get(i).getY(), regions.get(i).getW(), regions.get(i).getH());
    	}
    	
    }
    
    public void mouseClicked(MouseEvent e) {
    	int x = e.getX();
    	int y = e.getY();
    	
    	if(x > targets.get(i).getX() && x < targets.get(i).getX() + targets.get(i).getSize() && y > targets.get(i).getY() && y < targets.get(i).getY() + targets.get(i).getSize())
		{
			targets.remove(i);
		}
    }
    
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
	public void run() {
		
        	try {while(true) {
        		for(int i = 0; i < targets.size(); i++) // Target Cycling
        		{
        			targets.get(i).move() // Target Movement
            		if(targets.get(i).getY() < 0 || targets.get(i).getY() > 490) // Target Zones
                    {
                        targets.get(i).bounceX(); // Target Bouncing
                    }
        		}
        		
        		for(int i = 0; i < regions.size(); i++) // Region Cycling
        		{
        			regions.get(i).move() // Region Movement
        			if(regions.get(i).getY() < 0 || regions.get(i).getY() > 490) // Region Zones
                    {
                        regions.get(i).bounceX(); // Region Bouncing
                    }
        		}
        	}
    	}
        
        catch (InterruptedException e) {}
    }
}