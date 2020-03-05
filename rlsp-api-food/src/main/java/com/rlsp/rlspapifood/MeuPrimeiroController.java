package com.rlsp.rlspapifood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller ==> responsavel para receber REQUISICOES WEB 
 *
 */
@Controller
public class MeuPrimeiroController {

	/**
	 * @GetMapping ==> caminho para chegar no METODO
	 * @ResponseBody ==> devolvido como RESPOSTA no corpo
	 */
	@GetMapping("/hello")
	@ResponseBody()
	public String Hello() {
		return "Hello People and Brazil!!!";
	}

}
