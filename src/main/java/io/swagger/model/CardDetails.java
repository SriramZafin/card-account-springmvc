package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CardDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-02T17:32:19.191+05:30")

public class CardDetails   {
  @JsonProperty("cardNumber")
  private Integer cardNumber = null;

  @JsonProperty("customerId")
  private Integer customerId = null;

  @JsonProperty("cardType")
  private String cardType = null;

  @JsonProperty("cardStatus")
  private String cardStatus = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("expiryDate")
  private String expiryDate = null;

  @JsonProperty("cardApplyMode")
  private String cardApplyMode = null;

  public CardDetails cardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CardDetails customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public CardDetails cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public CardDetails cardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

   /**
   * Get cardStatus
   * @return cardStatus
  **/
  @ApiModelProperty(value = "")
  public String getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(String cardStatus) {
    this.cardStatus = cardStatus;
  }

  public CardDetails startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CardDetails expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public CardDetails cardApplyMode(String cardApplyMode) {
    this.cardApplyMode = cardApplyMode;
    return this;
  }

   /**
   * Get cardApplyMode
   * @return cardApplyMode
  **/
  @ApiModelProperty(value = "")
  public String getCardApplyMode() {
    return cardApplyMode;
  }

  public void setCardApplyMode(String cardApplyMode) {
    this.cardApplyMode = cardApplyMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.cardNumber, cardDetails.cardNumber) &&
        Objects.equals(this.customerId, cardDetails.customerId) &&
        Objects.equals(this.cardType, cardDetails.cardType) &&
        Objects.equals(this.cardStatus, cardDetails.cardStatus) &&
        Objects.equals(this.startDate, cardDetails.startDate) &&
        Objects.equals(this.expiryDate, cardDetails.expiryDate) &&
        Objects.equals(this.cardApplyMode, cardDetails.cardApplyMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, customerId, cardType, cardStatus, startDate, expiryDate, cardApplyMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    cardApplyMode: ").append(toIndentedString(cardApplyMode)).append("\n");
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

