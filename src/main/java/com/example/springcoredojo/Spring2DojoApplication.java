package com.example.springcoredojo;

import com.example.springcoredojo.banco.CajaAhorro;
import com.example.springcoredojo.banco.Cliente;
import com.example.springcoredojo.banco.CuentaCorriente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring2DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			Cliente cliente = ctx.getBean(Cliente.class);
			CajaAhorro ca = ctx.getBean(CajaAhorro.class);
			CuentaCorriente cc = ctx.getBean(CuentaCorriente.class);

			if (cliente.getApertura() >= 1000){

				System.out.println(cliente);

				if (cliente.getTipocuenta() == "Ambas"){
					System.out.println("Su ahorro es: $"+ca.getAhorro());
					System.out.println("Su saldo es: $"+cc.getSaldo());
				}

				if (cliente.getTipocuenta() == "Ahorro"){
					System.out.println("Su ahorro es: $"+ca.getAhorro());
				}else {
					System.out.println("Su saldo es: $"+cc.getSaldo());
				}

			}else{
				System.out.println("La apertura minima de cuenta es de $1000");
			}
		};
	}
}
