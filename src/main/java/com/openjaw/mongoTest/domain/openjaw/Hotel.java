package com.openjaw.mongoTest.domain.openjaw;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
	private String Reference;
	private Integer Position;
	private Integer StarRating;
	private String Name;
	private String Code;
	private String ChainCode;
	private String PolicyStatus;
	private String Image;
	private String URLPath;
	private Boolean Booked;
	private String BookingReference;
	private String Description;
	private Amenities Amenities;
	private TripAdvisor TripAdvisor;
	private AssociatedProducts AssociatedProducts;
	private Address Address;
	private List<Phone> Phone;
	private Location Location;
	@JsonProperty("Position")
	private Position PositionObj;
	private RelativePositions RelativePositions;
	private TimeSpan TimeSpan;
	private Rooms Rooms;
	public String getReference() {
		return Reference;
	}
	public void setReference(String reference) {
		Reference = reference;
	}
	public Integer getPosition() {
		return Position;
	}
	public void setPosition(Integer position) {
		Position = position;
	}
	public Integer getStarRating() {
		return StarRating;
	}
	public void setStarRating(Integer starRating) {
		StarRating = starRating;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getChainCode() {
		return ChainCode;
	}
	public void setChainCode(String chainCode) {
		ChainCode = chainCode;
	}
	public String getPolicyStatus() {
		return PolicyStatus;
	}
	public void setPolicyStatus(String policyStatus) {
		PolicyStatus = policyStatus;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getURLPath() {
		return URLPath;
	}
	public void setURLPath(String uRLPath) {
		URLPath = uRLPath;
	}
	public Boolean getBooked() {
		return Booked;
	}
	public void setBooked(Boolean booked) {
		Booked = booked;
	}
	public String getBookingReference() {
		return BookingReference;
	}
	public void setBookingReference(String bookingReference) {
		BookingReference = bookingReference;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Amenities getAmenities() {
		return Amenities;
	}
	public void setAmenities(Amenities amenities) {
		Amenities = amenities;
	}
	public TripAdvisor getTripAdvisor() {
		return TripAdvisor;
	}
	public void setTripAdvisor(TripAdvisor tripAdvisor) {
		TripAdvisor = tripAdvisor;
	}
	public AssociatedProducts getAssociatedProducts() {
		return AssociatedProducts;
	}
	public void setAssociatedProducts(AssociatedProducts associatedProducts) {
		AssociatedProducts = associatedProducts;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public List<Phone> getPhone() {
		return Phone;
	}
	public void setPhone(List<Phone> phone) {
		Phone = phone;
	}
	public Location getLocation() {
		return Location;
	}
	public void setLocation(Location location) {
		Location = location;
	}
	public Position getPositionObj() {
		return PositionObj;
	}
	public void setPositionObj(Position positionObj) {
		PositionObj = positionObj;
	}
	public RelativePositions getRelativePositions() {
		return RelativePositions;
	}
	public void setRelativePositions(RelativePositions relativePositions) {
		RelativePositions = relativePositions;
	}
	public TimeSpan getTimeSpan() {
		return TimeSpan;
	}
	public void setTimeSpan(TimeSpan timeSpan) {
		TimeSpan = timeSpan;
	}
	public Rooms getRooms() {
		return Rooms;
	}
	public void setRooms(Rooms rooms) {
		Rooms = rooms;
	}
	
	
	

	
	

	

			
}
