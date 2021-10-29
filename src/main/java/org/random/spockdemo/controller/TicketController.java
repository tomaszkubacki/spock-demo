package org.random.spockdemo.controller;

import org.random.spockdemo.model.Ticket;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class TicketController {


    @RequestMapping(value = {"/tickets"}, method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Ticket> getTickets() {
        return Stream.of(new Ticket[]{
                        Ticket
                                .builder()
                                .id(UUID.randomUUID())
                                .description("My ticket")
                                .description("some longer description")
                                .build(),
                        Ticket.builder()
                                .id(UUID.randomUUID())
                                .description("My ticket 1")
                                .description("some longer description 2")
                                .build(),
                })
                .collect(Collectors.toList());
    }
}
