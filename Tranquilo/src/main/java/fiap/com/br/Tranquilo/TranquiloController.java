package fiap.com.br.Tranquilo;

import org.springframework.web.bind.annotation.*;

@RestController
public class TranquiloController {


    //Conexão tipo GET HTTP
    @RequestMapping("/hello")
    public  String index() {return  "<h1>Olá Mundo!</h1>"; }


    //Conexão tipo GET HTTP
    @RequestMapping("/cadastro/{nome}")
    public  String dizernome(@PathVariable String nome) {return  "Olá, seu nome é " + nome ; }

    @RequestMapping("/info")
    public  String apresentar(@RequestParam("nome") String nome, @RequestParam ("idade") int idade)
    {return "<h1>Olá pessoal, meu nome é " + nome + "  e eu tenho " + idade + " anos</h1>"  ;
    }


    @PostMapping("/postar")
    public  String postar() {return "Objeto postado com sucesso." ; }
}
