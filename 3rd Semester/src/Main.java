class Boxs
{
	private double width;
	private double length;
	private double depth;
	Boxs(Boxs ob)
	{
		width = ob.width;
		depth = ob.depth;
		length = ob.length;
	}
	Boxs(double w ,double l ,double d)
	{
		width = w;
		depth = d;
		length = l;
	}
	Boxs()
	{
		width = -1;
		depth = -1;
		length = -1;
	}
	Boxs(double len)
	{
		width=depth=length=len;
	}
	double volume()
	{
		return depth*width*length;
	}
}
class Boxweight extends Boxs{
	double weight;
	Boxweight(Boxweight ob)
	{
		super(ob);
		weight=ob.weight;
	}
	Boxweight(double w ,double l ,double d,double m)
	{
		super(w,l,d);
		weight=m;
	}
	Boxweight()
	{
		super();
		weight=-1;
	}
	Boxweight(double len,double m)
	{
		super(len);
		weight=m;
	}
}
class Shipment extends Boxweight{
	double cost;
	Shipment(Shipment ob){
		super(ob);
		cost=ob.cost;
	}
	Shipment(double w ,double l ,double d,double m,double c){
		super(w,l,d,m);
		cost=c;
	}
	Shipment(){
		super();
		cost=-1;
	}
	Shipment(double len,double m , double c){
		super(len,m);
		cost=c;
	}
}

public class Main {

	public static void main(String[] args) {
		Shipment shipment1=new Shipment(10,20,15,10,3.41);
		Shipment shipment2=new Shipment(2,3,4,0.76,1.28);
		double vol;
		vol=shipment1.volume();
		System.out.println("Volume of Shipment 1 is :"+ vol);
		System.out.println("Weight of Shipment 1 is :"+ shipment1.weight);
		System.out.println("Shipping cost is : $ "+ shipment1.cost);
		System.out.println();
		vol=shipment2.volume();
		System.out.println("Volume of Shipment 2 is :"+ vol);
		System.out.println("Weight of Shipment 2 is :"+ shipment2.weight);
		System.out.println("Shipping cost is : $ "+ shipment2.cost);
	}
}
