# XPath - By text()

XPath `text()` is used to locate an element using its visible text.

## Syntax

```text
//tagname[text()='text value']
```

### Example

```xpath
//a[text()='Sauce Labs Backpack']
```

### Selenium

```java
driver.findElement(
        By.xpath("//a[text()='Sauce Labs Backpack']")
).click();
```

## When to Use

Use `text()` when:

- The element has stable and identifiable visible text.
- The text is more useful than the available attributes.
- The complete visible text is known.

## Interview Point

**Q: When do we use `text()` in XPath?**

When we need to locate an element using its visible text.

## Remember

```text
//tagname[text()='text value']
```

> **text() = Locate an element using its visible text**
