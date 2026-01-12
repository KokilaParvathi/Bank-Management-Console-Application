package Booking;

class Bus {
    private int totalSeats;
    private boolean[] seats;

    Bus(int totalSeats) {
        this.totalSeats = totalSeats;
        seats = new boolean[totalSeats];
        for (int i = 0; i < totalSeats; i++) {
            seats[i] = true;
        }
    }

    public int bookSeat() {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i]) {
                seats[i] = false;
                return i + 1;
            }
        }
        return -1;
    }

    public boolean cancelSeat(int seatNo) {
        if (seatNo > 0 && seatNo <= seats.length && !seats[seatNo - 1]) {
            seats[seatNo - 1] = true;
            return true;
        }
        return false;
    }

    public void showSeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Available" : "Booked"));
        }
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void setSeats(boolean[] seats) {
        this.seats = seats;
    }
}
