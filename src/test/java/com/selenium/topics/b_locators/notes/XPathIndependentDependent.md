# XPath - Independent and Dependent

Independent-Dependent XPath is a technique used when the target element does not have a reliable or unique locator.

We first identify a reliable element (**Independent Element**) and then locate the required element (**Dependent Element**) using its relationship in the DOM.

## Concept

```text
Independent Element
        ↓
   Relationship
        ↓
Dependent Element
```

## Example

On SauceDemo, suppose we want to click the **Add to Cart** button for:

```text
Sauce Labs Backpack
```

The product name can be used as the independent element:

```xpath
//div[text()='Sauce Labs Backpack']
```

Then navigate to its product container and find the button:

```xpath
//div[text()='Sauce Labs Backpack']/ancestor::div[@class='inventory_item']//button
```

### Selenium

```java
driver.findElement(
        By.xpath(
                "//div[text()='Sauce Labs Backpack']" +
                "/ancestor::div[@class='inventory_item']//button"
        )
).click();
```

## When to Use

Use this technique when:

- The target element has no useful unique attribute.
- A related element has a reliable locator.
- The target must be identified based on its relationship with another element.

## Important

Independent-Dependent XPath is a **technique**, not a separate XPath function.

It commonly uses XPath relationships or axes to reach the dependent element.

## Interview Point

> Identify a reliable independent element first, then navigate to the required dependent element using its relationship in the DOM.

## Remember

```text
Independent Element
        ↓
Find Relationship
        ↓
Dependent Element
```
