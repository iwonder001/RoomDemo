
public class RoomCarpet {
/**Next you should create a RoomCarpet class that has a RoomDimension object as a field. 
It should also have a field for the cost of the carpet per square foot. 
The RoomCarpet class should have a method that returns the total cost of the carpet.
 */
	
	RoomDimension size = new RoomDimension();
	private double carpetCost;
	
	
//	public RoomCarpet(RoomDimension size, double carpetCost) {
//		this.size = size;
//		this.carpetCost = carpetCost;
//	}
//	
	public double getTotalCost (double cost) {
		carpetCost = cost * size.getArea();
		return carpetCost;
	}
	
	
}

