import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FootballerServiceTest {

    private FootballerServiceInterface footballerServiceInterface = new FootballerService();

    @Test
    void thisTestShouldPass() {
        assertThat(true).isTrue();
    }

    @Test
    @Disabled
    void getNames() {
        List<String> names = footballerServiceInterface.getNames();
        assertThat(names).hasSize(4);
    }

}
