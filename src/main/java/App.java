import data.datasource.remote.UserRemoteDataSource;
import data.datasource.remote.UserRemoteDataSourceImpl;
import data.datasource.remote.api.ApiService;
import data.datasource.remote.api.RetrofitClient;
import data.datasource.remote.mapper.UserMapper;
import data.repository.UserRepository;
import data.repository.UserRepositoryImpl;
import domain.uscase.GetUserUseCase;
import domain.uscase.GetUserUseCaseImpl;
import presentation.userscreen.UserScreen;

public class App {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        UserRemoteDataSource remoteDataSource = new UserRemoteDataSourceImpl(apiService);
        UserMapper mapper = new UserMapper();
        UserRepository userRepository = new UserRepositoryImpl(remoteDataSource, mapper);
        GetUserUseCase getUserUseCase = new GetUserUseCaseImpl(userRepository);
        UserScreen screen = new UserScreen(getUserUseCase);
        screen.run();
    }
}
