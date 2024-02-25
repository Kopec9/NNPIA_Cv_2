package upce.nnpia_cv_2.controller;

import org.springframework.web.bind.annotation.*;

//@RequestMapping("/api/v1/")
@RestController
public class HelloController {
    @GetMapping("")
    public String helloWorld() {
        return "Hello world from Spring Boot application.";
    }

    // a. Přijímání řetězce z cesty
    @GetMapping("/path/{message}")
    public String pathParamExample(@PathVariable String message) {
        return "Received message from path: " + message;
    }

    // b. Přijímání řetězce z cesty s omezením na metodu GET
    @RequestMapping(value = "/restricted-path/{message}", method = RequestMethod.GET)
    public String restrictedPathParamExample(@PathVariable String message) {
        return "Received message from restricted path: " + message;
    }

    // c. Přijímání řetězce z query parametru
    @GetMapping("/query")
    public String queryParamExample(@RequestParam String message) {
        return "Received message from query parameter: " + message;
    }


    /*
    Rozdíl mezi anotací @RestController a @Controller?
    Obě anotace @Controller a @RestController jsou používány pro označení třídy jako komponenty spravované Springem, která zpracovává HTTP požadavky. Rozdíl je ale v:
    @Controller  je běžná anotace, která se používá k označení třídy jako Spring MVC Controller a deklaruje běžné webové řadiče, které mohou vracet odpověď HTTP.

    @RestController speciální ovladač používaný ve webových službách RESTFul a ekvivalent @Controller + @ResponseBody. Používá se k vytvoření řadičů pro REST API,
    které mohou vracet data ve formátu JSON nebo XML´.
     */

    /*
    Rozdíl mezi YAML, JSON a XML syntaxí?
        YAML:
            Data se značí odsazením.
            Příklad:
                person:
                  name: John Doe
                  age: 30
                  address:
                    city: New York
                    zip: '10001'

        XML:
            Data jsou uzavřena do tagů.
            Příklad:
                <person>
                  <name>John Doe</name>
                  <age>30</age>
                  <address>
                    <city>New York</city>
                    <zip>10001</zip>
                  </address>
                </person>

        JSON:
        Data jsou uzavřena v závorkách. Používají se složené závorky {} pro objekty a hranaté závorky [] pro pole.
        Příklad:
        {
          "person": {
            "name": "John Doe",
            "age": 30,
            "address": {
              "city": "New York",
              "zip": "10001"
            }
          }
        }

     */


}

