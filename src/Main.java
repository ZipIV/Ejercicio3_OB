public class Main {
    public static void main(String[] args) {
        //EJERCICIO 3 - PARTE 1 (Llama a la suma desde el main y se le da valores)
        int resultado;
        resultado = suma(10,5,15);
        System.out.println(resultado);

        //EJERCICIO 3 - PARTE 2 (Crea el objeto miCoche en el main)(Añade una puerta)(Muestra el número de puertas final)
        coche miCoche = new coche();
        miCoche.otrapuertamas();
        System.out.println(miCoche.puertas);

    }
    //EJERCICIO 3 - PARTE 1 (Crea una función con 3 parametros numéricos que se suman entre sí)
    public static int suma(int a,int b, int c){
        return a + b + c;
    }

}
//EJERCICIO 3 - PARTE 2 (Crea la clase coche),(Crea la variable numérica "puertas"),(Crea una función que
// incrementa el número de puertas)
class coche {
    public int puertas = 4;

    public void otrapuertamas () {
        this.puertas++;
    }

}