package edu.anatomiaClasses;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println(nomeCompleto("Rhuan", "Campideli"));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome+' '+segundoNome;
    }
}
