package tools;

import java.awt.Shape;
import java.awt.geom.Point2D;

public interface Tool {

    /**
     *  Set the start of cursor point
     *  
     *  @param start of cursor point
     */
    void setStartingPoint(final Point2D theStartingPoint);
    
    /**
     *  Returns the start of cursor point
     *  
     *  @return the start of cursor point
     */
    Point2D getStartingPoint();

    /**
     *  Set the end of cursor point
     *  
     *  @param end of cursor point
     */
    void setEndingPoint(final Point2D theEndingPoint);
    
    /**
     *  Returns the end of cursor point
     *  
     *  @return the end of cursor point
     */
    Point2D getEndingPoint();
 
    /**
     *  Returns the Mnemonic for this tool.
     *  
     *  @return the mnmonic for this tool
     */
    int getMnemonic();
    
  
    /**
     *  Returns the Shape that this tools draws
     *  
     *  @return the Shape to draw
     */
    Shape paintedShape();
    
}
