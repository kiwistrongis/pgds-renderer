import kiwi.*;

void setup(){
	size( 800, 600, "processing.opengl.PGraphicsOpenGL");
	//size( 800, 600, PGraphicsOpenGLDelegate.CLASSNAME);
	//size( 800, 600, PGDSRenderer.CLASSNAME);
	//size( 800, 600, PGraphicsOpenGLDelegate.class.getName());
	//size( 800, 600, PGDSRenderer.class.getName());
	//PGDSRenderer.init( this);
	println( g.getClass().getName());
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

public String sketchRenderer() {
	return OPENGL;
}*/

