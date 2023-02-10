package data.repository;

import data.datasource.remote.UserRemoteDataSource;
import data.datasource.remote.dto.RandomUserDto;
import data.datasource.remote.dto.UserDto;
import data.datasource.remote.mapper.UserMapper;
import domain.entity.User;

public class UserRepositoryImpl implements UserRepository {
    private final UserRemoteDataSource remoteDataSource;
    private final UserMapper mapper;

    public UserRepositoryImpl(UserRemoteDataSource remoteDataSource, UserMapper mapper) {
        this.remoteDataSource = remoteDataSource;
        this.mapper = mapper;
    }

    @Override
    public User getUser() {
        UserDto dto = remoteDataSource.getUser();
        return mapper.map(dto);
    }
}
