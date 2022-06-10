package persistent.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperationRepositoryTest {

    @DisplayName("Teste fumaca: Deve executar a insercao de uma operacao com sucesso")
    @Test void successofullInsert(){
        OperationRepository repository = new OperationRepository();
        Operation persistentOperation = repository.save(new Operation());
        Assertions.assertNull(persistentOperation.getId());
        HibernateUtil.shutdown();
    }
}
