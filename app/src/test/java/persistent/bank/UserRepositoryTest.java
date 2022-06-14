package persistent.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {

    @DisplayName("Teste fumaca: Deve executar a insercao de um usuario com sucesso")
    @Test void successofullInsert(){
        UserRepository repository = new UserRepository();
        User user = new User();
        user.setName("Garry");
        user.setEmail("Garry_candongas@calindra.com.br");
        user.setPhone("1743134567");

        User persistentOperation = repository.save(user);
        Assertions.assertNull(persistentOperation.getId());
        Assertions.assertEquals("Garry", persistentOperation.getName());
    }
}
