void setup(){
	//size( 800, 600, Renderer.class.getName());
}
void draw(){
	background( 30);
	fill( 200, 100, 100, 200);
	noStroke();
	rect( 10, 10, 100, 100);
}

public int sketchWidth() {
	return 800;
}
public int sketchHeight() {
	return 600;
}
public String sketchRenderer() {
	return Renderer.class.getName();
}

public static class Renderer extends PGraphics3D {
	public Renderer(){
		super();}
}