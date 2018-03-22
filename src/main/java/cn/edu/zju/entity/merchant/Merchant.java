package cn.edu.zju.entity.merchant;

public class Merchant {
    private String id;//商户ID
    private String name;//商户名
    private String account;
    private String password;
    private Integer cash_deposit;//保证金
    private Integer settlement_balance;//结算券余额
    private String check_state;//审核状态
    private String legal_person_name;//法人姓名
    private String address;//商户地址
    private String passport;//营业执照
    private String business_scope;//营业范围
    private String bank_number;//银行账号
    private String contract_addr;//合约地址
    private String issue_coupon_right;//发券权
    private String receive_coupon_right;//记账权

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getCash_deposit() {
        return cash_deposit;
    }

    public void setCash_deposit(Integer cash_deposit) {
        this.cash_deposit = cash_deposit;
    }

    public Integer getSettlement_balance() {
        return settlement_balance;
    }

    public void setSettlement_balance(Integer settlement_balance) {
        this.settlement_balance = settlement_balance;
    }

    public String getCheck_state() {
        return check_state;
    }

    public void setCheck_state(String check_state) {
        this.check_state = check_state;
    }

    public String getLegal_person_name() {
        return legal_person_name;
    }

    public void setLegal_person_name(String legal_person_name) {
        this.legal_person_name = legal_person_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getBusiness_scope() {
        return business_scope;
    }

    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }

    public String getBank_number() {
        return bank_number;
    }

    public void setBank_number(String bank_number) {
        this.bank_number = bank_number;
    }

    public String getContract_addr() {
        return contract_addr;
    }

    public void setContract_addr(String contract_addr) {
        this.contract_addr = contract_addr;
    }

    public String getIssue_coupon_right() {
        return issue_coupon_right;
    }

    public void setIssue_coupon_right(String issue_coupon_right) {
        this.issue_coupon_right = issue_coupon_right;
    }

    public String getReceive_coupon_right() {
        return receive_coupon_right;
    }

    public void setReceive_coupon_right(String receive_coupon_right) {
        this.receive_coupon_right = receive_coupon_right;
    }
}
