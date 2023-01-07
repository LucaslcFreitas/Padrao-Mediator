public class COPOM {

    private static COPOM instancia = new COPOM();
    private COPOM() {};
    public static COPOM getInstancia() {
        return instancia;
    }

    public String receberDenunciaRouboPatrulha(String local) {
        return "COPOM registrou sua denuncia.\n"+
                "A viatura de patrulha respondeu a sua denuncia de roubo.\n"+
                ">>"+ Patrulha.getInstancia().receberDenunciaRoubo(local);
    }

    public String receberDenunciaAtividadeSuspeitaPatrulha(String local) {
        return "COPOM registrou sua denuncia.\n"+
                "A viatura de patrulha respondeu a sua denuncia de atividade suspeita.\n"+
                ">>"+ Patrulha.getInstancia().receberDenunciaAtividadeSuspeita(local);
    }

    public String receberDenunciaAgressaoPatrulha(String local) {
        return "COPOM registrou sua denuncia.\n"+
                "A viatura de patrulha respondeu a sua denuncia de agressao.\n"+
                ">>"+ Patrulha.getInstancia().receberDenunciaAgressao(local);
    }
}
