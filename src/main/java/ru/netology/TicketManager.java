package ru.netology;

import java.util.Arrays;

public class TicketManager {
    TicketRepository repository = new TicketRepository();

    //конструкторы
    public TicketManager() {

    }

    public TicketManager(TicketRepository repository) {
        this.repository = repository;
    }

    //getter and setter

    public TicketRepository getRepository() {
        return repository;
    }

    public void setRepository(TicketRepository repository) {
        this.repository = repository;
    }

    //логика программы
    //добавление в репозиторий
    public void add(Ticket ticket) {
        repository.add(ticket);
    }

    //поиск аэропортам с сортировкой по цене
    public Ticket[] findAll(String airportFrom, String airportTo) {
        Ticket[] results = new Ticket[0];
        for (Ticket ticket : repository.findAll()) {
            if (matches(ticket, airportFrom, airportTo)) {
                Ticket[] tmp = new Ticket[results.length + 1];
                for (int i = 0; i < results.length; i++) {
                    tmp[i] = results[i];
                }
                tmp[tmp.length - 1] = ticket;
                results = tmp;
            }
        }
        Arrays.sort(results);
        return results;
    }

    //метод сравнения
    private boolean matches(Ticket ticket, String airportFrom, String airportTo) {
        if (ticket.getAirportFrom() != airportFrom) {
            return false;
        }
        if (ticket.getAirportTo() != airportTo) {
            return false;
        }
        return true;
    }
}
