package data.datasource.remote.dto;

import java.util.List;

public class RandomUserDto {
    private List<UserDto> results;
    private InfoDto info;

    public List<UserDto> getResults() {
        return results;
    }

    public InfoDto getInfo() {
        return info;
    }
}
