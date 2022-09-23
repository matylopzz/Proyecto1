
public class Tp1Ejercicio14 {
    
    public int[]gastos;  //Atributo
    
    public Tp1Ejercicio14(){
    gastos = new int[] {0,0,0,0,0,0,0};
    }
    
    public void Mostrar(){ //Metodos --> parece que llevan el void
        for( int i = 0; i<7; i++)
            System.out.print(gastos[i]+ " ");
    }
    public void CargarGastos(int NroDeDia, int imported){  int[] CargarGastos = null;
// imported=gastos del dia  PARAMETROS
        CargarGastos[NroDeDia] = imported;
    }  
    /**
     *
     * @return
     */
    public int MostrarMayorGasto(){
        
        int numMax=0;
        int j;
        for(j=0; j<7;j++){
            if (gastos[j]>numMax){
            }
        }
        return numMax;
    }
    public int MostrarDia(int NroDeDia){
        return gastos[NroDeDia];
    
    }  
    
}
