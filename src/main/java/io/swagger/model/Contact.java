package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Contact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

public class Contact {
	@JsonProperty("tel")
	private Integer tel = null;

	@JsonProperty("email")
	private String email = null;

	@JsonProperty("site")
	private String site = null;

	@JsonProperty("addresss")
	private List<Address> addresss = new ArrayList<Address>();

	public Contact tel(Integer tel) {
		this.tel = tel;
		return this;
	}

	/**
	 * Get tel
	 * 
	 * @return tel
	 **/
	@ApiModelProperty(value = "")
	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public Contact email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contact site(String site) {
		this.site = site;
		return this;
	}

	/**
	 * Get site
	 * 
	 * @return site
	 **/
	@ApiModelProperty(value = "")
	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Contact addresss(List<Address> addresss) {
		this.addresss = addresss;
		return this;
	}

	public Contact addAddresssItem(Address addresssItem) {
		this.addresss.add(addresssItem);
		return this;
	}

	/**
	 * Get addresss
	 * 
	 * @return addresss
	 **/
	@ApiModelProperty(value = "")
	public List<Address> getAddresss() {
		return addresss;
	}

	public void setAddresss(List<Address> addresss) {
		this.addresss = addresss;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Contact contact = (Contact) o;
		return Objects.equals(this.tel, contact.tel) && Objects.equals(this.email, contact.email)
				&& Objects.equals(this.site, contact.site) && Objects.equals(this.addresss, contact.addresss);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tel, email, site, addresss);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Contact {\n");

		sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    site: ").append(toIndentedString(site)).append("\n");
		sb.append("    addresss: ").append(toIndentedString(addresss)).append("\n");
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
