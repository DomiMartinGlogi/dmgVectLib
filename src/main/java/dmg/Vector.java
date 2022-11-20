package dmg;

public interface Vector {
    void setX(float x);
    void setY(float y);
    float getX();
    float getY();
    void transform(float f);
    void add(Vector f);
}
