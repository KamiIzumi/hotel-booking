use customer;

Select b.BookingID,c.FirstName,b.CheckIn,b.CheckOut,b.RoomID,b.RoomPrice,r.RestroPrice,a.BarPrice,s.ServicePrice
from booking as b
inner join customerinfo as c
on b.CustomerID = c. CustomerID
inner join restro as r
on b.BookingID = r.BookingID
inner join bar as a
on b.BookingID = a.BookingID
inner join services as s
on b.BookingID = s.BookingID;

select * from booking;
select * from customerinfo;
select * from restro;
select * from bar;
select * from services;
