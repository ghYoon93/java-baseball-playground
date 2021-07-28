package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitContains() {
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1", "2");
    }

    @Test
    void splitContainsExactly() {
        String[] actual = "1,".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException 발생")
    void charAtThrowsStringIndexOutOfBoundsException() {
//        assertThatThrownBy(() ->"abc".charAt(4)).isInstanceOf(StringIndexOutOfBoundsException.class);
        assertThatExceptionOfType(StringIndexOutOfBoundsException.class).isThrownBy(() -> "abc".charAt(4));

    }
}
