import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoImplTest {
    public List<OpcionVehiculo> pruebas = new ArrayList<OpcionVehiculo>();


    @Test
    public void setEstado() {
        MementoImpl memento = new MementoImpl();
        OpcionVehiculo opcion1 = new OpcionVehiculo("Asientos en cuero");
        pruebas.add(opcion1);
        memento.setEstado(pruebas);
        assertEquals(memento.getEstado(),pruebas);
    }
}
