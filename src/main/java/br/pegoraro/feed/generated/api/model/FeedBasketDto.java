package br.pegoraro.feed.generated.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeedBasketDto
 */

@JsonTypeName("FeedBasket")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-18T13:51:13.319310308-03:00[America/Sao_Paulo]")
public class FeedBasketDto {

  @JsonProperty("tweetCount")
  private Integer tweetCount;

  @JsonProperty("searchHits")
  private Integer searchHits;

  public FeedBasketDto tweetCount(Integer tweetCount) {
    this.tweetCount = tweetCount;
    return this;
  }

  /**
   * Get tweetCount
   * minimum: 0
   * @return tweetCount
  */
  @Min(0) 
  @Schema(name = "tweetCount", required = false)
  public Integer getTweetCount() {
    return tweetCount;
  }

  public void setTweetCount(Integer tweetCount) {
    this.tweetCount = tweetCount;
  }

  public FeedBasketDto searchHits(Integer searchHits) {
    this.searchHits = searchHits;
    return this;
  }

  /**
   * Get searchHits
   * minimum: 0
   * @return searchHits
  */
  @Min(0) 
  @Schema(name = "searchHits", required = false)
  public Integer getSearchHits() {
    return searchHits;
  }

  public void setSearchHits(Integer searchHits) {
    this.searchHits = searchHits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedBasketDto feedBasket = (FeedBasketDto) o;
    return Objects.equals(this.tweetCount, feedBasket.tweetCount) &&
        Objects.equals(this.searchHits, feedBasket.searchHits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tweetCount, searchHits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedBasketDto {\n");
    sb.append("    tweetCount: ").append(toIndentedString(tweetCount)).append("\n");
    sb.append("    searchHits: ").append(toIndentedString(searchHits)).append("\n");
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

