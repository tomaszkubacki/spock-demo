package org.random.spockdemo

import org.random.spockdemo.controller.TicketController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spock.lang.Specification;

@SpringBootTest
class TicketControllerSpec extends Specification {

    @Autowired
    TicketController ticketController;


    def "when context is loaded then all expected beans are created"() {
        expect: "the TicketController is created"
        ticketController
    }

    def "There are exactly two tickets"() {
        given:
        var tickets = ticketController.getTickets();
        when:
        int ticketCount = tickets.size()
        then:
        ticketCount == 2
    }

    def "You can get string class instance from java name"() {
        given:
        var className = "java.lang.String";
        when:
        Class<? extends java.lang.String> stringClass = Class.forName(className)
        then:
        stringClass.canonicalName == className
    }
}
