package net.sigmalab.jspart.domain;

import javax.persistence.Embeddable;

@Embeddable
public class GeoLocationCivicAddress {
	
	public static class Builder {
		
	    private String addressLine1;
		private String addressLine2;
		private String building;
		private String city;
		private String countryRegion;
		private String floorLevel;
		private String postalCode;
		private String stateProvince;
		
		private GeoLocation geoLocation = new GeoLocation();

        public Builder addressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
			return this;
		}

		public Builder addressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
			return this;
		}

		public Builder altitude(Float altitude) {
			this.geoLocation.setAltitude(altitude);
			return this;
		}

		public GeoLocationCivicAddress build() {
			return new GeoLocationCivicAddress(this);
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

		public Builder horizontalAccuracy(Float horizontalAccuracy) {
			this.geoLocation.setHorizontalAccuracy(horizontalAccuracy);
			return this;
		}

		public Builder latitude(Double latitude) {
			this.geoLocation.setLatitude(latitude);
			return this;
		}

		public Builder longitude(Double longitude) {
			this.geoLocation.setLongitude(longitude);
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

		public Builder verticalAccuracy(Float verticalAccuracy) {
			this.geoLocation.setVerticalAccuracy(verticalAccuracy);
			return this;
		}
	}
	
	private String addressType;
	
	private String municipality;
	
	/**
	 * 
	 * @uml.property  name="addressLine1"
	 */
	private String addressLine1;
	
	/**
	 * 
	 * @uml.property  name="addressLine2"
	 */
	private String addressLine2;
	
	/**
	 * 
	 * @uml.property  name="building"
	 */
	private String building;

	/**
	 * 
	 * @uml.property  name="city"
	 */
	private String city;
	/**
	 * 
	 * @uml.property  name="countryRegion"
	 */
	private String countryRegion;
	/**
	 * 
	 * @uml.property  name="floorLevel"
	 */
	private String floorLevel;
	/**
	 * 
	 * @uml.property  name="postalCode"
	 */
	private String postalCode;
	/**
	 * 
	 * @uml.property  name="stateProvince"
	 */
	private String stateProvince;
	/**
	 * 
	 * @uml.property  name="latitude"
	 */
	private Double latitude;
	/**
	 * 
	 * @uml.property  name="longitude"
	 */
	private Double longitude;
	/**
	 * 
	 * @uml.property  name="altitude"
	 */
	private Float altitude;
	/**
	 * 
	 * @uml.property  name="horizontalAccuracy"
	 */
	private Float horizontalAccuracy;
	/**
	 * 
	 * @uml.property  name="verticalAccuracy"
	 */
	private Float verticalAccuracy;
	public GeoLocationCivicAddress(){}
	private GeoLocationCivicAddress(Builder builder) {
		this.addressLine1 = builder.addressLine1;
		this.addressLine2 = builder.addressLine2;
		this.building = builder.building;
		this.city = builder.city;
		this.countryRegion = builder.countryRegion;
		this.floorLevel = builder.floorLevel;
		this.postalCode = builder.postalCode;
		this.stateProvince = builder.stateProvince;
		this.latitude = builder.geoLocation.getLatitude();
		this.longitude = builder.geoLocation.getLongitude();
		this.altitude = builder.geoLocation.getAltitude();
		this.horizontalAccuracy = builder.geoLocation.getHorizontalAccuracy();
		this.verticalAccuracy = builder.geoLocation.getVerticalAccuracy();
	}
	/**
	 * 
	 * @uml.property  name="addressLine1"
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * 
	 * @uml.property  name="addressLine2"
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getAddressType() {
		return addressType;
	}
	/**
	 * 
	 * @uml.property  name="altitude"
	 */
	public float getAltitude() {
		return altitude;
	}
	/**
	 * 
	 * @uml.property  name="building"
	 */
	public String getBuilding() {
		return building;
	}
	/**
	 * 
	 * @uml.property  name="city"
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @uml.property  name="countryRegion"
	 */
	public String getCountryRegion() {
		return countryRegion;
	}
	/**
	 * 
	 * @uml.property  name="floorLevel"
	 */
	public String getFloorLevel() {
		return floorLevel;
	}
	/**
	 * 
	 * @uml.property  name="horizontalAccuracy"
	 */
	public float getHorizontalAccuracy() {
		return horizontalAccuracy;
	}
	/**
	 * 
	 * @uml.property  name="latitude"
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * 
	 * @uml.property  name="longitude"
	 */
	public double getLongitude() {
		return longitude;
	}
	public String getMunicipality() {
		return municipality;
	}
	/**
	 * 
	 * @uml.property  name="postalCode"
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * 
	 * @uml.property  name="stateProvince"
	 */
	public String getStateProvince() {
		return stateProvince;
	}
	/**
	 * 
	 * @uml.property  name="verticalAccuracy"
	 */
	public float getVerticalAccuracy() {
		return verticalAccuracy;
	}
	/**
	 * 
	 * @uml.property  name="addressLine1"
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * 
	 * @uml.property  name="addressLine2"
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	/**
	 * 
	 * @uml.property  name="altitude"
	 */
	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}
	/**
	 * 
	 * @uml.property  name="building"
	 */
	public void setBuilding(String building) {
		this.building = building;
	}
	/**
	 * 
	 * @uml.property  name="city"
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @uml.property  name="countryRegion"
	 */
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	/**
	 * 
	 * @uml.property  name="floorLevel"
	 */
	public void setFloorLevel(String floorLevel) {
		this.floorLevel = floorLevel;
	}
	/**
	 * 
	 * @uml.property  name="horizontalAccuracy"
	 */
	public void setHorizontalAccuracy(float horizontalAccuracy) {
		this.horizontalAccuracy = horizontalAccuracy;
	}
	/**
	 * 
	 * @uml.property  name="latitude"
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * 
	 * @uml.property  name="longitude"
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	/**
	 * 
	 * @uml.property  name="postalCode"
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * 
	 * @uml.property  name="stateProvince"
	 */
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	
	/**
	 * 
	 * @uml.property  name="verticalAccuracy"
	 */
	public void setVerticalAccuracy(float verticalAccuracy) {
		this.verticalAccuracy = verticalAccuracy;
	}
}
