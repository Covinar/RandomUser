package data.datasource.remote.mapper;

import data.datasource.remote.dto.RandomUserDto;
import data.datasource.remote.dto.UserDto;
import domain.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {
    public User map(UserDto userDto){
        User user = new User(
                userDto.getName().getFirst() + userDto.getName().getLast(),
                userDto.getGender(),
                userDto.getEmail()
        );
        return user;
    }

    public List<User> map(List<UserDto> userDtoList){
        List<User> userList = new ArrayList<>();
        for (UserDto dto: userDtoList) {
            userList.add(map(dto));
        }
        return userList;
    }
}
