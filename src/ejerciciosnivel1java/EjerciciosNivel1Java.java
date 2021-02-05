//Autor Jorge Puertas. Ejercicio nº 1 nivel: chungo de cojones, pero seguimos fuertes. 
package ejerciciosnivel1java;

import java.util.Arrays; // importamos esto que no se que es porque no nos lo has dicho pero no pasa nada se te quiere igual 
import sun.util.locale.LocaleUtils;


public class EjerciciosNivel1Java {

    // EJERCICIO 1
    
    int[] listaNumeros; // Declaro el array vacio lista de numero s
    String frase = "Acaso hubo buhos aca";
    
    public EjerciciosNivel1Java() {
       
        this.listaNumeros = new int[]{30, 50,' ', 70, 200, 200, 95}; // Añado constructor para que el espacio vacío deje de tocar los pelendengues porque si no no funciona 
    }
    // CONTRUCTOR 
     
   public int[] maximo(int[] lista) {      // Funcion 

        int[] sol = {0, 0};  // Creo un vector vacio para almacenar la solucion
        int aux = lista[0];  // El máximo va a ser el primer elemento del array
        int aux2 = lista[0]; // Creo el segundo auxiliar para empezar a rastrear
        
        
//        for(int k = 0; k < lista.length; k++ ){
//          
//           for(int n = k+1; n < lista.length; n++ ){    // He intentado que no se repitan pero es imposible de esta manera
//            
//               sol[0] = 8;
//               if(lista[n] == lista[k]){
//                  sol[0] = 4; 
//               }
//                
//           }
//               
//           
//            
//        } 
          
        

        for (int j = 1; j < lista.length; j++) { // Uso primer bucle con la primera auxiliar para hayar el primer maximo y guardarlo en la tercera variable. 
            if (aux < lista[j]) {
                aux = lista[j];
            }
            sol[0] = aux;        //Asigno primera variable a la solucion final posicion 0 
        }
// Si llegas a leer este comentario avisame porque si no es que me da mucha pereza comentar si realmente no te lo vas a leer por eso pongo mensajes graciosillos pero es un coñazo 

        for (int i = 1; i < lista.length; i++) { // Segundo bucle igual que el anterior y guardo valor en la posicion uno del array solucion. 
            if (aux2 < lista[i] && lista[i] != aux) {
                aux2 = lista[i];
            }

            sol[1] = aux2;
        }

        return sol; // devuelvo la solucion al main con return 
    }
    //EJERCICIO 2
   
  // String frase = "Acaso hubo buhos aca"; // preguntar a jorge porque  no funciona en el constructor.
    
   public String quitaEspaciosEnBlanco(String cadena){
       String auxiliar = "";
       
       for(int i = 0; i<cadena.length(); i++){
           if(cadena.charAt(i) != ' '){
               
               auxiliar += cadena.charAt(i);
            }
        }
       return auxiliar;
    } 
   
   
   
   public boolean palIndromo(String _frase){
        
        // Primer tramo. Quitar los espacios en blanco de la cadena.
        
        String auxiliar = quitaEspaciosEnBlanco(frase);
        
        auxiliar = auxiliar.toLowerCase();
        
        
        int indiceIzq = 0;
        
        int indiceDer = auxiliar.length() - 1;
        
        while ( auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
             indiceIzq ++; 
             indiceDer --;
        }
        
        if(indiceIzq < indiceDer){
            return false;            
        }
        else{
            return true;
        }
        
       
        
    }
   
   public boolean isodromo(String _palabra){
       
       _palabra = _palabra.toLowerCase();
       _palabra = cambiaAcentos(_palabra);
       
       for(int i = 0; i < _palabra.length(); i++){
           for(int j = i + 1; j < _palabra.length(); j++){
               if(_palabra.charAt(i) == _palabra.charAt(j)){
                   return false;
               }
           }
       }

       return true;
   }
   
   public String cambiaAcentos(String _palabra){
       
       String aux = "";
       char auxa = 'a';
       char auxe = 'e';
       char auxi = 'i';
       char auxo = 'o';
       char auxu = 'u';
       
       
       for(int i = 0; i<_palabra.length(); i ++ ){
           
           if(_palabra.charAt(i) != 'á' && _palabra.charAt(i) != 'é' && _palabra.charAt(i) != 'í' && _palabra.charAt(i) != 'ó' && _palabra.charAt(i) != 'ú'){
               
               aux += _palabra.charAt(i);
            }
           if (_palabra.charAt(i) == 'á'){
               aux += auxa;
           }
           if (_palabra.charAt(i) == 'é'){
               aux += auxe;
           }
           if (_palabra.charAt(i) == 'í'){
               aux += auxi;
           }
           if (_palabra.charAt(i) == 'ó'){
               aux += auxo;
           }
           if (_palabra.charAt(i) == 'ú'){
               aux += auxu;
           }
           
       }

       return aux;
   }
   
    
    public static void main(String[] args) {
        EjerciciosNivel1Java ejercicio = new EjerciciosNivel1Java();
        
        
        
        // EJERCICIO 1 del system out
        System.out.println("Los valores maximos son: " + Arrays.toString(ejercicio.maximo(ejercicio.listaNumeros))); // Paso el array a string pq si no peta con la frase del principio ;))
    
        //Ejercicio 2 del System out 
        System.out.println("La Frase es Palíndromo: " + (ejercicio.palIndromo(ejercicio.frase))); // accedo a la variable de instancia forzandolo mediante un puntero de objeto que le haga referencia para que este reservado en memoria
        
        System.out.println("palabra junta " + (ejercicio.quitaEspaciosEnBlanco(ejercicio.frase)));
        
        System.out.println("Esta palabra es isodromo si sale true, si no te jode y bailas: " + (ejercicio.isodromo("murcielagoé")));
    }

}
