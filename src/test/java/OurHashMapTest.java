import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class OurHashMapTest {
    @Test
    void size(){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");

        //when

        //then
        assertEquals(1, map.size());
    }

    @Test
    void isEmpty(){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");

        //when

        //then
        assertFalse(map.isEmpty());
    }

    @Test
    void isEmptyTrue (){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();

        //when

        //then
        assertTrue(map.isEmpty());

    }

    @Test
    void isEmptyAfterRemove(){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");
        map.remove("ENGLISH1");

        //when

        //then
        assertTrue(map.isEmpty());

    }

    @Test
    void containsKey(){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");

        //when

        //then
        assertTrue(map.containsKey("ENGLISH1"));
        assertFalse(map.containsKey("ENGLISH2"));

    }

    @Test
    void containsValue(){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");

        //when

        //then
        assertTrue(map.containsValue("HELLO"));
        assertFalse(map.containsKey("HI"));

    }

    @Test
    void getNull() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when

        // then
        assertNull(map.get("ENGLISH1"));
    }

    @Test
    void put() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("ENGLISH2", "HI");
        map.put("ENGLISH3", "HEY");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");
        map.put("FRENCH", "BONJOUR");
        map.put("RUSSIAN", "PRIVIT");
        map.put("JAPANESE", "NE HOW");
        map.put("MANDARIN", "CONICHIWA");

        // then
        assertEquals("HELLO", map.get("ENGLISH1"));
        assertEquals("HI", map.get("ENGLISH2"));
        assertEquals("HEY", map.get("ENGLISH3"));
        assertEquals("HOLA", map.get("SPANISH"));
        assertEquals("SHALOM", map.get("HEBREW"));
        assertEquals("BONJOUR", map.get("FRENCH"));
        assertEquals("PRIVIT", map.get("RUSSIAN"));
        assertEquals("NE HOW", map.get("JAPANESE"));
        assertEquals("CONICHIWA", map.get("MANDARIN"));
    }

    @Test
    void putSameKeys() {
        // given
        OurHashMap<String,String> map = new OurHashMap<>();

        // when
        map.put("ENGLISH1", "HELLO");
        map.put("SPANISH", "HOLA");
        map.put("HEBREW", "SHALOM");
        map.put("FRENCH", "BONJOUR");
        map.put("ENGLISH1", "HI");

        // then
        assertEquals("HI", map.get("ENGLISH1"));
    }

    @Test
    void remove(){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");

        // when
        map.remove("ENGLISH1");

        //then
        assertFalse(map.containsKey("ENGLISH1"));
    }

    @Test
    void putAll(){
        //given
        OurHashMap<String,String> map = new OurHashMap<>();
        Map<String, String> m = new HashMap<>();
        m.put("ENGLISH1", "HELLO");
        m.put("ENGLISH2", "HI");

        //when
        map.putAll(m);

        //then
        assertTrue(map.containsKey("ENGLISH1"));
        assertTrue(map.containsValue("HELLO"));
        assertTrue(map.containsKey("ENGLISH2"));
        assertTrue(map.containsValue("HI"));
    }

    @Test
    void clear(){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");
        map.put("ENGLISH2", "HI");

        //when
        map.clear();

        //then
        assertTrue(map.isEmpty());
    }

    @Test
    void keySet (){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");
        map.put("ENGLISH2", "HI");

        //when
        Set keySet = map.keySet();

        //then
        assertTrue(keySet.contains("ENGLISH1"));
        assertTrue(keySet.contains("ENGLISH2"));
    }

    @Test
    void values (){
        // given
        OurHashMap<String,String> map = new OurHashMap<>();
        map.put("ENGLISH1", "HELLO");
        map.put("ENGLISH2", "HI");

        //when
        Collection valueCollection = map.values();

        //then
        assertTrue(valueCollection.contains("HELLO"));
        assertTrue(valueCollection.contains("HI"));
    }
}