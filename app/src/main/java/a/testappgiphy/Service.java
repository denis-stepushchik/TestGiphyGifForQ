package a.testappgiphy;

import a.testappgiphy.model.GiphyResponse;
import a.testappgiphy.support.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {
    @GET(Constants.PATH_SEARCH)
    Call<GiphyResponse> getSearchedGIF(@Query("q") String userInput, @Query("api_key") String API_KEY); // параметры у методов называются с малой буквы apiKey должно быть

    @GET(Constants.PATH_TREND)
    Call<GiphyResponse> getTrends(@Query("api_key") String API_KEY);
}
