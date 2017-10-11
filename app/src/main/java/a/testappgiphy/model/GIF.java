package a.testappgiphy.model;

import com.google.gson.annotations.SerializedName;

public class GIF { // только первая буква с строчкая, правильно Gif

    @SerializedName("type") //а азачем здесь это?
    private String type;

    public String getId() {
        return id;
    }

    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
//    "type": "gif",                                       //лучше это или в mock объект перенести или удалить
//    "id": "tOWyML1WPzKjm",
//    "slug": "cheezburger-bears-tOWyML1WPzKjm",
//    "url": "https://giphy.com/gifs/cheezburger-bears-tOWyML1WPzKjm",
//    "bitly_gif_url": "http://gph.is/19r5Mfk",
//    "bitly_url": "http://gph.is/19r5Mfk",
//    "embed_url": "https://giphy.com/embed/tOWyML1WPzKjm",
