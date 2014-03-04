package kiwi;

import java.awt.Image;
import processing.core.*;
import processing.opengl.*;

public class PGraphics3DDelegate extends PGraphics3D {
	//static fields
	public static final String CLASSNAME = PGraphics3DDelegate.class.getName();
	//fields
	private PGraphics3D delegate;

	//construtor
	public PGraphics3DDelegate(){
		super();
		delegate = null;
	}

	//accessor methods
	public PGraphics3D getDelegate(){
		return delegate == null ? this : delegate;
	}
	public void setDelegate( PGraphics3D delegate){
		this.delegate = delegate;
	}

	//delegate functions
	public void ambient(int rgb) {
		if( this.getDelegate() == this)
			super.ambient(rgb);
		else
			delegate.ambient(rgb);
	}

	public void ambient(float gray) {
		if( this.getDelegate() == this)
			super.ambient(gray);
		else
			delegate.ambient(gray);
	}

	public void ambient(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.ambient(v1, v2, v3);
		else
			delegate.ambient(v1, v2, v3);
	}

	public void ambientLight(float r, float g, float b) {
		if( this.getDelegate() == this)
			super.ambientLight(r, g, b);
		else
			delegate.ambientLight(r, g, b);
	}

	public void ambientLight(float r, float g, float b, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.ambientLight(r, g, b, x, y, z);
		else
			delegate.ambientLight(r, g, b, x, y, z);
	}

	public void applyMatrix(PMatrix2D source) {
		if( this.getDelegate() == this)
			super.applyMatrix(source);
		else
			delegate.applyMatrix(source);
	}

	public void applyMatrix(PMatrix3D source) {
		if( this.getDelegate() == this)
			super.applyMatrix(source);
		else
			delegate.applyMatrix(source);
	}

	public void applyMatrix(float n00, float n01, float n02, float n10, float n11, float n12) {
		if( this.getDelegate() == this)
			super.applyMatrix(n00, n01, n02, n10, n11, n12);
		else
			delegate.applyMatrix(n00, n01, n02, n10, n11, n12);
	}

