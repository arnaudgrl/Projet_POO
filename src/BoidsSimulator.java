
import gui.*;
import java.awt.Color;
import java.awt.Point;
import java.util.*;


public class BoidsSimulator implements Simulable {

	private Boids boids;
	private GUISimulator gui;

	public BoidsSimulator(GUISimulator gui, Boids boids){

			this.gui = gui;
			this.boids = boids;
	}

	@Override
	public void next() {
    gui.reset();
    int i=0;
		while(i<boids.boids.size()) {
			boids.boids.get(i).move_boid_to_new_position(boids);
      Boid a = boids.boids.get(i);
      String ch = new String();
      ch = "#"+i+"4"+i+"2"+i+"f";
			gui.addGraphicalElement(new Oval((int)a.position.x, (int)a.position.x, Color.decode(ch), Color.decode(ch), 10)) ;
      i++;
    }

	}

	@Override
	public void restart() {
    gui.reset();
    Boid b1 = new Boid(7.,70,3,3,0,0);
    Boid b2 = new Boid(50,28,10,10,0,0);
    Boid b3 = new Boid(38,50,0,0,0,0);
    Boid b4 = new Boid(25,33,0,0,0,0);
    gui.addGraphicalElement(new Oval((int)b1.position.x, (int)b1.position.y, Color.decode("#b4621f"), Color.decode("#b4621f"), 10)) ;
    gui.addGraphicalElement(new Oval((int)b2.position.x, (int)b2.position.y, Color.decode("#b4621f"), Color.decode("#b4621f"), 10)) ;
    gui.addGraphicalElement(new Oval((int)b3.position.x, (int)b3.position.y, Color.decode("#b4621f"), Color.decode("#b4621f"), 10)) ;
    gui.addGraphicalElement(new Oval((int)b4.position.x, (int)b4.position.y, Color.decode("#b4621f"), Color.decode("#b4621f"), 10)) ;

	}
}