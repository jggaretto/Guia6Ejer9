/*
Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

class C {
void metodoC() throws TuException{
sentencia_c1
try {
sentencia_c2
sentencia_c3
} catch (MioException e){
sentencia_c4
} catch (TuException e){
sentencia_c5
throw (e)
}

12

finally
sentencia_c6

}
}

 a) Si se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:

sentencia_c1
sentencia_c2
sentencia_c3
sentencia_c4
sentencia_c6
b) Si no se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:

sentencia_c1
sentencia_c2
sentencia_c3
sentencia_c6
c) Si se produce la excepción TuException, las sentencias se ejecutan en el siguiente orden:

sentencia_c1
sentencia_c2
sentencia_c3
sentencia_c5
sentencia_c6
En todos los casos, la sentencia_c1 se ejecuta siempre al inicio del método. Luego, se ejecutan las sentencias_c2 y sentencia_c3 en un bloque try. Si se produce una excepción MioException, se ejecuta sentencia_c4 dentro del bloque catch correspondiente. Si se produce una excepción TuException, se ejecuta sentencia_c5 dentro del bloque catch correspondiente. Finalmente, independientemente de si se produce una excepción o no, se ejecuta sentencia_c6 en el bloque finally.
 */
package guia6ejer9;


public class Guia6Ejer9 {

    
    public static void main(String[] args) {
        
    }
    
}
