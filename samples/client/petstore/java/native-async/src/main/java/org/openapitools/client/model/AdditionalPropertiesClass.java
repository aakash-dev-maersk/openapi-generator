/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import org.openapitools.client.ApiClient;
/**
 * AdditionalPropertiesClass
 */
@JsonPropertyOrder({
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_PROPERTY,
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_OF_MAP_PROPERTY,
  AdditionalPropertiesClass.JSON_PROPERTY_ANYTYPE1,
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1,
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2,
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3,
  AdditionalPropertiesClass.JSON_PROPERTY_EMPTY_MAP,
  AdditionalPropertiesClass.JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_STRING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0-SNAPSHOT")
public class AdditionalPropertiesClass {
  public static final String JSON_PROPERTY_MAP_PROPERTY = "map_property";
  private Map<String, String> mapProperty = new HashMap<>();

  public static final String JSON_PROPERTY_MAP_OF_MAP_PROPERTY = "map_of_map_property";
  private Map<String, Map<String, String>> mapOfMapProperty = new HashMap<>();

  public static final String JSON_PROPERTY_ANYTYPE1 = "anytype_1";
  private JsonNullable<Object> anytype1 = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1 = "map_with_undeclared_properties_anytype_1";
  private Object mapWithUndeclaredPropertiesAnytype1;

  public static final String JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2 = "map_with_undeclared_properties_anytype_2";
  private Object mapWithUndeclaredPropertiesAnytype2;

  public static final String JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3 = "map_with_undeclared_properties_anytype_3";
  private Map<String, Object> mapWithUndeclaredPropertiesAnytype3 = new HashMap<>();

  public static final String JSON_PROPERTY_EMPTY_MAP = "empty_map";
  private Object emptyMap;

  public static final String JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_STRING = "map_with_undeclared_properties_string";
  private Map<String, String> mapWithUndeclaredPropertiesString = new HashMap<>();

  public AdditionalPropertiesClass() { 
  }

  public AdditionalPropertiesClass mapProperty(Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapPropertyItem(String key, String mapPropertyItem) {
    if (this.mapProperty == null) {
      this.mapProperty = new HashMap<>();
    }
    this.mapProperty.put(key, mapPropertyItem);
    return this;
  }

  /**
   * Get mapProperty
   * @return mapProperty
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getMapProperty() {
    return mapProperty;
  }


  @JsonProperty(JSON_PROPERTY_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapProperty(Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
  }


  public AdditionalPropertiesClass mapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
    return this;
  }

  public AdditionalPropertiesClass putMapOfMapPropertyItem(String key, Map<String, String> mapOfMapPropertyItem) {
    if (this.mapOfMapProperty == null) {
      this.mapOfMapProperty = new HashMap<>();
    }
    this.mapOfMapProperty.put(key, mapOfMapPropertyItem);
    return this;
  }

  /**
   * Get mapOfMapProperty
   * @return mapOfMapProperty
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_OF_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Map<String, String>> getMapOfMapProperty() {
    return mapOfMapProperty;
  }


  @JsonProperty(JSON_PROPERTY_MAP_OF_MAP_PROPERTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
  }


  public AdditionalPropertiesClass anytype1(Object anytype1) {
    this.anytype1 = JsonNullable.<Object>of(anytype1);
    return this;
  }

  /**
   * Get anytype1
   * @return anytype1
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Object getAnytype1() {
        return anytype1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ANYTYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAnytype1_JsonNullable() {
    return anytype1;
  }
  
  @JsonProperty(JSON_PROPERTY_ANYTYPE1)
  public void setAnytype1_JsonNullable(JsonNullable<Object> anytype1) {
    this.anytype1 = anytype1;
  }

  public void setAnytype1(Object anytype1) {
    this.anytype1 = JsonNullable.<Object>of(anytype1);
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype1(Object mapWithUndeclaredPropertiesAnytype1) {
    this.mapWithUndeclaredPropertiesAnytype1 = mapWithUndeclaredPropertiesAnytype1;
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesAnytype1
   * @return mapWithUndeclaredPropertiesAnytype1
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMapWithUndeclaredPropertiesAnytype1() {
    return mapWithUndeclaredPropertiesAnytype1;
  }


  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapWithUndeclaredPropertiesAnytype1(Object mapWithUndeclaredPropertiesAnytype1) {
    this.mapWithUndeclaredPropertiesAnytype1 = mapWithUndeclaredPropertiesAnytype1;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype2(Object mapWithUndeclaredPropertiesAnytype2) {
    this.mapWithUndeclaredPropertiesAnytype2 = mapWithUndeclaredPropertiesAnytype2;
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesAnytype2
   * @return mapWithUndeclaredPropertiesAnytype2
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMapWithUndeclaredPropertiesAnytype2() {
    return mapWithUndeclaredPropertiesAnytype2;
  }


  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapWithUndeclaredPropertiesAnytype2(Object mapWithUndeclaredPropertiesAnytype2) {
    this.mapWithUndeclaredPropertiesAnytype2 = mapWithUndeclaredPropertiesAnytype2;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesAnytype3(Map<String, Object> mapWithUndeclaredPropertiesAnytype3) {
    this.mapWithUndeclaredPropertiesAnytype3 = mapWithUndeclaredPropertiesAnytype3;
    return this;
  }

  public AdditionalPropertiesClass putMapWithUndeclaredPropertiesAnytype3Item(String key, Object mapWithUndeclaredPropertiesAnytype3Item) {
    if (this.mapWithUndeclaredPropertiesAnytype3 == null) {
      this.mapWithUndeclaredPropertiesAnytype3 = new HashMap<>();
    }
    this.mapWithUndeclaredPropertiesAnytype3.put(key, mapWithUndeclaredPropertiesAnytype3Item);
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesAnytype3
   * @return mapWithUndeclaredPropertiesAnytype3
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMapWithUndeclaredPropertiesAnytype3() {
    return mapWithUndeclaredPropertiesAnytype3;
  }


  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_ANYTYPE3)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapWithUndeclaredPropertiesAnytype3(Map<String, Object> mapWithUndeclaredPropertiesAnytype3) {
    this.mapWithUndeclaredPropertiesAnytype3 = mapWithUndeclaredPropertiesAnytype3;
  }


  public AdditionalPropertiesClass emptyMap(Object emptyMap) {
    this.emptyMap = emptyMap;
    return this;
  }

  /**
   * an object with no declared properties and no undeclared properties, hence it&#39;s an empty map.
   * @return emptyMap
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMPTY_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getEmptyMap() {
    return emptyMap;
  }


  @JsonProperty(JSON_PROPERTY_EMPTY_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmptyMap(Object emptyMap) {
    this.emptyMap = emptyMap;
  }


  public AdditionalPropertiesClass mapWithUndeclaredPropertiesString(Map<String, String> mapWithUndeclaredPropertiesString) {
    this.mapWithUndeclaredPropertiesString = mapWithUndeclaredPropertiesString;
    return this;
  }

  public AdditionalPropertiesClass putMapWithUndeclaredPropertiesStringItem(String key, String mapWithUndeclaredPropertiesStringItem) {
    if (this.mapWithUndeclaredPropertiesString == null) {
      this.mapWithUndeclaredPropertiesString = new HashMap<>();
    }
    this.mapWithUndeclaredPropertiesString.put(key, mapWithUndeclaredPropertiesStringItem);
    return this;
  }

  /**
   * Get mapWithUndeclaredPropertiesString
   * @return mapWithUndeclaredPropertiesString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getMapWithUndeclaredPropertiesString() {
    return mapWithUndeclaredPropertiesString;
  }


  @JsonProperty(JSON_PROPERTY_MAP_WITH_UNDECLARED_PROPERTIES_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapWithUndeclaredPropertiesString(Map<String, String> mapWithUndeclaredPropertiesString) {
    this.mapWithUndeclaredPropertiesString = mapWithUndeclaredPropertiesString;
  }


  /**
   * Return true if this AdditionalPropertiesClass object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(this.mapProperty, additionalPropertiesClass.mapProperty) &&
        Objects.equals(this.mapOfMapProperty, additionalPropertiesClass.mapOfMapProperty) &&
        equalsNullable(this.anytype1, additionalPropertiesClass.anytype1) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype1, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype1) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype2, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype2) &&
        Objects.equals(this.mapWithUndeclaredPropertiesAnytype3, additionalPropertiesClass.mapWithUndeclaredPropertiesAnytype3) &&
        Objects.equals(this.emptyMap, additionalPropertiesClass.emptyMap) &&
        Objects.equals(this.mapWithUndeclaredPropertiesString, additionalPropertiesClass.mapWithUndeclaredPropertiesString);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapProperty, mapOfMapProperty, hashCodeNullable(anytype1), mapWithUndeclaredPropertiesAnytype1, mapWithUndeclaredPropertiesAnytype2, mapWithUndeclaredPropertiesAnytype3, emptyMap, mapWithUndeclaredPropertiesString);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
    sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
    sb.append("    anytype1: ").append(toIndentedString(anytype1)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype1: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype1)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype2: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype2)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesAnytype3: ").append(toIndentedString(mapWithUndeclaredPropertiesAnytype3)).append("\n");
    sb.append("    emptyMap: ").append(toIndentedString(emptyMap)).append("\n");
    sb.append("    mapWithUndeclaredPropertiesString: ").append(toIndentedString(mapWithUndeclaredPropertiesString)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `map_property` to the URL query string
    if (getMapProperty() != null) {
      for (String _key : getMapProperty().keySet()) {
        joiner.add(String.format("%smap_property%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getMapProperty().get(_key), URLEncoder.encode(ApiClient.valueToString(getMapProperty().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `map_of_map_property` to the URL query string
    if (getMapOfMapProperty() != null) {
      for (String _key : getMapOfMapProperty().keySet()) {
        joiner.add(String.format("%smap_of_map_property%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getMapOfMapProperty().get(_key), URLEncoder.encode(ApiClient.valueToString(getMapOfMapProperty().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `anytype_1` to the URL query string
    if (getAnytype1() != null) {
      joiner.add(String.format("%sanytype_1%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAnytype1()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `map_with_undeclared_properties_anytype_1` to the URL query string
    if (getMapWithUndeclaredPropertiesAnytype1() != null) {
      joiner.add(String.format("%smap_with_undeclared_properties_anytype_1%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMapWithUndeclaredPropertiesAnytype1()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `map_with_undeclared_properties_anytype_2` to the URL query string
    if (getMapWithUndeclaredPropertiesAnytype2() != null) {
      joiner.add(String.format("%smap_with_undeclared_properties_anytype_2%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMapWithUndeclaredPropertiesAnytype2()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `map_with_undeclared_properties_anytype_3` to the URL query string
    if (getMapWithUndeclaredPropertiesAnytype3() != null) {
      for (String _key : getMapWithUndeclaredPropertiesAnytype3().keySet()) {
        joiner.add(String.format("%smap_with_undeclared_properties_anytype_3%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getMapWithUndeclaredPropertiesAnytype3().get(_key), URLEncoder.encode(ApiClient.valueToString(getMapWithUndeclaredPropertiesAnytype3().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `empty_map` to the URL query string
    if (getEmptyMap() != null) {
      joiner.add(String.format("%sempty_map%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEmptyMap()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `map_with_undeclared_properties_string` to the URL query string
    if (getMapWithUndeclaredPropertiesString() != null) {
      for (String _key : getMapWithUndeclaredPropertiesString().keySet()) {
        joiner.add(String.format("%smap_with_undeclared_properties_string%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getMapWithUndeclaredPropertiesString().get(_key), URLEncoder.encode(ApiClient.valueToString(getMapWithUndeclaredPropertiesString().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}

