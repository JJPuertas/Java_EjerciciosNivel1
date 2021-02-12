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
        
        auxiliar = cambiaAcentos(_frase);
        
        
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
   
   // aqui va la parte 2 de los ejercicios 
   
   
   // EJERCICIO 1 PARTE 2 Acronimos: 
   /**
    * este metodo recive un string formado por varias palabras y devuelve el acronimo de todas las palabras.
    * 
    */
   
   
   
   public String[] divideFrase(String frase){
       
       String aux = "";
       
       int numEspaciosBlanco = 0;
       
       for (int i = 0; i < frase.length(); i++){
           
           if (frase.charAt(i) == ' '){
               numEspaciosBlanco ++;
           }
           
       }
       
       String[] dividido = new String[numEspaciosBlanco + 1];
       
       int contadorPalabra = 0;
       
       for (int i = 0; i < frase.length(); i++){
           
           if (frase.charAt(i) == ' '){
               
               dividido[contadorPalabra] = aux;
               aux = "";
               contadorPalabra ++; 
           }else{
               aux += frase.charAt(i);
           }
       }
       dividido[contadorPalabra] = aux;
       
       return dividido;
   }
   /**
    * recibe frase y devuelve acronimo
    * @param frase
    * @return 
    */
   public String acronimo(String frase){
       
       frase = frase.toLowerCase();
       
       String [] palabras = divideFrase(frase);
       
       String aux = "";
       
       for(int i = 0; i < palabras.length; i++ ){
           
           if(palabras[i].length() > 0){
           if( palabras[i].equals ("y") || palabras[i].equals ("e") || palabras[i].equals ("la") || palabras[i].equals ("las") || palabras[i].equals ("de") || palabras[i].equals (" ")){
               
           
           }else{
               aux += palabras[i].charAt(0);
           }
           }
       }
       
        aux = aux.toUpperCase();
       
       return aux;
   }
   
   // EJERCICIO 2  PARTE 2
   /**
    * si es anagrama devuelve true si no false 
    * @param p1 
    * @param p2 
     * @return  
    */
   
   public boolean anagrama(String p1, String p2){
       
      p1 = quitaEspaciosEnBlanco(p1);
      p2 = quitaEspaciosEnBlanco(p2);
                                        //Vamos quitando las letras no convenientes para el anagrama 
      p1 = cambiaAcentos(p1);
      p2 = cambiaAcentos(p2); 
      
      p1 = p1.toLowerCase();
      p2 = p2.toLowerCase();
      
      //String comprobacion = "";
      
      if( p1.length() != p2.length()){
          return false; // no tienen nuemro de letras iguales por lo que no es anagrama 
      }
      if(p1.length() == 0 || p2.length() == 0){
          return false;
      } 
      
       for(int i = 0; i < p1.length(); i++){
           
           if(p2.contains("" + p1.charAt(i))){
               // Busco donde esta la letra y luego hago algo con ella
       
            p2 = p2.replaceFirst ((String.valueOf(p1.charAt(i))) , ("-"));

           
           }else{
               return false;
           }   
       }
       
       
       
       return true;
   }
   
   
   // EJERCICIO 3 PARTE 2 
   
   /**
    * 
    * @param dia  // DIAS NO CONTADOS PARA QUE EMPIECE EL MES  
    */
   public void calendario(int dia){
       // PRIMERA PARTE: IMPRIMIR LAS XX 
       
       dia = dia % 7;
       
      // int[] calen = new int[34];
       
       for(int i = 0; i<dia ; i++){
           System.out.print("XX ");
           
       }
       
       // SEGUNDA PARTE: IMPRIMIR DEL 1 AL 31
       
       int contador = dia +1; 
       
       for(int i = 1; i<=31; i++){
           
           if(i < 10) {
               if (contador%7 == 0){
                   System.out.println("0" + i + " ");
                   
               }
               else{
               System.out.print("0" + i + " ");
               
               }
           }
           else{
               
               if (contador%7 == 0){
                   System.out.println(i + " ");
                   
               }
               else{System.out.print(i + " ");
                
               }
            }
           contador++;
       }
       
     
//       //3º fase: dibujar las XX finales
//            while(contador % 7 !=0){
//                System.out.print("XX");
//                contador++;
//            }

       
       
       
       // SI EL DIA ES DIVISOR DE 7 ME SOBRAN 4 espacios para poner xx 
       
//        if(dia == 0){
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//        }
//        if(dia == 1){
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//          
//        }
//        if(dia == 2){
//           System.out.print("XX ");
//           System.out.print("XX ");
//           
//        }
//        if(dia == 3){
//           System.out.print("XX ");
//           
//        }
//        
//        if(dia == 5){
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//        }
//        if(dia == 6){
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//           System.out.print("XX ");
//        }
   }
    
    public static void main(String[] args) {
        EjerciciosNivel1Java ejercicio = new EjerciciosNivel1Java();
        
        
        
//        // EJERCICIO 1 del system out
//        System.out.println("Los valores maximos son: " + Arrays.toString(ejercicio.maximo(ejercicio.listaNumeros))); // Paso el array a string pq si no peta con la frase del principio ;))
//    
//        //Ejercicio 2 del System out 
//        System.out.println("La Frase es Palíndromo: " + (ejercicio.palIndromo(ejercicio.frase))); // accedo a la variable de instancia forzandolo mediante un puntero de objeto que le haga referencia para que este reservado en memoria
//        
//        System.out.println("palabra junta " + (ejercicio.quitaEspaciosEnBlanco(ejercicio.frase)));
//        
//        System.out.println("Esta palabra es isodromo si sale true, si no te jode y bailas: " + (ejercicio.isodromo("murcielagoé")));
            
          System.out.println((ejercicio.acronimo("Centro de Estudios Tecnológicos Y  Sociales")));
          
          System.out.println("Si es True significa que si que es anagrama: " + ejercicio.anagrama("rO má", "aM ór"));
       
          
          ejercicio.calendario(0b101110100010100111010010);
    }

}
