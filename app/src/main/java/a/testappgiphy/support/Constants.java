package a.testappgiphy.support;


public class Constants { // можно ещё сделать класс final и создать приватный конструктор, чтобы не смочь наследоваться и создавать экзепляр

    public static final String myLogs = "|||||||||||||||||||";
    public static final String GIPHY_API_KEY = "dc6zaTOxFJmzC";

    public static final byte CODE_SUCCESS = 1; // это в enum лучше перенсти
    public static final byte CODE_NETWORK_ERROR = 2;
    public static final byte CODE_COMMON_ERROR = 3;
    public static final byte EMPTY_BODY = 4;


    public static final String HOST = "http://api.giphy.com";    // эти константы лучше в сервисы перенести
    public static final String PATH_TREND = "/v1/gifs/trending";
    public static final String PATH_SEARCH = "/v1/gifs/search";
    public static final String GIF_HOST = "https://media.giphy.com/media/";
    public static final String SMALL_GIF = "/200w_d.gif";
    public static final String FULL_GIF = "/giphy.gif";

}
