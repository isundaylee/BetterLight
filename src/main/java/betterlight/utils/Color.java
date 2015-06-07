package betterlight.utils;

public class Color {
	
	private int red; 
	private int green; 
	private int blue; 
	
	private static final int COLOR_MIN = 0;  
	private static final int COLOR_MAX = 255;
	
	public static final Color white = new Color(COLOR_MAX, COLOR_MAX, COLOR_MAX); 
	
	public Color(int r, int g, int b) {
		super();
		
		this.red = r; 
		this.green = g; 
		this.blue = b;  
	}

	public Color(int color) {
		this(
			((color & 0x00ff0000) >> 16),
			((color & 0x0000ff00) >> 8), 
			(color & 0x000000ff)
		);
	}
	
	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public int toInteger() {
		return (this.red << 16) + (this.green << 8) + this.blue; 
	}
	
}
