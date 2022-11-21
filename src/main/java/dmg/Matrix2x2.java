package dmg;

public class Matrix2x2 implements Matrix{
    private Vect2 vectorA;
    private Vect2 vectorB;

    public Matrix2x2(Vect2 a, Vect2 b){
        this.vectorA = a;
        this.vectorB = b;
    }
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
        Vect2 a = new Vect2(x, y);
        this.vectorA = a;
    }

    public void setVectorA(Vect2 vector){
        this.vectorA = vector;
    }
    @Override
    public void setVectorB(float x, float y) {
        Vect2 a = new Vect2(x, y);
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
