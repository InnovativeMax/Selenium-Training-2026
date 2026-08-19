# XPath - By Attribute

XPath can locate an element using its HTML attribute and attribute value.

## Syntax

```text
//tagname[@attribute='value']
```

### Example

```xpath
//input[@id='user-name']
```

### Selenium

```java
driver.findElement(
        By.xpath("//input[@id='user-name']")
);
```

## Multiple Attributes

Multiple attributes can be combined using the `and` operator.

### Syntax

```text
//tagname[@attribute1='value1' and @attribute2='value2']
```

### Example

```xpath
//input[@id='user-name' and @placeholder='Username']
```

### Selenium

```java
driver.findElement(
        By.xpath("//input[@id='user-name' and @placeholder='Username']")
);
```

Both conditions must match the element.

## When to Use

Use attribute-based XPath when:

- The element has a unique attribute.
- The attribute value is stable.
- ID or Name locator is not suitable.
- Multiple attributes are required to uniquely identify the element.

### Common Attributes

- `id`
- `name`
- `class`
- `type`
- `placeholder`
- `value`

## Interview Point

**Q: What is attribute-based XPath?**

Attribute-based XPath identifies an element using its HTML attribute and attribute value.

**Q: What is the syntax?**

```text
//tagname[@attribute='value']
```

**Q: How do you use multiple attributes in XPath?**

Use the `and` operator:

```xpath
//input[@id='user-name' and @placeholder='Username']
```

## Remember

```text
//tagname[@attribute='value']
```

> **Attribute XPath = Tag + Attribute + Attribute Value**