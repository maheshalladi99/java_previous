package com.maheshalladi;

public class ClientMain {

    public static void main(String[] args) {
        Client[] clients=new Client[2];
        clients[0]=new Client(100,"mahi","1232809897");
        clients[0].addAccount(new Account(1,1000,1.5));
        clients[0].addAccount(new Account(2,2000,2.5));



        clients[1]=new Client(200,"babay","12328093457");
        clients[1].addAccount(new Account(3,3000,3.5));
        clients[1].addAccount(new Account(4,4000,4.5));
        clients[1].addAccount(new Account(5,5000,5.5));


        System.out.println(clients[0]);
        System.out.println(clients[1]);
    }


}
