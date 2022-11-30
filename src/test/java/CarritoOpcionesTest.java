import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CarritoOpcionesTest {
    public List<OpcionVehiculo> pruebas = new ArrayList<OpcionVehiculo>();
    String mensaje2 = "Contenido del carrito de opciones\n" +
            "opcion: Asientos en cuero";


    @Test
    public void agregaOpcion() {
        MementoImpl memento = new MementoImpl();
        CarritoOpciones carritoOpciones = new CarritoOpciones();
        OpcionVehiculo opcion1 = new OpcionVehiculo("Asientos en cuero");
        carritoOpciones.agregaOpcion(opcion1);
        assertEquals(memento.getEstado(),pruebas);
    }

    @Test
    public void visualiza(){
        String mensaje1 = "Contenido del carrito de opciones\n" +
                "opcion: Asientos en cuero";
        CarritoOpciones carritoOpciones = new CarritoOpciones();
        OpcionVehiculo opcion1 = new OpcionVehiculo("Asientos en cuero");
        carritoOpciones.agregaOpcion(opcion1);
        assertEquals(mensaje1,mensaje2);
    }
}
