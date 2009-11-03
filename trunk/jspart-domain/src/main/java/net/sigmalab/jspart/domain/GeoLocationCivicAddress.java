package net.sigmalab.jspart.domain;

import javax.persistence.Embeddable;

@Embeddable
public class GeoLocationCivicAddress {

	private String addressLine1;
	private String addressLine2;
	private String building;
	private String city;
	private String countryRegion;
	private String floorLevel;
	private String postalCode;
	private String stateProvince;
	private Double latitude;
	private Double longitude;
	private Float altitude;
	private Float horizontalAccuracy;
	private Float verticalAccuracy;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryRegion() {
		return countryRegion;
	}

	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}

	public String getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(String floorLevel) {
		this.floorLevel = floorLevel;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public float getAltitude() {
		return altitude;
	}

	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}

	public float getHorizontalAccuracy() {
		return horizontalAccuracy;
	}

	public void setHorizontalAccuracy(float horizontalAccuracy) {
		this.horizontalAccuracy = horizontalAccuracy;
	}

	public float getVerticalAccuracy() {
		return verticalAccuracy;
	}

	public void setVerticalAccuracy(float verticalAccuracy) {
		this.verticalAccuracy = verticalAccuracy;
	}

	public static class Builder {
		private String addressLine1;
		private String addressLine2;
		private String building;
		private String city;
		private String countryRegion;
		private String floorLevel;
		private String postalCode;
		private String stateProvince;
		private Double latitude;
		private Double longitude;
		private Float altitude;
		private Float horizontalAccuracy;
		private Float verticalAccuracy;

		public Builder addressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
			return this;
		}

		public Builder addressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
			return this;
		}

		public Builder building(String building) {
			this.building = building;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder countryRegion(String countryRegion) {
			this.countryRegion = countryRegion;
			return this;
		}

		public Builder floorLevel(String floorLevel) {
			this.floorLevel = floorLevel;
			return this;
		}

		public Builder postalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public Builder stateProvince(String stateProvince) {
			this.stateProvince = stateProvince;
			return this;
		}

		public Builder latitude(Double latitude) {
			this.latitude = latitude;
			return this;
		}

		public Builder longitude(Double longitude) {
			this.longitude = longitude;
			return this;
		}

		public Builder altitude(Float altitude) {
			this.altitude = altitude;
			return this;
		}

		public Builder horizontalAccuracy(Float horizontalAccuracy) {
			this.horizontalAccuracy = horizontalAccuracy;
			return this;
		}

		public Builder verticalAccuracy(Float verticalAccuracy) {
			this.verticalAccuracy = verticalAccuracy;
			return this;
		}

		public GeoLocationCivicAddress build() {
			return new GeoLocationCivicAddress(this);
		}
	}

	private GeoLocationCivicAddress(Builder builder) {
		this.addressLine1 = builder.addressLine1;
		this.addressLine2 = builder.addressLine2;
		this.building = builder.building;
		this.city = builder.city;
		this.countryRegion = builder.countryRegion;
		this.floorLevel = builder.floorLevel;
		this.postalCode = builder.postalCode;
		this.stateProvince = builder.stateProvince;
		this.latitude = builder.latitude;
		this.longitude = builder.longitude;
		this.altitude = builder.altitude;
		this.horizontalAccuracy = builder.horizontalAccuracy;
		this.verticalAccuracy = builder.verticalAccuracy;
	}
	
	public GeoLocationCivicAddress(){}
}
