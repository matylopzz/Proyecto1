
public class Contenedor14 {

    public static void main(String[] args){
    
        Contenedor14 miobjeto = new Contenedor14();
        
        miobjeto.Mostrar();
        
        miobjeto.CargarGastos(1,10);
        miobjeto.CargarGastos(5,35); //Cargando el vecetor de manera manual
        miobjeto.Mostrar();
        int nmax = miobjeto.MostrarMayorGasto();
        System.out.println("Mayor numero gasto"+" "+nmax);
        int DiaSeleccionado = miobjeto.MostrarDia(5);
        System.out.println("Dia con Mayor gasto"+" "+DiaSeleccionado);
        
        
    
    }

    private void Mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void CargarGastos(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int MostrarMayorGasto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int MostrarDia(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
