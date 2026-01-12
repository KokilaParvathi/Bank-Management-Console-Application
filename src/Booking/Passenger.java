package Booking;

class Passenger {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    private int age;
    private String gender;
    private String phone;

    public Passenger(int age, String gender, String name, String phone) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.phone = phone;
    }

    public String getDetails() {
        return name + " | " + age + " | " + gender + " | " + phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
