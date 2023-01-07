public class Patrulha implements Equipe {

    private static Patrulha instancia = new Patrulha();
    private Patrulha() {};
    public static Patrulha getInstancia() {
        return instancia;
    }

    public String receberDenunciaRoubo(String local) {
        return "Viatura se deslocando para denuncia de roubo no local: " + local;
    }

    public String receberDenunciaAtividadeSuspeita(String local) {
        return "Viatura se deslocando para denuncia de atividade suspeita no local: " + local;
    }

    public String receberDenunciaAgressao(String local) {
        return "Viatura se deslocando para denuncia de agressao no local: " + local;
    }
}
