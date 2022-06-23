package herencia;

public class tiempoFuturo extends edadAFuturo{

    public tiempoFuturo(int edadActual, int años) {
        super(edadActual, años);
        this.calcularEdadAFuturo();
    }

    @Override
    public void calcularEdadAFuturo() {
        this.edadAFuturo = this.edadActual + this.años;
    }

    public int getEdadAFuturo(){
        return edadAFuturo;
    }
}
