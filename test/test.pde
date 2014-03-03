import kiwi.*;

void setup(){
	size( 800, 600, CPGraphics.RENDERER);
	CPGraphics.init( this);
}

void draw(){
	background( 30);
	pushStyle();
	fill( 200, 100, 100, 200);
	noStroke();
	rect( 10, 10, 100, 100);
	popStyle();
}
