package com.poo.banco.entities;

import java.util.Date;

public class Client extends Person{
    public Client(int id, String name, String cpf, Date birthDate, String login,
                  String password, Adress adress, String mail, String telephoneNumber) {
        super(id, name, cpf, birthDate, login, password, adress, mail, telephoneNumber);
    }

}
