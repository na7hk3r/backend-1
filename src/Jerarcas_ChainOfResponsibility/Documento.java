package Jerarcas_ChainOfResponsibility;

public class Documento {

    private String contenido;
    private int tipo;

    public Documento(String contenido, int tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    public void leer(Diputado jerarca){
        if (tipo == 1){
            System.out.println("Diputado leyendo contenido "+ contenido);
        }else{
            System.out.println("Diputado no tiene acceso a este documento");
        }
    }

    public void leer(Ministro jerarca){
        if (tipo <= 2){
            System.out.println("Ministro leyendo contenido "+ contenido);
        }else{
            System.out.println("Ministro no tiene acceso a este documento");
        }
    }

    public void leer(Presidente jerarca){
        if (tipo <= 3){
            System.out.println("Presidente leyendo contenido "+ contenido);
        }else{
            System.out.println("Presidente no tiene acceso a este documento");
        }
    }
}