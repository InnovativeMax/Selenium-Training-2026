# Introduction to XPath

XPath is a locator strategy in Selenium used to locate elements on a web page using path expressions.

---

# Types of XPath

There are two types of XPath:

1. Absolute XPath
2. Relative XPath

---

## 1. Absolute XPath

Absolute XPath starts from the root element and follows the complete hierarchy of elements to reach the target element.

It starts with a single forward slash `/`.

### Examples

```text
/html/body/header
```

```text
/html/body/main/div/div/div/div/div/div/div/div/div/div/div/div/div/div/a
```

### Important

Absolute XPath depends on the complete HTML hierarchy.

If the structure of the page changes, the XPath may become invalid.

---

## 2. Relative XPath

Relative XPath starts from any element in the HTML DOM.

It starts with a double forward slash `//`.

### Examples

```text
//header
```

```text
//div/a
```

Relative XPath can locate elements using:

- Attributes
- Text
- Conditions
- Relationships
- XPath functions
- XPath axes

### Example

```xpath
//input[@id='user-name']
```

---

# When to Use XPath?

Prefer XPath when:

- A unique and stable ID is not available.
- A suitable Name locator is not available.
- The element has dynamic attributes.
- The element needs to be located using its visible text.
- The element needs to be located based on its relationship with another element.
- Complex conditions are required to identify the element.

---

# Advantages of XPath

- Allows navigation through the HTML DOM.
- Supports complex queries and conditions.
- Can locate elements using text and attributes.
- Can locate elements based on relationships with other elements.
- Supports XPath functions such as `text()` and `contains()`.
- Supports traversing between related elements using XPath axes.

---

# Disadvantages of XPath

- Complex XPath expressions can be difficult to read and maintain.
- Poorly designed XPath can become fragile when the UI structure changes.
- Long XPath expressions can make automation scripts difficult to maintain.

---

# CSS Selector vs XPath

| Feature | CSS Selector | XPath |
|---|---|---|
| Attribute-based locating | Yes | Yes |
| Text-based locating | No | Yes |
| DOM traversal | Limited | Yes |
| Parent/ancestor traversal | No | Yes |
| Sibling traversal | No | Yes |
| Complex relationships | Limited | Yes |
| Syntax | Generally simpler | Can be more complex |

### Example

CSS Selector:

```css
input[placeholder='Username']
```

XPath:

```xpath
//input[@placeholder='Username']
```

XPath becomes particularly useful when we need to locate an element using **text, relationships, or DOM traversal**.

---

# Common XPath Syntax

## By Attribute

```text
//tagname[@attribute='value']
```

Example:

```xpath
//input[@placeholder='Username']
```

## By text()

```text
//tagname[text()='visible text']
```

Example:

```xpath
//label[text()='Email address or mobile number']
```

## By contains()

```text
//tagname[contains(@attribute,'value')]
```

Example:

```xpath
//input[contains(@placeholder,'Username')]
```

Using text:

```xpath
//label[contains(text(),'Email address')]
```

---

# Locator Preference

When choosing a locator, prefer the **simplest, most unique, stable, and maintainable locator**.

A general preference is:

```text
1. ID
   ↓
2. Name
   ↓
3. CSS Selector
   ↓
4. XPath
```

### Rule

**1.** Use ID when a unique and stable ID is available.

**2.** If ID is not suitable, consider Name.

**3.** If ID and Name are not suitable, consider CSS Selector.

**4.** Use XPath when CSS Selector is not suitable or when text, relationships, or DOM traversal are required.

> The order is a guideline, not a strict Selenium rule. Choose the locator that is most reliable and maintainable for the element.

---

# XPath Topics

We will learn XPath techniques separately:

1. XPath by Attribute
2. XPath by `text()`
3. XPath using `contains()`
4. XPath using `and` / `or`
5. XPath by Index
6. XPath using Parent / Child
7. Independent and Dependent XPath
8. XPath Axes
