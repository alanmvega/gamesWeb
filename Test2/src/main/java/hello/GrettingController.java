package hello;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GrettingController {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
    
    @CrossOrigin(origins = "http://localhost:9000")
    @RequestMapping("/games")
    public List<GameInfo> games() throws JsonParseException, JsonMappingException, IOException{
    	ObjectMapper mapper = new ObjectMapper();
    	List<GameInfo> gamesList = mapper.readValue(new File("public/games.json"), mapper.getTypeFactory().constructCollectionType(List.class, GameInfo.class));
    	return gamesList;
//    	return mapper.readValue(new File("public/games.json"), GameInfo.class);
    }
    
//    @RequestMapping("/greeting-javaconfig")
//    public @ResponseBody Greeting greetingWithJavaconfig(@RequestParam(required=false, defaultValue="World") String name) {
//        System.out.println("==== in greeting ====");
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
//    }
}