# Selenium Locators

A locator is used to identify a web element on a webpage.

## Locator Types

| Locator | Selenium Method | When to Use |
|---|---|---|
| ID | `By.id()` | When the element has a unique and stable `id` |
| Name | `By.name()` | When the element has a unique and stable `name` |
| Class Name | `By.className()` | When a unique class name identifies the element |
| Link Text | `By.linkText()` | When locating an `<a>` element using its complete visible text |
| Partial Link Text | `By.partialLinkText()` | When locating an `<a>` element using part of its visible text |
| CSS Selector | `By.cssSelector()` | When a more flexible locator is required using attributes, ID, class, etc. |
| Tag Name | `By.tagName()` | When locating elements based on their HTML tag |

---

# CSS Selector

CSS Selector allows us to identify elements using CSS selector syntax.

## Common Syntax

| Syntax | Example | Meaning |
|---|---|---|
| `tag#id` | `input#user-name` | Tag + ID |
| `#id` | `#user-name` | ID |
| `tag.class` | `input.btn_action` | Tag + Class |
| `.class` | `.btn_action` | Class |
| `tag[attribute='value']` | `input[placeholder='Password']` | Tag + Attribute |
| `[attribute='value']` | `[placeholder='Password']` | Attribute |
| `tag.class[attribute='value']` | `input.btn_action[type='submit']` | Multiple conditions |

### Selenium Example

```java
driver.findElement(
        By.cssSelector("input#user-name")
);