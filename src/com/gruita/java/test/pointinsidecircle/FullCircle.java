package com.gruita.java.test.pointinsidecircle;

// general: x^2 + y^2 = r^2


/**
 * Tests if a point of coordinates x, y is inside a circle defined by 
 * x, y, r where x and y are the center coordinates and r is the radius
 * @author cgruita
 *
 */
public class FullCircle{
	
	
    
    private int xCenter;
    private int yCenter;
    private int radius;
    
    public FullCircle(int xCenter, int yCenter, int radius){
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        if(radius <= 0){
           throw new IllegalArgumentException("radius cannot be 0 or negative!");
        }
        this.radius = radius;
    }
    
    
    
    
    // condition that a point is inside a circle:
    // center is at xCenter, yCenter, radius is r (positive)
    // P(x,y)
    // x condition: xCenter-r < x < xCenter + r
    // y condition: yCenter - r < y < yCenter + r
    
    public boolean isPointInside(Point point){
        
        
        boolean xCondition = false;
        boolean yCondition = false;
        
        int x = point.getX();
        
        if((xCenter - radius < x) && (xCenter + radius > x)){
            xCondition = true;
        }
        
        int y = point.getY();
        if((yCenter - radius < y) && (yCenter + radius > y)){
            yCondition = true;
        }
        
        
        return xCondition && yCondition;
    }
    
    public static void main(String[] args){
    	FullCircle circle = new FullCircle(0,0,5);
    	Point point = new Point(3, 3);
    	System.out.println("point inside: " + circle.isPointInside(point));
    }
    
    
    
    
}

