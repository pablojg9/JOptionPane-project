package com.excecao;

import com.util.MessageUtil;

public class ExcecaoProcessarNota extends Exception{

    public ExcecaoProcessarNota(String err) {
        super(MessageUtil.EXEPCTION_ARQUIVO + err);
    }


}
