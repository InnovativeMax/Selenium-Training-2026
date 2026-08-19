# XPath - contains()

XPath `contains()` is used when the complete attribute value or text is not known or may change.

## Syntax - Attribute

```text
//tagname[contains(@attribute,'partial value')]
```

### Example

```xpath
//input[contains(@id,'user')]
```

### Selenium

```java
driver.findElement(
        By.xpath("//input[contains(@id,'user')]")
);
```

## Syntax - Text

```text
//tagname[contains(text(),'partial text')]
```

### Example

```xpath
//a[contains(text(),'Backpack')]
```

### Selenium

```java
driver.findElement(
        By.xpath("//a[contains(text(),'Backpack')]")
).click();
```

## When to Use

Use `contains()` when:

- Only part of an attribute value is known.
- The attribute value is dynamic.
- Only part of the visible text is known.
- The complete value is not stable.

## Interview Point

**Q: Why do we use `contains()`?**

To create a flexible XPath when the complete attribute value or text is not known or may change.

## Remember

```text
contains(@attribute,'value')
```

or

```text
contains(text(),'value')
```

> **contains() = Match a partial value**
