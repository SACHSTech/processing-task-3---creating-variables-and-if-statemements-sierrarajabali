import processing.core.PApplet;
import java.util.Random;
import java.lang.Math;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
   // Background color set to blue
  public void setup() {
    background(138, 181, 237);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  int min = 0; 
  int max = 101;
  int intRandom = (int)Math.floor(Math.random() * (max - min + 1) + min);
  
  // Drawing of the house
  public void draw() {

  //variables of width and lenght
  int length = 400;
  int width = 400;
	  
	if (intRandom <= 51 && intRandom >= 0) {
    // The grass (foreground) of the background
    fill(21, 153, 51);
    rect(0, (float)(width *0.625), length, width);  
    
    // The roof of the house
    fill(150, 58, 38);
    triangle((float)(length*0.25), (float)(width*0.5), (float)(length*0.5), (float)(width*0.2), (float)(length*0.75),(float)(width*0.5));

    // Base of the house
    fill(255, 77, 207);
    rect((float)(length*0.25), (float)(width*0.5), (float)(length*0.5), (float)(length*0.5)); 

    // Door of the house
    fill(150, 150, 150);
    rect((float)(length*0.325), (float)(width*0.7375), (float)(length*0.175), (float)(width*0.325)); 

    // Doorknob of the house
    fill(255, 255, 48);
    ellipse((float)(length*0.38), (float)(width*0.9), (float)(length*0.025), (float)(width*0.025));
  }
  else {
    // The grass (foreground) of the background
    fill(255, 0, 183);
    rect(0, (float)(width *0.625), length, width);  
    
    // The roof of the house
    fill(61, 235, 52);
    triangle((float)(length*0.25), (float)(width*0.5), (float)(length*0.5), (float)(width*0.2), (float)(length*0.75),(float)(width*0.5));

    // Base of the house
    fill(165, 52, 235);
    rect((float)(length*0.25), (float)(width*0.5), (float)(length*0.5), (float)(length*0.5)); 

    // Door of the house
    fill(52, 205, 235);
    rect((float)(length*0.325), (float)(width*0.7375), (float)(length*0.175), (float)(width*0.325)); 

    // Doorknob of the house
    fill(235, 52, 58);
    ellipse((float)(length*0.38), (float)(width*0.9), (float)(length*0.025), (float)(width*0.025));
  }
  
  // define other methods down here.
}
}