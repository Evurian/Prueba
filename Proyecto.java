import java.util.Arrays;

public class Ejercicio {
    public static boolean esCuadrada(int[ ] [ ] matriz ){
        if(matriz.length == matriz[1].length ){
            return true;
        } 
        return false;
    }
    public static int[] diagonal(int[][] matriz){
        int[] diagonal = new int[matriz.length];
        for(int i = 0; i < matriz.length; i++){
            diagonal[i] = matriz[i][i] ;
        }
        return diagonal;
    }
    public static boolean esIdentidad(int[][] matriz){
        int contador  = 0;
        for(int i = 0; i < matriz.length; i++){
            if(matriz[i][i] == 1){
                contador++;
            }
            if(contador == matriz.length){
                return true;
            }
        }
        return false;
    }
    public static boolean esDiagonal(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i != j && matriz[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean esTriinf(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(j > i && matriz[i][j] != 0 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean esTriSup(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(j < i && matriz[i][j] != 0 ){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] matriz ={{1, 2, 3},
                        {0, 5, 6},
                        {0, 0, 9}
        };
        for(int i = 0; i < matriz.length; i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("La diagonal es: ");
        System.out.println(Arrays.toString(diagonal(matriz)));
        if(esIdentidad(matriz)){
            System.out.println("Es una matriz identidad");
        }
        if(esDiagonal(matriz)){
            System.out.println("Es una matriz diagonal");
        }
        if(esCuadrada(matriz)){
            System.out.println("Es una matriz cuadrada");
        }
        if(esTriinf(matriz)){
            System.out.println("Es triangular inferior");
        }
        if(esTriSup(matriz)){
            System.out.println("es triangular superior");
        }
        
    }
}
