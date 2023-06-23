import org.example.StringListImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

public class StringListImplTest {
    private final StringListImpl stringList = new StringListImpl();

    @AfterEach
    public void afterEach() {stringList.clear();}

    @Test
    void addTest() {
        String[] elements = {"test1", "test2", "test3", "test4", "test5"};
        add(elements);

        for (int i = 0; i < elements.length; i++) {
            assertThat(stringList.get(i)).isEqualTo(elements[i]);
            assertThat(stringList.get(i)).contains(elements[i]);
            assertThat(stringList.indexOf(elements[i])).isEqualTo(i);
            assertThat(stringList.lastIndexOf(elements[i])).isEqualTo(i);
        }

        assertThat(stringList.toArray()).hasSize(elements.length);
        assertThat(stringList.toArray()).containsExactly(elements);
    }

    @Test
    void addByIndexAndItemTest() {
        String[] elements = {"test1", "test2", "test3", "test4", "test5"};
        add(elements);

        stringList.add(0, "test");
        assertThat(stringList.size()).isEqualTo(elements.length + 1);
        assertThat(stringList.get(0)).isEqualTo("test");

        stringList.add(3, "test");
        assertThat(stringList.size()).isEqualTo(elements.length + 2);
        assertThat(stringList.get(3)).isEqualTo("test");
        assertThat(stringList.indexOf("test")).isEqualTo(0);
        assertThat(stringList.lastIndexOf("test")).isEqualTo(3);

        stringList.add(7, "test");
        assertThat(stringList.size()).isEqualTo(elements.length + 3);
        assertThat(stringList.get(7)).isEqualTo("test");
        assertThat(stringList.indexOf("test")).isEqualTo(0);
        assertThat(stringList.lastIndexOf("test")).isEqualTo(7);
    }

    @Test
    void setTest() {
    }

    @Test
    void removeByItemTest() {
    }

    @Test
    void removeByIndexTest() {
    }

    @Test
    void containsTest() {
    }

    @Test
    void indexOfTest() {
    }

    @Test
    void lastIndexOfTest() {
    }

    @Test
    void getTest() {
    }

    @Test
    void equalsTest() {
    }

    @Test
    void sizeTest() {
    }

    @Test
    void isEmptyTest() {
    }

    @Test
    void clearTest() {
    }

    @Test
    void toArrayTest() {
    }

    @Test
    void checkItemTest() {
    }

    @Test
    void checkIndexTest() {
    }

    private void add(String [] elements) {
        assertThat(stringList.isEmpty()).isTrue();
        Stream.of(elements).forEach(stringList::add);
        assertThat(stringList.size()).isEqualTo(elements.length);
    }

}
