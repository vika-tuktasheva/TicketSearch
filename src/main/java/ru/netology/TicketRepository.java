package ru.netology;

public class TicketRepository {
    Ticket[] tickets = new Ticket[0];

    //конструкторы
    public TicketRepository() {

    }

    public TicketRepository(Ticket[] tickets) {
        this.tickets = tickets;
    }

    //getter and setter
    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    //методы
    //метод добавления
    public void add(Ticket ticket) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;
    }

    //метод получения
    public Ticket[] findAll() {
        return getTickets();
    }
}
