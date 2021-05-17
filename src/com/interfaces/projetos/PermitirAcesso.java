package com.interfaces.projetos;

// Interface será o contrato de autenticação
public interface PermitirAcesso {

    public boolean autenticar(String login, String senha);
    public boolean autenticarLogin();


}
