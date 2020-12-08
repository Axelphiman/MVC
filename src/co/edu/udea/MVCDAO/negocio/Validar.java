package co.edu.udea.MVCDAO.negocio;


public class Validar {

    public static boolean validarNombre(String nombre){
        int longitudNombre = nombre.length();
        if (longitudNombre < 3 || longitudNombre > 25){
            return false;
        }
        return true;
    }

    public static boolean validarDocumento(String documento){
        int longitudDocumento = documento.length();
        if (longitudDocumento < 3 || longitudDocumento > 25){
            return false;
        }
        for (int i = 0; i < longitudDocumento; i++) {
            if (!Character.isDigit(documento.charAt(i))){return false;}
        }
        return true;
    }

    public static String rellenarDato(String dato){
        int longitudDato = dato.length();
        StringBuilder cadenaDato = new StringBuilder(dato);
        while(cadenaDato.length() < 25){
            cadenaDato.append(" ");
        }
        return  cadenaDato.toString();
    }

}
