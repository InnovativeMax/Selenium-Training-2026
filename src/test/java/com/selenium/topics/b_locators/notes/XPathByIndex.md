# XPath - Index

Index is used when multiple elements match the same XPath and we need a specific occurrence.

## Hard-Coded Index

### Syntax

```text
(//tagname[@attribute='value'])[index]
```

### Examples

First element:

```xpath
(//div[@class='inventory_item'])[1]
```

Second element:

```xpath
(//div[@class='inventory_item'])[2]
```

### Selenium

```java
driver.findElement(
        By.xpath("(//div[@class='inventory_item'])[1]")
);
```

## When to Use

Use an index when multiple elements have the same XPath and a specific occurrence is required.

---

## position()

`position()` can be used to select an element at a specific position.

### Example

```xpath
(//div[@class='inventory_item'])[position()=2]
```

Selects the second matching element.

---

## last()

`last()` selects the last matching element.

### Example

```xpath
(//div[@class='inventory_item'])[last()]
```

## When to Use

Use `last()` when you need the last matching element.

## Important

Index-based XPath can become fragile if the order of elements changes.

Prefer a more unique XPath when possible.

## Interview Point

- `[1]` → First matching element
- `[2]` → Second matching element
- `[position()=2]` → Second matching element
- `[last()]` → Last matching element

## Remember

```text
(index)  → Select a specific occurrence

position() → Select based on position

last() → Select the last occurrence
```
