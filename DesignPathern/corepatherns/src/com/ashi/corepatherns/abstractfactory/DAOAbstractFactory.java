package com.ashi.corepatherns.abstractfactory;

public abstract class DAOAbstractFactory {
    public abstract DAO createDAO(String type);
}
