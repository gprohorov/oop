package pro.edu;

public class Triangle {

    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle() {
    }

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(float sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }




    public Triangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float) Math.sqrt(sideA*sideA + sideB*sideB );
    }
    public Triangle(float sideA, float sideB, double alpha) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float) Math.sqrt(sideA*sideA + sideB*sideB - 2*sideA*sideB*Math.cos(alpha) );
    }
    public Triangle(float sideA, double beta, double alpha) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float) Math.sqrt(sideA*sideA + sideB*sideB - 2*sideA*sideB*Math.cos(alpha) );
    }











}
