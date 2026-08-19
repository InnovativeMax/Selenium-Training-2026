# XPath - Conditions

XPath conditions can be combined using `and` and `or`.

## AND

`and` is used when **both conditions must be true**.

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

## When to Use

Use `and` when one attribute is not enough to uniquely identify the element.

---

## OR

`or` is used when **either condition can be true**.

### Syntax

```text
//tagname[@attribute1='value1' or @attribute2='value2']
```

### Example

```xpath
//input[@id='user-name' or @name='user-name']
```

### Selenium

```java
driver.findElement(
        By.xpath("//input[@id='user-name' or @name='user-name']")
);
```

## When to Use

Use `or` when either of multiple conditions can identify the element.

## Interview Point

**Q: What is the difference between `and` and `or` in XPath?**

- `and` → Both conditions must match.
- `or` → At least one condition must match.

## Remember

```text
and → All conditions must be true

or → Any one condition can be true
```
