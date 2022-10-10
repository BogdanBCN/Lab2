package Pack;

public class Language {
    private String LanguageName;
    private String LanguageId;
    private String LanguageFamily;

    public String getId() {
        return LanguageId;
    }

    public void setId(String id) {
        this.LanguageId = id;
    }

    public String getName() {
        return LanguageName;
    }

    public void setName(String name) {
        this.LanguageName = name;
    }

    public String getFamily() {
        return LanguageFamily;
    }

    public void setFamily(String family) {
        this.LanguageFamily = family;
    }
}
