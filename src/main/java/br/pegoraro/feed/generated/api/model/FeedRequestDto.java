package br.pegoraro.feed.generated.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeedRequestDto
 */

@JsonTypeName("FeedRequest")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-18T13:51:13.319310308-03:00[America/Sao_Paulo]")
public class FeedRequestDto {

  @JsonProperty("label")
  private String label;

  @JsonProperty("queryTags")
  @Valid
  private List<String> queryTags = null;

  @JsonProperty("cron")
  private String cron;

  public FeedRequestDto label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", required = false)
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public FeedRequestDto queryTags(List<String> queryTags) {
    this.queryTags = queryTags;
    return this;
  }

  public FeedRequestDto addQueryTagsItem(String queryTagsItem) {
    if (this.queryTags == null) {
      this.queryTags = new ArrayList<>();
    }
    this.queryTags.add(queryTagsItem);
    return this;
  }

  /**
   * Get queryTags
   * @return queryTags
  */
  
  @Schema(name = "queryTags", required = false)
  public List<String> getQueryTags() {
    return queryTags;
  }

  public void setQueryTags(List<String> queryTags) {
    this.queryTags = queryTags;
  }

  public FeedRequestDto cron(String cron) {
    this.cron = cron;
    return this;
  }

  /**
   * Get cron
   * @return cron
  */
  
  @Schema(name = "cron", required = false)
  public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedRequestDto feedRequest = (FeedRequestDto) o;
    return Objects.equals(this.label, feedRequest.label) &&
        Objects.equals(this.queryTags, feedRequest.queryTags) &&
        Objects.equals(this.cron, feedRequest.cron);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, queryTags, cron);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedRequestDto {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    queryTags: ").append(toIndentedString(queryTags)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
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

