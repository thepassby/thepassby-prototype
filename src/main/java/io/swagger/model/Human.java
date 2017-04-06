package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Human
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T13:50:22.207Z")

public class Human {
	@JsonProperty("index")
	private Integer index = null;

	@JsonProperty("name")
	private String name = null;

	@JsonProperty("birthday")
	private String birthday = null;

	@JsonProperty("sex")
	private String sex = null;

	@JsonProperty("lucky")
	private Double lucky = null;

	@JsonProperty("occupation")
	private List<Occupation> occupation = new ArrayList<Occupation>();

	@JsonProperty("contact")
	private List<Contact> contact = new ArrayList<Contact>();

	public Human index(Integer index) {
		this.index = index;
		return this;
	}

	/**
	 * auto increase id.
	 * 
	 * @return index
	 **/
	@ApiModelProperty(value = "auto increase id.")
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Human name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human birthday(String birthday) {
		this.birthday = birthday;
		return this;
	}

	/**
	 * format yyyy-mm-dd.
	 * 
	 * @return birthday
	 **/
	@ApiModelProperty(value = "format yyyy-mm-dd.")
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Human sex(String sex) {
		this.sex = sex;
		return this;
	}

	/**
	 * Get sex
	 * 
	 * @return sex
	 **/
	@ApiModelProperty(value = "")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Human lucky(Double lucky) {
		this.lucky = lucky;
		return this;
	}

	/**
	 * Get lucky
	 * 
	 * @return lucky
	 **/
	@ApiModelProperty(value = "")
	public Double getLucky() {
		return lucky;
	}

	public void setLucky(Double lucky) {
		this.lucky = lucky;
	}

	public Human occupation(List<Occupation> occupation) {
		this.occupation = occupation;
		return this;
	}

	public Human addOccupationItem(Occupation occupationItem) {
		this.occupation.add(occupationItem);
		return this;
	}

	/**
	 * Get occupation
	 * 
	 * @return occupation
	 **/
	@ApiModelProperty(value = "")
	public List<Occupation> getOccupation() {
		return occupation;
	}

	public void setOccupation(List<Occupation> occupation) {
		this.occupation = occupation;
	}

	public Human contact(List<Contact> contact) {
		this.contact = contact;
		return this;
	}

	public Human addContactItem(Contact contactItem) {
		this.contact.add(contactItem);
		return this;
	}

	/**
	 * Get contact
	 * 
	 * @return contact
	 **/
	@ApiModelProperty(value = "")
	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Human human = (Human) o;
		return Objects.equals(this.index, human.index) && Objects.equals(this.name, human.name)
				&& Objects.equals(this.birthday, human.birthday) && Objects.equals(this.sex, human.sex)
				&& Objects.equals(this.lucky, human.lucky) && Objects.equals(this.occupation, human.occupation)
				&& Objects.equals(this.contact, human.contact);
	}

	@Override
	public int hashCode() {
		return Objects.hash(index, name, birthday, sex, lucky, occupation, contact);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Human {\n");

		sb.append("    index: ").append(toIndentedString(index)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
		sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
		sb.append("    lucky: ").append(toIndentedString(lucky)).append("\n");
		sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
		sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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
