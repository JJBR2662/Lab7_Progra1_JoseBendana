package lab7_progra1_josebendana;

import java.util.Scanner;

public class Avion {
    public String modelo;
    public String codigo;
    public int year;
    public int maxpa;
    public int peso;
    public String aerolinea;
    
    public Avion(String modelo, String codigo, int year, int maxpa, int peso, String aerolinea){
        this.modelo=modelo;
        this.codigo=codigo;
        this.year=year;
        this.maxpa=maxpa;
        this.peso=peso;
        this.aerolinea=aerolinea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxpa() {
        return maxpa;
    }

    public void setMaxpa(int maxpa) {
        this.maxpa = maxpa;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    public static int estado1(Avion[] array, int estado1, boolean sera){
        int estado=3;
        Scanner cam = new Scanner(System.in);
        int original=estado1;
        if (sera) {
            System.out.println();
            System.out.println("---------Estados disponibles---------");
            System.out.println("1.  Despegando");
            System.out.println("2.  Aterrizando");
            System.out.println("3.  Estacionado");
            System.out.println("-------------------------------------");
            System.out.println();
            int estadocop=estado;
            System.out.print("Ingrese el nuevo estado: ");
            estado=cam.nextInt();
            String state;
            switch(estado){
                case 1:
                    state="Despegando";
                    break;
                case 2:
                    state = "Aterrizando";
                    break;
                case 3:
                    state = "Estacionado";
                    break;
                default:
                    System.out.println("estado no valido");
                    state = "igual";
                    break;
            }
            if(((original==3)&&(estado==1))||((original==1)&&(estado==2))||((original==2)&&(estado==3))){
                 System.out.println("---"+array[0].modelo+" esta "+state+"---");            
            }else{
                System.out.println("No se pueden cambiar esos estados");
                estado=estadocop;
            }
        }
        return estado;  
    }
    
    public static int estado2(Avion[] array, int estado1, boolean sera){
        int estado=3;
        Scanner cam = new Scanner(System.in);
        int original=estado1;
        if (sera) {
            System.out.println();
            System.out.println("---------Estados disponibles---------");
            System.out.println("1.  Despegando");
            System.out.println("2.  Aterrizando");
            System.out.println("3.  Estacionado");
            System.out.println("-------------------------------------");
            System.out.println();
            int estadocop=estado;
            System.out.print("Ingrese el nuevo estado: ");
            estado=cam.nextInt();
            String state;
            switch(estado){
                case 1:
                    state="Despegando";
                    break;
                case 2:
                    state = "Aterrizando";
                    break;
                case 3:
                    state = "Estacionado";
                    break;
                default:
                    System.out.println("estado no valido");
                    state = "igual";
                    break;
            }
            if(((original==3)&&(estado==1))||((original==1)&&(estado==2))||((original==2)&&(estado==3))){
                 System.out.println("---"+array[1].modelo+" esta "+state+"---");            
            }else{
                System.out.println("No se pueden cambiar esos estados");
                estado=estadocop;
            }
        }
        return estado;  
    }
    
    public static int estado3(Avion[] array, int estado1, boolean sera){
        int estado=3;
        Scanner cam = new Scanner(System.in);
        int original=estado1;
        if (sera) {
            System.out.println();
            System.out.println("---------Estados disponibles---------");
            System.out.println("1.  Despegando");
            System.out.println("2.  Aterrizando");
            System.out.println("3.  Estacionado");
            System.out.println("-------------------------------------");
            System.out.println();
            System.out.print("Ingrese el nuevo estado: ");
            int estadocop=estado;
            estado=cam.nextInt();
            String state;
            switch(estado){
                case 1:
                    state="Despegando";
                    break;
                case 2:
                    state = "Aterrizando";
                    break;
                case 3:
                    state = "Estacionado";
                    break;
                default:
                    System.out.println("estado no valido");
                    state = "igual";
                    break;
            }
            if(((original==3)&&(estado==1))||((original==1)&&(estado==2))||((original==2)&&(estado==3))){
                 System.out.println("---"+array[2].modelo+" esta "+state+"---");            
            }else{
                System.out.println("No se pueden cambiar esos estados");
                estado=estadocop;
            }
        }
        return estado;  
    }  
}
