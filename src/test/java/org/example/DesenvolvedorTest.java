package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {

    @Test
    void getNivelBaseadoEmExperiencia_deveRetornarJuniorQuandoMenorOuIgualADois() {
        Desenvolvedor f1 = new Desenvolvedor("Fábio",1);
        Desenvolvedor f2 = new Desenvolvedor("Ferdinando",2);

        assertEquals("Júnior", f1.getNivelBaseadoEmExperiencia());
        assertEquals("Júnior", f2.getNivelBaseadoEmExperiencia());
    }

    @Test
    void getNivelBaseadoEmExperiencia_deveRetornarPlenoQuandoEntreTresECinco() {
        Desenvolvedor f3 = new Desenvolvedor("Tamara",3);
        Desenvolvedor f5 = new Desenvolvedor("Leonidas",5);

        assertEquals("Pleno", f3.getNivelBaseadoEmExperiencia());
        assertEquals("Pleno", f5.getNivelBaseadoEmExperiencia());
    }

    @Test
    void getNivelBaseadoEmExperiencia_deveRetornarSeniorQuandoMaiorQueCinco() {
        Desenvolvedor f6 = new Desenvolvedor("Huysla",6);

        assertEquals("Sênior", f6.getNivelBaseadoEmExperiencia());
    }
}




