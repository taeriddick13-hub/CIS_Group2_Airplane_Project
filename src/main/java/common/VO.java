package common;

public class VO {
    private String username;
    private String password;
    private String email;
    private String first_name;
    private String last_name;
    private String address;
    private String zip;
    private String state;
    private String action;
    private String operationResult;

    public VO() {
    }

    public VO(String username, String password, String email, String first_name, String last_name,
              String address, String zip, String state, String action, String operationResult) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.zip = zip;
        this.state = state;
        this.action = action;
        this.operationResult = operationResult;
    }

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getFirst_name() {return first_name;}

    public void setFirst_name(String first_name) {this.first_name = first_name;}

    public String getLast_name() {return last_name;}

    public void setLast_name(String last_name) {this.last_name = last_name;}

    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    public String getZip() {return zip;}

    public void setZip(String zip) {this.zip = zip;}

    public String getState() {return state;}

    public void setState(String state) {this.state = state;}

    public String getAction() {return action;}

    public void setAction(String action) {this.action = action;}

    public String getOperationResult() {return operationResult;}

    public void setOperationResult(String operationResult) {this.operationResult = operationResult;}

    @Override
    public String toString() {
        return "VO{" +
                "username=" + username + '\'' +
                ", password=" + password + '\'' +
                ", email=" + email + '\'' +
                ", first_name=" + first_name + '\'' +
                ", last_name=" + last_name + '\'' +
                ", address=" + address + '\'' +
                ", zip=" + zip + '\'' +
                ", state=" + state + '\'' +
                ", action=" + action + '\'' +
                ", operationResult=" + operationResult + '\'' +
                '}';
    }

}

