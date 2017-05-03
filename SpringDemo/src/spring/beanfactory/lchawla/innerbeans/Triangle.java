package spring.beanfactory.lchawla.innerbeans;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A = " +getPointA().getX() + " Point A = " +getPointA().getY());
		System.out.println("Point B = " +getPointB().getX() + " Point B = " +getPointB().getY());
		System.out.println("Point C = " +getPointC().getX() + " Point C = " +getPointC().getY());

	}
}
