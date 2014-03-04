package kiwi;

//standard library imports
import java.util.Stack;

//processing imports
import processing.core.*;
import processing.opengl.*;

public class P3DDSRenderer extends PGraphics3DDelegate {
	//private fields
	private Stack<PGraphics3D> delegates;
	private PGraphics3D temp1 = null;
	private PGraphics3D temp2 = null;
	private PGraphics3D temp3 = null;

	//constructor
	public P3DDSRenderer(){
		super();
		delegates = new Stack<PGraphics3D>();
	}

	//delegate functions
	@Override
	public PGraphics3D getDelegate(){
		return delegates.isEmpty() ?
			this : delegates.peek();
	}
	@Override
	public void setDelegate( PGraphics3D delegate){
		pushDelegate( delegate);
	}
	public void pushDelegate( PGraphics3D delegate){
		delegates.push( delegate);
	}
	public PGraphics3D popDelegate(){
		return delegates.pop();
	}

	//render calls
	public void pre(){
		/*if( temp1 == null){
			temp1 = (PGraphics3D) parent.createGraphics(
				this.width, this.height, PConstants.P3D);
			temp1.beginDraw();
			temp1.background( 0, 0, 0, 0);
			temp1.endDraw();}
		if( temp2 == null){
			temp2 = (PGraphics3D) parent.createGraphics(
				this.width, this.height, PConstants.P3D);
			temp2.beginDraw();
			temp2.background( 0, 0, 0, 0);
			temp2.endDraw();}
		if( temp3 == null){
			temp3 = (PGraphics3D) parent.createGraphics(
				this.width, this.height, PConstants.P3D);
			temp3.beginDraw();
			temp3.background( 0, 0, 0, 0);
			temp3.endDraw();}
		pushDelegate( temp1);
			beginDraw();
			pushDelegate( temp2);
				beginDraw();
				pushDelegate( temp3);
					beginDraw();
					pushStyle();
					fill( 100, 200, 200, 200);
					noStroke();
					rect( 10, 10, 100, 100);
					popStyle();
					endDraw();
				popDelegate();
				image( temp3, 100, 100, temp3.width - 200, temp3.height - 200);
				pushStyle();
				noFill();
				stroke( 250, 250, 250, 200);
				strokeWeight( 5);
				strokeCap( ROUND);
				rect( 100, 100, width - 200, height - 200);
				popStyle();
				endDraw();
			popDelegate();
			image( temp2, 100, 100, temp2.width - 200, temp2.height - 200);
			pushStyle();
			noFill();
			stroke( 250, 250, 250, 200);
			strokeWeight( 5);
			strokeCap( ROUND);
			rect( 100, 100, width - 200, height - 200);
			popStyle();
			endDraw();
		popDelegate();*/
	}
	public void draw(){
		/*image( temp1, 100, 100, width - 200, height - 200);
		pushStyle();
		noFill();
		stroke( 250, 250, 250, 200);
		strokeWeight( 5);
		strokeCap( ROUND);
		rect( 100, 100, width - 200, height - 200);
		popStyle();
		String asdf = (String) null;*/
	}

	//static fields
	public static final String CLASSNAME = P3DDSRenderer.class.getName();
	private static PApplet applet = null;
	private static P3DDSRenderer renderer = null;

	//static functions
	public static void init( PApplet applet){
		P3DDSRenderer.applet = applet;
		//validate renderer
		if( ! P3DDSRenderer.class.isInstance( applet.g))
			throw new RuntimeException(
				String.format( "To use this library you must use P3DDSRenderer.CLASSNAME as the renderer field in size(). For example: size( 800, 600, P3DDSRenderer.CLASSNAME). You used %s.",
					applet.g.getClass().getName()));
		renderer = (P3DDSRenderer) applet.g;
		applet.registerMethod("pre", renderer);
		applet.registerMethod("draw", renderer);
	}
}