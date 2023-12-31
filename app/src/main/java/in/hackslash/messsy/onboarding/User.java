package in.hackslash.messsy.onboarding;

public class User {

    // TODO add user fields here
    private String email,name,roomno,uid,roll;
    private int balance;


    public User(){

    }

    public User(String email, String name, String roomno, String uid, int balance, String roll) {
        this.email = email;
        this.name = name;
        this.roomno = roomno;
        this.uid=uid;
        this.balance=balance;
        this.roll = roll;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
