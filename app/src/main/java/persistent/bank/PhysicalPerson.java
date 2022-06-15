package persistent.bank;

public class PhysicalPerson extends User {
    
    private String cpf;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
