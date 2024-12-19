class BoxVol {
    double width;
    double length;
    double depth;
    BoxVol(BoxVol ob) {
        width = ob.width;
        length = ob.length;
        depth = ob.depth;
    }
    BoxVol(double w, double l, double d) {
        width = w;
        length = l;
        depth = d;
    }
    BoxVol() {
        width = -1;
        length = -1;
        depth = -1;
    }
    BoxVol(double len) {
        length = width = depth = len;
    }
    double volume() {
        return length * width * depth;
    }
}
public class Boxes {
    public static void main(String[] args) {
        BoxVol b1 = new BoxVol(); 
        BoxVol b2 = new BoxVol(10); 
        BoxVol b3 = new BoxVol(20, 30, 40);
        BoxVol b4 = new BoxVol(b3);
        System.out.println("Volume of b1 = " + b1.volume());
        System.out.println("Volume of b2 = " +b2.volume());
        System.out.println("Volume of b3 = " +b3.volume());
        System.out.println("Volume of b4 = " + b4.volume());
    }
}
