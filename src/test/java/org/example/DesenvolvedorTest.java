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
        Desenvolvedor f5 = new Desenvolvedor("Leonidas",4);

        assertEquals("Pleno", f3.getNivelBaseadoEmExperiencia());
        assertEquals("Pleno", f5.getNivelBaseadoEmExperiencia());
    }

    @Test
    void getNivelBaseadoEmExperiencia_deveRetornarSeniorQuandoMaiorQueCinco() {
        Desenvolvedor f6 = new Desenvolvedor("Huysla",6);

        assertEquals("Sênior", f6.getNivelBaseadoEmExperiencia());
    }

    @Test
    void adicionarProjeto_deveImpedirInclusaoDeProjetosDuplicadosCaseInsensitive() {
        Desenvolvedor dev = new Desenvolvedor("Ana",4);

        boolean primeiroAdd = dev.adicionarProjeto("Sistema Financeiro");
        boolean duplicadoMaiusculo = dev.adicionarProjeto("SISTEMA FINANCEIRO");
        boolean duplicadoMinusculo = dev.adicionarProjeto("sistema financeiro");

        assertTrue(primeiroAdd, "O primeiro projeto deve ser adicionado com sucesso");
        assertFalse(duplicadoMaiusculo, "Não deve permitir duplicata com letras maiúsculas");
        assertFalse(duplicadoMinusculo, "Não deve permitir duplicata com letras minúsculas");

        assertEquals(1, dev.getProjetos().size(), "Deve haver apenas um projeto na lista");
    }

}




