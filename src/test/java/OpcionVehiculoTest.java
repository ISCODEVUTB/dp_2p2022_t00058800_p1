import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionVehiculoTest {
    public List<OpcionVehiculo> pruebas = new ArrayList<OpcionVehiculo>();
    @Test
    public void agregaOpcionIncompatible() {
        OpcionVehiculo opcionIcompatible = new OpcionVehiculo("Asientos en cuero");
        opcionIcompatible.agregaOpcionIncompatible(opcionIcompatible);
        pruebas.add(opcionIcompatible);
        assertEquals(opcionIcompatible.getOpcionesIncompatibles(),pruebas);
    }
    @Test
    public void vizualiza() {
        String mensaje = "opcion: Asientos en cuero \n";
        OpcionVehiculo opcion = new OpcionVehiculo("Asientos en cuero");
        opcion.visualiza();
        assertEquals(mensaje,mensaje);

    }

}
