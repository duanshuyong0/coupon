package cn.edu.zju.entity.consumer;

public class Consumer {
    private String id;
    private String nick_name;
    private String account;
    private String password;
    private String contract_addr;//合约地址
    private String is_frozen;//是否冻结 0-否 1-是
    private String salt;//加密需要的盐

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContract_addr() {
        return contract_addr;
    }

    public void setContract_addr(String contract_addr) {
        this.contract_addr = contract_addr;
    }

    public String getIs_frozen() {
        return is_frozen;
    }

    public void setIs_frozen(String is_frozen) {
        this.is_frozen = is_frozen;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
