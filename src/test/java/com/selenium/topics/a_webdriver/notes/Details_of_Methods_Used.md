# WebDriver Interface Methods

`WebDriver` is an interface in Selenium used to control and interact with web browsers.

```java
WebDriver driver = new ChromeDriver();
```

---

## WebDriver Methods

| Method Name          | Return Type        | Parameter    | Aim / Description                                         |
| -------------------- | ------------------ | ------------ | --------------------------------------------------------- |
| `get()`              | `void`             | `String url` | Opens/navigates to the specified URL                      |
| `getTitle()`         | `String`           | No argument  | Returns the title of the current webpage                  |
| `getCurrentUrl()`    | `String`           | No argument  | Returns the current URL                                   |
| `getPageSource()`    | `String`           | No argument  | Returns the current page source                           |
| `findElement()`      | `WebElement`       | `By`         | Finds the first matching web element                      |
| `findElements()`     | `List<WebElement>` | `By`         | Finds all matching web elements                           |
| `getWindowHandle()`  | `String`           | No argument  | Returns the handle of the current browser window/tab      |
| `getWindowHandles()` | `Set<String>`      | No argument  | Returns handles of all browser windows/tabs               |
| `close()`            | `void`             | No argument  | Closes the current browser window/tab                     |
| `quit()`             | `void`             | No argument  | Closes all browser windows and ends the WebDriver session |
| `navigate()`         | `Navigation`       | No argument  | Returns the Navigation interface for browser navigation   |

---

# Navigation Methods

`navigate()` returns the `Navigation` interface.

```java
Navigation nav = driver.navigate();
```

| Method Name | Return Type | Parameter    | Aim / Description                                   |
| ----------- | ----------- | ------------ | --------------------------------------------------- |
| `to()`      | `void`      | `String url` | Navigates to the specified URL                      |
| `to()`      | `void`      | `URL url`    | Navigates to the specified URL using a `URL` object |
| `back()`    | `void`      | No argument  | Navigates back to the previous page                 |
| `forward()` | `void`      | No argument  | Navigates forward to the next page                  |
| `refresh()` | `void`      | No argument  | Refreshes the current page                          |

### Example

```java
Navigation nav = driver.navigate();

nav.to("https://www.google.com");

nav.back();

nav.forward();

nav.refresh();
```

---

# `get()` vs `navigate().to()`

Both methods can navigate to a URL.

```java
driver.get("https://www.google.com");
```

```java
driver.navigate().to("https://www.google.com");
```

### Interview Point

**`get()`** is the direct WebDriver method for navigating to a URL.

**`navigate().to()`** is part of the `Navigation` interface and is useful when performing browser navigation operations such as:

```text
to()
back()
forward()
refresh()
```

Do not define the difference simply as "`get()` waits and `navigate().to()` doesn't." Page-load behavior depends on WebDriver's page-load strategy and browser behavior.

---

# `close()` vs `quit()`

| Method    | Description                                                          |
| --------- | -------------------------------------------------------------------- |
| `close()` | Closes the current browser window/tab                                |
| `quit()`  | Closes all browser windows/tabs and terminates the WebDriver session |

```java
driver.close();
```

```java
driver.quit();
```

### Interview Question

**Q: Which method should normally be used at the end of an automation script?**

**Answer:** `quit()` because it ends the complete WebDriver session and closes all associated browser windows.

---

# Quick Interview Questions

### 1. What is WebDriver?

`WebDriver` is an interface in Selenium used to control and interact with web browsers.

### 2. What does `driver.get()` do?

It navigates the browser to the specified URL.

### 3. What is the return type of `getTitle()`?

`String`

### 4. What is the return type of `getCurrentUrl()`?

`String`

### 7. What does `navigate()` return?

`WebDriver.Navigation`

### 8. What are the methods of `Navigation`?

* `to()`
* `back()`
* `forward()`
* `refresh()`

### 9. Difference between `close()` and `quit()`?

`close()` closes the current window/tab.

`quit()` closes all windows and terminates the WebDriver session.

### 10. Difference between `getWindowHandle()` and `getWindowHandles()`?

`getWindowHandle()` returns the current window handle.

`getWindowHandles()` returns handles of all open windows/tabs.

---

# Key Points to Remember

```text
WebDriver
    ↓
get()
getTitle()
getCurrentUrl()
getPageSource()
findElement()
findElements()
getWindowHandle()
getWindowHandles()
close()
quit()
navigate()
```

```text
Navigation
    ↓
to()
back()
forward()
refresh()
```
