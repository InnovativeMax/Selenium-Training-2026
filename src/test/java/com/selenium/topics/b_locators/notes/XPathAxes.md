# XPath - Axes

XPath Axes are used to locate elements based on their relationship with another element in the DOM.

## Important Axes

| Axis | Direction | Use |
|---|---|---|
| `parent` | Up | Direct parent |
| `ancestor` | Up | Any ancestor |
| `child` | Down | Direct child |
| `descendant` | Down | Any descendant |
| `following-sibling` | Sideways | Following sibling |
| `preceding-sibling` | Sideways | Previous sibling |

---

## 1. parent

Moves to the direct parent.

### Syntax

```text
//element/parent::*
```

### Example

```xpath
//div[text()='Sauce Labs Backpack']/parent::*
```

### When to Use

When the required element is the direct parent of a known element.

---

## 2. ancestor

Moves upward through the DOM.

### Syntax

```text
//element/ancestor::tagname
```

### Example

```xpath
//div[text()='Sauce Labs Backpack']/ancestor::div
```

### When to Use

When the required element is higher up in the DOM hierarchy.

---

## 3. child

Moves to direct child elements.

### Syntax

```text
//element/child::tagname
```

### Example

```xpath
//div[@class='inventory_item']/child::div
```

### When to Use

When the required element is a direct child.

---

## 4. descendant

Finds elements anywhere below the current element.

### Syntax

```text
//element/descendant::tagname
```

### Example

```xpath
//div[@class='inventory_item']/descendant::button
```

### When to Use

When the required element can be anywhere inside the current element.

---

## 5. following-sibling

Finds sibling elements that appear after the current element.

### Syntax

```text
//element/following-sibling::tagname
```

### Example

```xpath
//div[text()='Sauce Labs Backpack']/following-sibling::div
```

### When to Use

When the required element is a sibling that appears after the known element.

---

## 6. preceding-sibling

Finds sibling elements that appear before the current element.

### Syntax

```text
//element/preceding-sibling::tagname
```

### Example

```xpath
//div[text()='Sauce Labs Backpack']/preceding-sibling::a
```

### When to Use

When the required element is a sibling that appears before the known element.

---

## Relationship

```text
              ancestor
                 ↑
              parent
                 ↑
              Element
             ↙       ↘
      preceding     following
       sibling       sibling
                 ↓
               child
                 ↓
            descendant
```

## Interview Point

**Q: What are XPath Axes?**

XPath Axes are used to locate elements based on their relationship with another element in the DOM.

## Remember

```text
Up       → parent / ancestor
Down     → child / descendant
Sideways → following-sibling / preceding-sibling
```
