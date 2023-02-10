package domain.uscase;

import data.repository.UserRepository;
import domain.entity.User;

public class GetUserUseCaseImpl implements GetUserUseCase{
    private final UserRepository repository;

    public GetUserUseCaseImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
