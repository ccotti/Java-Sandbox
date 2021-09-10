// public class a7p1Rectangle {
    
// 	// Instance Variables
// 	private double length = 1.0;
// 	private double width = 1.0;
// 	private double perimeter;
// 	private double area;
	
// 	// Constructor that initializes
// 	public a7p1Rectangle(double length, double width) {
// 		this.length = length;
// 		this.width = width;
// 	}
	
// 	// Start of set methods which will assign the values to length and width
// 	// This will also verify that length and width are between 0.0 and 20.0
// 	public void setLength(double length) {
// 		if (length > 0.0 && length < 20.0) {
// 			this.length = length;
// 		}
// 		else {
// 			throw new IllegalArgumentException("IllegalArgumentException: Length and Width need to be between 0.0 and 20.0"); //Exception Throw
// 		}
// 	}

// 	public void setWidth(double width) {
// 		if (width > 0.0 && width < 20.0) {
// 			this.width = width;
// 		}
// 		else {
// 			throw new IllegalArgumentException("IllegalArgumentException: Length and Width need to be between 0.0 and 20.0");  //Exception Throw
// 		}
// 	}
	
// 	public void setPerimeter(double perimeter) {
// 		this.perimeter = perimeter;
// 	}
	
// 	public void setArea(double area) {
// 		this.area = area;
// 	}
	
// 	// Start of get methods which will retrieve and return the values for length and width
// 	public double getLength() {
// 		return length;
// 	}
// 	public double getWidth() {
// 		return width;
// 	}

// 	public double getPerimeter() {
// 		return perimeter;
// 	}

// 	public double getArea() {
// 		return area;
// 	}

// 	//method to calculate perimeter
// 	public static double calculatePerimeter (double length, double width) {
// 		double perimeter = 2 * (length + width);
// 		return perimeter;
// 	}
	
// 	//method to calculate area  
// 	public static double calculateArea (double length, double width) {
// 		double area = length * width;
// 		return area;
// 	}
	
// }
