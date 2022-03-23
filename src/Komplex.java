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

    public int hashCode() {
        return Objects.hash(super.hashCode(), real, img);
    }
}