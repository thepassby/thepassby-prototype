package io.swagger.model.seq;

import java.util.Objects;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Sequence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-05T14:40:45.991Z")

public class Sequence {
	@Id
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("key")
	private String key = null;

	@JsonProperty("value")
	private Integer value = null;

	public Sequence id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Sequence key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * Get key
	 * 
	 * @return key
	 **/
	@ApiModelProperty(value = "")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Sequence value(Integer value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Sequence sequence = (Sequence) o;
		return Objects.equals(this.id, sequence.id) && Objects.equals(this.key, sequence.key)
				&& Objects.equals(this.value, sequence.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, key, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Sequence {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
