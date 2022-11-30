public class Client {
    public static void main(String[] args)
    {
        Imemento memento;
        OpcionVehiculo opcion1 = new OpcionVehiculo("Asientos en cuero");
        OpcionVehiculo opcion2 = new OpcionVehiculo("Reclinables");
        OpcionVehiculo opcion3 = new OpcionVehiculo("Asientos deportivos");

        opcion1.agregaOpcionIncompatible(opcion3);
        opcion2.agregaOpcionIncompatible(opcion3);
        CarritoOpciones carritoOpciones = new CarritoOpciones();
        carritoOpciones.agregaOpcion(opcion1);
        carritoOpciones.agregaOpcion(opcion2);
        carritoOpciones.visualiza();
        memento = carritoOpciones.agregaOpcion(opcion3);
        carritoOpciones.visualiza();
        carritoOpciones.anula(memento);
        carritoOpciones.visualiza();

        /*
        Salida
        Contenido del carrito de opciones
        opcion: Asientos en cuero
        opcion: Reclinables

        Contenido del carrito de opciones
        opcion: Asientos deportivos

        Contenido del carrito de opciones
        opcion: Asientos en cuero
        opcion: Reclinables
        */
    }
}

