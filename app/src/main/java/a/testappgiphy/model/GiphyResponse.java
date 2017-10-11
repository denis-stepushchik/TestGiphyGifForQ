package a.testappgiphy.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GiphyResponse {

    public List<GIF> getBody() { // поля впереди, методы позади
        return body;
    }

    @SerializedName("data")
    private List<GIF> body;  

}
