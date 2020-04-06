package com.demoapplication.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demoapplication.Entity.Ticket;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("ticket")
@RequiredArgsConstructor
public class TicketController {

	@GetMapping
	public ResponseEntity<Ticket> get(){
		Ticket ticket = new Ticket();
		ticket.setID(1);
		ticket.setName("Istanbul to Ankara");
		return ResponseEntity.ok(ticket);
	}
}

