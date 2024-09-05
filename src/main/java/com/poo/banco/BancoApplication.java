package com.poo.banco;


import com.poo.banco.entities.Adress;
import com.poo.banco.entities.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args)  {
		SpringApplication.run(BancoApplication.class, args);
		LocalDate localDate1 = LocalDate.of(2004, 10, 8);
		Date date1 = Date.from(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Adress adr1 = new Adress(1, "Rua doutor João Barcellos", 126, "Casa A", "Petrópolis",
				"Rio de Janeiro", "25615-171");

		Client client1 = new Client(Client.counterId,
				"Eduardo Cilento",
				"176.270.067-08",
				date1,
				"eduardo.cilento",
				"1245@!M",
				 adr1,// Endereço
				"eduardo@email.com",
				"(24)992568756"
		);

		client1.showRecord();

	}

}
