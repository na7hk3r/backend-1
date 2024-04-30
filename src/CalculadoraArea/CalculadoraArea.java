package CalculadoraArea;

public class CalculadoraArea {

    public static void calcularArea(String figura, double medida) {
        if (medida <= 0) {
            System.out.println("El valor del radio o lado debe ser mayor que cero");
            return;
        }

        double area;

        if (figura.equals("círculo")) {
            area = calcularAreaCirculo(medida);
        } else if (figura.equals("cuadrado")) {
            area = calcularAreaCuadrado(medida);
        } else {
            System.out.println("Figura geométrica no reconocida");
            return;
        }

        System.out.println("El área del " + figura + " es " + area + " unidades");
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }
}