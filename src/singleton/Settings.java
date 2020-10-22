package singleton;

public class Settings {

    // 생성자를 private 를 통해 제한함
    private Settings() {};

    // 초기값을 null로 설정
    private static Settings settings = null;

    public static Settings getSettings(){
        if (settings == null){
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode() {return darkMode;}
    public int getFontSize() {return fontSize;}

    public void setDarkMode(boolean _darkMode){
        darkMode = _darkMode;
    }
    public void setFontSize(int _fontSize){
        fontSize = _fontSize;
    }

}
