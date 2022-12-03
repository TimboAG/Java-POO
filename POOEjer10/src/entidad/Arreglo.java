package entidad;

public class Arreglo {

    private double[] a = new double[50];
    private double[] b = new double[20];

    public void mostrarA() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void mostrarB() {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public Arreglo() {
    }

    public Arreglo(double[] a, double[] b) {
        this.a = a;
        this.b = b;
    }

    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {

        this.a = a;
    }

    public double[] getB() {
        return b;
    }

    public void setB(double[] b) {
        this.b = b;
    }

}