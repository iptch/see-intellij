import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BeerTest {

    public static final String SCH = "sch";

    @Test
    void bla() {
        Beer sch = new Beer(SCH);
        assertThat(sch.getBla()).isEqualTo(SCH);
    }
}
