package dmg;

public class Matrix2x2 implements Matrix{
    private Vect2 vectorA;
    private Vect2 vectorB;

    @Override
    public Vector getVectorA() {
        return vectorA;
    }

    @Override
    public Vector getVectorB() {
        return vectorB;
    }

    @Override
    public void setVectorA(float x, float y) {
        Vect2 a = new Vect2();
        a.setX(x);
        a.setY(y);
        this.vectorA = a;
    }

    public void setVectorA(Vect2 vector){
        this.vectorA = vector;
    }
    @Override
    public void setVectorB(float x, float y) {
        Vect2 a = new Vect2();
        a.setX(x);
        a.setY(y);
        this.vectorB = a;
    }

    public void setVectorB(Vect2 vector){
        this.vectorB = vector;
    }

    public void create(Vect2 vectorA, Vect2 vectorB) {
        setVectorA(vectorA);
        setVectorB(vectorB);
    }
}
