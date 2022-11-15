
package modelo;

public class Modelo {

    double resultado;

    public Modelo() {

    }

    public Modelo(double resultado) {
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void sumar(double num1) {
        this.resultado = resultado+num1;

    }

    public void restar(double num1) {
        this.resultado = resultado-num1;

    }

    public void multiplicacion(double num1) {
        this.resultado = resultado*num1;

    }

    public void division(double num1) {
        if (num1 != 0) {
            this.resultado = resultado/num1;
        }

    }

    
}