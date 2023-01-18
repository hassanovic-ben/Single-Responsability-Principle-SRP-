package problem.square;

public class Square {

    int side = 5;
    boolean highResolutionMonitor;

    // Cohesion is the degree to which the various parts of a software components are related

    /******************************************************/
    public int calculateArea(){
        return side * side;
    }

    // the method calculateArea and calculatePerimeter are closely related, there is a high level of cohesion

    public int calculatePerimeter(){
        return side * 4;
    }

    /*****************************************************/

    // There is more than one reason to change this class

    /****************************************************/
    public void draw(){
        if(highResolutionMonitor){
            // Render a high resolution image of a square
        }
        else{
            // Render a normal resolution image of a square
        }
    }

    // the method draw and rotate are closely related, there is a high level of cohesion

    public void rotate(int degree){
        // Rotate the image of the square clockwise to
        // the required degree and re-render
    }

    /******************************************************/
}
