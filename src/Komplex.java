import java.util.Objects;

public class Komplex {
    double real;
    double img;

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Komplex komplex = (Komplex) object;
        return java.lang.Double.compare(komplex.real, real) == 0 && java.lang.Double.compare(komplex.img, img) == 0;
    }

    public Komplex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Komplex{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), real, img);


    }

    public Komplex add(Komplex b) {
        return new Komplex(real + b.real, img + b.img);
    }
}