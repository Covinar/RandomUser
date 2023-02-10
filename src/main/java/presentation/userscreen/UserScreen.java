package presentation.userscreen;

import domain.uscase.GetUserUseCase;
import presentation.common.BaseScreen;

public class UserScreen extends BaseScreen {
    private final GetUserUseCase getUserUseCase;

    public UserScreen(GetUserUseCase getUserUseCase) {
        this.getUserUseCase = getUserUseCase;
    }

    public void run() {
        System.out.println(getUserUseCase.getUser());
    }
}
