
/**
 *
 * @author  Sebastián Ramos
 */
public class ArregloMultidimensional {
    public static void main(String[] args) {

        //Inicialización del arreglo y variables de suma
        int Floricola[][][]= {{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},
                                    {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},
                                    {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},
                                    {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},
                                    {{3,4,5,3},{3,4,5,6},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},
                                    {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}};
    int total=0; 
    int total2=0;
    //Literal a) Total mensual de cada tipo de flor durante el primer anio
    /**
     * Se usan dos ciclos for y no te porque nada más vamos a ver durante el primer año 
     * pero, los otros dos indices si se recorren puesto a que uno va a recorrer los tipos de flores 
     * y el otro los 12 meses del año.
    */
    for(int i=0; i<6; i++){
        for(int j=0; j<12;j++){
            System.out.println("Total del mes ["+j+"] del tipo de flor ["+i+"] del primer año es:"+Floricola[i][j][0]);
            }
            System.out.println("");
        }
    System.out.println("");

    //Literal b) Total de producción durante el primer anio
    /**
     * Se usan dos ciclos for igualmente porque queremos ver durante el primer año, la diferencia con el anterior 
     * es que no solo queremos ver mes por mes, sino de todo el año (por eso se hace una suma).
     */
    for(int i=0; i<6; i++){
        for(int j=0; j<12;j++){
            total=total+Floricola[i][j][0];
            }
    }
    System.out.println("Total de la producción durante el primer año es: "+total);
    System.out.println("");
    //Literal c) Total de producción por el tercer tipo de flor a lo largo del último anio
    /**
     * Se usa nada más un ciclo for porque queremos ver la producción (suma) del tercer tipo de flor 
     * en el último año.
     */
        for(int j=0; j<12;j++){
            total2=total2+Floricola[2][j][3];
            }
    System.out.println("Total de la producción durante el último año del tercer tipo de flor es: "+total2);
    System.out.println("");
    }
}
