package Pack;

public class MVCPatternImplementation {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Language model = retriveLanguageFromDatabase();

        //Create a view : to write Language details on console
        LanguageView view = new LanguageView();

        LanguageController controller = new LanguageController(model, view);

        controller.updateView();

        //update model data
        controller.setLanguageName("Romanian");
        controller.setLanguageFamily("Romance");
        System.out.println("\nAfter updating, Language Details are as follows");

        controller.updateView();
        System.out.println("Done");
    }

    private static Language retriveLanguageFromDatabase() {
        Language language = new Language();
        language.setName("Japanese");
        language.setId("01");
        language.setFamily("Japanese");
        return language;
    }
}
