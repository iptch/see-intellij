import java.util.List;

public class FootballerController {
    private FootballerServiceInterface footballerServiceInterface = new FootballerService();

    public List<String> getNames() {
        return footballerServiceInterface.getNames();
    }

}
