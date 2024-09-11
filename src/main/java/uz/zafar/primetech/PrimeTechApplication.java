package uz.zafar.primetech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class PrimeTechApplication {

	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tashkent"));
	}
	public static void main(String[] args) {
		SpringApplication.run(PrimeTechApplication.class, args);
	}

}