	public void applyMatrix(float n00, float n01, float n02, float n03, float n10, float n11, float n12, float n13, float n20, float n21, float n22, float n23, float n30, float n31, float n32, float n33) {
		if( this.getDelegate() == this)
			super.applyMatrix(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
		else
			delegate.applyMatrix(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
	}

	public void applyMatrix(PMatrix source) {
		if( this.getDelegate() == this)
			super.applyMatrix(source);
		else
			delegate.applyMatrix(source);
	}

	public void applyProjection(PMatrix3D mat) {
		if( this.getDelegate() == this)
			super.applyProjection(mat);
		else
			delegate.applyProjection(mat);
	}

	public void applyProjection(float n00, float n01, float n02, float n03, float n10, float n11, float n12, float n13, float n20, float n21, float n22, float n23, float n30, float n31, float n32, float n33) {
		if( this.getDelegate() == this)
			super.applyProjection(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
		else
			delegate.applyProjection(n00, n01, n02, n03, n10, n11, n12, n13, n20, n21, n22, n23, n30, n31, n32, n33);
	}

	public void arc(float a, float b, float c, float d, float start, float stop) {
		if( this.getDelegate() == this)
			super.arc(a, b, c, d, start, stop);
		else
			delegate.arc(a, b, c, d, start, stop);
	}

	public void arc(float a, float b, float c, float d, float start, float stop, int mode) {
		if( this.getDelegate() == this)
			super.arc(a, b, c, d, start, stop, mode);
		else
			delegate.arc(a, b, c, d, start, stop, mode);
	}

	public void background(int rgb) {
		if( this.getDelegate() == this)
			super.background(rgb);
		else
			delegate.background(rgb);
	}

	public void background(float gray) {
		if( this.getDelegate() == this)
			super.background(gray);
		else
			delegate.background(gray);
	}

	public void background(PImage image) {
		if( this.getDelegate() == this)
			super.background(image);
		else
			delegate.background(image);
	}

	public void background(int rgb, float alpha) {
		if( this.getDelegate() == this)
			super.background(rgb, alpha);
		else
			delegate.background(rgb, alpha);
	}

	public void background(float gray, float alpha) {
		if( this.getDelegate() == this)
			super.background(gray, alpha);
		else
			delegate.background(gray, alpha);
	}

	public void background(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.background(v1, v2, v3);
		else
			delegate.background(v1, v2, v3);
	}

	public void background(float v1, float v2, float v3, float alpha) {
		if( this.getDelegate() == this)
			super.background(v1, v2, v3, alpha);
		else
			delegate.background(v1, v2, v3, alpha);
	}

	public void beginCamera() {
		if( this.getDelegate() == this)
			super.beginCamera();
		else
			delegate.beginCamera();
	}

	public void beginContour() {
		if( this.getDelegate() == this)
			super.beginContour();
		else
			delegate.beginContour();
	}

	public void beginDraw() {
		if( this.getDelegate() == this)
			super.beginDraw();
		else
			delegate.beginDraw();
	}

	public PGL beginPGL() {
		if( this.getDelegate() == this)
			return super.beginPGL();
		else
			return delegate.beginPGL();
	}

	public void beginRaw(PGraphics rawGraphics) {
		if( this.getDelegate() == this)
			super.beginRaw(rawGraphics);
		else
			delegate.beginRaw(rawGraphics);
	}

	public void beginReadPixels() {
		if( this.getDelegate() == this)
			super.beginReadPixels();
		else
			delegate.beginReadPixels();
	}

	public void beginShape(int kind) {
		if( this.getDelegate() == this)
			super.beginShape(kind);
		else
			delegate.beginShape(kind);
	}

	public void beginShape() {
		if( this.getDelegate() == this)
			super.beginShape();
		else
			delegate.beginShape();
	}

	public void bezier(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		if( this.getDelegate() == this)
			super.bezier(x1, y1, x2, y2, x3, y3, x4, y4);
		else
			delegate.bezier(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public void bezier(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
		if( this.getDelegate() == this)
			super.bezier(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
		else
			delegate.bezier(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
	}

	public void bezierDetail(int detail) {
		if( this.getDelegate() == this)
			super.bezierDetail(detail);
		else
			delegate.bezierDetail(detail);
	}

	public float bezierPoint(float a, float b, float c, float d, float t) {
		if( this.getDelegate() == this)
			return super.bezierPoint(a, b, c, d, t);
		else
			return delegate.bezierPoint(a, b, c, d, t);
	}

	public float bezierTangent(float a, float b, float c, float d, float t) {
		if( this.getDelegate() == this)
			return super.bezierTangent(a, b, c, d, t);
		else
			return delegate.bezierTangent(a, b, c, d, t);
	}

	public void bezierVertex(float x2, float y2, float x3, float y3, float x4, float y4) {
		if( this.getDelegate() == this)
			super.bezierVertex(x2, y2, x3, y3, x4, y4);
		else
			delegate.bezierVertex(x2, y2, x3, y3, x4, y4);
	}

	public void bezierVertex(float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
		if( this.getDelegate() == this)
			super.bezierVertex(x2, y2, z2, x3, y3, z3, x4, y4, z4);
		else
			delegate.bezierVertex(x2, y2, z2, x3, y3, z3, x4, y4, z4);
	}

	public void blend(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
		if( this.getDelegate() == this)
			super.blend(sx, sy, sw, sh, dx, dy, dw, dh, mode);
		else
			delegate.blend(sx, sy, sw, sh, dx, dy, dw, dh, mode);
	}

	public void blend(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh, int mode) {
		if( this.getDelegate() == this)
			super.blend(src, sx, sy, sw, sh, dx, dy, dw, dh, mode);
		else
			delegate.blend(src, sx, sy, sw, sh, dx, dy, dw, dh, mode);
	}

	public void blendMode(int mode) {
		if( this.getDelegate() == this)
			super.blendMode(mode);
		else
			delegate.blendMode(mode);
	}

	public void box(float w, float h, float d) {
		if( this.getDelegate() == this)
			super.box(w, h, d);
		else
			delegate.box(w, h, d);
	}

	public void box(float size) {
		if( this.getDelegate() == this)
			super.box(size);
		else
			delegate.box(size);
	}

	public void camera() {
		if( this.getDelegate() == this)
			super.camera();
		else
			delegate.camera();
	}

	public void camera(float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ) {
		if( this.getDelegate() == this)
			super.camera(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
		else
			delegate.camera(eyeX, eyeY, eyeZ, centerX, centerY, centerZ, upX, upY, upZ);
	}

	public boolean canDraw() {
		if( this.getDelegate() == this)
			return super.canDraw();
		else
			return delegate.canDraw();
	}

	public void clear() {
		if( this.getDelegate() == this)
			super.clear();
		else
			delegate.clear();
	}

	public void clip(float a, float b, float c, float d) {
		if( this.getDelegate() == this)
			super.clip(a, b, c, d);
		else
			delegate.clip(a, b, c, d);
	}

	public Object clone() throws CloneNotSupportedException {
		if( this.getDelegate() == this)
			return super.clone();
		else
			return delegate.clone();
	}

	public void colorMode(int mode) {
		if( this.getDelegate() == this)
			super.colorMode(mode);
		else
			delegate.colorMode(mode);
	}

	public void colorMode(int mode, float max) {
		if( this.getDelegate() == this)
			super.colorMode(mode, max);
		else
			delegate.colorMode(mode, max);
	}

	public void colorMode(int mode, float max1, float max2, float max3) {
		if( this.getDelegate() == this)
			super.colorMode(mode, max1, max2, max3);
		else
			delegate.colorMode(mode, max1, max2, max3);
	}

	public void colorMode(int mode, float max1, float max2, float max3, float maxA) {
		if( this.getDelegate() == this)
			super.colorMode(mode, max1, max2, max3, maxA);
		else
			delegate.colorMode(mode, max1, max2, max3, maxA);
	}

	public void copy(int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
		if( this.getDelegate() == this)
			super.copy(sx, sy, sw, sh, dx, dy, dw, dh);
		else
			delegate.copy(sx, sy, sw, sh, dx, dy, dw, dh);
	}

	public void copy(PImage src, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
		if( this.getDelegate() == this)
			super.copy(src, sx, sy, sw, sh, dx, dy, dw, dh);
		else
			delegate.copy(src, sx, sy, sw, sh, dx, dy, dw, dh);
	}

	public PShape createShape() {
		if( this.getDelegate() == this)
			return super.createShape();
		else
			return delegate.createShape();
	}

	public PShape createShape(PShape source) {
		if( this.getDelegate() == this)
			return super.createShape(source);
		else
			return delegate.createShape(source);
	}

	public PShape createShape(int type) {
		if( this.getDelegate() == this)
			return super.createShape(type);
		else
			return delegate.createShape(type);
	}

	public PShape createShape(int kind, float... p) {
		if( this.getDelegate() == this)
			return super.createShape(kind, p);
		else
			return delegate.createShape(kind, p);
	}

	public void curve(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		if( this.getDelegate() == this)
			super.curve(x1, y1, x2, y2, x3, y3, x4, y4);
		else
			delegate.curve(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public void curve(float x1, float y1, float z1, float x2, float y2, float z2, float x3, float y3, float z3, float x4, float y4, float z4) {
		if( this.getDelegate() == this)
			super.curve(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
		else
			delegate.curve(x1, y1, z1, x2, y2, z2, x3, y3, z3, x4, y4, z4);
	}

	public void curveDetail(int detail) {
		if( this.getDelegate() == this)
			super.curveDetail(detail);
		else
			delegate.curveDetail(detail);
	}

	public float curvePoint(float a, float b, float c, float d, float t) {
		if( this.getDelegate() == this)
			return super.curvePoint(a, b, c, d, t);
		else
			return delegate.curvePoint(a, b, c, d, t);
	}

	public float curveTangent(float a, float b, float c, float d, float t) {
		if( this.getDelegate() == this)
			return super.curveTangent(a, b, c, d, t);
		else
			return delegate.curveTangent(a, b, c, d, t);
	}

	public void curveTightness(float tightness) {
		if( this.getDelegate() == this)
			super.curveTightness(tightness);
		else
			delegate.curveTightness(tightness);
	}

	public void curveVertex(float x, float y) {
		if( this.getDelegate() == this)
			super.curveVertex(x, y);
		else
			delegate.curveVertex(x, y);
	}

	public void curveVertex(float x, float y, float z) {
		if( this.getDelegate() == this)
			super.curveVertex(x, y, z);
		else
			delegate.curveVertex(x, y, z);
	}

	public void directionalLight(float r, float g, float b, float dx, float dy, float dz) {
		if( this.getDelegate() == this)
			super.directionalLight(r, g, b, dx, dy, dz);
		else
			delegate.directionalLight(r, g, b, dx, dy, dz);
	}

	public boolean displayable() {
		if( this.getDelegate() == this)
			return super.displayable();
		else
			return delegate.displayable();
	}

	public void dispose() {
		if( this.getDelegate() == this)
			super.dispose();
		else
			delegate.dispose();
	}

	public void edge(boolean edge) {
		if( this.getDelegate() == this)
			super.edge(edge);
		else
			delegate.edge(edge);
	}

	public void ellipse(float a, float b, float c, float d) {
		if( this.getDelegate() == this)
			super.ellipse(a, b, c, d);
		else
			delegate.ellipse(a, b, c, d);
	}

	public void ellipseImpl(float a, float b, float c, float d) {
		if( this.getDelegate() == this)
			super.ellipseImpl(a, b, c, d);
		else
			delegate.ellipseImpl(a, b, c, d);
	}

	public void ellipseMode(int mode) {
		if( this.getDelegate() == this)
			super.ellipseMode(mode);
		else
			delegate.ellipseMode(mode);
	}

	public void emissive(int rgb) {
		if( this.getDelegate() == this)
			super.emissive(rgb);
		else
			delegate.emissive(rgb);
	}

	public void emissive(float gray) {
		if( this.getDelegate() == this)
			super.emissive(gray);
		else
			delegate.emissive(gray);
	}

	public void emissive(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.emissive(v1, v2, v3);
		else
			delegate.emissive(v1, v2, v3);
	}

	public void endCamera() {
		if( this.getDelegate() == this)
			super.endCamera();
		else
			delegate.endCamera();
	}

	public void endContour() {
		if( this.getDelegate() == this)
			super.endContour();
		else
			delegate.endContour();
	}

	public void endDraw() {
		if( this.getDelegate() == this)
			super.endDraw();
		else
			delegate.endDraw();
	}

	public void endPGL() {
		if( this.getDelegate() == this)
			super.endPGL();
		else
			delegate.endPGL();
	}

	public void endRaw() {
		if( this.getDelegate() == this)
			super.endRaw();
		else
			delegate.endRaw();
	}

	public void endReadPixels() {
		if( this.getDelegate() == this)
			super.endReadPixels();
		else
			delegate.endReadPixels();
	}

	public void endShape(int mode) {
		if( this.getDelegate() == this)
			super.endShape(mode);
		else
			delegate.endShape(mode);
	}

	public void endShape() {
		if( this.getDelegate() == this)
			super.endShape();
		else
			delegate.endShape();
	}

	public boolean equals(Object obj) {
		if( this.getDelegate() == this)
			return super.equals(obj);
		else
			return delegate.equals(obj);
	}

	public void fill(int rgb) {
		if( this.getDelegate() == this)
			super.fill(rgb);
		else
			delegate.fill(rgb);
	}

	public void fill(float gray) {
		if( this.getDelegate() == this)
			super.fill(gray);
		else
			delegate.fill(gray);
	}

	public void fill(int rgb, float alpha) {
		if( this.getDelegate() == this)
			super.fill(rgb, alpha);
		else
			delegate.fill(rgb, alpha);
	}

	public void fill(float gray, float alpha) {
		if( this.getDelegate() == this)
			super.fill(gray, alpha);
		else
			delegate.fill(gray, alpha);
	}

	public void fill(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.fill(v1, v2, v3);
		else
			delegate.fill(v1, v2, v3);
	}

	public void fill(float v1, float v2, float v3, float alpha) {
		if( this.getDelegate() == this)
			super.fill(v1, v2, v3, alpha);
		else
			delegate.fill(v1, v2, v3, alpha);
	}

	public void filter(int kind) {
		if( this.getDelegate() == this)
			super.filter(kind);
		else
			delegate.filter(kind);
	}

	public void filter(PShader shader) {
		if( this.getDelegate() == this)
			super.filter(shader);
		else
			delegate.filter(shader);
	}

	public void filter(int kind, float param) {
		if( this.getDelegate() == this)
			super.filter(kind, param);
		else
			delegate.filter(kind, param);
	}

	public void flush() {
		if( this.getDelegate() == this)
			super.flush();
		else
			delegate.flush();
	}

	public void frustum(float left, float right, float bottom, float top, float znear, float zfar) {
		if( this.getDelegate() == this)
			super.frustum(left, right, bottom, top, znear, zfar);
		else
			delegate.frustum(left, right, bottom, top, znear, zfar);
	}

	public int get(int x, int y) {
		if( this.getDelegate() == this)
			return super.get(x, y);
		else
			return delegate.get(x, y);
	}

	public PImage get() {
		if( this.getDelegate() == this)
			return super.get();
		else
			return delegate.get();
	}

	public PImage get(int x, int y, int w, int h) {
		if( this.getDelegate() == this)
			return super.get(x, y, w, h);
		else
			return delegate.get(x, y, w, h);
	}

	public Object getCache(PImage image) {
		if( this.getDelegate() == this)
			return super.getCache(image);
		else
			return delegate.getCache(image);
	}

	public Image getImage() {
		if( this.getDelegate() == this)
			return super.getImage();
		else
			return delegate.getImage();
	}

	public PMatrix getMatrix() {
		if( this.getDelegate() == this)
			return super.getMatrix();
		else
			return delegate.getMatrix();
	}

	public PMatrix3D getMatrix(PMatrix3D target) {
		if( this.getDelegate() == this)
			return super.getMatrix(target);
		else
			return delegate.getMatrix(target);
	}

	public PMatrix2D getMatrix(PMatrix2D target) {
		if( this.getDelegate() == this)
			return super.getMatrix(target);
		else
			return delegate.getMatrix(target);
	}

	public int getModifiedX1() {
		if( this.getDelegate() == this)
			return super.getModifiedX1();
		else
			return delegate.getModifiedX1();
	}

	public int getModifiedX2() {
		if( this.getDelegate() == this)
			return super.getModifiedX2();
		else
			return delegate.getModifiedX2();
	}

	public int getModifiedY1() {
		if( this.getDelegate() == this)
			return super.getModifiedY1();
		else
			return delegate.getModifiedY1();
	}

	public int getModifiedY2() {
		if( this.getDelegate() == this)
			return super.getModifiedY2();
		else
			return delegate.getModifiedY2();
	}

	public Object getNative() {
		if( this.getDelegate() == this)
			return super.getNative();
		else
			return delegate.getNative();
	}

	public PGraphics getRaw() {
		if( this.getDelegate() == this)
			return super.getRaw();
		else
			return delegate.getRaw();
	}

	public PStyle getStyle() {
		if( this.getDelegate() == this)
			return super.getStyle();
		else
			return delegate.getStyle();
	}

	public PStyle getStyle(PStyle s) {
		if( this.getDelegate() == this)
			return super.getStyle(s);
		else
			return delegate.getStyle(s);
	}

	public Texture getTexture() {
		if( this.getDelegate() == this)
			return super.getTexture();
		else
			return delegate.getTexture();
	}

	public Texture getTexture(boolean load) {
		if( this.getDelegate() == this)
			return super.getTexture(load);
		else
			return delegate.getTexture(load);
	}

	public Texture getTexture(PImage img) {
		if( this.getDelegate() == this)
			return super.getTexture(img);
		else
			return delegate.getTexture(img);
	}

	public int hashCode() {
		if( this.getDelegate() == this)
			return super.hashCode();
		else
			return delegate.hashCode();
	}

	public boolean haveRaw() {
		if( this.getDelegate() == this)
			return super.haveRaw();
		else
			return delegate.haveRaw();
	}

	public void hint(int which) {
		if( this.getDelegate() == this)
			super.hint(which);
		else
			delegate.hint(which);
	}

	public void image(PImage img, float a, float b) {
		if( this.getDelegate() == this)
			super.image(img, a, b);
		else
			delegate.image(img, a, b);
	}

	public void image(PImage img, float a, float b, float c, float d) {
		if( this.getDelegate() == this)
			super.image(img, a, b, c, d);
		else
			delegate.image(img, a, b, c, d);
	}

	public void image(PImage img, float a, float b, float c, float d, int u1, int v1, int u2, int v2) {
		if( this.getDelegate() == this)
			super.image(img, a, b, c, d, u1, v1, u2, v2);
		else
			delegate.image(img, a, b, c, d, u1, v1, u2, v2);
	}

	public void imageMode(int mode) {
		if( this.getDelegate() == this)
			super.imageMode(mode);
		else
			delegate.imageMode(mode);
	}

	public void init(int width, int height, int format) {
		if( this.getDelegate() == this)
			super.init(width, height, format);
		else
			delegate.init(width, height, format);
	}

	public boolean is2D() {
		if( this.getDelegate() == this)
			return super.is2D();
		else
			return delegate.is2D();
	}

	public boolean is3D() {
		if( this.getDelegate() == this)
			return super.is3D();
		else
			return delegate.is3D();
	}

	public boolean isGL() {
		if( this.getDelegate() == this)
			return super.isGL();
		else
			return delegate.isGL();
	}

	public boolean isLoaded() {
		if( this.getDelegate() == this)
			return super.isLoaded();
		else
			return delegate.isLoaded();
	}

	public boolean isModified() {
		if( this.getDelegate() == this)
			return super.isModified();
		else
			return delegate.isModified();
	}

	public int lerpColor(int c1, int c2, float amt) {
		if( this.getDelegate() == this)
			return super.lerpColor(c1, c2, amt);
		else
			return delegate.lerpColor(c1, c2, amt);
	}

	public void lightFalloff(float constant, float linear, float quadratic) {
		if( this.getDelegate() == this)
			super.lightFalloff(constant, linear, quadratic);
		else
			delegate.lightFalloff(constant, linear, quadratic);
	}

	public void lightSpecular(float x, float y, float z) {
		if( this.getDelegate() == this)
			super.lightSpecular(x, y, z);
		else
			delegate.lightSpecular(x, y, z);
	}

	public void lights() {
		if( this.getDelegate() == this)
			super.lights();
		else
			delegate.lights();
	}

	public void line(float x1, float y1, float x2, float y2) {
		if( this.getDelegate() == this)
			super.line(x1, y1, x2, y2);
		else
			delegate.line(x1, y1, x2, y2);
	}

	public void line(float x1, float y1, float z1, float x2, float y2, float z2) {
		if( this.getDelegate() == this)
			super.line(x1, y1, z1, x2, y2, z2);
		else
			delegate.line(x1, y1, z1, x2, y2, z2);
	}

	public void loadPixels() {
		if( this.getDelegate() == this)
			super.loadPixels();
		else
			delegate.loadPixels();
	}

	public PShader loadShader(String fragFilename) {
		if( this.getDelegate() == this)
			return super.loadShader(fragFilename);
		else
			return delegate.loadShader(fragFilename);
	}

	public PShader loadShader(String fragFilename, String vertFilename) {
		if( this.getDelegate() == this)
			return super.loadShader(fragFilename, vertFilename);
		else
			return delegate.loadShader(fragFilename, vertFilename);
	}

	public PShape loadShape(String filename) {
		if( this.getDelegate() == this)
			return super.loadShape(filename);
		else
			return delegate.loadShape(filename);
	}

	public PShape loadShape(String filename, String options) {
		if( this.getDelegate() == this)
			return super.loadShape(filename, options);
		else
			return delegate.loadShape(filename, options);
	}

	public void loadTexture() {
		if( this.getDelegate() == this)
			super.loadTexture();
		else
			delegate.loadTexture();
	}

	public void mask(PImage alpha) {
		if( this.getDelegate() == this)
			super.mask(alpha);
		else
			delegate.mask(alpha);
	}

	public void mask(int[] maskArray) {
		if( this.getDelegate() == this)
			super.mask(maskArray);
		else
			delegate.mask(maskArray);
	}

	public float modelX(float x, float y, float z) {
		if( this.getDelegate() == this)
			return super.modelX(x, y, z);
		else
			return delegate.modelX(x, y, z);
	}

	public float modelY(float x, float y, float z) {
		if( this.getDelegate() == this)
			return super.modelY(x, y, z);
		else
			return delegate.modelY(x, y, z);
	}

	public float modelZ(float x, float y, float z) {
		if( this.getDelegate() == this)
			return super.modelZ(x, y, z);
		else
			return delegate.modelZ(x, y, z);
	}

	public void noClip() {
		if( this.getDelegate() == this)
			super.noClip();
		else
			delegate.noClip();
	}

	public void noFill() {
		if( this.getDelegate() == this)
			super.noFill();
		else
			delegate.noFill();
	}

	public void noLights() {
		if( this.getDelegate() == this)
			super.noLights();
		else
			delegate.noLights();
	}

	public void noSmooth() {
		if( this.getDelegate() == this)
			super.noSmooth();
		else
			delegate.noSmooth();
	}

	public void noStroke() {
		if( this.getDelegate() == this)
			super.noStroke();
		else
			delegate.noStroke();
	}

	public void noTexture() {
		if( this.getDelegate() == this)
			super.noTexture();
		else
			delegate.noTexture();
	}

	public void noTint() {
		if( this.getDelegate() == this)
			super.noTint();
		else
			delegate.noTint();
	}

	public void normal(float nx, float ny, float nz) {
		if( this.getDelegate() == this)
			super.normal(nx, ny, nz);
		else
			delegate.normal(nx, ny, nz);
	}

	public void ortho() {
		if( this.getDelegate() == this)
			super.ortho();
		else
			delegate.ortho();
	}

	public void ortho(float left, float right, float bottom, float top) {
		if( this.getDelegate() == this)
			super.ortho(left, right, bottom, top);
		else
			delegate.ortho(left, right, bottom, top);
	}

	public void ortho(float left, float right, float bottom, float top, float near, float far) {
		if( this.getDelegate() == this)
			super.ortho(left, right, bottom, top, near, far);
		else
			delegate.ortho(left, right, bottom, top, near, far);
	}

	public void perspective() {
		if( this.getDelegate() == this)
			super.perspective();
		else
			delegate.perspective();
	}

	public void perspective(float fov, float aspect, float zNear, float zFar) {
		if( this.getDelegate() == this)
			super.perspective(fov, aspect, zNear, zFar);
		else
			delegate.perspective(fov, aspect, zNear, zFar);
	}

	public void point(float x, float y) {
		if( this.getDelegate() == this)
			super.point(x, y);
		else
			delegate.point(x, y);
	}

	public void point(float x, float y, float z) {
		if( this.getDelegate() == this)
			super.point(x, y, z);
		else
			delegate.point(x, y, z);
	}

	public void pointLight(float r, float g, float b, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.pointLight(r, g, b, x, y, z);
		else
			delegate.pointLight(r, g, b, x, y, z);
	}

	public void popMatrix() {
		if( this.getDelegate() == this)
			super.popMatrix();
		else
			delegate.popMatrix();
	}

	public void popProjection() {
		if( this.getDelegate() == this)
			super.popProjection();
		else
			delegate.popProjection();
	}

	public void popStyle() {
		if( this.getDelegate() == this)
			super.popStyle();
		else
			delegate.popStyle();
	}

	public void printCamera() {
		if( this.getDelegate() == this)
			super.printCamera();
		else
			delegate.printCamera();
	}

	public void printMatrix() {
		if( this.getDelegate() == this)
			super.printMatrix();
		else
			delegate.printMatrix();
	}

	public void printProjection() {
		if( this.getDelegate() == this)
			super.printProjection();
		else
			delegate.printProjection();
	}

	public void pushMatrix() {
		if( this.getDelegate() == this)
			super.pushMatrix();
		else
			delegate.pushMatrix();
	}

	public void pushProjection() {
		if( this.getDelegate() == this)
			super.pushProjection();
		else
			delegate.pushProjection();
	}

	public void pushStyle() {
		if( this.getDelegate() == this)
			super.pushStyle();
		else
			delegate.pushStyle();
	}

	public void quad(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
		if( this.getDelegate() == this)
			super.quad(x1, y1, x2, y2, x3, y3, x4, y4);
		else
			delegate.quad(x1, y1, x2, y2, x3, y3, x4, y4);
	}

	public void quadraticVertex(float cx, float cy, float x3, float y3) {
		if( this.getDelegate() == this)
			super.quadraticVertex(cx, cy, x3, y3);
		else
			delegate.quadraticVertex(cx, cy, x3, y3);
	}

	public void quadraticVertex(float cx, float cy, float cz, float x3, float y3, float z3) {
		if( this.getDelegate() == this)
			super.quadraticVertex(cx, cy, cz, x3, y3, z3);
		else
			delegate.quadraticVertex(cx, cy, cz, x3, y3, z3);
	}

	public void rect(float a, float b, float c, float d) {
		if( this.getDelegate() == this)
			super.rect(a, b, c, d);
		else
			delegate.rect(a, b, c, d);
	}

	public void rect(float a, float b, float c, float d, float r) {
		if( this.getDelegate() == this)
			super.rect(a, b, c, d, r);
		else
			delegate.rect(a, b, c, d, r);
	}

	public void rect(float a, float b, float c, float d, float tl, float tr, float br, float bl) {
		if( this.getDelegate() == this)
			super.rect(a, b, c, d, tl, tr, br, bl);
		else
			delegate.rect(a, b, c, d, tl, tr, br, bl);
	}

	public void rectMode(int mode) {
		if( this.getDelegate() == this)
			super.rectMode(mode);
		else
			delegate.rectMode(mode);
	}

	public void removeCache(PImage image) {
		if( this.getDelegate() == this)
			super.removeCache(image);
		else
			delegate.removeCache(image);
	}

	public void requestDraw() {
		if( this.getDelegate() == this)
			super.requestDraw();
		else
			delegate.requestDraw();
	}

	public void requestFocus() {
		if( this.getDelegate() == this)
			super.requestFocus();
		else
			delegate.requestFocus();
	}

	public void resetMatrix() {
		if( this.getDelegate() == this)
			super.resetMatrix();
		else
			delegate.resetMatrix();
	}

	public void resetProjection() {
		if( this.getDelegate() == this)
			super.resetProjection();
		else
			delegate.resetProjection();
	}

	public void resetShader() {
		if( this.getDelegate() == this)
			super.resetShader();
		else
			delegate.resetShader();
	}

	public void resetShader(int kind) {
		if( this.getDelegate() == this)
			super.resetShader(kind);
		else
			delegate.resetShader(kind);
	}

	public void resize(int wide, int high) {
		if( this.getDelegate() == this)
			super.resize(wide, high);
		else
			delegate.resize(wide, high);
	}

	public void rotate(float angle) {
		if( this.getDelegate() == this)
			super.rotate(angle);
		else
			delegate.rotate(angle);
	}

	public void rotate(float angle, float v0, float v1, float v2) {
		if( this.getDelegate() == this)
			super.rotate(angle, v0, v1, v2);
		else
			delegate.rotate(angle, v0, v1, v2);
	}

	public void rotateX(float angle) {
		if( this.getDelegate() == this)
			super.rotateX(angle);
		else
			delegate.rotateX(angle);
	}

	public void rotateY(float angle) {
		if( this.getDelegate() == this)
			super.rotateY(angle);
		else
			delegate.rotateY(angle);
	}

	public void rotateZ(float angle) {
		if( this.getDelegate() == this)
			super.rotateZ(angle);
		else
			delegate.rotateZ(angle);
	}

	public boolean save(String filename) {
		if( this.getDelegate() == this)
			return super.save(filename);
		else
			return delegate.save(filename);
	}

	public void scale(float s) {
		if( this.getDelegate() == this)
			super.scale(s);
		else
			delegate.scale(s);
	}

	public void scale(float sx, float sy) {
		if( this.getDelegate() == this)
			super.scale(sx, sy);
		else
			delegate.scale(sx, sy);
	}

	public void scale(float sx, float sy, float sz) {
		if( this.getDelegate() == this)
			super.scale(sx, sy, sz);
		else
			delegate.scale(sx, sy, sz);
	}

	public float screenX(float x, float y) {
		if( this.getDelegate() == this)
			return super.screenX(x, y);
		else
			return delegate.screenX(x, y);
	}

	public float screenX(float x, float y, float z) {
		if( this.getDelegate() == this)
			return super.screenX(x, y, z);
		else
			return delegate.screenX(x, y, z);
	}

	public float screenY(float x, float y) {
		if( this.getDelegate() == this)
			return super.screenY(x, y);
		else
			return delegate.screenY(x, y);
	}

	public float screenY(float x, float y, float z) {
		if( this.getDelegate() == this)
			return super.screenY(x, y, z);
		else
			return delegate.screenY(x, y, z);
	}

	public float screenZ(float x, float y, float z) {
		if( this.getDelegate() == this)
			return super.screenZ(x, y, z);
		else
			return delegate.screenZ(x, y, z);
	}

	public void set(int x, int y, int argb) {
		if( this.getDelegate() == this)
			super.set(x, y, argb);
		else
			delegate.set(x, y, argb);
	}

	public void set(int x, int y, PImage img) {
		if( this.getDelegate() == this)
			super.set(x, y, img);
		else
			delegate.set(x, y, img);
	}

	public void setCache(PImage image, Object storage) {
		if( this.getDelegate() == this)
			super.setCache(image, storage);
		else
			delegate.setCache(image, storage);
	}

	public void setFrameRate(float frameRate) {
		if( this.getDelegate() == this)
			super.setFrameRate(frameRate);
		else
			delegate.setFrameRate(frameRate);
	}

	public void setLoaded() {
		if( this.getDelegate() == this)
			super.setLoaded();
		else
			delegate.setLoaded();
	}

	public void setLoaded(boolean l) {
		if( this.getDelegate() == this)
			super.setLoaded(l);
		else
			delegate.setLoaded(l);
	}

	public void setMatrix(PMatrix2D source) {
		if( this.getDelegate() == this)
			super.setMatrix(source);
		else
			delegate.setMatrix(source);
	}

	public void setMatrix(PMatrix3D source) {
		if( this.getDelegate() == this)
			super.setMatrix(source);
		else
			delegate.setMatrix(source);
	}

	public void setMatrix(PMatrix source) {
		if( this.getDelegate() == this)
			super.setMatrix(source);
		else
			delegate.setMatrix(source);
	}

	public void setModified() {
		if( this.getDelegate() == this)
			super.setModified();
		else
			delegate.setModified();
	}

	public void setModified(boolean m) {
		if( this.getDelegate() == this)
			super.setModified(m);
		else
			delegate.setModified(m);
	}

	public void setParent(PApplet parent) {
		if( this.getDelegate() == this)
			super.setParent(parent);
		else
			delegate.setParent(parent);
	}

	public void setPath(String path) {
		if( this.getDelegate() == this)
			super.setPath(path);
		else
			delegate.setPath(path);
	}

	public void setPrimary(boolean primary) {
		if( this.getDelegate() == this)
			super.setPrimary(primary);
		else
			delegate.setPrimary(primary);
	}

	public void setProjection(PMatrix3D mat) {
		if( this.getDelegate() == this)
			super.setProjection(mat);
		else
			delegate.setProjection(mat);
	}

	public void setSize(int iwidth, int iheight) {
		if( this.getDelegate() == this)
			super.setSize(iwidth, iheight);
		else
			delegate.setSize(iwidth, iheight);
	}

	public void shader(PShader shader) {
		if( this.getDelegate() == this)
			super.shader(shader);
		else
			delegate.shader(shader);
	}

	public void shader(PShader shader, int kind) {
		if( this.getDelegate() == this)
			super.shader(shader, kind);
		else
			delegate.shader(shader, kind);
	}

	public void shape(PShape shape) {
		if( this.getDelegate() == this)
			super.shape(shape);
		else
			delegate.shape(shape);
	}

	public void shape(PShape shape, float x, float y) {
		if( this.getDelegate() == this)
			super.shape(shape, x, y);
		else
			delegate.shape(shape, x, y);
	}

	public void shape(PShape shape, float a, float b, float c, float d) {
		if( this.getDelegate() == this)
			super.shape(shape, a, b, c, d);
		else
			delegate.shape(shape, a, b, c, d);
	}

	public void shapeMode(int mode) {
		if( this.getDelegate() == this)
			super.shapeMode(mode);
		else
			delegate.shapeMode(mode);
	}

	public void shearX(float angle) {
		if( this.getDelegate() == this)
			super.shearX(angle);
		else
			delegate.shearX(angle);
	}

	public void shearY(float angle) {
		if( this.getDelegate() == this)
			super.shearY(angle);
		else
			delegate.shearY(angle);
	}

	public void shininess(float shine) {
		if( this.getDelegate() == this)
			super.shininess(shine);
		else
			delegate.shininess(shine);
	}

	public void smooth() {
		if( this.getDelegate() == this)
			super.smooth();
		else
			delegate.smooth();
	}

	public void smooth(int level) {
		if( this.getDelegate() == this)
			super.smooth(level);
		else
			delegate.smooth(level);
	}

	public void specular(int rgb) {
		if( this.getDelegate() == this)
			super.specular(rgb);
		else
			delegate.specular(rgb);
	}

	public void specular(float gray) {
		if( this.getDelegate() == this)
			super.specular(gray);
		else
			delegate.specular(gray);
	}

	public void specular(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.specular(v1, v2, v3);
		else
			delegate.specular(v1, v2, v3);
	}

	public void sphere(float r) {
		if( this.getDelegate() == this)
			super.sphere(r);
		else
			delegate.sphere(r);
	}

	public void sphereDetail(int res) {
		if( this.getDelegate() == this)
			super.sphereDetail(res);
		else
			delegate.sphereDetail(res);
	}

	public void sphereDetail(int ures, int vres) {
		if( this.getDelegate() == this)
			super.sphereDetail(ures, vres);
		else
			delegate.sphereDetail(ures, vres);
	}

	public void spotLight(float r, float g, float b, float x, float y, float z, float dx, float dy, float dz, float angle, float concentration) {
		if( this.getDelegate() == this)
			super.spotLight(r, g, b, x, y, z, dx, dy, dz, angle, concentration);
		else
			delegate.spotLight(r, g, b, x, y, z, dx, dy, dz, angle, concentration);
	}

	public void stroke(int rgb) {
		if( this.getDelegate() == this)
			super.stroke(rgb);
		else
			delegate.stroke(rgb);
	}

	public void stroke(float gray) {
		if( this.getDelegate() == this)
			super.stroke(gray);
		else
			delegate.stroke(gray);
	}

	public void stroke(int rgb, float alpha) {
		if( this.getDelegate() == this)
			super.stroke(rgb, alpha);
		else
			delegate.stroke(rgb, alpha);
	}

	public void stroke(float gray, float alpha) {
		if( this.getDelegate() == this)
			super.stroke(gray, alpha);
		else
			delegate.stroke(gray, alpha);
	}

	public void stroke(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.stroke(v1, v2, v3);
		else
			delegate.stroke(v1, v2, v3);
	}

	public void stroke(float v1, float v2, float v3, float alpha) {
		if( this.getDelegate() == this)
			super.stroke(v1, v2, v3, alpha);
		else
			delegate.stroke(v1, v2, v3, alpha);
	}

	public void strokeCap(int cap) {
		if( this.getDelegate() == this)
			super.strokeCap(cap);
		else
			delegate.strokeCap(cap);
	}

	public void strokeJoin(int join) {
		if( this.getDelegate() == this)
			super.strokeJoin(join);
		else
			delegate.strokeJoin(join);
	}

	public void strokeWeight(float weight) {
		if( this.getDelegate() == this)
			super.strokeWeight(weight);
		else
			delegate.strokeWeight(weight);
	}

	public void style(PStyle s) {
		if( this.getDelegate() == this)
			super.style(s);
		else
			delegate.style(s);
	}

	public void text(char c, float x, float y) {
		if( this.getDelegate() == this)
			super.text(c, x, y);
		else
			delegate.text(c, x, y);
	}

	public void text(String str, float x, float y) {
		if( this.getDelegate() == this)
			super.text(str, x, y);
		else
			delegate.text(str, x, y);
	}

	public void text(int num, float x, float y) {
		if( this.getDelegate() == this)
			super.text(num, x, y);
		else
			delegate.text(num, x, y);
	}

	public void text(float num, float x, float y) {
		if( this.getDelegate() == this)
			super.text(num, x, y);
		else
			delegate.text(num, x, y);
	}

	public void text(char c, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.text(c, x, y, z);
		else
			delegate.text(c, x, y, z);
	}

	public void text(String str, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.text(str, x, y, z);
		else
			delegate.text(str, x, y, z);
	}

	public void text(int num, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.text(num, x, y, z);
		else
			delegate.text(num, x, y, z);
	}

	public void text(float num, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.text(num, x, y, z);
		else
			delegate.text(num, x, y, z);
	}

	public void text(char[] chars, int start, int stop, float x, float y) {
		if( this.getDelegate() == this)
			super.text(chars, start, stop, x, y);
		else
			delegate.text(chars, start, stop, x, y);
	}

	public void text(String str, float x1, float y1, float x2, float y2) {
		if( this.getDelegate() == this)
			super.text(str, x1, y1, x2, y2);
		else
			delegate.text(str, x1, y1, x2, y2);
	}

	public void text(char[] chars, int start, int stop, float x, float y, float z) {
		if( this.getDelegate() == this)
			super.text(chars, start, stop, x, y, z);
		else
			delegate.text(chars, start, stop, x, y, z);
	}

	public void textAlign(int alignX) {
		if( this.getDelegate() == this)
			super.textAlign(alignX);
		else
			delegate.textAlign(alignX);
	}

	public void textAlign(int alignX, int alignY) {
		if( this.getDelegate() == this)
			super.textAlign(alignX, alignY);
		else
			delegate.textAlign(alignX, alignY);
	}

	public float textAscent() {
		if( this.getDelegate() == this)
			return super.textAscent();
		else
			return delegate.textAscent();
	}

	public float textDescent() {
		if( this.getDelegate() == this)
			return super.textDescent();
		else
			return delegate.textDescent();
	}

	public void textFont(PFont which) {
		if( this.getDelegate() == this)
			super.textFont(which);
		else
			delegate.textFont(which);
	}

	public void textFont(PFont which, float size) {
		if( this.getDelegate() == this)
			super.textFont(which, size);
		else
			delegate.textFont(which, size);
	}

	public void textLeading(float leading) {
		if( this.getDelegate() == this)
			super.textLeading(leading);
		else
			delegate.textLeading(leading);
	}

	public void textMode(int mode) {
		if( this.getDelegate() == this)
			super.textMode(mode);
		else
			delegate.textMode(mode);
	}

	public void textSize(float size) {
		if( this.getDelegate() == this)
			super.textSize(size);
		else
			delegate.textSize(size);
	}

	public float textWidth(char c) {
		if( this.getDelegate() == this)
			return super.textWidth(c);
		else
			return delegate.textWidth(c);
	}

	public float textWidth(String str) {
		if( this.getDelegate() == this)
			return super.textWidth(str);
		else
			return delegate.textWidth(str);
	}

	public float textWidth(char[] chars, int start, int length) {
		if( this.getDelegate() == this)
			return super.textWidth(chars, start, length);
		else
			return delegate.textWidth(chars, start, length);
	}

	public void texture(PImage image) {
		if( this.getDelegate() == this)
			super.texture(image);
		else
			delegate.texture(image);
	}

	public void textureMode(int mode) {
		if( this.getDelegate() == this)
			super.textureMode(mode);
		else
			delegate.textureMode(mode);
	}

	public void textureSampling(int sampling) {
		if( this.getDelegate() == this)
			super.textureSampling(sampling);
		else
			delegate.textureSampling(sampling);
	}

	public void textureWrap(int wrap) {
		if( this.getDelegate() == this)
			super.textureWrap(wrap);
		else
			delegate.textureWrap(wrap);
	}

	public void tint(int rgb) {
		if( this.getDelegate() == this)
			super.tint(rgb);
		else
			delegate.tint(rgb);
	}

	public void tint(float gray) {
		if( this.getDelegate() == this)
			super.tint(gray);
		else
			delegate.tint(gray);
	}

	public void tint(int rgb, float alpha) {
		if( this.getDelegate() == this)
			super.tint(rgb, alpha);
		else
			delegate.tint(rgb, alpha);
	}

	public void tint(float gray, float alpha) {
		if( this.getDelegate() == this)
			super.tint(gray, alpha);
		else
			delegate.tint(gray, alpha);
	}

	public void tint(float v1, float v2, float v3) {
		if( this.getDelegate() == this)
			super.tint(v1, v2, v3);
		else
			delegate.tint(v1, v2, v3);
	}

	public void tint(float v1, float v2, float v3, float alpha) {
		if( this.getDelegate() == this)
			super.tint(v1, v2, v3, alpha);
		else
			delegate.tint(v1, v2, v3, alpha);
	}

	public String toString() {
		if( this.getDelegate() == this)
			return super.toString();
		else
			return delegate.toString();
	}

	public void translate(float tx, float ty) {
		if( this.getDelegate() == this)
			super.translate(tx, ty);
		else
			delegate.translate(tx, ty);
	}

	public void translate(float tx, float ty, float tz) {
		if( this.getDelegate() == this)
			super.translate(tx, ty, tz);
		else
			delegate.translate(tx, ty, tz);
	}

	public void triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
		if( this.getDelegate() == this)
			super.triangle(x1, y1, x2, y2, x3, y3);
		else
			delegate.triangle(x1, y1, x2, y2, x3, y3);
	}

	public void updateDisplay() {
		if( this.getDelegate() == this)
			super.updateDisplay();
		else
			delegate.updateDisplay();
	}

	public void updatePixels() {
		if( this.getDelegate() == this)
			super.updatePixels();
		else
			delegate.updatePixels();
	}

	public void updatePixels(int x, int y, int w, int h) {
		if( this.getDelegate() == this)
			super.updatePixels(x, y, w, h);
		else
			delegate.updatePixels(x, y, w, h);
	}

	public void updateProjmodelview() {
		if( this.getDelegate() == this)
			super.updateProjmodelview();
		else
			delegate.updateProjmodelview();
	}

	public void updateTexture() {
		if( this.getDelegate() == this)
			super.updateTexture();
		else
			delegate.updateTexture();
	}

	public void updateTexture(int x, int y, int w, int h) {
		if( this.getDelegate() == this)
			super.updateTexture(x, y, w, h);
		else
			delegate.updateTexture(x, y, w, h);
	}

	public void vertex(float x, float y) {
		if( this.getDelegate() == this)
			super.vertex(x, y);
		else
			delegate.vertex(x, y);
	}

	public void vertex(float x, float y, float z) {
		if( this.getDelegate() == this)
			super.vertex(x, y, z);
		else
			delegate.vertex(x, y, z);
	}

	public void vertex(float x, float y, float u, float v) {
		if( this.getDelegate() == this)
			super.vertex(x, y, u, v);
		else
			delegate.vertex(x, y, u, v);
	}

	public void vertex(float x, float y, float z, float u, float v) {
		if( this.getDelegate() == this)
			super.vertex(x, y, z, u, v);
		else
			delegate.vertex(x, y, z, u, v);
	}

	public void vertex(float[] v) {
		if( this.getDelegate() == this)
			super.vertex(v);
		else
			delegate.vertex(v);
	}
}
