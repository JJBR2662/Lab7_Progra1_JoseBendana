package lab7_progra1_josebendana;

import java.util.Scanner;

public class Lab7_Progra1_JoseBendana {

    public static void main(String[] args) {
        int op=1;
        while(((op==1)||(op==2))){
            Scanner menu = new Scanner(System.in);
            System.out.println("1.  El calamar Pablo");
            System.out.println("2.  Torre de control");
            System.out.println("Si quiere salir escriba cualquier cosa menos 1 o 2");
            System.out.println();
            System.out.print("Ingrese el ejemplo a evaluar: ");
            op = menu.nextInt();
            if (op==1) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese el nombre de la seleccion [en caso de ser españa, escribir (spain)]: ");
                String pais = sc.nextLine();
                String sele = pais.toLowerCase();
                Seleccion country;
                switch (sele){
                    case "spain":
                        country = new Seleccion("grupo E", "España","Luis Enrique",26,"Si","Primera",0);
                        System.out.println(country.toString());
                        break;
                    case "alemania":
                        country = new Seleccion("grupo E", "Alemania","Hansi Flick",26,"Si","Tercera",0);
                        System.out.println(country.toString());
                        break;
                    case "costa rica":
                        country = new Seleccion("grupo E", "Costa Rica","Luis Fernando Suarez",26,"No","Cuarta",0);
                        System.out.println(country.toString());
                        break;
                    case "japon":
                        country = new Seleccion("grupo E", "Japon","Hayime Moriyasu",26,"No","Segunda",0);
                        System.out.println(country.toString());
                        break;
                    case "belgica":
                        country = new Seleccion("grupo F", "Belgica","Roberto Martinez",26,"No","Primera",0);
                        System.out.println(country.toString());
                        break;
                    case "croacia":
                        country = new Seleccion("grupo F", "Croacia","Zlatko Dalic",26,"No","Segunda",0);
                        System.out.println(country.toString());
                        break;
                    case "canada":
                        country = new Seleccion("grupo F", "Canada","John Herdman",26,"No","Cuarta",0);
                        System.out.println(country.toString());
                        break;
                    case "marruecos":
                        country = new Seleccion("grupo F", "Marruecos","Walid Regragui",26,"No","Tercera",0);
                        System.out.println(country.toString());
                        break;
                    default:
                        System.out.println("pais no valido");
                        break;
                }
                String equipo1="";
                String equipo2="";
                for (int i = 1; i <=4; i++) {
                    int gol1=0;
                    int gol2=0;
                    switch(i){
                        case 1:
                            equipo1 = "Japon";
                            gol1 = Seleccion.setgoles();
                            equipo2 = "Costa Rica";
                            gol2 = Seleccion.setgoles();
                            System.out.println();
                            System.out.println("Juega " + equipo1 + " contra " + equipo2);
                            System.out.println(equipo1 + " " + gol1 + " " + equipo2 + " " + gol2);
                            if (gol1>gol2) {
                                System.out.println("Ha ganado "+equipo1);
                            }else if(gol2>gol1){
                                System.out.println("Ha ganado "+equipo2);
                            }else{
                                System.out.println("Han quedado empate");
                            }
                            break;
                        case 2:
                            equipo1 = "Belgica";
                            gol1 = Seleccion.setgoles();
                            equipo2 = "Marruecos";
                            gol2 = Seleccion.setgoles();
                            System.out.println();
                            System.out.println("Juega " + equipo1 + " contra " + equipo2);
                            System.out.println(equipo1 + " " + gol1 + " " + equipo2 + " " + gol2);
                            if (gol1>gol2) {
                                System.out.println("Ha ganado "+equipo1);
                            }else if(gol2>gol1){
                                System.out.println("Ha ganado "+equipo2);
                            }else{
                                System.out.println("Han quedado empate");
                            }
                            break;
                        case 3:
                            equipo1 = "Croacia";
                            gol1 = Seleccion.setgoles();
                            equipo2 = "Canada";
                            gol2 = Seleccion.setgoles();
                            System.out.println();
                            System.out.println("Juega " + equipo1 + " contra " + equipo2);
                            System.out.println(equipo1 + " " + gol1 + " " + equipo2 + " " + gol2);
                            if (gol1>gol2) {
                                System.out.println("Ha ganado "+equipo1);
                            }else if(gol2>gol1){
                                System.out.println("Ha ganado "+equipo2);
                            }else{
                                System.out.println("Han quedado empate");
                            }
                            break;
                        case 4:
                            equipo1 = "Spain";
                            gol1 = Seleccion.setgoles();
                            equipo2 = "Alemania";
                            gol2 = Seleccion.setgoles();
                            System.out.println();
                            System.out.println("Juega " + equipo1 + " contra " + equipo2);
                            System.out.println(equipo1 + " " + gol1 + " " + equipo2 + " " + gol2);
                            if (gol1>gol2) {
                                System.out.println("Ha ganado "+equipo1);
                            }else if(gol2>gol1){
                                System.out.println("Ha ganado "+equipo2);
                            }else{
                                System.out.println("Han quedado empate");
                            }
                            break;
                    }
                }
            }else if(op==2){
                char resp;
                int estado1=3;
                int estado2=3;
                int estado3=3;
                boolean sera;
                Avion[] array = new Avion[3];
                for (int i = 0; i < array.length; i++) {
                    Scanner ex2= new Scanner(System.in);
                    Scanner ex2int= new Scanner(System.in);
                    System.out.print("Ingrese el modelo del avion: ");
                    String modelo = ex2.nextLine();
                    System.out.print("Ingrese el codigo: ");
                    String codigo = ex2.nextLine();
                    System.out.print("Ingrese el anio de fabricacion: ");
                    int year = ex2int.nextInt();
                    System.out.print("Ingrese la capacidad maxima de pasajeros: ");
                    int maxpa = ex2int.nextInt();
                    System.out.print("Ingrese el peso del avion: ");
                    int peso = ex2int.nextInt();
                    System.out.print("Ingrese el nombre de la aerolinea: ");
                    String aerolinea = ex2.nextLine();
                    System.out.println("---Se ha entregado el avion exitosamente---");
                    Avion air = new Avion(modelo, codigo, year, maxpa, peso, aerolinea);
                    array[i]=air;
                }
                do {
                    Scanner carac = new Scanner(System.in);
                    System.out.print("Desea cambiarle el estado a un avion [S/N]: ");
                    resp = carac.next().charAt(0);
                    if ((resp=='s')||(resp=='S')) {
                        Scanner cam = new Scanner(System.in);
                        System.out.println("-----------Aviones disponibles-----------");
                        for (int i = 1; i <= 3; i++) {
                            System.out.println(i + ". " + array[i - 1].modelo);
                        }
                        System.out.print("Ingrese el numero del avion al que le desea cambiar el estado: ");
                        int opcion = cam.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("---------Se ha elegido " + array[0].modelo + "---------");
                                sera = true;
                                break;
                            case 2:
                                System.out.println("---------Se ha elegido " + array[1].modelo + "---------");
                                sera = true;
                                break;
                            case 3:
                                System.out.println("---------Se ha elegido " + array[2].modelo + "---------");
                                sera = true;
                                break;
                            default:
                                System.out.println("Avion no valido");
                                sera = false;
                                break;
                        }if (opcion==1) {
                            estado1=Avion.estado1(array, estado1, sera); 
                        }else if(opcion==2){
                            estado2=Avion.estado2(array, estado2, sera);
                        }else if(opcion==3){
                            estado3=Avion.estado3(array, estado3, sera);
                        }  
                    }else{
                        break;
                    }
                } while ((resp=='s')||(resp=='S'));
            }else{
                break;
            }
        }
    }
}
