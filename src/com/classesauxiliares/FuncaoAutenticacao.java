package com.classesauxiliares;

import com.interfaces.projetos.PermitirAcesso;
import cursojava.classes.Secretario;

public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar() {
        return  permitirAcesso.autenticarLogin();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }

}
