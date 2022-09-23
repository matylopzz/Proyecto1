package listasdobleenlazadas;


public class ListasDobleEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDible listita = new ListaDoble();
        int opcion=0, elemento;
        
        do
        {
            try
            {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Agregar nodo Inicio\n"
                          +"2.Agregar nodo Final\n"
                                + "3Mostrar lista inicio fin\n"
                                + "4.Mostrar lista fin inicio\n"
                                + "5.Salir\n"
                                + "Que desea hacer ?\n",
                                jOptionPane.INFORMATION_MESSAGE));
            }
        }
        
    }
    
}
