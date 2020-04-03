
package Exercises;

import cezeri.matrix.CMatrix;

/**
 *
 * @author YUSUFNAS
 */
public class Exercises {

    public static void main(String[] args) {

        CMatrix cm1 = CMatrix.getInstance()
                .range(1, 5)
                .reshape(2, 2)
                .dump();

        CMatrix cm2 = CMatrix.getInstance()
                .range(5, 9)
                .reshape(2, 2)
                .dump();

        dotproduct(cm1, cm2);
    }

    public static void dotproduct(CMatrix m1, CMatrix m2) {
        CMatrix sub = CMatrix.getInstance().range(4).multiplyScalar(0).addScalar(1).reshape(2, 2)
                .multiplyElement(m1)
                .multiplyElement(m2)
                .dump()
                ;
    }

}
