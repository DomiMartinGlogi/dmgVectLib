package dmg;

public class Vect2 implements Vector{
    private float x;
    private float y;

    public Vect2(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void transform(float f) {
        this.x = this.x * f;
        this.y = this.y * f;
    }

    @Override
    public void add(Vector f) {
        this.x = f.getX() + this.x;
        this.y = f.getY() + this.y;
    }

    public void linTransform(Matrix2x2 m){
        this.x = (m.getVectorA().getX() * this.x) + (m.getVectorB().getX() * this.x);
        this.y = (m.getVectorA().getY() * this.y) + (m.getVectorA().getY() * this.y);
    }

}
