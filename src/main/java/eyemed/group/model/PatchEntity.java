package eyemed.group.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * Patch entity payload
 */
@lombok.AllArgsConstructor @lombok.NoArgsConstructor

@Schema(name = "PatchEntity", description = "Patch entity payload")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-19T00:33:24.857772500+05:30[Asia/Calcutta]")
public class PatchEntity {

  /**
   * context dependent value, but more generic values are 'replace','remove','link'
   */
  public enum OpEnum {
    REPLACE("replace"),
    
    REMOVE("remove"),
    
    LINK("link");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("op")
  private OpEnum op;

  @JsonProperty("newValue")
  private Object newValue;

  @JsonProperty("column")
  private String column;

  public PatchEntity op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * context dependent value, but more generic values are 'replace','remove','link'
   * @return op
  */
  
  @Schema(name = "op", description = "context dependent value, but more generic values are 'replace','remove','link'", required = false)
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public PatchEntity newValue(Object newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * For operation like 'remove', this attribute could be omitted, otherwise it is mandatory value
   * @return newValue
  */
  
  @Schema(name = "newValue", description = "For operation like 'remove', this attribute could be omitted, otherwise it is mandatory value", required = false)
  public Object getNewValue() {
    return newValue;
  }

  public void setNewValue(Object newValue) {
    this.newValue = newValue;
  }

  public PatchEntity column(String column) {
    this.column = column;
    return this;
  }

  /**
   * this specifying target of modification, for example 'name' or 'description'
   * @return column
  */
  
  @Schema(name = "column", description = "this specifying target of modification, for example 'name' or 'description'", required = false)
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchEntity patchEntity = (PatchEntity) o;
    return Objects.equals(this.op, patchEntity.op) &&
        Objects.equals(this.newValue, patchEntity.newValue) &&
        Objects.equals(this.column, patchEntity.column);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, newValue, column);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchEntity {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

