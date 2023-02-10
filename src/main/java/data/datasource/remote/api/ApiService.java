package data.datasource.remote.api;

import data.datasource.remote.dto.UserDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/api")
    Call<UserDto> getUser();
}
