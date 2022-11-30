import java.util.*;
public class CarritoOpciones
{
    protected List<OpcionVehiculo> opciones =
            new ArrayList<OpcionVehiculo>();

    public Imemento agregaOpcion(OpcionVehiculo opcionVehiculo)
    {
        MementoImpl resultado = new MementoImpl();
        resultado.setEstado(opciones);
        opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());
        opciones.add(opcionVehiculo);
        return resultado;
    }

    public void anula(Imemento memento)
    {
        MementoImpl mementoImplInstance = new MementoImpl();
        opciones = mementoImplInstance.getEstado();
    }

    public void visualiza()
    {
        System.out.println("Contenido del carrito de opciones");
        for (OpcionVehiculo opcion: opciones)
            opcion.visualiza();
        System.out.println();
    }
}

