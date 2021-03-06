import java.awt.*;
import java.applet.*;

import javax.swing.*;

import java.util.*;
import java.awt.event.*;

public class Main extends JApplet implements Runnable, MouseListener { 

    Thread t;   
    int timeStep = 75;
    Random r = new Random();
    Image target1, target2;
    
    ArrayList <Target> targets = new ArrayList <Target> (); // Target Setup
    ArrayList <Region> regions = new ArrayList <Region> (); // Region Setup
    
    public void init() {
    	resize(800,800);
    	
    	for (int i = 1; i < 8; i++){
    		if (i%2 == 0)
    			targets.add(new DiscV(i*100, 0, 10.0, 30, "clay_pigeon.gif")); // Targets Vert population
    		else
    			targets.add(new DiscV(i*100, 0, 10.0, 30, "Disc1.gif")); // Targets Vert population
    	}
    	for (int i = 1; i < 8; i++){
    		if (i%2 == 0)
    			targets.add(new DiscH(0, i*100, 10.0, 30, "Disc1.gif")); // Targets Horiz population
    		else
    			targets.add(new DiscH(0, i*100, 10.0, 30, "clay_pigeon.gif")); // Targets Horiz population
    	}
    	
    	target1 = getImage (getDocumentBase(), "clay_pigeon.gif");
    	target2 = getImage (getDocumentBase(), "Disc1.gif");
    	
    	//regions.add(new Region()); // Regions population
    	
        addMouseListener(this);
        t = new Thread(this);
        t.start();
    }
    
    public void paint (Graphics g) {
    	
    	g.setColor(Color.white); // Background flushing
    	g.fillRect(0,0,800,800);
    	
    	g.setColor(Color.red);
    	for (Target a:targets) // Target painting
    	{
    		if (a.getImageType() == "clay_pigeon.gif")	
    			g.drawImage(target1,a.getX(), a.getY(), a.getSize(),a.getSize(), this);
    		if (a.getImageType() == "Disc1.gif")
    			g.drawImage(target2, a.getX(), a.getY(), a.getSize(), a.getSize(), this);
    		
    	}
    	
//    	g.setColor(Color.red);
//    	for(int i = 0; i < regions.size(); i++) // Region painting
//    	{
//    		g.fillRect(regions.get(i).getX(), regions.get(i).getY(), regions.get(i).getW(), regions.get(i).getH());
//    	}
    	
    }
    
    public void mouseClicked(MouseEvent e) {
    	int x = e.getX();
    	int y = e.getY();
    	
    	for (int i = 0; i < targets.size(); i++){
    		if(x > targets.get(i).getX() && x < targets.get(i).getX() + targets.get(i).getSize() && y > targets.get(i).getY() && y < targets.get(i).getY() + targets.get(i).getSize())
    		{
    			targets.remove(i);
    		}
    	}
    }
    
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    
	public void run() {
        	while(true) {
        		try {
        			for(Target q:targets) // Target Cycling
        			{
        				q.move(); // Target Movement
//            			if(targets.get(i).getY() < 0 || targets.get(i).getY() > 490) // Target Zones
//                    	{
//                        	targets.get(i).bounceX(); // Target Bouncing
//                    	}
        			}
        			
//        			for(int i = 0; i < regions.size(); i++) // Region Cycling
//        			{
//        				regions.get(i).move() // Region Movement
//        				if(regions.get(i).getY() < 0 || regions.get(i).getY() > 490) // Region Zones
//                    	{
//                        	regions.get(i).bounceX(); // Region Bouncing
//                    	}
//        			}
        			repaint ();
        			t.sleep (timeStep);
        		} catch (InterruptedException e) {}
        	}
	
	}
         
}