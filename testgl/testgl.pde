import kiwi.pgdsr.*;

void setup(){
	size( 800, 600, PGLDSRenderer.CLASSNAME);
	PGLDSRenderer.init( this);
	System.out.printf( "Renderer: %s\n", this.g.getClass().getName());
}

void draw(){
	background( 30);
	fill( 200, 100, 100, 200);
	noStroke();
	rect( 10, 10, 100, 100);
}

void drawMethod(){
	pushStyle();
	fill( 100, 200, 200, 200);
	noStroke();
	rect( 10, 10, 100, 100);
	popStyle();
}

/*
public int sketchWidth() {
	return 800;}
public int sketchHeight() {
	return 600;}
public String sketchRenderer() {
	return PGLDSRenderer.class.getName();}
*/
