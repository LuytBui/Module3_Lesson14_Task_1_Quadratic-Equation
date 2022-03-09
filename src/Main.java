import com.codegym.QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(2, 4, 6);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(0, 1, -6);
        QuadraticEquation quadraticEquation3 = new QuadraticEquation(5, -9, 6);
        QuadraticEquation quadraticEquation4 = new QuadraticEquation(1, -9, 1);

        processQuadraticEquation(quadraticEquation1);
        processQuadraticEquation(quadraticEquation2);
        processQuadraticEquation(quadraticEquation3);
        processQuadraticEquation(quadraticEquation4);

    }

    private static void processQuadraticEquation(QuadraticEquation quadraticEquation) {
        System.out.println(quadraticEquation);
        quadraticEquation.solve();
        System.out.println(quadraticEquation.getStatus());
        if (quadraticEquation.hasRoot())
            System.out.println(quadraticEquation.printRootList());
        System.out.println();
    }
}
