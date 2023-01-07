import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadaoTest {

    @Test
    void deveDenunciarRouboPatrulha() {
        Cidadao cidadao = new Cidadao();
        assertEquals("COPOM registrou sua denuncia.\n" +
                "A viatura de patrulha respondeu a sua denuncia de roubo.\n" +
                ">>Viatura se deslocando para denuncia de roubo no local: Av. Barão do Rio Branco, 3000, JF", cidadao.denunciarRouboPatrulha("Av. Barão do Rio Branco, 3000, JF"));
    }

    @Test
    void deveDenunciarAtividadeSuspeitaPatrulha() {
        Cidadao cidadao = new Cidadao();
        assertEquals("COPOM registrou sua denuncia.\n" +
                "A viatura de patrulha respondeu a sua denuncia de atividade suspeita.\n" +
                ">>Viatura se deslocando para denuncia de atividade suspeita no local: Av. Barão do Rio Branco, 3000, JF", cidadao.denunciarAtividadeSuspeitaPatrulha("Av. Barão do Rio Branco, 3000, JF"));
    }

    @Test
    void deveDenunciarAgressaoPatrulha() {
        Cidadao cidadao = new Cidadao();
        assertEquals("COPOM registrou sua denuncia.\n" +
                "A viatura de patrulha respondeu a sua denuncia de agressao.\n" +
                ">>Viatura se deslocando para denuncia de agressao no local: Av. Barão do Rio Branco, 3000, JF", cidadao.denunciarAgressaoPatrulha("Av. Barão do Rio Branco, 3000, JF"));
    }
}