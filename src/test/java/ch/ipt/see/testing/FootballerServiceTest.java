package ch.ipt.see.testing;

import ch.ipt.see.testing.FootballerService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class FootballerServiceTest {

    private FootballerService footballerService = new FootballerService();

    @Test
    void thisTestShouldPass() {
        assertThat(true).isTrue();
    }

    @Test
    @Disabled
    void getNames() {
        List<String> names = footballerService.getNames();
        assertThat(names).hasSize(4);
    }

}
