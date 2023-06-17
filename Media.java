
package sp.senai.br.calculos;


public class Media {
    
    public static void main(String args[]){   
       
        Calculos biblioteca = new Calculos();
        
        biblioteca.inserirNotas();
        biblioteca.calcularMedia();
        biblioteca.verificarSituacao();
        biblioteca.exibirResultados();
        
    	System.exit(0);
		
    }
}