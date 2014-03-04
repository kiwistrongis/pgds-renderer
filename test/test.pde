import kiwi.*;

void setup(){
	//size( 800, 600, PGraphicsOpenGLDelegate.CLASSNAME);
	//size( 800, 600, PGraphics3DDelegate.CLASSNAME);
	//size( 800, 600, PGLDSRenderer.CLASSNAME);
	//size( 800, 600, P3DDSRenderer.CLASSNAME);
	//PGDSRenderer.init( this);
	println( this.g.getClass().getName());
}

void draw(){
	background( 30);
	pushStyle();
	fill( 200, 100, 100, 200);
	noStroke();
	rect( 10, 10, 100, 100);
	popStyle();
}

void drawMethod(){
	
}

/*
public int sketchWidth() {
	return 800;
}

public int sketchHeight() {
	return 600;
}
*/

public String sketchRenderer() {
	return P3D2.class.getName();
}
