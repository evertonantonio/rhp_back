package com.example.reuniaorhp;

import com.example.reuniaorhp.model.Data;
import com.example.reuniaorhp.model.Funcionario;
import com.example.reuniaorhp.model.Reuniao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReuniaorhpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReuniaorhpApplication.class, args);

		Funcionario f = new Funcionario( "Everton", "evertonantoniogp@gmail.com", "123456789");
		Funcionario f2 = new Funcionario( "pedro", "pedro@gmail.com", "34224335");
		Funcionario f3 = new Funcionario("joao", "jp@gmail.com", "81276524");


		Data d = new Data("19","10","2022","10","30","12","00");
		Reuniao r = new Reuniao(f, d);

	}

}
