
    package arreglo;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Arreglo;{
   
    public static int tamaño;
     private static String carnet[];
     private static String nombres[];
     private static int calific[];
     private static int calific2[];
     private static int calific3[];
     private static int calific4[];
            public static int suma = 0;
            public static int promedio = 0;
	public static void main(String[] args) {             
            menu();
    }

        public static void menu(){       
        Scanner texto = new Scanner(System.in);
            String opcion;
            do {               
            opcion =JOptionPane.showInputDialog("------------REGISTRO DE ESTUDIANTES------------"
+ " \n1. INGRESAR ESTUDIANTES\n2. MODIFICAR NOTA\n3. ELIMINAR ESTUDIANTE\n4. LISTAR ESTUDIANTES\ns. Salir"
+ "\n------------------------------------------------\nINGRESE LA OPCION [1 - 4]: ");
           
            switch (opcion) {                case "1":
agregar();

break;
 case "2":
modificar();
break;

 case "3":
                 
buscar();
break;

 case "4":
listar();

break;
                case "s":

System.exit(0);

break;
                default:
break;
            }
        } while (true);
        }
       
        public static void agregar(){
            //Pedir tamaño del Arreglo al usuario:
     tamaño=Integer.parseInt(JOptionPane.showInputDialog
                ("¿De que tamaño desea su Arreglo?"));
       //recibe los arreglos globalizados arriba
      nombres = new String[tamaño];
      carnet = new String[tamaño];
      calific = new int[tamaño];
      calific2 = new int[tamaño];
      calific3 = new int[tamaño];
      calific4 = new int[tamaño];
     
       //Insertar carnet de alumnos al Arreglo String
      for(int contador=0; contador < carnet.length; contador++)
            carnet[contador]=JOptionPane.showInputDialog
("Carnet del alumno");
      //Insertar nombres de alumnos al Arreglo String:
      for(int contador=0; contador < nombres.length; contador++)
            nombres[contador]=JOptionPane.showInputDialog
("Nombre?");
       
      //Insertar calificaciones de cada alumno al Arreglo int:
      for(int contador=0; contador < calific.length; contador++)
            calific[contador]=Integer.parseInt
(JOptionPane.showInputDialog
("Cual es la nota 1 de "
+nombres[contador]+"?"));
     
      for(int contador=0; contador < calific2.length; contador++)
            calific2[contador]=Integer.parseInt
(JOptionPane.showInputDialog
("Cual es la nota 2 de "
+nombres[contador]+"?"));
     
      for(int contador=0; contador < calific3.length; contador++)
            calific3[contador]=Integer.parseInt
(JOptionPane.showInputDialog
("Cual es la nota 3 de "
+nombres[contador]+"?"));
     
      for(int contador=0; contador < calific4.length; contador++)
            calific4[contador]=Integer.parseInt
(JOptionPane.showInputDialog
("Cual es la nota 4 de "
+nombres[contador]+"?"));
     
      //Sumar notas
      for (int i = 0; i<calific.length; i++){
          for (int j = 0; j<calific2.length; j++){
              for (int k = 0; k<calific3.length; k++){
                  for (int f = 0; f<calific4.length; f++){
 
  suma = calific[i] + calific2[j] + calific3[k] + calific4[f];
  promedio = suma/4;
                 
              }
          }
     
      }
         
    }
       
      //Mostrar alumno y su calificacion en pantalla:
      System.out.println("Numero\tCarnet\tNombre\tpromedio");
      for(int contador=0; contador < nombres.length; contador++)
            System.out.println(contador+1+"\t" + carnet[contador]+"\t"+nombres[contador]+"\t"
+promedio);
     
      menu();
     
        }
        public static void buscar(){           
         menu();   
           
 }
       
         public static void modificar(){
             boolean elCarnetEsta = false;
             
             String car;
            car=JOptionPane.showInputDialog("INGRESA EL CARNET DEL ALUMNO");
             
             for(int contador=0; contador < carnet.length; contador++)
                 if (car.equals(carnet[contador])){
 elCarnetEsta = true;
          int seleccion;
          int nueva = 0;
            seleccion =Integer.parseInt(JOptionPane.showInputDialog("QUE NOTA DESEAS CAMBIAR: \n1.\n2.\n3.\n4."));
       
          if(seleccion==1){           
            calific[nueva] =Integer.parseInt(JOptionPane.showInputDialog("NUEVA NOTA ["+seleccion+"]"));
           
        }
       
        else if(seleccion==2){           
            calific2[nueva] =Integer.parseInt(JOptionPane.showInputDialog("NUEVA NOTA ["+seleccion+"]"));
           
        }
       
        else if(seleccion==3){           
            calific3[nueva] =Integer.parseInt(JOptionPane.showInputDialog("NUEVA NOTA ["+seleccion+"]"));
           
        }
       
        else if(seleccion==4){           
            calific4[nueva] =Integer.parseInt(JOptionPane.showInputDialog("NUEVA NOTA ["+seleccion+"]"));
               
        }
       
                 }
             
              if(elCarnetEsta ==false) {
            JOptionPane.showMessageDialog(null, "EL CARNET NO EXISTE");
        }
             
              menu();
        }
        public static void listar(){           
            //Mostrar alumno y su calificacion en pantalla:
      System.out.println("Numero\tCarnet\tNombre\tnota1\tnota2\tnota3\tnota4");
      for(int contador=0; contador < nombres.length; contador++)
            System.out.println(contador+1+"\t" + carnet[contador]+"\t"+nombres[contador]+"\t"
+calific[contador]+"\t"+calific2[contador]+"\t"+calific3[contador]+"\t"+calific4[contador]);
     
      menu();
        }
   
    public static void eliminar(){             
              menu();
    }

}
  