package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    @Test
    void findAll(){
        TicketManager manager=new TicketManager();
        Ticket ticket1=new Ticket(1, 10000,"KUF", "LED", 120);
        Ticket ticket2=new Ticket(2, 5000,"KUF", "MOW", 60);
        Ticket ticket3=new Ticket(3, 15000,"DME", "GOJ", 90);
        Ticket ticket4=new Ticket(4, 12000,"DME", "GOJ", 100);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);

        Ticket[] expected=new Ticket[]{ticket4, ticket3};
        assertArrayEquals(expected, manager.findAll("DME", "GOJ"));

    }
}