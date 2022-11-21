package dmg;

public interface Vector {
    void setX(float x);
    void setY(float y);
    float getX();
    float getY();
    void scale(float f);
    void add(Vector f);
}
