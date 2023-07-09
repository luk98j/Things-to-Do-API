package com.whatsupdev.GradeFood.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Error
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-09T23:00:03.137099500+02:00[Europe/Warsaw]")
public class Error {

  private Integer messageId;

  private String messageDescription;

  /**
   * Default constructor
   * @deprecated Use {@link Error#Error(Integer, String)}
   */
  @Deprecated
  public Error() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Error(Integer messageId, String messageDescription) {
    this.messageId = messageId;
    this.messageDescription = messageDescription;
  }

  public Error messageId(Integer messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * Unique number for error
   * @return messageId
  */
  @NotNull 
  @Schema(name = "messageId", description = "Unique number for error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messageId")
  public Integer getMessageId() {
    return messageId;
  }

  public void setMessageId(Integer messageId) {
    this.messageId = messageId;
  }

  public Error messageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
    return this;
  }

  /**
   * A human readable error message
   * @return messageDescription
  */
  @NotNull 
  @Schema(name = "messageDescription", description = "A human readable error message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messageDescription")
  public String getMessageDescription() {
    return messageDescription;
  }

  public void setMessageDescription(String messageDescription) {
    this.messageDescription = messageDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.messageId, error.messageId) &&
        Objects.equals(this.messageDescription, error.messageDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, messageDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageDescription: ").append(toIndentedString(messageDescription)).append("\n");
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

