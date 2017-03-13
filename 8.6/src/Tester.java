
public class Tester 
{
	public static void main(String[] args)
	{
		Cube cube1 = new Cube(4.0);
		Cylinder cylinder1 = new Cylinder(4.0, 4.0);
		Sphere sphere1 = new Sphere(4.0);
		Cone cone1 = new Cone(4.0, 4.0);
		
		System.out.println(cube1.getSurfaceArea());
		System.out.println(cube1.getVolume());
		System.out.println(cylinder1.getSurfaceArea());
		System.out.println(cylinder1.getVolume());
		System.out.println(sphere1.getVolume());
		System.out.println(sphere1.getSurfaceArea());
		System.out.println(cone1.getSurfaceArea());
		System.out.println(cone1.getVolume());
		
	}
}
