package Pack;

public class LanguageController {
    private Language model;
    private LanguageView view;

    public LanguageController(Language model, LanguageView view) {
        this.model = model;
        this.view = view;
    }

    public void setLanguageName(String name) {
        model.setName(name);
    }

    public String getLanguageName() {
        return model.getName();
    }

    public void setLanguageId(String id) {
        model.setId(id);
    }

    public String getLanguageId() {
        return model.getId();
    }

    public void setLanguageFamily(String family) {
        model.setFamily(family);
    }

    public String getLanguageFamily() {
        return model.getFamily();
    }

    public void updateView() {
        view.printLanguageDetails(model.getName(), model.getId(), model.getFamily());
    }
}
