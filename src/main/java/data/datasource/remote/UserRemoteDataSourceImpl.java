package data.datasource.remote;

import data.datasource.remote.api.ApiService;
import data.datasource.remote.dto.UserDto;

import java.io.IOException;

public class UserRemoteDataSourceImpl implements UserRemoteDataSource {
    private final ApiService apiService;

    public UserRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public UserDto getUser() {
        try {
            return apiService.getUser().execute().body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
