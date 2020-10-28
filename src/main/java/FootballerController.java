import java.util.List;

public class FootballerController {
    private FootballerService footballerService = new FootballerService();

    public List<String> getNames() {
        return footballerService.getNames();
    }

}
