
public class RoomDimension {
	/**one for the length of the room and one for the width. 
The RoomDimension class should have a method that returns the area of the room. 
(The area of the room is the room’s length multiplied by the room’s width.)*/

	private double length;
	private double width;
	private double area;
	
	public double getArea(){
		area = length * width;
		return area;
	}
	
	
	
}
