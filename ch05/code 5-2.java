// 코드 5-2  템플릿 파일

// template.java
package ${packageName}

/**
 * ${className}이다.
 * Gradle로 자동 생성
 */
public class ${className} {
<% fileds.each { type, fieldName -> %>
  private ${type} ${fieldName};<% } %>

  public void ${className}() {}
<% fields.each { type, fieldName ->
  String methodName = fieldName.capitalize() %>
  public ${type} get${methodName}() {
    return ${fieldName};
  }
  public void set${methodName}(${type} ${fieldName}) {
    this.${fieldName} = ${fieldName};
  }<% } %>
}
