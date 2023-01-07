public class Pessoa {

    public String denunciarRouboPatrulha(String local) {
        return COPOM.getInstancia().receberDenunciaRouboPatrulha(local);
    }

    public String denunciarAtividadeSuspeitaPatrulha(String local) {
        return COPOM.getInstancia().receberDenunciaAtividadeSuspeitaPatrulha(local);
    }

    public String denunciarAgressaoPatrulha(String local) {
        return COPOM.getInstancia().receberDenunciaAgressaoPatrulha(local);
    }
}
