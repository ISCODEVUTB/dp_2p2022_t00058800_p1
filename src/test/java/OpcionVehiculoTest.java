import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpcionVehiculoTest {
    public List<OpcionVehiculo> pruebas = new ArrayList<OpcionVehiculo>();
    String mensaje2 = "opcion: Asientos en cuero \n";
    @Test
    public void agregaOpcionIncompatible() {
        OpcionVehiculo opcionIcompatible = new OpcionVehiculo("Asientos en cuero");
        opcionIcompatible.agregaOpcionIncompatible(opcionIcompatible);
        pruebas.add(opcionIcompatible);
        assertEquals(opcionIcompatible.getOpcionesIncompatibles(),pruebas);
    }
    @Test
    public void vizualiza() {
        String mensaje1 = "opcion: Asientos en cuero \n";
        OpcionVehiculo opcion = new OpcionVehiculo("Asientos en cuero");
        opcion.visualiza();
        assertEquals(mensaje1,mensaje2);

    }

}
