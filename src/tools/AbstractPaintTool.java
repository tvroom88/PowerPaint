package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.Objects;

public abstract class AbstractPaintTool implements Tool {
    
    /**
     *  A point outside the drawing area.
     */
    public static final Point NO_POINT = new Point(-50,-50);
    
    // Starting point of the tool    
    private Point2D myStartingPoint;
    
    // Ending point of the tool    
    private Point2D myEndingPoint;
    
    /**
     *  the mnemonic for this tool
     */
    private final int myMenmonic;
    
    
    /**
     *  Constructs a paint tool.
     *  
     *  @param theMnemonic the mnemonic for this tool
     */
    protected AbstractPaintTool(final int theMenmonic) {
        this.myStartingPoint = NO_POINT;
        this.myEndingPoint = NO_POINT;
        this.myMenmonic = Objects.requireNonNull(theMenmonic, "theMenmonic couldn't empty");
    }

    @Override
    public Point2D getStartingPoint() {
        // TODO Auto-generated method stub
        return myStartingPoint;
    }

    @Override
    public void setStartingPoint(Point2D theStartingPoint) {
        // TODO Auto-generated method stub
        this.myStartingPoint = theStartingPoint;
    }

    @Override
    public Point2D getEndingPoint() {
        // TODO Auto-generated method stub
        return myEndingPoint;
    }

    @Override
    public void setEndingPoint(Point2D theEndingPoint) {
        // TODO Auto-generated method stub
        this.myEndingPoint = theEndingPoint;
    }
    
    @Override
    public int getMnemonic() {
       return myMenmonic;
    };

    @Override
    public abstract Shape paintedShape();

}

