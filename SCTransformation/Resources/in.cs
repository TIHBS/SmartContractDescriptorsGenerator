using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using ParkHero.Enumerations;
using ParkHero.Models;

namespace ParkHero.Interfaces.Services.Data
{
    public interface IBookingData
    {
        Task<Booking> AddBooking(Booking newBooking);
        Task<bool> CancelBooking(int bookingId);
        Task<IEnumerable<Booking>> GetBookings(int userId, StatusType type);
        Task<IEnumerable<Booking>> GetBookings(string dateTime);
        Task<IEnumerable<Booking>> GetMonthBookings(string dateTime);
        Task<int> GetCountOfBookedParkingLot(DateTime bookingDate);
        Task<bool> AddBlockDay(BlockedDay blockDay);
        Task<bool> CancelBlockDay(BlockedDay blockDay);
        Task<IEnumerable<BlockedDay>> GetBlockedDays();
    }
}