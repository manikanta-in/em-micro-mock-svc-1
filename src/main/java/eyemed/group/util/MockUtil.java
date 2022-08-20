package eyemed.group.util;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class MockUtil {

    public static File mockFileReader(String fileName) {
        ClassLoader classLoader = MockUtil.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return file;
    }


    public static Map<Object, Object> convertJsonIntoMap(String jsonFile) {
        Map<Object, Object> map = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            map = mapper.readValue(mockFileReader(jsonFile), Map.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static List<Map<Object, Object>> convertJsonIntoListMap(String jsonFile) {
        List<Map<Object, Object>> map = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            map = mapper.readValue(mockFileReader(jsonFile), List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }


    public static List convertJsonIntoList(String jsonFile) {
        List list = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            list = mapper.readValue(mockFileReader(jsonFile), List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static void main(String[] args) {
        Map<Object, Object> response =  convertJsonIntoMap("mock/authentication.json");
        System.out.println(response);
    }




}
