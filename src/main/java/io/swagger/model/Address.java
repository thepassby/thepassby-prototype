package io.swagger.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

public class Address {
	@JsonProperty("country")
	private String country = null;

	@JsonProperty("city")
	private String city = null;

	@JsonProperty("street")
	private String street = null;

	@JsonProperty("number")
	private String number = null;

	@JsonProperty("zipcode")
	private Integer zipcode = null;

	public Address country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * Get country
	 * 
	 * @return country
	 **/
	@ApiModelProperty(value = "")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * Get city
	 * 
	 * @return city
	 **/
	@ApiModelProperty(value = "")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address street(String street) {
		this.street = street;
		return this;
	}

	/**
	 * Get street
	 * 
	 * @return street
	 **/
	@ApiModelProperty(value = "")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Address number(String number) {
		this.number = number;
		return this;
	}

	/**
	 * Get number
	 * 
	 * @return number
	 **/
	@ApiModelProperty(value = "")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Address zipcode(Integer zipcode) {
		this.zipcode = zipcode;
		return this;
	}

	/**
	 * Get zipcode
	 * 
	 * @return zipcode
	 **/
	@ApiModelProperty(value = "")
	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Address address = (Address) o;
		return Objects.equals(this.country, address.country) && Objects.equals(this.city, address.city)
				&& Objects.equals(this.street, address.street) && Objects.equals(this.number, address.number)
				&& Objects.equals(this.zipcode, address.zipcode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, city, street, number, zipcode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Address {\n");

		sb.append("    country: ").append(toIndentedString(country)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    street: ").append(toIndentedString(street)).append("\n");
		sb.append("    number: ").append(toIndentedString(number)).append("\n");
		sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
