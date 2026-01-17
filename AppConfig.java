public class AppConfig {
    private static final AppConfig instance = new AppConfig();

    private String theme = "Light";
    private String language = "es";

    private AppConfig() {
        // Constructor privado para evitar instanciación externa
    }

    public static AppConfig getInstance() {
        return instance;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
