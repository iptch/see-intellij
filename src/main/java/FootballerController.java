import java.util.List;

public class FootballerController {
    private FootballerService footballerServiceInterface = new FootballerService();

    public List<String> getNames() {
        return footballerServiceInterface.getNames();
    }

}
