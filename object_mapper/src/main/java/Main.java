import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import dto.Car;
import dto.User;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("main");
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User();

        user.setName("홍길동");
        user.setAge(10);


        Car car1 = new Car();
        car1.setName("K5");
        car1.setCarNumber("1111");
        car1.setType("sedan");


        Car car2 = new Car();
        car2.setName("Q5");
        car2.setCarNumber("2222");
        car2.setType("suv");

        List<Car> carlist = Arrays.asList(car1,car2);
        user.setCars(carlist);




        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        JsonNode jsonNode = objectMapper.readTree(json);
        String name= jsonNode.get("name").asText();
        int age = jsonNode.get("age").asInt();
        System.out.println("name: "+name+" age: "+ age);

    JsonNode cars = jsonNode.get("cars");
    ArrayNode arrayNode = (ArrayNode)cars;
    List<Car> _cars = objectMapper.convertValue(arrayNode, new TypeReference<List<Car>>() {});
        System.out.println(_cars);


    }
}
