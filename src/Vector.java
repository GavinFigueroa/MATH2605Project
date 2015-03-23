// Vector.java
// Version 1.0

public class Vector {
    private double[] vector;

    public Vector(double[] vector) {
        this.vector = vector;
    }

    /**
     * Returns the transpose of the vector
     * @return the transpose matrix
     */
    public Matrix getTranspose() {
        double[][] transpose = new double[1][vector.length];
        for (int i = 0; i < vector.length; i++) {
            transpose[1][i] = vector[i];
        }
        return new Matrix(transpose);
    }

    /**
     * Returns the element at the given index
     * @param index of the element
     * @return element at that index
     */
    public double get(int index) {
        if (index < 0 || index > vector.length - 1) {
            throw new IndexOutOfBoundsException("Index outside of vector length!");
        }
        return vector[index];
    }

    /**
     * Returns the size of the vector
     * @return size of the vector
     */
    public int getSize() { return vector.length; }

    /**
     * Multiplies the vector by a scalar
     * @param c1 the scalar
     * @return the new vector scaled
     */
    public Vector scale(double c1) {
        double[] scaled = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            scaled[i] = vector[i] * c1;
        }
        return new Vector(scaled);
    }
}
