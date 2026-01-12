package Booking;

import java.util.ArrayList;

class BookingService {
    private Bus bus;
    private final ArrayList<Passenger> passengers = new ArrayList<>();

    @SuppressWarnings("unused")
    BookingService(Bus bus) {
        this.bus = bus;
    }

    public void bookPassenger(Passenger p) {
        int seat = bus.bookSeat();
        if (seat != -1) {
            passengers.add(p);
            System.out.println("Seat booked successfully! Seat No: " + seat);
        } else {
            System.out.println("No seats available");
        }
    }

    public void cancelBooking(int seatNo) {
        if (bus.cancelSeat(seatNo)) {
            passengers.remove(passengers.size() - 1);
            System.out.println("Booking cancelled");
        } else {
            System.out.println("Invalid seat number");
        }
    }

    public void showPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers found");
            return;
        }
        for (Passenger p : passengers) {
            System.out.println(p.getDetails());
        }
    }

    public void showSeats() {
        bus.showSeats();
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
