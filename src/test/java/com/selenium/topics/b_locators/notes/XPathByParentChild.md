# XPath - Parent and Child

Parent and child relationships are used to navigate through the DOM hierarchy.

```text
Parent
   ↓
Child
```

## Parent

`parent` moves to the direct parent of an element.

### Syntax

```text
//element/parent::*
```

### Example

```xpath
//div[text()='Sauce Labs Backpack']/parent::*
```

### When to Use

Use `parent` when the required element is the direct parent of a known element.

---

## Child

`child` moves to the direct child of an element.

### Syntax

```text
//element/child::tagname
```

### Example

```xpath
//div[@class='inventory_item']/child::div
```

### When to Use

Use `child` when the required element is a direct child of a known element.

---

## Shortcuts

### Parent

```xpath
//div/..
```

### Child

```xpath
//div/div
```

These are commonly used as shorter alternatives.

## Interview Point

- `parent` → Moves one level upward.
- `child` → Moves one level downward.

## Remember

```text
Parent
   ↑
Element
   ↓
Child
```
